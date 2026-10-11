predicate spec(param: record[i: int], entry_self: record[size: int, empty: bool, elements: list[option[int]]], exit_self: record[size: int, empty: bool, elements: list[option[int]]], ret: option[int]) {
    var i: int = param.i;
    var elem_at_i: option[int] = 
        entry_self.elements[i];
    (((0 <= i < entry_self.size) ∧
        is_some(elem_at_i)) ==>
        (ret == elem_at_i))
}