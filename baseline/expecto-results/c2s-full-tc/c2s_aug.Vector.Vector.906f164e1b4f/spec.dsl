predicate SameElementsInOrder(a: list[option[int]], b: list[option[int]]) {
    ((len(a) == len(b)) ∧
        (∀(i: int) ::
            ((0 <= i < len(a)) ==>
                (a[i] == b[i]))))
}

predicate spec(param: record[c: record[is_null: bool, size: int, empty: bool, elements: list[option[int]]]], entry_self: nonetype, exit_self: record[size: int, empty: bool, elements: list[option[int]], equals_c: bool], ret: nonetype) {
    ((¬ param.c.is_null) ==>
        (((exit_self.equals_c ∧
            SameElementsInOrder(exit_self.elements, param.c.elements)) ∧
            (exit_self.size == param.c.size)) ∧
            (exit_self.empty == param.c.empty)))
}