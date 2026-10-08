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


def build_assertion_prompt(method_info):
    prompt = BATCH_PROMPT.format(
        description=method_info.javadoc["description"],
        code=method_info.code,
    )

    representation = method_info.javadoc.get("state_representation")
    if representation:
        prompt += "\nState representation (public Java observers):\n" + representation + "\n"
    return prompt
