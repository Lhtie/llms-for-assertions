predicate spec(param: record[i: int], entry_self: record[size: int, empty: bool, elements: list[option[int]]], exit_self: record[size: int, empty: bool, elements: list[option[int]]], ret: option[int]) {
    var n: int = 
        len(entry_self.elements);
    ((0 <= param.i < n) ==>
        (∀(k: int) ::
            ((param.i < k < (n - 1)) ==>
                (exit_self.elements[k] == entry_self.elements[k]))))
}