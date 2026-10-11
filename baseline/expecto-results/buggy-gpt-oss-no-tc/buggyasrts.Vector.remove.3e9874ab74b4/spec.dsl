predicate spec(param: record[index: int], entry_self: record[size: int, empty: bool, elements: list[option[int]]], exit_self: record[size: int, empty: bool, elements: list[option[int]]], ret: option[int]) {
    var i: int = param.index;
    ((0 <= i < entry_self.size) ==>
        (ret == entry_self.elements[(i + 1)]))
}