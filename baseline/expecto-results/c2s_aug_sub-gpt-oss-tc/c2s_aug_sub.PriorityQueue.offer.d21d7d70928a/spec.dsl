predicate spec(param: record[e: option[int]], entry_self: record[size: int, empty: bool, elements: list[option[int]]], exit_self: record[size: int, empty: bool, elements: list[option[int]]], ret: bool) {
    ((is_some(param.e) ∧
        (¬ entry_self.empty)) ==>
        (QueueHead(exit_self) <= QueueHead(entry_self)))
}

function QueueHead(q: record[size: int, empty: bool, elements: list[option[int]]]) -> (head: int) {
    require ((¬ q.empty) ∧
    (∃(i: int) ::
        ((0 <= i < len(q.elements)) ∧
            is_some(q.elements[i]))));
    ensure (∃(i: int) ::
    (((0 <= i < len(q.elements)) ∧
        is_some(q.elements[i])) ∧
        (head == unwrap(q.elements[i]))));
    ensure (∀(i: int) ::
    (((0 <= i < len(q.elements)) ∧
        is_some(q.elements[i])) ==>
        (head <= unwrap(q.elements[i]))));
}