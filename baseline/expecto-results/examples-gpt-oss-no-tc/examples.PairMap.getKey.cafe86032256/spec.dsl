predicate spec(param: record[key: record[is_null: bool, length: int, char_codes: list[int]]], entry_self: record[size: int, contains_key: bool, index_of_key: int, values_equal_key: list[bool], values_identical_key: list[bool]], exit_self: record[size: int, contains_key: bool, index_of_key: int, values_equal_key: list[bool], values_identical_key: list[bool], values_equal_result: list[bool], values_identical_result: list[bool]], ret: record[is_null: bool, equals_key: bool, identical_key: bool]) {
    (entry_self.contains_key ==>
        (((((¬ ret.is_null) ∧
            ret.equals_key) ∧
            ret.identical_key) ∧
            exit_self.values_equal_result[entry_self.index_of_key]) ∧
            exit_self.values_identical_result[entry_self.index_of_key]))
}