predicate spec(param: record[i: int], entry_self: record[size: int, empty: bool, elements: list[option[int]]], exit_self: record[size: int, empty: bool, elements: list[option[int]]], ret: option[int]) {
    var n: int = 
        entry_self.size;
    ((0 <= param.i < n) ==>
        (∀(k: int) ::
            ((param.i < k < (n - 1)) ==>
                (entry_self.elements[k] == exit_self.elements[k]))))
}