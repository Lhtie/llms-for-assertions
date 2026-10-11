predicate spec(param: record[item: option[int]], entry_self: record[size: int, empty: bool, elements: list[option[int]]], exit_self: record[size: int, empty: bool, elements: list[option[int]]], ret: option[int]) {
    contains_item(exit_self.elements, param.item)
}

predicate contains_item(lst: list[option[int]], el: option[int]) {
    (∃(i: int) ::
        ((0 <= i < len(lst)) ∧
            (lst[i] == el)))
}