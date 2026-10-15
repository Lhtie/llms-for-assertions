predicate spec(param: record[], entry_self: record[size: int, empty: bool, elements: list[option[int]]], exit_self: record[size: int, empty: bool, elements: list[option[int]]], ret: record[is_null: bool, elements: list[option[int]]]) {
    ((((entry_self.size == exit_self.size) ∧
        (entry_self.empty == exit_self.empty)) ∧
        (entry_self.elements == exit_self.elements)) ∧
        ElementsShifted(entry_self.elements, ret.elements))
}

predicate ElementsShifted(src: list[option[int]], dst: list[option[int]]) {
    var n: int = len(src);
    var m: int = len(dst);
    (((n == m) ∧
        ((n == 0) ==> true)) ∧
        ((n > 0) ==>
            ((dst[0] == None) ∧
                (∀(i: int) ::
                    ((0 <= i < (n - 1)) ==>
                        (dst[(i + 1)] == src[i]))))))
}