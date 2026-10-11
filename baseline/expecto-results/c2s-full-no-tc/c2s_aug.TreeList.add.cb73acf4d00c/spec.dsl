predicate spec(param: record[index: int, obj: option[int]], entry_self: record[size: int, empty: bool, elements: list[option[int]]], exit_self: record[size: int, empty: bool, elements: list[option[int]]], ret: nonetype) {
    ((0 <= param.index <= entry_self.size) ==>
        (((exit_self.size == (entry_self.size + 1)) ∧
            (exit_self.empty == false)) ∧
            (∀(k: int) ::
                ((0 <= k < exit_self.size) ==>
                    ((((k < param.index) ==>
                        (exit_self.elements[k] == entry_self.elements[k])) ∧
                        ((k == param.index) ==>
                            (exit_self.elements[k] == param.obj))) ∧
                        ((k > param.index) ==>
                            (exit_self.elements[k] == entry_self.elements[(k - 1)])))))))
}