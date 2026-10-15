predicate spec(param: record[o: option[int]], entry_self: record[size: int, empty: bool, elements: list[option[int]]], exit_self: record[size: int, empty: bool, elements: list[option[int]]], ret: bool) {
    var elem_present: bool = 
        any(lambda (e) = (e == param.o), entry_self.elements);
    ((is_some(param.o) ∧
        elem_present) ==>
        ret)
}