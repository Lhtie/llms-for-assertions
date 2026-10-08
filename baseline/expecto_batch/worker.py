"""One isolated invocation of the upstream Expecto tree search."""

import asyncio
import json
import os
import subprocess
import tempfile
import sys
from contextlib import contextmanager
from unittest.mock import patch
from pathlib import Path

from .models import create_model, model_settings
from .prompts import DEFAULT_ROOT_DESCRIPTION, build_assertion_prompt, build_root_description


def configure_import_paths(artifact):
    """Give both this worker and sandbox subprocesses the upstream package roots."""
    roots = [str(artifact.resolve()), str((artifact / "expecto").resolve())]
    existing = [
        str(Path(part).resolve())
        for part in os.environ.get("PYTHONPATH", "").split(os.pathsep)
        if part
    ]
    os.environ["PYTHONPATH"] = os.pathsep.join(dict.fromkeys(roots + existing))
    sys.path[:0] = roots


def check_sandbox_imports():
    """Fail before model calls if an isolated Python process cannot load the DSL."""
    with tempfile.TemporaryDirectory(prefix="expecto-import-check-") as directory:
        completed = subprocess.run(
            [
                sys.executable,
                "-c",
                "from expecto.src.DSL.compiler import DSLCompiler, make_solver",
            ],
            cwd=directory,
            capture_output=True,
            text=True,
            timeout=60,
        )
    if completed.returncode:
        raise RuntimeError(
            "Expecto sandbox import preflight failed before model generation:\n"
            + completed.stderr
        )


@contextmanager
def capture_feedback(generator_class, path):
    """Save upstream checker feedback without changing tree-search decisions."""
    original = generator_class.generate
    with path.open("w") as log:

        async def generate_with_feedback(self, *args, **kwargs):
            outputs = await original(self, *args, **kwargs)
            for metadata, result in outputs:
                record = metadata.model_dump(mode="json")
                record["postprocess_error"] = (
                    str(result.err()) if result.is_err() else None
                )
                log.write(json.dumps(record, ensure_ascii=False) + "\n")
                log.flush()
            return outputs

        # The worker is isolated per sample; restore the method on every exit.
        with patch.object(generator_class, "generate", generate_with_feedback):
            yield


def main():
    data = json.loads(Path(sys.argv[1]).read_text())
    artifact = Path(__file__).resolve().parents[1] / "expecto-artifact"
    configure_import_paths(artifact)
    check_sandbox_imports()
    from dotenv import load_dotenv

    load_dotenv(artifact / ".env")
    from src.tasks.defects4j import Defects4jMethodSample
    from src.solvers.defects4j_tree_search import generate_spec_per_method
    from src.evaluation.sandbox import initialize

    from src.solvers.multigen import MultiGen

    settings = model_settings(
        data["model"],
        max_tokens=data.get("max_tokens"),
        reasoning_effort=data.get("reasoning_effort"),
        use_memo=data.get("use_memo"),
    )
    Path(sys.argv[2]).with_name("model_config.json").write_text(
        json.dumps(settings, indent=2)
    )
    sample = Defects4jMethodSample.model_validate(data["sample"])
    prompt = build_assertion_prompt(sample.method_info)
    Path(sys.argv[2]).with_name("generation_prompt.txt").write_text(prompt)
    root_description = build_root_description(
        sample.method_info, data.get("root_description", DEFAULT_ROOT_DESCRIPTION)
    )
    Path(sys.argv[2]).with_name("root_description.txt").write_text(root_description)

    async def run():
        initialize()
        model = create_model(settings)
        try:
            return await generate_spec_per_method(
                sample,
                model,
                data["max_attempts"],
                data["n_completions"],
                bool(sample.corrects),
                settings["use_memo"],
                True,
                prompt,
                root_description=root_description,
            )
        finally:
            await model.api.aclose()

    feedback_path = Path(sys.argv[2]).with_name("generation_feedback.jsonl")
    with capture_feedback(MultiGen, feedback_path):
        result = asyncio.run(run())
    Path(sys.argv[2]).write_text(json.dumps(result, indent=2, default=str))


if __name__ == "__main__":
    main()
