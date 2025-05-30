import re
import itertools
from xml.etree import ElementTree

import sys
import os
sys.path.append(os.path.abspath(os.path.join(os.path.dirname(__file__), "..")))

from codehelper.codehelper import codehelper
from utils.parsetree import parseTree
    
obs_funcs = [
    "isEmpty", "size", "get", "indexOf", "lastIndexOf", "contains"
]
third_party = [
    "./java-testgen/randoop",
    "./java-testgen/hamcrest-core.jar",
    "./java-testgen/junit.jar"
]
combinedcodes = "./combinedcodes"

def dropext(typ):
    # remove ambiguous extended types
    typ = re.sub(r"\s*\?\s+extends\s+", "", typ)
    return typ

def closing_paren(string, start):
    if string[start] not in "[({":
        return start
    left = string[start]
    right = {"[":"]", "(":")", "{":"}"}[left]
    end, balance = start + 1, 1
    while end < len(string):
        if balance == 0: return end
        if string[end] == left: balance += 1
        elif string[end] == right: balance -= 1   
        end += 1
    return end
    
class javahelper(codehelper):
    def __init__(self, code):
        super().__init__(
            "java",
            code,
            fuzz_objname = "fuzzobj", 
            fuzz_argname = "fuzzarg", 
            fuzz_retvar = "New_Ret"
        )

        self.imports = self.guessimports()
        self.namespace = self.guessnamespace()
        self.classname = self.guessclassname()
        self.funcname = self.guessfuncname()

        self.anlyz_class()
    
    def anlyz_class(self):
        self.funcs = {}
        for l in self.code.split("\n"):
            match1 = re.match(r".*public ([\w\[\]]+) (\w+)\((.*)\).*", l.strip())
            match2 = re.match(r".*public (\w+)\((.*)\).*", l.strip())
            if match1:
                retType = dropext(match1.group(1).strip())
                funcname = match1.group(2)
                if match1.group(3) == "":
                    args = []
                else:
                    args = [dropext(arg.strip()) # we remove extended types
                        for arg in match1.group(3).split(",")]
                iscstr = False
            if match2:
                retType = "void"
                funcname = match2.group(1)
                if match2.group(2) == "":
                    args = []
                else:
                    args = [dropext(arg.strip()) # we remove extended types
                        for arg in match2.group(2).split(",")]
                iscstr = True
            if match1 or match2:
                self.funcs[funcname] = {
                    "rtyp": retType, 
                    "args": {arg.split()[1]: arg.split()[0] for arg in args},
                    "isobs": funcname in obs_funcs,
                    "iscstr": iscstr,
                }
                
    def handle_implies(self, asrt):
        if "=>" in asrt:
            fp, sp = asrt.split("=>")
            return f"!({fp.strip()}) || ({sp.strip()})"
        return asrt
    
    def handle_old(self, asrt):
        tr = parseTree()
        old_exprs = dict()

        def recursive_replace(asrt, par):
            cur = tr.add_node(asrt, par)

            while True:
                m = re.search(r"\\old", asrt)
                if not m:
                    break
                start = m.span()[0]
                end = closing_paren(asrt, m.span()[1])
                old_expr = asrt[start + 5:end - 1]

                if old_expr not in old_exprs:
                    replaced_asrt = recursive_replace(old_expr, cur)
                    new_expr = f"OLD_var{old_exprs.__len__()}"
                    old_exprs[old_expr] = (new_expr, replaced_asrt)
                else:
                    new_expr = old_exprs[old_expr][0]
                asrt = asrt[:m.span()[0]] + new_expr + asrt[end:]

            return asrt
    
        asrt = recursive_replace(asrt, None)

        def traverse_tree(node):
            if node is None:
                return []
            old_addns = []
            for child in node.children:
                old_addns += traverse_tree(child)
            if node != tr.root:
                old_addns += [f"var {old_exprs[node.value][0]} = {old_exprs[node.value][1]};"]
            return old_addns
        
        old_addns = traverse_tree(tr.root)
        return old_addns, asrt

    def guessimports(self):
        import_list = []
        for l in self.code.split("\n"):
            match = re.match(r".*import (.*?);.*", l.strip())
            if match:
                import_list.append(match.group(1))
        return import_list

    def guessfuncname(self):
        for l in self.code.split("\n")[::-1]:
            match = re.match(r".*public [\w\[\]]+ (\w+).*", l.strip())
            if match:
                return match.group(1)
            match = re.match(r".*public (\w+).*", l.strip())
            if match:
                return match.group(1)
        raise Exception("Function name not found")

    def guessnamespace(self):
        for l in self.code.split("\n")[::-1]:
            match = re.match(r".*public class (\w+).*", l.strip())
            if match:
                return match.group(1)
        raise Exception("Namespace not found")
        
    def guessclassname(self):
        for l in self.code.split("\n")[::-1]:
            match = re.match(r".*public class ([\w<>]+).*", l.strip())
            if match:
                return match.group(1)
        raise Exception("Class name not found")

    def extract_formula(self, asrt):
        match = re.match(r".*Assert\s*(.*)\s*;.*", asrt.strip())
        assert match, "Assertion not in the required format"
        asrt = match.group(1)
        return asrt.strip()
    
    def trans_formula(self, asrt):
        asrt = self.handle_implies(asrt)
        asrt = asrt.replace("this", self.fuzz_objname)
        asrt = asrt.replace("\\result", self.fuzz_retvar)

        old_addns, asrt = self.handle_old(asrt)
        return asrt, old_addns 

    def func_call(self, funcname, args):
        assert funcname in self.funcs, f"Function {funcname} not found"

        if self.funcs[funcname]["iscstr"]:
            return f"{self.fuzz_objname} = new {self.classname}({', '.join(args)});"
        elif self.funcs[funcname]["rtyp"] == "void":
            return f"{self.fuzz_objname}.{funcname}({', '.join(args)});"
        else:
            return f"var {self.fuzz_retvar} = {self.fuzz_objname}.{funcname}({', '.join(args)});"