predicate spec(param: record[], entry_self: record[size: int, empty: bool, elements: list[option[int]]], exit_self: record[size: int, empty: bool, elements: list[option[int]]], ret: option[int]) {
    ((entry_self.empty == false) ==>
        (ret == get_last(entry_self.elements)))
}

function get_last(elems: list[option[int]]) -> (result: option[int]) {
    require (len(elems) > 0);
    ensure (result == elems[(len(elems) - 1)]);
}