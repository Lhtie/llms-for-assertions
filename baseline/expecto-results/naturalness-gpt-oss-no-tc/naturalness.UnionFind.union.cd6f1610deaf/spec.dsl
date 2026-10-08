predicate spec(param: record[element1: option[int], element2: option[int]], entry_self: record[size: int, number_of_sets: int, contains_element1: bool, representative_element1: option[int], contains_element2: bool, representative_element2: option[int], same_set: bool], exit_self: record[size: int, number_of_sets: int, contains_element1: bool, representative_element1: option[int], contains_element2: bool, representative_element2: option[int], same_set: bool], ret: nonetype) {
    (exit_self.number_of_sets == (entry_self.number_of_sets -
        1))
}