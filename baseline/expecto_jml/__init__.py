"""Translate the supported Expecto DSL subset into JML postconditions."""

from .translator import TranslationError, translate

__all__ = ["TranslationError", "translate"]
