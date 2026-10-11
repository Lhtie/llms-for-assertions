predicate spec(param: record[c: record[is_null: bool, size: int, empty: bool, elements: list[option[int]]]], entry_self: nonetype, exit_self: record[size: int, empty: bool, elements: list[option[int]], equals_c: bool], ret: nonetype) {
    ((¬ param.c.is_null) ==>
        ((((exit_self.equals_c ∧
            (exit_self.size == param.c.size)) ∧
            (exit_self.empty == param.c.empty)) ∧
            (len(exit_self.elements) == len(param.c.elements))) ∧
            (∀(i: int) ::
                ((0 <= i < len(param.c.elements)) ==>
                    (exit_self.elements[i] == param.c.elements[i])))))
}