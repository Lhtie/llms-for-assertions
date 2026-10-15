predicate spec(param: record[index: int, element: option[int]], entry_self: record[size: int, empty: bool, elements: list[option[int]]], exit_self: record[size: int, empty: bool, elements: list[option[int]]], ret: option[int]) {
    (((0 <= param.index) ∧
        (param.index < entry_self.size)) ==>
        (∀(i: int) ::
            (((i > ReplacedPos(entry_self.size, param.index)) ∧
                (i < entry_self.size)) ==>
                (exit_self.elements[i] == entry_self.elements[i]))))
}

function ReplacedPos(size: int, index: int) -> (pos: int) {
    require ((0 <= index) ∧
    (index < size));
    ensure (((index == (size - 1)) ==>
    (pos == index)) ∧
    ((index != (size - 1)) ==>
        (pos == (index + 1))));
}