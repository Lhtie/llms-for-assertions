predicate spec(param: record[a: record[is_null: bool, elements: list[option[int]]]], entry_self: record[size: int, empty: bool, elements: list[option[int]]], exit_self: record[size: int, empty: bool, elements: list[option[int]]], ret: record[is_null: bool, elements: list[option[int]]]) {
    (((¬ param.a.is_null) ∧
        (len(param.a.elements) >= entry_self.size)) ==>
        (¬ ret.is_null))
}