predicate spec(param: record[key: option[int]], entry_self: record[size: int, empty: bool, contains_key: bool, value_at_key: option[int], contains_return_value: bool], exit_self: record[size: int, empty: bool, contains_key: bool, value_at_key: option[int], contains_return_value: bool], ret: option[int]) {
    (entry_self.contains_key ==>
        (is_some(ret) ∧
            exit_self.contains_return_value))
}