predicate spec(param: record[], entry_self: record[size: int, empty: bool, elements: list[option[int]]], exit_self: record[size: int, empty: bool, elements: list[option[int]]], ret: option[int]) {
    var old_last: option[int] = 
        deque_last(entry_self.elements, entry_self.size);
    ((¬ entry_self.empty) ==>
        (ret == old_last))
}

function deque_last(elems: list[option[int]], sz: int) -> (last: option[int]) {
    ensure (((sz > 0) ==>
    (last == elems[(sz - 1)])) ∧
    ((sz == 0) ==>
        is_none(last)));
}