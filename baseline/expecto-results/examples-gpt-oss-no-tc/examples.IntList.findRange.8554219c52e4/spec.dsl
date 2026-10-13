predicate spec(param: record[value: int, lo: int, hi: int], entry_self: record[size: int, empty: bool, elements: list[int]], exit_self: record[size: int, empty: bool, elements: list[int]], ret: int) {
    ((ret == (-1)) ==>
        (∀(k: int) ::
            (((((k >= param.lo) ∧
                (k >= 0)) ∧
                (k < param.hi)) ∧
                (k < entry_self.size)) ==>
                (entry_self.elements[k] != param.value))))
}