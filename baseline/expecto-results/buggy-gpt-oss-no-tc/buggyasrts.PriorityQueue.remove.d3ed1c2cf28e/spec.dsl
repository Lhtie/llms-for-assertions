predicate spec(param: record[o: option[int]], entry_self: record[size: int, empty: bool, elements: list[option[int]]], exit_self: record[size: int, empty: bool, elements: list[option[int]]], ret: bool) {
    var old_head: option[int] = 
        queue_head(entry_self);
    var new_head: option[int] = 
        queue_head(exit_self);
    (((¬ entry_self.empty) ∧
        ret) ==>
        ((¬ exit_self.empty) ==>
            (unwrap(new_head) <= unwrap(old_head))))
}

function queue_head(q: record[size: int, empty: bool, elements: list[option[int]]]) -> (head: option[int]) {
    ensure ((q.empty ==>
    (head == None)) ∧
    ((¬ q.empty) ==>
        (is_some(head) ∧
            (∃(i: int) ::
                (((0 <= i < len(q.elements)) ∧
                    (q.elements[i] == head)) ∧
                    (∀(j: int) ::
                        (((0 <= j < len(q.elements)) ∧
                            is_some(q.elements[j])) ==>
                            (unwrap(head) <= unwrap(q.elements[j])))))))));
}