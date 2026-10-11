predicate spec(param: record[key: option[int], value: option[int]], entry_self: record[size: int, empty: bool, contains_key: bool, value_at_key: option[int], contains_value: bool, contains_return_value: bool], exit_self: record[size: int, empty: bool, contains_key: bool, value_at_key: option[int], contains_value: bool, contains_return_value: bool], ret: option[int]) {
    (is_none(ret) ==>
        ((¬ entry_self.contains_key) ∨
            is_none(entry_self.value_at_key)))
}