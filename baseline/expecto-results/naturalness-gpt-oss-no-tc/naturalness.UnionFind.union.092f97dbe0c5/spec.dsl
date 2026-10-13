predicate spec(param: record[element1: option[int], element2: option[int]], entry_self: record[size: int, number_of_sets: int, contains_element1: bool, representative_element1: option[int], contains_element2: bool, representative_element2: option[int], same_set: bool], exit_self: record[size: int, number_of_sets: int, contains_element1: bool, representative_element1: option[int], contains_element2: bool, representative_element2: option[int], same_set: bool], ret: nonetype) {
    ((entry_self.contains_element1 ∧
        entry_self.contains_element2) ==>
        (((exit_self.same_set ∧
            is_some(exit_self.representative_element1)) ∧
            is_some(exit_self.representative_element2)) ∧
            (unwrap(exit_self.representative_element1) == unwrap(exit_self.representative_element2))))
}