predicate spec(param: record[element: option[int]], entry_self: record[size: int, number_of_sets: int, contains_element: bool, representative_element: option[int]], exit_self: record[size: int, number_of_sets: int, contains_element: bool, representative_element: option[int]], ret: nonetype) {
    (((¬ is_some(param.element)) ==>
        ((((exit_self.size == entry_self.size) ∧
            (exit_self.number_of_sets == entry_self.number_of_sets)) ∧
            (exit_self.contains_element == entry_self.contains_element)) ∧
            (exit_self.representative_element == entry_self.representative_element))) ∧
        (is_some(param.element) ==>
            ((entry_self.contains_element ==>
                ((((exit_self.size == entry_self.size) ∧
                    (exit_self.number_of_sets == entry_self.number_of_sets)) ∧
                    (exit_self.contains_element == entry_self.contains_element)) ∧
                    (exit_self.representative_element == entry_self.representative_element))) ∧
                ((¬ entry_self.contains_element) ==>
                    ((exit_self.contains_element == true) ∧
                        (exit_self.representative_element == param.element))))))
}