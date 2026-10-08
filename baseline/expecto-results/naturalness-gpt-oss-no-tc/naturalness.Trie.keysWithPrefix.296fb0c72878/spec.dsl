predicate spec(param: record[prefix: record[is_null: bool, length: int, char_codes: list[int]]], entry_self: record[size: int, empty: bool, contains_prefix: bool, prefix_count_prefix: int, starts_with_prefix: bool, prefix_counts_prefix: list[int], prefix_present_prefix: list[bool], prefix_results_contain_prefix: list[bool]], exit_self: record[size: int, empty: bool, contains_prefix: bool, prefix_count_prefix: int, starts_with_prefix: bool, prefix_counts_prefix: list[int], prefix_present_prefix: list[bool], prefix_results_contain_prefix: list[bool]], ret: record[is_null: bool, size: int, contained_in_receiver: list[bool], starts_with_prefix: list[bool]]) {
    (∀(i: int) ::
        ((0 <= i < ret.size) ==>
            (ret.contained_in_receiver[i] ∧
                ret.starts_with_prefix[i])))
}