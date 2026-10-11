predicate spec(param: record[index: int], entry_self: record[size: int, empty: bool, elements: list[option[int]]], exit_self: record[size: int, empty: bool, elements: list[option[int]]], ret: option[int]) {
    ((0 <= param.index < entry_self.size) ==>
        (((exit_self.size == (entry_self.size - 1)) ∧
            shift_preserve(entry_self.elements, param.index, exit_self.elements)) ∧
            (ret == entry_self.elements[param.index])))
}

predicate shift_preserve(orig: list[option[int]], idx: int, shifted: list[option[int]]) {
    (((len(orig) == (len(shifted) + 1)) ∧
        (∀(i: int) ::
            ((0 <= i < idx) ==>
                (shifted[i] == orig[i])))) ∧
        (∀(i: int) ::
            ((idx <= i < len(shifted)) ==>
                (shifted[i] == orig[(i + 1)]))))
}