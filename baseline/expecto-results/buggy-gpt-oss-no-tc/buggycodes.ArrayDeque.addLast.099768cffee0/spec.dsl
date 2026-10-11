predicate spec(param: record[e: option[int]], entry_self: record[size: int, empty: bool, elements: list[option[int]]], exit_self: record[size: int, empty: bool, elements: list[option[int]]], ret: nonetype) {
    var new_elements: list[option[int]] = 
        concat(entry_self.elements, [param.e]);
    (((((exit_self.elements == new_elements) ∧
        (exit_self.size == len(new_elements))) ∧
        (entry_self.size == len(entry_self.elements))) ∧
        (entry_self.empty <==>
            (entry_self.size == 0))) ∧
        (exit_self.empty <==>
            (exit_self.size == 0)))
}