predicate spec(param: record[coll: record[is_null: bool, size: int, empty: bool, elements: list[option[int]]]], entry_self: nonetype, exit_self: record[size: int, empty: bool, elements: list[option[int]], equals_coll: bool], ret: nonetype) {
    (param.coll.is_null ∨
        (((len(param.coll.elements) == len(exit_self.elements)) ∧
            (∀(i: int) ::
                ((0 <= i < len(param.coll.elements)) ==>
                    ((param.coll.elements[i] == exit_self.elements[i]) ∧
                        true)))) ∧
            (exit_self.equals_coll == true)))
}