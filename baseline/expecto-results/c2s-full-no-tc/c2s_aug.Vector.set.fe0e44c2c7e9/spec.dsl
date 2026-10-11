predicate spec(param: record[index: int, element: option[int]], entry_self: record[size: int, empty: bool, elements: list[option[int]]], exit_self: record[size: int, empty: bool, elements: list[option[int]]], ret: option[int]) {
    var idx: int = param.index;
    var n: int = 
        len(entry_self.elements);
    ((0 <= idx < n) ==>
        (∀(k: int) ::
            ((idx < k < n) ==>
                (exit_self.elements[k] == entry_self.elements[k]))))
}