predicate spec(param: record[], entry_self: record[size: int, empty: bool, elements: list[option[int]]], exit_self: record[size: int, empty: bool, elements: list[option[int]]], ret: option[int]) {
    ((entry_self.empty == false) ==>
        (ret == getLast(entry_self)))
}

function getLast(d: record[size: int, empty: bool, elements: list[option[int]]]) -> (result: option[int]) {
    var sz: int = d.size;
    ensure (((d.empty == false) ==>
    (result == d.elements[(sz - 1)])) ∧
    ((d.empty == true) ==>
        (result == None)));
}