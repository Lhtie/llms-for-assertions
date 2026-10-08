predicate PrefixCountsInc(old: list[int], newer: list[int]) {
    var n: int = len(old);
    ((len(newer) == n) ∧
        (∀(i: int) ::
            ((0 <= i < n) ==>
                (newer[i] == (old[i] + 1)))))
}

predicate spec(param: record[word: record[is_null: bool, length: int, char_codes: list[int]]], entry_self: record[size: int, empty: bool, contains_word: bool, prefix_count_word: int, starts_with_word: bool, prefix_counts_word: list[int], prefix_present_word: list[bool], prefix_results_contain_word: list[bool]], exit_self: record[size: int, empty: bool, contains_word: bool, prefix_count_word: int, starts_with_word: bool, prefix_counts_word: list[int], prefix_present_word: list[bool], prefix_results_contain_word: list[bool]], ret: bool) {
    (((¬ param.word.is_null) ∧
        (ret == true)) ==>
        PrefixCountsInc(entry_self.prefix_counts_word, exit_self.prefix_counts_word))
}