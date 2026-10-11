predicate spec(param: record[coll: record[is_null: bool, size: int, empty: bool, elements: list[option[int]]]], entry_self: nonetype, exit_self: record[size: int, empty: bool, elements: list[option[int]], equals_coll: bool], ret: nonetype) {
    ((¬ param.coll.is_null) ==>
        (((exit_self.size == param.coll.size) ∧
            (exit_self.elements == param.coll.elements)) ∧
            exit_self.equals_coll))
}