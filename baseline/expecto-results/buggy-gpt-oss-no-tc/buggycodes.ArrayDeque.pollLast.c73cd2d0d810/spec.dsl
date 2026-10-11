predicate spec(param: record[], entry_self: record[size: int, empty: bool, elements: list[option[int]]], exit_self: record[size: int, empty: bool, elements: list[option[int]]], ret: option[int]) {
    ((¬ entry_self.empty) ==>
        (ret == GetLast(entry_self.elements)))
}

function GetLast(lst: list[option[int]]) -> (result: option[int]) {
    ensure (((len(lst) == 0) ==>
    (result == None)) ∧
    ((len(lst) > 0) ==>
        (result == lst[(len(lst) - 1)])));
}