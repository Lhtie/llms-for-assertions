import argparse


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
            stripped.startswith("best_validity_")
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
            }
            i += 1
            continue

        if current is not None and stripped.startswith("best_validity_"):
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


def evaluate(samples, target_validity, threshold):
    key = f"best_validity_{target_validity}"
    selected = []
    missing = 0

    for sample in samples:
        candidate = sample.get(key)
        if candidate is None:
            missing += 1
            continue
        selected.append(candidate)

    pred_pos = [
        candidate for candidate in selected
        if candidate["conformance"] is not None and candidate["conformance"] >= threshold
    ]
    gt_pos = [
        candidate for candidate in selected
        if candidate["equivalence"] is True
    ]
    tp = [
        candidate for candidate in selected
        if candidate["equivalence"] is True
        and candidate["conformance"] is not None
        and candidate["conformance"] >= threshold
    ]
    fp = [
        candidate for candidate in selected
        if candidate["equivalence"] is not True
        and candidate["conformance"] is not None
        and candidate["conformance"] >= threshold
    ]
    fn = [
        candidate for candidate in selected
        if candidate["equivalence"] is True
        and (candidate["conformance"] is None or candidate["conformance"] < threshold)
    ]

    precision = safe_div(len(tp), len(tp) + len(fp))
    recall = safe_div(len(tp), len(tp) + len(fn))
    f1 = safe_div(2 * precision * recall, precision + recall)

    return {
        "target_validity": target_validity,
        "threshold": threshold,
        "num_samples": len(samples),
        "num_selected": len(selected),
        "num_missing": missing,
        "num_predicted_positive": len(pred_pos),
        "num_groundtruth_positive": len(gt_pos),
        "true_positive": len(tp),
        "false_positive": len(fp),
        "false_negative": len(fn),
        "precision": precision,
        "recall": recall,
        "f1": f1,
    }


def print_report(path, report):
    print(f"file: {path}")
    print(f"presume validity: {report['target_validity']}")
    print(f"threshold: {report['threshold']}")
    print(f"samples: {report['num_samples']}")
    print(f"selected assertions: {report['num_selected']}")
    print(f"missing selected assertions: {report['num_missing']}")
    print(f"conformance >= threshold: {report['num_predicted_positive']}")
    print(f"equivalence == 1 (groundtruth): {report['num_groundtruth_positive']}")
    print(f"true positives: {report['true_positive']}")
    print(f"false positives: {report['false_positive']}")
    print(f"false negatives: {report['false_negative']}")
    print(f"precision: {report['precision']:.6f}")
    print(f"recall: {report['recall']:.6f}")
    print(f"f1: {report['f1']:.6f}")


def main():
    parser = argparse.ArgumentParser()
    parser.add_argument("files", nargs="+")
    parser.add_argument("--presume", choices=["valid", "invalid"], default="valid")
    parser.add_argument("--threshold", type=float, default=0.6)
    args = parser.parse_args()

    target_validity = 1 if args.presume == "valid" else 0
    for idx, path in enumerate(args.files):
        if idx:
            print()
        samples = parse_checker_file(path)
        report = evaluate(samples, target_validity, args.threshold)
        print_report(path, report)


if __name__ == "__main__":
    main()
