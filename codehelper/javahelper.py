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

def drop(typ):
    # drop final, static, synchronized keywords from type
    typ = re.sub(r"\s*\b(?:final|static|synchronized)\b", "", typ)
    # drop extended types from generics, e.g., "? extends E" -> "E"
    typ = re.sub(r"\?\s+extends\s+([\w$]+)", r"\1", typ)
    return typ.strip()

def split_args_outside_generics(s: str):
    res, buf = [], []
    depth_angle = depth_paren = depth_brack = 0

    for ch in s:
        if ch == '<': depth_angle += 1
        elif ch == '>': depth_angle -= 1
        elif ch == '(': depth_paren += 1
        elif ch == ')': depth_paren -= 1
        elif ch == '[': depth_brack += 1
        elif ch == ']': depth_brack -= 1

        if ch == ',' and depth_angle == 0 and depth_paren == 0 and depth_brack == 0:
            res.append(''.join(buf).strip())
            buf = []
            continue

        buf.append(ch)

    if buf or (s and s[-1] == ','):
        res.append(''.join(buf).strip())
    return res

def closing_paren(string, start):
    # Find the closing parenthesis for the opening parenthesis at index `start`
    if string[start] not in "[({":
        return start
    left = string[start]
    right = {"[":"]", "(":")", "{":"}"}[left]
    end, balance = start + 1, 1
    while end < len(string):
        if string[end] == left: balance += 1
        elif string[end] == right: balance -= 1   
        end += 1
        if balance == 0: return end
    raise AssertionError(f"Unmatched '{left}' in expression")

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
        self.anlyz_class()
        self.funcname = self.guessfuncname()

        self.old_exprs = {}             # map raw \old exprs: tuple(var name, replaced exprs)
        self.old_vars = {}              # map var names: raw \old exprs
        self.asrt_exprs = {}            # map asrt expr names: asrt exprs
        self.forall_idx = 0
        self.asrt_exprs = {}
        self.asrt_operands = []

    def _get_documentation(self, line):
        start = line - 1
        code = self.code.split("\n")
        while code[start].strip().startswith(tuple(["//", "/*", "*", "*/", "@"])):
            start -= 1
        return "\n".join([l.strip() for l in code[start+1:line]]) if start + 1 < line else ""
    
    def anlyz_class(self):
        self.funcs = []
        
        ret, buff = [], []
        balance = 0
        for i, l in enumerate(self.code.split("\n")):
            balance += l.count("(") - l.count(")")
            buff.append((i, l))
            if balance == 0:
                line = "\n".join([x for _, x in buff])
                pattern = r"""^(public|protected|private)?\s*
                            (static\s+)?
                            (final\s+)?
                            (synchronized\s+)?
                            (<\w+(\s*,\s*\w+)*>\s+)?
                            (?!if|else|for|while|switch|catch|throw|return|
                                public|protected|private|static|final|synchronized)\b
                            (\w+[\w\<\>\[\],\s\?]*)\s+
                            (\w+)\s*
                            \(([\w\<\>\[\],\s\?]*)\)\s*
                            ({|;)?.*
                        """
                match1 = re.match(pattern, line.strip(), re.VERBOSE)
                if match1:
                    generic = match1.group(5)
                    retType = drop(match1.group(7).strip())
                    funcname = match1.group(8)
                    if match1.group(9) == "":
                        args = []
                    else:
                        args = [drop(arg.strip()) # we remove extended types
                            for arg in split_args_outside_generics(match1.group(9))]
                    iscstr = False
                pattern = r"""^(public|protected|private)?\s*
                            (static\s+)?
                            (final\s+)?
                            (synchronized\s+)?
                            (<\w+(\s*,\s*\w+)*>\s+)?
                        """ + self.namespace + r"""\s*
                            \(([\w\<\>\[\],\s\?]*)\)\s*
                            ({|;)?.*
                        """
                match2 = re.match(pattern, line.strip(), re.VERBOSE)
                if match2:
                    generic = match2.group(5)
                    retType = "void"
                    funcname = self.namespace
                    if match2.group(7) == "":
                        args = []
                    else:
                        args = [drop(arg.strip()) # we remove extended types
                            for arg in split_args_outside_generics(match2.group(7))]
                    iscstr = True
                if match1 or match2:
                    self.funcs.append({
                        "funcname": funcname,
                        "rtyp": retType, 
                        "args": {arg.rsplit(' ', 1)[1]: arg.rsplit(' ', 1)[0] for arg in args},
                        "docs": self._get_documentation(buff[0][0]),
                        "isobs": funcname in obs_funcs,
                        "iscstr": iscstr,
                        "generic": generic.strip() if generic is not None else None
                    })
                buff = []
                
    def handle_implies(self, asrt):
        return asrt.replace("==>", "=>").replace("->", "=>").replace("-->", "=>")
    
    def handle_old(self, asrt):
        tr = parseTree()

        def recursive_replace(asrt, par):
            cur = tr.add_node(asrt, par)

            while True:
                m = re.search(r"\\old", asrt)
                if not m:
                    break
                start = m.span()[0]
                if m.span()[1] >= len(asrt) or asrt[m.span()[1]] != "(":
                    raise AssertionError(r"\\old must be followed by parenthesized expression")
                end = closing_paren(asrt, m.span()[1])
                old_expr = asrt[start + 5:end - 1]
                if old_expr.strip() == "":
                    raise AssertionError(r"\\old() cannot be empty")

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

        while True:
            m = re.search(r"\\forall", asrt)
            if not m:
                break
            start = m.span()[0]
            end = closing_paren(asrt[:start] + "(" + asrt[start+1:] + ")", start)
            forall_expr = asrt[start:end-1]
            match = re.match(r"\\forall\s*(.*?);(.*?);(.*)", forall_expr)
            if match is None:
                raise AssertionError(r"\\forall must have format '\\forall <type var>; <cond>; <spec>'")

            var_expr = match.group(1).strip()
            cond_expr = match.group(2).strip()
            spec_expr = match.group(3).strip()
            if var_expr == "" or cond_expr == "" or spec_expr == "":
                raise AssertionError(r"\\forall parts cannot be empty")

            var_parts = var_expr.split()
            if len(var_parts) != 2:
                raise AssertionError(r"\\forall variable declaration must be '<type> <name>'")
            var_type, var_name = var_parts
            if var_type != "int":
                raise AssertionError("Only int type is supported for forall quantifier")
            
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
                    old_addns_arr.append((f"{old_var_name}_forallidx{self.forall_idx}", old_expr))

            if old_addns_arr != []:
                for old_var_name, old_expr in old_addns_arr:
                    ex = re.sub(rf'\b{re.escape(var_name)}\b', lo, old_expr)[11:-1]
                    sample_name = f"{old_var_name}_sample"
                    old_addns += [
                        f"var {sample_name} = exec(() -> {ex});",
                        f"var {old_var_name} = exec(() -> {{",
                        f"\tint capacity = ({hi}) - ({lo}) + 1;",
                        f"\tvar ret = Array.newInstance({sample_name}.getClass(), capacity);",
                        f"\tint cur_idx = 0;",
                        f"\tfor ({var_type} {var_name} = {lo}; {var_name} <= {hi}; {var_name} += 1) {{",
                        f"\t\tArray.set(ret, cur_idx, {old_expr[11:-1]});",
                        f"\t\tcur_idx += 1;",
                        f"\t}}",
                        f"\treturn ret;",
                        f"}});",
                    ]
                for old_var_name, old_expr in old_addns_arr:
                    sample_name = f"{old_var_name}_sample"
                    cond_expr = cond_expr.replace(
                        old_var_name.split("_forallidx")[0], f"get_from_array({old_var_name}, cur_idx, {sample_name})")
                    spec_expr = spec_expr.replace(
                        old_var_name.split("_forallidx")[0], f"get_from_array({old_var_name}, cur_idx, {sample_name})")

            forall_addns += [
                f"Boolean forall_holds_forallidx{self.forall_idx} = Boolean.TRUE.equals(exec(() -> {{",
                f"\tboolean ret = true;",
                f"\tint _cur_idx = 0;",
                f"\tfor ({var_type} _{var_name} = {lo}; _{var_name} <= {hi}; _{var_name} += 1) {{",
                f"\t\tint cur_idx = _cur_idx;",
                f"\t\tint {var_name} = _{var_name};",
                f"\t\tif ({cond_expr}) {{"
            ]
            split_addns, spec_expr = self.split_formula(spec_expr)
            forall_addns += ["\t\t\t" + addn for addn in split_addns]
            forall_addns += [
                f"\t\t\tret &= Boolean.TRUE.equals(exec(() -> {spec_expr}));",
                f"\t\t}}",
                f"\t\t_cur_idx += 1;",
                f"\t}}",
                f"\treturn ret;",
                f"}}));",
            ]
            asrt = asrt[:start] + f"forall_holds_forallidx{self.forall_idx}" + asrt[start + len(forall_expr):]
            self.forall_idx += 1

        return forall_addns, old_addns, asrt

    def guessimports(self):
        import_list = []
        for l in self.code.split("\n"):
            match = re.match(r".*import\s+(.*?);.*", l.strip())
            if match:
                import_list.append(match.group(1))
        return import_list

    def guessfuncname(self):
        if len(self.funcs) > 0:
            return self.funcs[-1]["funcname"]
        else:
            raise AssertionError("Function name not found")

    def guessnamespace(self):
        for l in self.code.split("\n"):
            match = re.match(r".*public\s+class\s+(\w+).*", l.strip())
            if match:
                return match.group(1)
        raise AssertionError("Namespace not found")
        
    def guessclassname(self):
        for l in self.code.split("\n"):
            match = re.match(r".*public\s+class\s+(\w+\s*(<\w+(\s*,\s*\w+)*>)?).*", l.strip())
            if match:
                return match.group(1)
        raise AssertionError("Class name not found")

    def extract_formula(self, asrt):
        match = re.match(r".*assert\s*(.*)\s*;.*", asrt.strip())
        assert match, "Assertion not in the required format"
        assert len(re.findall(r"assert", asrt.strip())) == 1, "Only allow one assertion"
        
        asrt = match.group(1)
        asrt = self.handle_implies(asrt)

        return asrt.strip()
    
    def split_formula(self, asrt):
        tr = parseTree()

        def split_top_level(asrt, delimiter):
            stack, ret = [], []
            buff = ""
            idx = 0
            seen_delimiter = False
            while idx < len(asrt):
                if len(stack) == 0 and asrt[idx:idx+len(delimiter)] == delimiter:
                    seen_delimiter = True
                    if not buff.strip():
                        raise AssertionError(f"Invalid formula around '{delimiter}'")
                    ret.append(buff.strip())
                    buff = ""
                    idx += len(delimiter)
                    continue
                if asrt[idx] == "(":
                    stack.append(idx)
                if asrt[idx] == ")":
                    if not stack:
                        raise AssertionError("Unmatched ')' in formula")
                    stack.pop()
                buff += asrt[idx]
                idx += 1
            if stack:
                raise AssertionError("Unmatched '(' in formula")
            if seen_delimiter and not buff.strip():
                raise AssertionError(f"Invalid formula around '{delimiter}'")
            if buff.strip():
                ret.append(buff.strip())
            return ret
                
        def recursive_split(asrt, par):
            asrt = asrt.strip()
            if asrt == "":
                raise AssertionError("Empty assertion formula")
            while asrt and asrt[0] == "(" and asrt[-1] == ")":
                balance = 0
                for i, c in enumerate(asrt[1:-1]):
                    balance += (c == "(") - (c == ")")
                    if balance < 0:
                        break
                if balance == 0:
                    asrt = asrt[1:-1]
                    if asrt.strip() == "":
                        raise AssertionError("Empty assertion formula")
                else:
                    break
            cur = tr.add_node((asrt, None), par)
            for delimiter in ["=>", "||", "&&", "=="]:
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
                fuzzexpr = f"fuzzexpr{self.asrt_exprs.__len__()}"
                if node.value[1].strip() == "=>":
                    assert len(child_asrts) == 2, "Implication should have exactly two parts"
                    self.asrt_exprs[fuzzexpr] = f"!{child_asrts[0]} || {child_asrts[1]}"
                elif node.value[1].strip() == "==":
                    assert len(child_asrts) == 2, "Equality should have exactly two parts"
                    self.asrt_operands += child_asrts
                    if self.asrt_exprs[child_asrts[0]] == "null" or self.asrt_exprs[child_asrts[1]] == "null":
                        self.asrt_exprs[fuzzexpr] = f"{child_asrts[0]} == {child_asrts[1]}"
                    else:
                        self.asrt_exprs[fuzzexpr] = f"Objects.equals({child_asrts[0]}, {child_asrts[1]})"
                else:
                    self.asrt_exprs[fuzzexpr] = node.value[1].join(child_asrts)
                return fuzzexpr
            else:
                if node.value[1].strip() == "=>":
                    assert len(child_asrts) == 2, "Implication should have exactly two parts"
                    return f"!{child_asrts[0]} || {child_asrts[1]}"
                elif node.value[1].strip() == "==":
                    assert len(child_asrts) == 2, "Equality should have exactly two parts"
                    self.asrt_operands += child_asrts
                    if self.asrt_exprs[child_asrts[0]] == "null" or self.asrt_exprs[child_asrts[1]] == "null":
                        return f"{child_asrts[0]} == {child_asrts[1]}"
                    else:
                        return f"Objects.equals({child_asrts[0]}, {child_asrts[1]})"
                else:
                    return node.value[1].join(child_asrts)

        recursive_split(asrt, None)
        start = len(self.asrt_exprs)
        asrt = traverse_tree(tr.root)
        split_addns = []
        for k, v in list(self.asrt_exprs.items())[start:]:
            if k in self.asrt_operands:
                split_addns.append(f"var {k} = exec(() -> {v});")
            else:
                split_addns.append(f"Boolean {k} = Boolean.TRUE.equals(exec(() -> {v}));")
        return split_addns, asrt
    
    def trans_formula(self, asrt):
        asrt = asrt.replace("this", self.fuzz_objname)
        asrt = asrt.replace("\\result", self.fuzz_retvar)

        forall_addns, old_addns_0, asrt = self.handle_forall(asrt)
        old_addns_1, asrt = self.handle_old(asrt)
        split_addns, asrt = self.split_formula(asrt)

        return asrt, old_addns_0 + old_addns_1, forall_addns, split_addns

    def func_call(self, func):
        funcname = func["funcname"]
        args = func["args"].keys()

        if func["iscstr"]:
            return [
                f"var paired_ret = func_call_supplier(() -> new {self.classname}({', '.join(args)}));",
                f"var {self.fuzz_objname}_final = paired_ret.first;",
                f"String exceptionType = paired_ret.second;"
            ]
        elif func["rtyp"] == "void":
            return [
                f"String exceptionType = func_call_runnable(() -> {self.fuzz_objname}.{funcname}({', '.join(args)}));"
            ]
        else:
            return [
                f"var paired_ret = func_call_supplier(() -> {self.fuzz_objname}.{funcname}({', '.join(args)}));",
                f"var {self.fuzz_retvar} = paired_ret.first;",
                f"String exceptionType = paired_ret.second;"
            ]
