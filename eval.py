import argparse
import ast
import re
from pathlib import Path


BLOCK_LABELS = {
    "final_best_candidate",
    "best_validity_0",
    "best_validity_1",
}


def parse_float(value):
    value = value.strip()
    if value == "None":
        return None
    return float(value)


def parse_bool(value):
    value = value.strip()
    if value in {"1", "True", "true"}:
        return True
    if value in {"0", "False", "false"}:
        return False
    if value == "None":
        return None
    raise ValueError(f"Cannot parse boolean value: {value}")


def parse_list(value, parser):
    return [parser(str(item)) for item in ast.literal_eval(value.strip())]


def parse_score_list(value):
    return parse_list(value, parse_float)


def parse_bool_list(value):
    return parse_list(value, parse_bool)


def parse_int_list(value):
    return parse_list(value, lambda item: int(item.strip()))


def parse_result_list_line(line, parser):
    _, value = line.split(":", 1)
    start = value.find("[")
    end = value.rfind("]")
    if start == -1 or end == -1 or end < start:
        raise ValueError(f"Cannot parse result list line: {line}")
    value = value[start:end + 1]
    return parse_list(value, parser)


def parse_best_block(lines, start):
    header = lines[start].strip()
    if header.endswith("None"):
        return None, start + 1

    candidate = {}
    i = start + 1
    while i < len(lines):
        line = lines[i]
        stripped = line.strip()
        if (
            stripped.split(":", 1)[0] in BLOCK_LABELS
            or stripped.startswith("validity_")
            or stripped.startswith("active_decision:")
            or stripped.startswith("#")
            or not line.startswith("  ")
        ):
            break

        key, value = stripped.split(":", 1)
        value = value.strip()
        if key == "index":
            candidate[key] = int(value)
        elif key == "validity":
            candidate[key] = int(value)
        elif key == "conformance":
            candidate[key] = parse_float(value)
        elif key == "equivalence":
            candidate[key] = parse_bool(value)
        elif key == "assert":
            candidate[key] = value
        else:
            candidate[key] = value
        i += 1

    return candidate, i


def parse_checker_file(path):
    samples = []
    current = None

    with open(path, "r") as f:
        lines = f.readlines()

    i = 0
    while i < len(lines):
        stripped = lines[i].strip()
        if stripped.startswith("########## ") and stripped.endswith(" ##########"):
            if current is not None:
                samples.append(current)
            current = {
                "title": stripped.strip("#").strip(),
                "best_validity_0": None,
                "best_validity_1": None,
                "final_best_candidate": None,
                "validity_fail_best_conf": None,
                "validity_pass_best_conf": None,
                "active_decision": None,
                "validity_scores": [],
                "conformance_scores": [],
                "equiv_res": [],
            }
            i += 1
            continue

        if current is not None and stripped.startswith("validity_scores:"):
            current["validity_scores"] = parse_result_list_line(stripped, parse_bool)
            i += 1
            continue

        if current is not None and stripped.startswith("conformance_scores:"):
            current["conformance_scores"] = parse_result_list_line(stripped, parse_float)
            i += 1
            continue

        if current is not None and stripped.startswith("equiv_res:"):
            current["equiv_res"] = parse_result_list_line(stripped, parse_bool)
            i += 1
            continue

        if current is not None and stripped.startswith("validity_fail_best_conf:"):
            current["validity_fail_best_conf"] = stripped.split(":", 1)[1].strip()
            if current["validity_fail_best_conf"] == "None":
                current["validity_fail_best_conf"] = None
            i += 1
            continue

        if current is not None and stripped.startswith("validity_pass_best_conf:"):
            current["validity_pass_best_conf"] = stripped.split(":", 1)[1].strip()
            if current["validity_pass_best_conf"] == "None":
                current["validity_pass_best_conf"] = None
            i += 1
            continue

        if current is not None and stripped.startswith("active_decision:"):
            current["active_decision"] = stripped.split(":", 1)[1].strip()
            i += 1
            continue

        if current is not None and stripped.split(":", 1)[0] in BLOCK_LABELS:
            label = stripped.split(":", 1)[0]
            candidate, i = parse_best_block(lines, i)
            current[label] = candidate
            continue

        i += 1

    if current is not None:
        samples.append(current)

    return samples


def safe_div(num, denom):
    if denom == 0:
        return 0.0
    return num / denom


def is_positive_by_conformance(candidate, threshold):
    return (
        candidate is not None
        and candidate["conformance"] is not None
        and candidate["conformance"] >= threshold
    )


def precision_recall_f1(candidates, threshold):
    pred_pos = [
        candidate for candidate in candidates
        if is_positive_by_conformance(candidate, threshold)
    ]
    gt_pos = [
        candidate for candidate in candidates
        if candidate["equivalence"] is True
    ]
    tp = [
        candidate for candidate in candidates
        if candidate["equivalence"] is True
        and is_positive_by_conformance(candidate, threshold)
    ]
    fp = [
        candidate for candidate in candidates
        if candidate["equivalence"] is not True
        and is_positive_by_conformance(candidate, threshold)
    ]
    fn = [
        candidate for candidate in candidates
        if candidate["equivalence"] is True
        and not is_positive_by_conformance(candidate, threshold)
    ]

    precision = safe_div(len(tp), len(tp) + len(fp))
    recall = safe_div(len(tp), len(tp) + len(fn))
    f1 = safe_div(2 * precision * recall, precision + recall)

    false_candidates = [
        candidate for candidate in candidates
        if candidate["equivalence"] is not True
    ]
    false_positive_rate_before = safe_div(len(false_candidates), len(candidates))
    false_positive_rate_after = safe_div(len(fp), len(pred_pos))
    false_positive_rate_reduction = false_positive_rate_before - false_positive_rate_after

    return {
        "num_candidates": len(candidates),
        "num_predicted_positive": len(pred_pos),
        "num_groundtruth_positive": len(gt_pos),
        "true_positive": len(tp),
        "false_positive": len(fp),
        "false_negative": len(fn),
        "precision": precision,
        "recall": recall,
        "f1": f1,
        "false_positive_rate_before_filter": false_positive_rate_before,
        "false_positive_rate_after_filter": false_positive_rate_after,
        "false_positive_rate_reduction": false_positive_rate_reduction,
    }


def normalize_assertion(assertion):
    if assertion is None:
        return None
    return assertion.strip()


def read_extract_assertions(title):
    extract = Path(title.removesuffix(".check") + ".extract")
    if not extract.exists():
        return []
    text = extract.read_text()
    return [chunk.strip() for chunk in text.split("-" * 20)[:-1]]


def find_candidate(sample, assertion, target_validity):
    assertion = normalize_assertion(assertion)
    if assertion is None:
        return None

    assertions = read_extract_assertions(sample["title"])
    best = None
    for idx, candidate_assertion in enumerate(assertions):
        if normalize_assertion(candidate_assertion) != assertion:
            continue
        if idx >= len(sample["validity_scores"]):
            continue
        if int(sample["validity_scores"][idx]) != target_validity:
            continue

        candidate = {
            "index": idx,
            "validity": int(sample["validity_scores"][idx]),
            "conformance": sample["conformance_scores"][idx],
            "equivalence": sample["equiv_res"][idx],
            "assert": candidate_assertion,
        }
        if (
            best is None
            or (
                candidate["conformance"] is not None
                and (
                    best["conformance"] is None
                    or candidate["conformance"] > best["conformance"]
                )
            )
        ):
            best = candidate

    return best


def active_eval(samples):
    total = 0
    selected_equiv = 0
    missing_selected = 0

    for sample in samples:
        if sample.get("active_decision") is None:
            continue

        fail_candidate = find_candidate(sample, sample["validity_fail_best_conf"], 0)
        pass_candidate = find_candidate(sample, sample["validity_pass_best_conf"], 1)
        candidates = [
            candidate for candidate in [fail_candidate, pass_candidate]
            if candidate is not None
        ]
        if not any(candidate["equivalence"] is True for candidate in candidates):
            continue

        total += 1
        decision = sample["active_decision"]
        if decision == "invalid":
            selected = fail_candidate
        elif decision == "valid":
            selected = pass_candidate
        else:
            selected = None

        if selected is None:
            missing_selected += 1
            continue
        if selected["equivalence"] is True:
            selected_equiv += 1

    return {
        "eligible_total": total,
        "selected_equiv": selected_equiv,
        "missing_selected": missing_selected,
        "acc": safe_div(selected_equiv, total),
    }


def evaluate(samples, threshold):
    final_candidates = [
        sample["final_best_candidate"]
        for sample in samples
        if sample.get("final_best_candidate") is not None
    ]
    overall_correct = [
        candidate for candidate in final_candidates
        if candidate["equivalence"] is True
        and is_positive_by_conformance(candidate, threshold)
    ]
    final_conf_ge_threshold = [
        candidate for candidate in final_candidates
        if is_positive_by_conformance(candidate, threshold)
    ]

    first_equiv_true = [
        sample for sample in samples
        if sample.get("equiv_res") and sample["equiv_res"][0] is True
    ]

    return {
        "threshold": threshold,
        "num_samples": len(samples),
        "num_final": len(final_candidates),
        "num_missing_final": len(samples) - len(final_candidates),
        "overall_correct": len(overall_correct),
        "overall_acc": safe_div(len(overall_correct), len(samples)),
        "final_conf_ge_threshold_total": len(final_conf_ge_threshold),
        "final_conf_ge_threshold_equiv_true": len(overall_correct),
        "final_conf_ge_threshold_equiv_acc": safe_div(
            len(overall_correct),
            len(final_conf_ge_threshold),
        ),
        "first_equiv_true": len(first_equiv_true),
        "first_equiv_acc": safe_div(len(first_equiv_true), len(samples)),
        "conformance": precision_recall_f1(final_candidates, threshold),
        "active": active_eval(samples),
    }


def class_name_from_title(title):
    name = Path(title).name
    match = re.match(r"(.+?)\d+onedown", name)
    if match:
        return match.group(1)
    if ".java" in name:
        return name.split(".java", 1)[0]
    return name.split(".", 1)[0]


def samples_by_class(samples):
    groups = {}
    for sample in samples:
        cls = class_name_from_title(sample["title"])
        groups.setdefault(cls, []).append(sample)
    return groups


def fmt_metric(value):
    return f"{value:.6f}"


def print_class_report(samples, threshold):
    groups = samples_by_class(samples)
    print()
    print("per-class summary")
    headers = [
        "class",
        "samples",
        "first_candidate_acc",
        "final_selected_acc",
        "conf_precision",
        "conf_recall",
        "conf_f1",
        "active_equiv_acc",
    ]
    print("\t".join(headers))
    for cls in sorted(groups):
        report = evaluate(groups[cls], threshold)
        conf = report["conformance"]
        active = report["active"]
        row = [
            cls,
            str(report["num_samples"]),
            fmt_metric(report["first_equiv_acc"]),
            fmt_metric(report["overall_acc"]),
            fmt_metric(conf["precision"]),
            fmt_metric(conf["recall"]),
            fmt_metric(conf["f1"]),
            fmt_metric(active["acc"]),
        ]
        print("\t".join(row))


def print_report(path, report):
    print(f"file: {path}")
    print(f"threshold: {report['threshold']}")
    print(f"samples: {report['num_samples']}")
    print()
    print("first candidate equivalence accuracy")
    print(f"  first equiv == True: {report['first_equiv_true']}/{report['num_samples']}")
    print(f"  first_equiv_acc: {report['first_equiv_acc']:.6f}")
    print()
    print("overall final result accuracy")
    print(f"  final candidates: {report['num_final']}")
    print(f"  missing final candidates: {report['num_missing_final']}")
    print(
        "  final conformance >= threshold and equivalence == True: "
        f"{report['overall_correct']}/{report['num_samples']}"
    )
    print(f"  overall_acc: {report['overall_acc']:.6f}")
    print(
        "  equiv acc among final conformance >= threshold: "
        f"{report['final_conf_ge_threshold_equiv_true']}/"
        f"{report['final_conf_ge_threshold_total']}"
    )
    print(
        "  final_conf_ge_threshold_equiv_acc: "
        f"{report['final_conf_ge_threshold_equiv_acc']:.6f}"
    )
    print()
    print("conformance classifier on final candidates")
    conf = report["conformance"]
    print(f"  final candidates: {conf['num_candidates']}")
    print(f"  conformance >= threshold: {conf['num_predicted_positive']}")
    print(f"  equivalence == True: {conf['num_groundtruth_positive']}")
    print(f"  true positives: {conf['true_positive']}")
    print(f"  false positives: {conf['false_positive']}")
    print(f"  false negatives: {conf['false_negative']}")
    print(f"  precision: {conf['precision']:.6f}")
    print(f"  recall: {conf['recall']:.6f}")
    print(f"  f1: {conf['f1']:.6f}")
    # print(f"  false positive rate without filter: {conf['false_positive_rate_before_filter']:.6f}")
    # print(f"  false positive rate with filter: {conf['false_positive_rate_after_filter']:.6f}")
    # print(f"  false positive rate reduction: {conf['false_positive_rate_reduction']:.6f}")
    print()
    print("active learning equivalence accuracy")
    active = report["active"]
    print(f"  eligible active cases: {active['eligible_total']}")
    print(f"  selected candidate equivalence == True: {active['selected_equiv']}")
    print(f"  selected candidate missing/unknown: {active['missing_selected']}")
    print(f"  active_equiv_acc: {active['acc']:.6f}")


def main():
    parser = argparse.ArgumentParser()
    parser.add_argument("files", nargs="+")
    parser.add_argument("--threshold", type=float, default=0.6)
    args = parser.parse_args()

    for idx, path in enumerate(args.files):
        if idx:
            print()
        samples = parse_checker_file(path)
        report = evaluate(samples, args.threshold)
        print_report(path, report)
        # print_class_report(samples, args.threshold)


if __name__ == "__main__":
    main()
