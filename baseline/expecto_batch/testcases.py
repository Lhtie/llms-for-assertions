"""Generate ground-truth-labelled state cases with Randoop, independently per assert."""

from concurrent.futures import ThreadPoolExecutor, as_completed
import argparse
import hashlib
import json
import os
import re
from pathlib import Path

from .adapters import adapt
from .compare import ROOT, command
from .extract import scan

DEFAULT_OUTPUT = ROOT / "baseline/expecto_batch/testcases"

JAVA_HELPERS = r"""
 static java.util.Set<String> seen = new java.util.HashSet<>();
 static int positives=0, negatives=0, failureReports=0;
 static void failure(Exception e) { if(failureReports++<3) e.printStackTrace(); }
 static Object project(java.util.Collection<?> c, boolean nullable) {
  java.util.Map<String,Object> m = new java.util.LinkedHashMap<>();
  if(nullable) m.put("is_null", c==null);
  m.put("size", c==null?0:c.size());
  m.put("empty", c==null || c.isEmpty());
  m.put("elements", c==null?new Object[0]:c.toArray());
  return m;
 }
 static Object arrayProject(Object[] a) {
  java.util.Map<String,Object> m=new java.util.LinkedHashMap<>();
  m.put("is_null",a==null); m.put("elements",a==null?new Object[0]:a); return m;
 }
 @SuppressWarnings("unchecked")
 static Object cloneProject(java.util.Collection<?> r, Object receiver) {
  java.util.Map<String,Object> m=(java.util.Map<String,Object>)project(r,true);
  m.put("same_receiver",r==receiver); return m;
 }
 static String json(Object o) {
  if(o==null) return "null";
  if(o instanceof Boolean || o instanceof Integer) return o.toString();
  if(o instanceof String) return "\""+((String)o).replace("\\","\\\\").replace("\"","\\\"")+"\"";
  if(o instanceof java.util.Map) {
   java.util.List<String> parts=new java.util.ArrayList<>();
   for(Object x:((java.util.Map<?,?>)o).entrySet()) {
    java.util.Map.Entry<?,?> e=(java.util.Map.Entry<?,?>)x;
    parts.add(json(e.getKey())+":"+json(e.getValue()));
   }
   return "{"+String.join(",",parts)+"}";
  }
  if(o instanceof Object[]) {
   java.util.List<String> parts=new java.util.ArrayList<>();
   for(Object x:(Object[])o) parts.add(json(x));
   return "["+String.join(",",parts)+"]";
  }
  throw new IllegalArgumentException("Outside Integer domain");
 }
 static void emit(boolean label, Object entrySelf, Object exitSelf, Object ret, Object[] params) throws Exception {
  java.util.Map<String,Object> p=new java.util.LinkedHashMap<>();
  for(int i=0;i<params.length;i+=2) p.put((String)params[i],params[i+1]);
  java.util.Map<String,Object> entry=new java.util.LinkedHashMap<>(), exit=new java.util.LinkedHashMap<>();
  entry.put("params",p); entry.put("self",entrySelf);
  exit.put("self",exitSelf); exit.put("ret",ret);
  java.util.Map<String,Object> trace=new java.util.LinkedHashMap<>();
  trace.put("entry",entry); trace.put("exit",exit);
  String body=json(trace);
  if((label?positives:negatives)>=2000 || !seen.add(body)) return;
  if(label) positives++; else negatives++;
  String line="{\"label\":"+label+",\"trace\":"+body+"}\n";
  java.nio.file.Files.writeString(java.nio.file.Path.of(System.getProperty("expecto.cases")),line,
    java.nio.file.StandardOpenOption.CREATE, java.nio.file.StandardOpenOption.APPEND);
 }
"""


def instrumentation(row, adapter):
    params = []
    for p in adapter["java_parameters"]:
        params += [
            json.dumps(p["name"]),
            (
                f"project({p['name']},true)"
                if p["type"].startswith("java.util.Collection")
                else p["name"]
            ),
        ]
    ret = "New_Ret" if adapter["java_return"] else "null"
    if row["method_name"] == "clone":
        ret = "cloneProject(New_Ret,fuzzobj_new)"
    elif adapter["java_return"] == "Integer[]":
        ret = "arrayProject(New_Ret)"
    old = "null" if row["constructor"] else "project(fuzzobj_old,false)"
    return f'emit(a,{old},project(fuzzobj_new,false),{ret},new Object[]{{{", ".join(params)}}});'


def probe_source(row, adapter):
    """Randoop chooses four ints; bounded factories make collection inputs useful."""
    cls = row["class_name"]
    args = ["oldState", "newState"]
    for index, param in enumerate(adapter["java_parameters"]):
        choice = f"(p+{index})"
        typ = param["type"]
        if typ == "int":
            value = f"number({choice},oldState.size())"
        elif typ == "boolean":
            value = f"({choice}%2==0)"
        elif typ == "Integer":
            value = f"element({choice})"
        else:
            value = f"(Math.floorMod({choice},5)==0?null:make({choice}))"
        args.append(value)
    typ = adapter["java_return"]
    if typ:
        if typ == "boolean":
            value = "(r%2==0)"
        elif typ == "int":
            value = "number(r,newState.size())"
        elif typ == "Integer":
            value = "element(r)"
        elif typ == "Integer[]":
            value = "(r%5==0?null:make(r).toArray(new Integer[0]))"
        else:
            value = "(r%5==0?null:(r%5==1?newState:make(r)))"
        args.append(value)
    constructor = f"return new {cls}<>(values);"
    fixture = ""
    if cls == "Stack":
        constructor = "Stack<Integer> c=new Stack<>(); c.addAll(values); return c;"
    elif cls == "HashSet":
        constructor = "return new SetFixture(values);"
        fixture = """
 // Dataset HashMap iterator factories are null stubs. This immutable test
 // fixture supplies iteration over the same inserted set, without changing
 // dataset files or size/contains/equals implementations.
 static class SetFixture extends HashSet<Integer> {
  private final java.util.Set<Integer> inserted;
  SetFixture(java.util.Collection<Integer> values) {
   super(values); inserted=new java.util.HashSet<>(values);
  }
  @Override public java.util.Iterator<Integer> iterator() { return inserted.iterator(); }
 }
"""
    return (
        fixture
        + """
 static Integer element(int x) {
  Integer[] values={null,-1,0,1,2,10,Integer.MIN_VALUE,Integer.MAX_VALUE};
  return values[Math.floorMod(x,values.length)];
 }
 static int number(int x,int size) {
  int[] values={-1,0,1,size-1,size,size+1,Integer.MIN_VALUE,Integer.MAX_VALUE};
  return values[Math.floorMod(x,values.length)];
 }
 static CLASS<Integer> make(int selector) {
  java.util.ArrayList<Integer> values=new java.util.ArrayList<>();
  int length=Math.floorMod(selector,6);
  for(int i=0;i<length;i++) {
   Integer e=element(selector%2==0?selector:selector+i);
   if(e==null && NONNULL) e=0;
   values.add(e);
  }
  CONSTRUCT
 }
 public static void probe(int o,int n,int p,int r) {
  try {
   CLASS<Integer> oldState=make(o),newState=make(n);
   new FuzzTest().check(ARGUMENTS);
  } catch(Exception problem) { failure(problem); errors++; }
 }
""".replace("CLASS", cls)
        .replace("NONNULL", str(cls in {"ArrayDeque", "PriorityQueue", "TreeSet"}).lower())
        .replace("ARGUMENTS", ",".join(args))
        .replace("CONSTRUCT", constructor)
    )


def features(value, path=""):
    """Structural/value features for deterministic farthest-first selection."""
    result = set()
    if isinstance(value, dict):
        for k, v in value.items():
            result |= features(v, path + "." + k)
    elif isinstance(value, list):
        result.add((path, "length", len(value)))
        result.add(
            (
                path,
                "duplicates",
                len({json.dumps(x, sort_keys=True) for x in value}) < len(value),
            )
        )
        for v in value:
            result |= features(v, path + "[]")
    else:
        result.add((path, type(value).__name__, value))
    return result


def diverse(cases, limit):
    if not cases or limit <= 0:
        return []
    remaining = list(cases)
    selected = [remaining.pop(0)]
    covered = features(selected[0])
    while remaining and len(selected) < limit:
        i = max(
            range(len(remaining)), key=lambda i: len(features(remaining[i]) - covered)
        )
        item = remaining.pop(i)
        selected.append(item)
        covered |= features(item)
    return selected


def split_cases(cases, count):
    """Select generation examples; reserve all other unique cases for evaluation."""
    examples = diverse(cases, count)
    used = {json.dumps(c, sort_keys=True) for c in examples}
    return examples, [c for c in cases if json.dumps(c, sort_keys=True) not in used]


def write(path, value):
    path.write_text(json.dumps(value, indent=2, ensure_ascii=False) + "\n")


def oracle_expression(assertion):
    """Lower this benchmark's bounded JML without eager operand evaluation.

    States are immutable during check, so old(expr) can read the old object
    directly, including inside quantifiers. Unsupported syntax fails closed.
    """
    from codehelper.javahelper import closing_paren, find_bounds

    text = re.sub(r"^\s*assert\s+", "", assertion).strip().rstrip(";")
    text = re.sub(r"<\s*E\s*>", "<Integer>", text)
    while r"\old(" in text:
        start = text.index(r"\old(")
        opening = start + len(r"\old")
        end = closing_paren(text, opening)
        body = text[opening + 1 : end - 1]
        body = re.sub(r"\bthis\b", "fuzzobj_old", body)
        text = text[:start] + "(" + body + ")" + text[end:]
    text = text.replace(r"\result", "New_Ret")
    text = re.sub(r"\bthis\b", "fuzzobj_new", text)

    def lower(expr):
        expr = expr.strip()
        depth = 0
        for i, ch in enumerate(expr):
            if ch == "(":
                depth += 1
            elif ch == ")":
                depth -= 1
            if depth == 0 and expr[i : i + 2] == "=>":
                return f"(!({lower(expr[:i])}) || ({lower(expr[i+2:])}))"
        if expr.startswith(r"\forall"):
            declaration, guard, body = expr.split(";", 2)
            match = re.fullmatch(r"\\forall\s+int\s+(\w+)", declaration.strip())
            if not match:
                raise ValueError("Unsupported quantifier declaration")
            var = match[1]
            lo, hi = find_bounds(guard.strip(), var)
            if lo == "-65536" or hi == "65536":
                raise ValueError(
                    "Quantifier needs explicit finite lower and upper bounds"
                )
            return (
                f"java.util.stream.IntStream.rangeClosed({lo},{hi}).allMatch("
                f"{var} -> !({guard}) || ({lower(body)}))"
            )
        if "\\" in expr or ";" in expr or "=>" in expr:
            raise ValueError("Unsupported assertion syntax: " + expr)
        return expr

    return lower(text)


def generate(row, adapter, datasets, directory, seconds, seeds):
    if row["group"] in {"c2s_aug_sub", "naturalness"} or adapter.get("extended") or row["class_name"] == "TreeSet":
        from .trace_projection import instrumented_harness

        code = instrumented_harness(
            row, adapter, JAVA_HELPERS,
            collection_probe=None if adapter.get("extended") else probe_source(row, adapter),
        )
    else:
        args = [
            f"{row['class_name']}<Integer> fuzzobj_old",
            f"{row['class_name']}<Integer> fuzzobj_new",
        ]
        args += [p["type"] + " " + p["name"] for p in adapter["java_parameters"]]
        if adapter["java_return"]:
            args.append(adapter["java_return"] + " New_Ret")
        expression = oracle_expression(row["ground_truth"])
        code = (
            "package fuzztests;\nimport java.util.*;\nimport "
            + row["package"]
            + "."
            + row["class_name"]
            + ";\n"
            + "public class FuzzTest {\n"
            + JAVA_HELPERS
            + probe_source(row, adapter)
            + r"""
     static long valid=0,errors=0;
     static { Runtime.getRuntime().addShutdownHook(new Thread(() -> {
      try { java.nio.file.Files.writeString(java.nio.file.Path.of(System.getProperty("expecto.counts")),
        "{\"valid\":"+valid+",\"errors\":"+errors+"}"); } catch(Exception e) {}
     })); }
    """
            + " public void check("
            + ",".join(args)
            + ") {\n"
            + " if(fuzzobj_old==null || fuzzobj_new==null) return;\n try {\n"
            + " boolean a="
            + expression
            + ";\n"
            + instrumentation(row, adapter)
            + "\n valid++;\n"
            + " } catch(Exception problem) { failure(problem); errors++; }\n }\n}\n"
        )
    harness = directory / "FuzzTest.java"
    harness.write_text(code)
    classes = directory / "classes"
    classes.mkdir(exist_ok=True)
    jars = list((ROOT / "java-testgen").rglob("*.jar")) + list(
        (ROOT / "java-thirdparty").glob("*.jar")
    )
    cp = os.pathsep.join(map(str, [classes] + jars))
    source = datasets / row["source"]
    source_text = source.read_text()
    compatible = re.sub(r"(?m)^[ \t]*@java\.io\.Serial[ \t]*(?=\r?$)", "", source_text)
    if compatible != source_text:
        source = directory / "java_sources" / row["source"]
        source.parent.mkdir(parents=True, exist_ok=True)
        source.write_text(compatible)
    rc = command(
        [
            "javac",
            "-cp",
            cp,
            "-sourcepath",
            datasets,
            "-d",
            classes,
            source,
            harness,
        ],
        directory,
        "compile_cases",
        120,
    )
    if rc != 0:
        return dict(status="compile_error", returncode=rc)
    methods = directory / "methods.txt"
    methods.write_text("fuzztests.FuzzTest.probe(int,int,int,int)\n")
    runs = []
    unique = {}
    for seed in seeds:
        path = directory / f"raw-seed-{seed}.jsonl"
        path.unlink(missing_ok=True)
        counts = directory / f"counts-seed-{seed}.json"
        counts.unlink(missing_ok=True)
        cmd = [
            "java",
            "-Xmx512m",
            "-Dexpecto.counts=" + str(counts),
            "-Dexpecto.cases=" + str(path),
            "-cp",
            cp,
            "randoop.main.Main",
            "gentests",
            "--methodlist=" + str(methods),
            "--time-limit=" + str(seconds),
            "--randomseed=" + str(seed),
            "--no-regression-tests=true",
            "--junit-output-dir=" + str(directory / f"randoop-seed-{seed}"),
            "--output-limit=100",
            "--unchecked-exception=ERROR",
        ]
        rc = command(cmd, directory, f"randoop-seed-{seed}", seconds + 60)
        runs.append(
            dict(
                seed=seed,
                returncode=rc,
                counts=json.loads(counts.read_text()) if counts.exists() else None,
            )
        )
        if path.exists():
            for line in path.read_text().splitlines():
                try:
                    item = json.loads(line)
                except json.JSONDecodeError:
                    continue
                key = json.dumps(item["trace"], sort_keys=True)
                if key in unique and unique[key]["label"] != item["label"]:
                    raise ValueError(
                        "Same projected state has conflicting labels; projection is insufficient"
                    )
                unique[key] = item
    positives = [v["trace"] for v in unique.values() if v["label"]]
    negatives = [v["trace"] for v in unique.values() if not v["label"]]
    pos, held_pos = split_cases(positives, 3)
    neg, held_neg = split_cases(negatives, 3)
    examples = dict(
        corrects={f"p{i}": v for i, v in enumerate(pos)},
        incorrects={f"n{i}": v for i, v in enumerate(neg)},
    )
    write(directory / "examples.json", examples)
    write(directory / "heldout.json", dict(corrects=held_pos, incorrects=held_neg))
    write(directory / "cases.json", list(unique.values()))
    return dict(
        status="generated" if unique else "no_cases",
        positive=len(positives),
        negative=len(negatives),
        generation_positive=len(pos),
        generation_negative=len(neg),
        runs=runs,
        incomplete_runs=any(r["returncode"] != 0 for r in runs),
    )


def main():
    p = argparse.ArgumentParser(description=__doc__)
    p.add_argument("--datasets", type=Path, default=ROOT / "datasets")
    p.add_argument("--output", type=Path, default=DEFAULT_OUTPUT)
    p.add_argument(
        "--seconds", type=int, default=3, help="Randoop seconds per seed per assert"
    )
    p.add_argument("--seeds", type=int, nargs="+", default=[0, 1, 2])
    p.add_argument("--group", nargs="+", choices=["buggycodes", "buggyasrts", "c2s_aug_sub", "naturalness"],
                   default=["buggycodes", "buggyasrts"])
    p.add_argument("--sample-id")
    p.add_argument("--force", action="store_true")
    p.add_argument(
        "--jobs",
        type=int,
        default=2,
        help="Concurrent assertions; each Java process has a 512 MB heap limit",
    )
    args = p.parse_args()
    if args.seconds <= 0 or args.jobs <= 0:
        p.error("--seconds and --jobs must be positive")
    args.datasets = args.datasets.resolve()
    args.output = args.output.resolve()
    args.output.mkdir(parents=True, exist_ok=True)
    rows = [
        r
        for group in args.group
        for source in sorted((args.datasets / group).rglob("*.java"))
        for r in scan(source, args.datasets)
    ]
    if args.sample_id:
        rows = [r for r in rows if r["id"] == args.sample_id]
    if not rows:
        p.error("No matching assertions")
    summary = {}
    traces = {}

    source_fingerprint = (
        Path(__file__).read_text()
        + (ROOT / "baseline/expecto_batch/compare.py").read_text()
        + (ROOT / "codehelper/javahelper.py").read_text()
        + "".join((Path(__file__).parent / name).read_text() for name in
                  ["adapters.py", "extended_adapters.py", "tc_harness.py", "trace_projection.py"])
    )

    def process(row):
        directory = args.output / row["id"]
        directory.mkdir(exist_ok=True)
        fingerprint = hashlib.sha256(
            (
                json.dumps(row, sort_keys=True)
                + str(args.seconds)
                + str(args.seeds)
                + source_fingerprint
            ).encode()
        ).hexdigest()
        result_path = directory / "result.json"
        if (
            result_path.exists()
            and not args.force
            and json.loads(result_path.read_text()).get("fingerprint") == fingerprint
        ):
            result = json.loads(result_path.read_text())
        else:
            write(directory / "sample.json", row)
            try:
                if row.get("extraction_error"):
                    raise ValueError(row["extraction_error"])
                adapter = adapt(row)
                write(directory / "adapter.json", adapter)
                result = generate(
                    row, adapter, args.datasets, directory, args.seconds, args.seeds
                )
            except Exception as e:
                result = dict(status="unsupported" if row.get("extraction_error") else "error", error=str(e))
            result.update(
                fixture=(
                    "HashSet iterator supplied by immutable SetFixture"
                    if row["class_name"] == "HashSet"
                    else "bounded public-observer state factories" if (row["group"] in {"c2s_aug_sub", "naturalness"} or row["class_name"] in {"BitSet", "Trie", "UnionFind", "TreeSet"})
                    else "dataset collection constructor"
                ),
                fingerprint=fingerprint,
                seconds_per_seed=args.seconds,
                seeds=args.seeds,
            )
            write(result_path, result)
        return row, result

    # Preserve aggregate entries when regenerating only a selected assertion.
    for directory in args.output.iterdir():
        if directory.is_dir() and (directory / "result.json").exists():
            summary[directory.name] = json.loads(
                (directory / "result.json").read_text()
            )
            if summary[directory.name]["status"] in ("generated", "no_cases"):
                traces[directory.name] = json.loads(
                    (directory / "examples.json").read_text()
                )
    with ThreadPoolExecutor(max_workers=args.jobs) as pool:
        for future in as_completed([pool.submit(process, row) for row in rows]):
            row, result = future.result()
            summary[row["id"]] = result
            traces.pop(row["id"], None)
            if result["status"] in ("generated", "no_cases"):
                traces[row["id"]] = json.loads(
                    (args.output / row["id"] / "examples.json").read_text()
                )
            write(args.output / "summary.json", summary)
            write(args.output / "generation-traces.json", traces)
            print(
                row["id"],
                result["status"],
                result.get("positive", 0),
                result.get("negative", 0),
                flush=True,
            )


if __name__ == "__main__":
    main()
