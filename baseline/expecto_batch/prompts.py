"""Prompt for translating one benchmark description into an Expecto spec."""

BATCH_PROMPT = """Translate the description below into a formal specification in Expecto DSL, using the Java method code as context.
The specification should express the property stated in the description.

Description:
{description}

Method code:
```java
{code}
```
"""


DEFAULT_ROOT_DESCRIPTION = "Translate this description into an equivalent Expecto DSL spec: {description}. Express only the stated property; use the method code only as context."


def build_root_description(method_info, template=DEFAULT_ROOT_DESCRIPTION):
    """Substitute only the description token; preserve literal DSL braces."""
    if not isinstance(template, str) or not template.strip():
        raise ValueError("Root spec description must be a nonempty string")
    return template.replace("{description}", method_info.javadoc["description"])


def build_assertion_prompt(method_info, variant="default"):
    if variant == "pipeline-fewshot":
        from prompting import transform

        # transform removes the line after @@@ (the ground-truth slot). Supply
        # an empty slot, never the benchmark's actual reference assertion.
        code = method_info.code + "\n// @@@ " + method_info.javadoc["description"] + "\n\n"
        prompt = transform(None, "default", None, code, "java", True)[0]["content"]
        prompt += (
            "\n\nExpecto output adaptation: the preceding JML examples and syntax "
            "rules illustrate the intended property semantics. For this experiment, "
            "express the property in Expecto DSL using the provided entry/exit schemas "
            "and the required predicate signature. Follow the surrounding Expecto "
            "DSL generation format, not the Java assert or <code> output format above. "
            "Map \\old expressions to entry-state observations, current expressions "
            "to exit-state observations, and \\result to ret. Do not add properties "
            "beyond the natural-language assertion."
        )
        representation = method_info.javadoc.get("state_representation")
        if representation:
            prompt += "\nState representation (public Java observers):\n" + representation + "\n"
        return prompt
    if variant != "default":
        raise ValueError(f"Unknown prompt variant: {variant}")
    prompt = BATCH_PROMPT.format(
        description=method_info.javadoc["description"],
        code=method_info.code,
    )

    representation = method_info.javadoc.get("state_representation")
    if representation:
        prompt += "\nState representation (public Java observers):\n" + representation + "\n"
    return prompt
