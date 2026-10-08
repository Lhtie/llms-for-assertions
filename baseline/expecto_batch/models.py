"""Provider configuration and final-answer adaptation for upstream Expecto."""

import os

TOGETHER_GPT_OSS = "together/openai/gpt-oss-120b"
TOGETHER_BASE_URL = "https://api.together.ai/v1"


def model_settings(model, *, max_tokens=None, reasoning_effort=None, use_memo=None):
    """Resolve defaults without importing SDKs or including credentials."""
    if model in {"gpt-oss-120b", "together/gpt-oss-120b"}:
        model = TOGETHER_GPT_OSS
    if model == "openai/gpt-oss-120b":
        raise ValueError(
            "For Together GPT-OSS use --model together/openai/gpt-oss-120b"
        )
    together = model.startswith("together/")
    if max_tokens is not None and max_tokens <= 0:
        raise ValueError("--max-tokens must be positive")
    if reasoning_effort not in {None, "low", "medium", "high"}:
        raise ValueError("--reasoning-effort must be low, medium, or high")
    return dict(
        model=model,
        base_url=TOGETHER_BASE_URL if together else None,
        max_tokens=(
            max_tokens if max_tokens is not None else (8192 if together else None)
        ),
        reasoning_effort=reasoning_effort
        or ("medium" if model == TOGETHER_GPT_OSS else None),
        # Upstream memo calls OpenAI embeddings. Avoid an unexpected second
        # provider/key dependency when the user chooses Together.
        use_memo=use_memo if use_memo is not None else not together,
    )


def final_text_output(output):
    """Keep only final text; upstream MultiGen rejects structured content lists."""
    output = output.model_copy(deep=True)
    for choice in output.choices:
        content = choice.message.content
        if not isinstance(content, str):
            content = "\n".join(block.text for block in content if block.type == "text")
        if not content.strip():
            raise RuntimeError(
                "Together returned no final answer text "
                f"(stop_reason={choice.stop_reason}). "
                "If the reasoning exhausted the budget, increase --max-tokens "
                "or use --reasoning-effort low."
            )
        choice.message.content = content
    return output


class FinalTextModel:
    """Delegate requests unchanged, exposing final text to Expecto's MultiGen."""

    def __init__(self, model):
        self.model = model

    def __getattr__(self, name):
        return getattr(self.model, name)

    async def generate(self, *args, **kwargs):
        output = await self.model.generate(*args, **kwargs)
        return final_text_output(output)


def create_model(settings):
    from inspect_ai.model import GenerateConfig, get_model

    together = settings["model"].startswith("together/")
    if together and not os.environ.get("TOGETHER_API_KEY", "").strip():
        raise ValueError(
            "TOGETHER_API_KEY is missing. Set it in the environment or "
            "baseline/expecto-artifact/.env."
        )
    if (
        together
        and settings["use_memo"]
        and not os.environ.get("OPENAI_API_KEY", "").strip()
    ):
        raise ValueError(
            "--memo uses upstream OpenAI embeddings and needs OPENAI_API_KEY. "
            "Use --no-memo to run with only TOGETHER_API_KEY."
        )
    config = GenerateConfig(
        **{
            key: settings[key]
            for key in ("max_tokens", "reasoning_effort")
            if settings[key] is not None
        }
    )
    kwargs = dict(config=config)
    if together:
        kwargs["base_url"] = settings["base_url"]
    model = get_model(settings["model"], **kwargs)
    return FinalTextModel(model) if together else model
