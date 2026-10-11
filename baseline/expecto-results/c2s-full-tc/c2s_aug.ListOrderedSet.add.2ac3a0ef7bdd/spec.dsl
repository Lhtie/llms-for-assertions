predicate spec(param: record[index: int, object: option[int]], entry_self: record[size: int, empty: bool, elements: list[option[int]]], exit_self: record[size: int, empty: bool, elements: list[option[int]]], ret: nonetype) {
    var idx: int = param.index;
    var obj_opt: option[int] = 
        param.object;
    var pre: bool = 
        (((0 <= idx <= entry_self.size) ∧
            is_some(obj_opt)) ∧
            (¬ any(lambda (e) = (e == obj_opt), entry_self.elements)));
    (pre ==>
        ((((exit_self.size == (entry_self.size + 1)) ∧
            (∀(i: int) ::
                ((0 <= i < idx) ==>
                    (exit_self.elements[i] == entry_self.elements[i])))) ∧
            (exit_self.elements[idx] == obj_opt)) ∧
            (∀(i: int) ::
                ((idx < i < exit_self.size) ==>
                    (exit_self.elements[i] == entry_self.elements[(i - 1)])))))
}