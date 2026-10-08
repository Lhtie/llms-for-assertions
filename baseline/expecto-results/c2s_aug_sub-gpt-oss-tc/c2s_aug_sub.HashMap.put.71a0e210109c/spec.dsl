predicate spec(param: record[key: option[int], value: option[int]], entry_self: record[size: int, empty: bool, contains_key: bool, value_at_key: option[int], contains_value: bool, contains_return_value: bool], exit_self: record[size: int, empty: bool, contains_key: bool, value_at_key: option[int], contains_value: bool, contains_return_value: bool], ret: option[int]) {
    (((is_some(param.key) ∧
        exit_self.contains_key) ∧
        (exit_self.value_at_key == param.value)) ∧
        (is_some(param.value) ==>
            exit_self.contains_value))
}