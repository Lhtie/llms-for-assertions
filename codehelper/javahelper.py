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
    "./java-testgen/junit.jar",
    "./java-thirdparty/commons-collections4-4.5.0.jar",
    "./java-thirdparty/gs-core-2.0.jar",
    "./java-thirdparty/jgrapht-core-1.5.2.jar"
]
combinedcodes = "./combinedcodes"

def dropext(typ):
    # remove ambiguous extended types
    typ = re.sub(r"\s*\?\s+extends\s+", "", typ)
    return typ

def closing_paren(string, start):
    # Find the closing parenthesis for the opening parenthesis at index `start`
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

def contains_var(expr, var_name):
    # Check if the expression contains the variable name
    # but not as a part of another variable name
    pattern = r'\b' + re.escape(var_name) + r'\b'
    return re.search(pattern, expr) is not None

def find_bounds(cond_expr, var_name):
    lo, hi = None, None
    for cond in cond_expr.split("&&"):
        cond = cond.strip()
        if ">" in cond or ">=" in cond:
            lhs, rhs = cond.split(">=") if ">=" in cond else cond.split(">")
            lhs = lhs.strip()
            rhs = rhs.strip()
            if lhs == var_name and not contains_var(rhs, var_name):
                lo = rhs if ">=" in cond else f"{rhs} + 1"
            elif rhs == var_name and not contains_var(lhs, var_name):
                hi = lhs if ">=" in cond else f"{lhs} - 1"
        elif "<" in cond or "<=" in cond:
            lhs, rhs = cond.split("<=") if "<=" in cond else cond.split("<")
            lhs = lhs.strip()
            rhs = rhs.strip()
            if lhs == var_name and not contains_var(rhs, var_name):
                hi = rhs if "<=" in cond else f"{rhs} - 1"
            elif rhs == var_name and not contains_var(lhs, var_name):
                lo = lhs if "<=" in cond else f"{lhs} + 1"

    return lo if lo is not None else "-65536", hi if hi is not None else "65536"
    
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
        self.old_exprs = {}             # map raw \old exprs: tuple(var name, replaced exprs)
        self.old_vars = {}              # map var names: raw \old exprs
        self.asrt_exprs = {}            # map asrt expr names: asrt exprs
    
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
        if "==>" in asrt:
            fp, sp = asrt.split("==>")
            return f"!({fp.strip()}) || ({sp.strip()})"
        return asrt
    
    def handle_old(self, asrt):
        tr = parseTree()

        def recursive_replace(asrt, par):
            cur = tr.add_node(asrt, par)

            while True:
                m = re.search(r"\\old", asrt)
                if not m:
                    break
                start = m.span()[0]
                end = closing_paren(asrt, m.span()[1])
                old_expr = asrt[start + 5:end - 1]

                if old_expr not in self.old_exprs:
                    replaced_asrt = recursive_replace(old_expr, cur)
                    new_expr = f"OLD_var{self.old_exprs.__len__()}"
                    self.old_exprs[old_expr] = (new_expr, replaced_asrt)
                    self.old_vars[new_expr] = old_expr
                else:
                    new_expr = self.old_exprs[old_expr][0]
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
                old_addns += [f"var {self.old_exprs[node.value][0]} = exec(() -> {self.old_exprs[node.value][1]});"]
            return old_addns
        
        old_addns = traverse_tree(tr.root)
        return old_addns, asrt
    
    def handle_forall(self, asrt):
        old_addns, forall_addns = [], []
        forall_idx = 0

        while True:
            m = re.search(r"\\forall", asrt)
            if not m:
                break
            start = m.span()[0]
            end = closing_paren(asrt[:start] + "(" + asrt[start+1:] + ")", start)
            forall_expr = asrt[start:end-1]
            match = re.match(r"\\forall\s*(.*?);(.*?);(.*)", forall_expr)

            var_expr = match.group(1).strip()
            cond_expr = match.group(2).strip()
            spec_expr = match.group(3).strip()

            var_type, var_name = var_expr.split()
            if var_type != "int":
                raise Exception("Only int type is supported for forall quantifier")
            
            lo, hi = find_bounds(cond_expr, var_name)
            old_addns_lo, lo = self.handle_old(lo)
            old_addns_hi, hi = self.handle_old(hi)
            old_addns += old_addns_lo + old_addns_hi

            old_addns_cond, cond_expr = self.handle_old(cond_expr)
            old_addns_spec, spec_expr = self.handle_old(spec_expr)
            old_addns_arr = []
            for t in old_addns_cond + old_addns_spec:
                old_var_name, old_expr = t[4:-1].split(" = ")
                if not contains_var(old_expr, var_name):
                    old_addns.append(t)
                else:
                    # upd old_exprs map
                    self.old_exprs.pop(self.old_vars[old_var_name])
                    self.old_vars.pop(old_var_name)
                    old_addns_arr.append((f"{old_var_name}_forallidx{forall_idx}", old_expr))

            if old_addns_arr != []:
                for old_var_name, old_expr in old_addns_arr:
                    old_addns += [
                        f"var {old_var_name} = exec(() -> {{",
                        f"\tint capacity = ({hi}) - ({lo}) + 1;",
                        f"\tObject ex = {old_expr.replace(var_name, lo)[11:-1]};",
                        f"\tvar ret = Array.newInstance(ex.getClass(), capacity);",
                        f"\tint cur_idx = 0;",
                        f"\tfor ({var_type} {var_name} = {lo}; {var_name} <= {hi}; {var_name} += 1) {{",
                        f"\t\tArray.set(ret, cur_idx, {old_expr[11:-1]});",
                        f"\t\tcur_idx += 1;",
                        f"\t}}",
                        f"\treturn ret;",
                        f"}});",
                    ]
                for old_var_name, old_expr in old_addns_arr:
                    cond_expr = cond_expr.replace(
                        old_var_name.split("_forallidx")[0], f"Array.get({old_var_name}, cur_idx)")
                    spec_expr = spec_expr.replace(
                        old_var_name.split("_forallidx")[0], f"Array.get({old_var_name}, cur_idx)")

            forall_addns += [
                f"Boolean forall_holds_forallidx{forall_idx} = exec(() -> {{",
                f"\tboolean ret = true;",
                f"\tint cur_idx = 0;",
                f"\tfor ({var_type} {var_name} = {lo}; {var_name} <= {hi}; {var_name} += 1) {{",
                f"\t\tif ({cond_expr}) {{",
                f"\t\t\tret &= {spec_expr};",
                f"\t\t}}",
                f"\t\tcur_idx += 1;",
                f"\t}}",
                f"\treturn ret;",
                f"}});",
            ]
            asrt = asrt[:start] + f"forall_holds_forallidx{forall_idx}" + asrt[start + len(forall_expr):]
            forall_idx += 1

        return forall_addns, old_addns, asrt

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
        match = re.match(r".*assert\s*(.*)\s*;.*", asrt.strip())
        assert match, "Assertion not in the required format"
        asrt = match.group(1)
        asrt = self.handle_implies(asrt)

        return asrt.strip()
    
    def split_formula(self, asrt):
        tr = parseTree()
        self.asrt_exprs = {}

        def split_top_level(asrt, delimiter):
            while asrt[0] == "(" and asrt[-1] == ")":
                balance = 0
                for i, c in enumerate(asrt[1:-1]):
                    balance += (c == "(") - (c == ")")
                    if balance < 0:
                        break
                if balance == 0:
                    asrt = asrt[1:-1]
                else:
                    break

            stack, ret = [], []
            buff = ""
            idx = 0
            while idx < len(asrt):
                if len(stack) == 0 and asrt[idx:idx+len(delimiter)] == delimiter:
                    if buff.strip():
                        ret.append(buff.strip())
                    buff = ""
                    idx += len(delimiter)
                    continue
                if asrt[idx] == "(":
                    stack.append(idx)
                if asrt[idx] == ")":
                    stack.pop()
                buff += asrt[idx]
                idx += 1
            if buff.strip():
                ret.append(buff.strip())
            return ret
                
        def recursive_split(asrt, par):
            cur = tr.add_node((asrt, None), par)
            for delimiter in ["||", "&&", "==", "!="]:
                cur.value = (cur.value[0], ' ' + delimiter + ' ')
                parts = split_top_level(asrt, delimiter)
                if len(parts) > 1:
                    for part in parts:
                        recursive_split(part, cur)
                    break
        
        def traverse_tree(node):
            if len(node.children) == 0:
                self.asrt_exprs[f"fuzzexpr{self.asrt_exprs.__len__()}"] = node.value[0]
                return f"fuzzexpr{self.asrt_exprs.__len__() - 1}"
            child_asrts = []
            for child in node.children:
                child_asrt = traverse_tree(child)
                child_asrts.append(child_asrt)
            if node != tr.root:
                self.asrt_exprs[f"fuzzexpr{self.asrt_exprs.__len__()}"] = node.value[1].join(child_asrts)
                return f"fuzzexpr{self.asrt_exprs.__len__() - 1}"
            else:
                return node.value[1].join(child_asrts)

        recursive_split(asrt, None)
        asrt = traverse_tree(tr.root)
        split_addns = []
        for k, v in self.asrt_exprs.items():
            split_addns.append(f"Boolean {k} = exec(() -> {v});")
        return split_addns, asrt
    
    def trans_formula(self, asrt):
        asrt = asrt.replace("this", self.fuzz_objname)
        asrt = asrt.replace("\\result", self.fuzz_retvar)

        forall_addns, old_addns_0, asrt = self.handle_forall(asrt)
        old_addns_1, asrt = self.handle_old(asrt)
        split_addns, asrt = self.split_formula(asrt)

        return asrt, old_addns_0 + old_addns_1, forall_addns, split_addns

    def func_call(self, funcname, args):
        assert funcname in self.funcs, f"Function {funcname} not found"

        if self.funcs[funcname]["iscstr"]:
            return f"{self.fuzz_objname} = new {self.classname}({', '.join(args)});"
        elif self.funcs[funcname]["rtyp"] == "void":
            return f"{self.fuzz_objname}.{funcname}({', '.join(args)});"
        else:
            return f"var {self.fuzz_retvar} = {self.fuzz_objname}.{funcname}({', '.join(args)});"
