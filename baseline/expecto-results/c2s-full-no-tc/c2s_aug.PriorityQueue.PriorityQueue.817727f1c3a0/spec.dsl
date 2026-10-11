predicate spec(param: record[initialCapacity: int, comparator: record[is_null: bool]], entry_self: nonetype, exit_self: record[size: int, empty: bool, elements: list[option[int]]], ret: nonetype) {
    ((((exit_self.size == 0) ∧
        (exit_self.empty == true)) ∧
        (len(exit_self.elements) == param.initialCapacity)) ∧
        (∀(i: int) ::
            ((0 <= i < len(exit_self.elements)) ==>
                is_none(exit_self.elements[i]))))
}