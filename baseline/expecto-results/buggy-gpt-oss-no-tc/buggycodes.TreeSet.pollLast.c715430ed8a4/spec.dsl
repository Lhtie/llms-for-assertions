predicate spec(param: record[], entry_self: record[size: int, empty: bool, elements: list[option[int]]], exit_self: record[size: int, empty: bool, elements: list[option[int]]], ret: option[int]) {
    ((entry_self.empty == false) ∧
        (∃(last: int) ::
            (((((((0 <= last < len(entry_self.elements)) ∧
                is_some(entry_self.elements[last])) ∧
                (∀(k: int) ::
                    ((last < k < len(entry_self.elements)) ==>
                        is_none(entry_self.elements[k])))) ∧
                (ret == entry_self.elements[last])) ∧
                (exit_self.elements == set_at(entry_self.elements, last, None))) ∧
                (exit_self.size == (entry_self.size - 1))) ∧
                (exit_self.empty == (exit_self.size == 0)))))
}

function set_at(xs: list[option[int]], i: int, v: option[int]) -> (result: list[option[int]]) {
    require ((0 <= i) ∧
    (i < len(xs)));
    ensure ((len(result) == len(xs)) ∧
    (∀(k: int) ::
        ((0 <= k < len(xs)) ==>
            (result[k] == (if (k == i) then v else xs[k])))));
}