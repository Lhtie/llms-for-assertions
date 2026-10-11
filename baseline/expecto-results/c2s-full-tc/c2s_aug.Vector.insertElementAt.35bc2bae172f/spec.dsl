predicate spec(param: record[obj: option[int], index: int], entry_self: record[size: int, empty: bool, elements: list[option[int]]], exit_self: record[size: int, empty: bool, elements: list[option[int]]], ret: nonetype) {
    ((0 <= param.index <= entry_self.size) ==>
        (((exit_self.size == (entry_self.size + 1)) ∧
            (exit_self.empty == false)) ∧
            (∀(i: int) ::
                ((0 <= i < exit_self.size) ==>
                    (if (i < param.index) then
                        (exit_self.elements[i] == entry_self.elements[i])
                    else
                        (if (i == param.index) then
                            (exit_self.elements[i] == param.obj)
                        else
                            (exit_self.elements[i] == entry_self.elements[(i - 1)])))))))
}