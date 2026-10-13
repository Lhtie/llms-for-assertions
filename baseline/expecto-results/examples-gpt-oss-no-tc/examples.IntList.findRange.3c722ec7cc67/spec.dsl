predicate spec(param: record[value: int, lo: int, hi: int], entry_self: record[size: int, empty: bool, elements: list[int]], exit_self: record[size: int, empty: bool, elements: list[int]], ret: int) {
    ((ret != (-1)) ==>
        (((((0 <= ret) ∧
            (ret < entry_self.size)) ∧
            (ret >= param.lo)) ∧
            (ret < param.hi)) ∧
            (entry_self.elements[ret] == param.value)))
}