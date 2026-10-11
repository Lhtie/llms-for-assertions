predicate spec(param: record[index: int, element: option[int]], entry_self: record[size: int, empty: bool, elements: list[option[int]]], exit_self: record[size: int, empty: bool, elements: list[option[int]]], ret: option[int]) {
    var idx: int = param.index;
    var sz: int = 
        entry_self.size;
    var rp: int = 
        replacedPos(idx, sz);
    ((0 <= idx < sz) ==>
        (∀(i: int) ::
            (((rp < i) ∧ (i < sz)) ==>
                (exit_self.elements[i] == entry_self.elements[i]))))
}

function replacedPos(index: int, size: int) -> (pos: int) {
    ensure (((index == (size - 1)) ==>
    (pos == index)) ∧
    ((index != (size - 1)) ==>
        (pos == (index + 1))));
}