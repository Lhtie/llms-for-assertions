predicate spec(param: record[word: record[is_null: bool, length: int, char_codes: list[int]]], entry_self: record[size: int, empty: bool, contains_word: bool, prefix_count_word: int, starts_with_word: bool, prefix_counts_word: list[int], prefix_present_word: list[bool], prefix_results_contain_word: list[bool]], exit_self: record[size: int, empty: bool, contains_word: bool, prefix_count_word: int, starts_with_word: bool, prefix_counts_word: list[int], prefix_present_word: list[bool], prefix_results_contain_word: list[bool]], ret: bool) {
    var n: int = 
        param.word.length;
    ((((¬ param.word.is_null) ∧
        entry_self.contains_word) ∧
        (n > 0)) ==>
        (((ret == true) ∧
            (exit_self.size == (entry_self.size - 1))) ∧
            (∀(i: int) ::
                (((1 <= i) ∧ (i <= n)) ==>
                    (exit_self.prefix_counts_word[i] == (entry_self.prefix_counts_word[i] -
                        1))))))
}