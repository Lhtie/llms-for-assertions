from abc import ABC, abstractmethod

class codehelper(ABC):
    def __init__(self, langid, code, fuzz_objname, fuzz_argname, fuzz_retvar):
        self.langid = langid
        self.code = code

        self.fuzz_objname = fuzz_objname
        self.fuzz_argname = fuzz_argname
        self.fuzz_retvar = fuzz_retvar
    