predicate spec(param: record[element: option[int]], entry_self: record[size: int, number_of_sets: int, contains_element: bool, representative_element: option[int]], exit_self: record[size: int, number_of_sets: int, contains_element: bool, representative_element: option[int]], ret: nonetype) {
    var elem: option[int] = 
        param.element;
    var after_contains: bool = 
        exit_self.contains_element;
    ((after_contains == true) ∧
        (is_some(elem) ==>
            (is_some(exit_self.representative_element) ∧
                (unwrap(exit_self.representative_element) == unwrap(elem)))))
}