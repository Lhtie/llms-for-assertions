predicate spec(param: record[element: option[int]], entry_self: record[size: int, number_of_sets: int, contains_element: bool, representative_element: option[int]], exit_self: record[size: int, number_of_sets: int, contains_element: bool, representative_element: option[int]], ret: nonetype) {
    (is_some(param.element) ==>
        (exit_self.number_of_sets == (entry_self.number_of_sets +
            1)))
}