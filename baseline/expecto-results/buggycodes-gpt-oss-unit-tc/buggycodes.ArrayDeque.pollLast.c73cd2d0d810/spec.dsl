predicate spec(param: record[], entry_self: record[size: int, empty: bool, elements: list[option[int]]], exit_self: record[size: int, empty: bool, elements: list[option[int]]], ret: option[int]) {
    ((¬ entry_self.empty) ==>
        (ret == getLast(entry_self)))
}

function getLast(d: record[size: int, empty: bool, elements: list[option[int]]]) -> (res: option[int]) {
    ensure ((d.empty ==> is_none(res)) ∧
    ((¬ d.empty) ==>
        (∃(i: int) ::
            ((((0 <= i < len(d.elements)) ∧
                is_some(d.elements[i])) ∧
                (∀(j: int) ::
                    ((i < j < len(d.elements)) ==>
                        is_none(d.elements[j])))) ∧
                (res == d.elements[i])))));
}