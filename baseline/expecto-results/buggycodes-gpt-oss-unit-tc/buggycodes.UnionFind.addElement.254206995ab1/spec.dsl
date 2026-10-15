predicate spec(param: record[element: option[int]], entry_self: record[size: int, number_of_sets: int, contains_element: bool, representative_element: option[int]], exit_self: record[size: int, number_of_sets: int, contains_element: bool, representative_element: option[int]], ret: nonetype) {
    (exit_self.number_of_sets == (entry_self.number_of_sets +
        (if (¬ entry_self.contains_element) then 1 else 0)))
}