import json
import os
import shutil
import subprocess
from dataclasses import dataclass


DEFAULT_CLAUDE_CODE_BIN = os.environ.get("CLAUDE_CODE_BIN", "claude")
DEFAULT_CLAUDE_CODE_TIMEOUT_SEC = int(
    os.environ.get("CLAUDE_CODE_TIMEOUT_SEC", "600")
)


def _stringify_message_content(content):
    if isinstance(content, str):
        return content.strip()

    if isinstance(content, list):
        parts = []
        for block in content:
            if isinstance(block, dict):
                text = block.get("text")
                if isinstance(text, str):
                    parts.append(text.strip())
                else:
                    parts.append(json.dumps(block, ensure_ascii=False))
            else:
                parts.append(str(block).strip())
        return "\n".join(part for part in parts if part).strip()

    return str(content).strip()


def _extract_text_from_response_content(content):
    if isinstance(content, str):
        return content.strip()

    if isinstance(content, list):
        parts = []
        for block in content:
            if not isinstance(block, dict):
                continue
            text = block.get("text")
            if isinstance(text, str) and text.strip():
                parts.append(text.strip())
        return "\n".join(parts).strip()

    return ""


def _chat_messages_to_prompt(prompt):
    if isinstance(prompt, str):
        text = prompt.strip()
        if not text:
            raise ValueError("Claude Code prompt is empty")
        return "", text

    if not isinstance(prompt, list):
        raise TypeError("Claude Code prompts must be a string or chat message list")

    system_messages = []
    transcript = []
    last_role = None
    for message in prompt:
        role = message.get("role", "user")
        content = _stringify_message_content(message.get("content", ""))
        if not content:
            continue

        if role == "system":
            system_messages.append(content)
            continue

        if role == "assistant":
            speaker = "Assistant"
        elif role == "user":
            speaker = "User"
        else:
            speaker = str(role).capitalize()

        transcript.append(f"{speaker}:\n{content}")
        last_role = role

    prompt_text = "\n\n".join(transcript).strip()
    if not prompt_text:
        raise ValueError("Claude Code prompt is empty")
    if last_role != "assistant":
        prompt_text += "\n\nAssistant:"

    system_prompt = "\n\n".join(system_messages).strip()
    return system_prompt, prompt_text


def _parse_claude_code_output(raw_output):
    output = raw_output.strip()
    print(f"Raw Claude Code output:\n{output}\n--- End of output ---")
    if not output:
        return ""

    try:
        payload = json.loads(output)
    except json.JSONDecodeError:
        return output

    if isinstance(payload, dict):
        for key in ("result", "text", "output", "completion"):
            value = payload.get(key)
            if isinstance(value, str) and value.strip():
                return value.strip()

        message = payload.get("message")
        if isinstance(message, dict):
            content = _extract_text_from_response_content(message.get("content"))
            if content:
                return content

        messages = payload.get("messages")
        if isinstance(messages, list):
            parts = []
            for message in messages:
                if not isinstance(message, dict):
                    continue
                if message.get("role") != "assistant":
                    continue
                content = _extract_text_from_response_content(message.get("content"))
                if content:
                    parts.append(content)
            if parts:
                return "\n\n".join(parts).strip()

    return output


@dataclass
class ClaudeCodeClient:
    model_name: str
    cli_path: str = DEFAULT_CLAUDE_CODE_BIN
    timeout_sec: int = DEFAULT_CLAUDE_CODE_TIMEOUT_SEC

    def __post_init__(self):
        if shutil.which(self.cli_path) is None:
            raise FileNotFoundError(
                f"Claude Code CLI '{self.cli_path}' was not found in PATH"
            )

    def _build_command(self, system_prompt):
        command = [
            self.cli_path,
            "-p",
            "--model",
            self.model_name,
            "--output-format",
            "json",
            "--permission-mode",
            "dontAsk",
            "--no-session-persistence",
        ]
        if system_prompt:
            command.extend(["--system-prompt", system_prompt])
        return command

    def generate(self, prompt, *, temp=0.0, max_tokens=1024):
        del temp
        del max_tokens

        system_prompt, prompt_text = _chat_messages_to_prompt(prompt)
        try:
            result = subprocess.run(
                self._build_command(system_prompt) + [prompt_text],
                capture_output=True,
                text=True,
                check=False,
                timeout=self.timeout_sec,
            )
        except subprocess.TimeoutExpired as exc:
            raise RuntimeError(
                "Claude Code command timed out after "
                f"{self.timeout_sec} seconds"
            ) from exc

        if result.returncode != 0:
            error_message = result.stderr.strip() or result.stdout.strip()
            raise RuntimeError(
                f"Claude Code command failed with exit code {result.returncode}: "
                f"{error_message}"
            )

        return _parse_claude_code_output(result.stdout)
