predicate spec(param: record[word: record[is_null: bool, length: int, char_codes: list[int]]], entry_self: record[size: int, empty: bool, contains_word: bool, prefix_count_word: int, starts_with_word: bool, prefix_counts_word: list[int], prefix_present_word: list[bool], prefix_results_contain_word: list[bool]], exit_self: record[size: int, empty: bool, contains_word: bool, prefix_count_word: int, starts_with_word: bool, prefix_counts_word: list[int], prefix_present_word: list[bool], prefix_results_contain_word: list[bool]], ret: bool) {
    ((¬ param.word.is_null) ==>
        ((∀(i: int) ::
            ((1 <= i < param.word.length) ==>
                exit_self.prefix_present_word[i])) ∧
            (ret ==>
                exit_self.prefix_present_word[param.word.length])))
}