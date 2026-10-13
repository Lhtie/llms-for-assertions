predicate spec(param: record[element: option[int]], entry_self: record[size: int, number_of_sets: int, contains_element: bool, representative_element: option[int]], exit_self: record[size: int, number_of_sets: int, contains_element: bool, representative_element: option[int]], ret: nonetype) {
    ((¬ entry_self.contains_element) ==>
        (exit_self.size == (entry_self.size + 1)))
}