predicate spec(param: record[], entry_self: record[size: int, empty: bool, elements: list[option[int]]], exit_self: record[size: int, empty: bool, elements: list[option[int]]], ret: option[int]) {
    ((len(entry_self.elements) > 1) ==>
        (ret == entry_self.elements[1]))
}