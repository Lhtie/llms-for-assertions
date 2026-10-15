predicate spec(param: record[], entry_self: record[size: int, empty: bool, elements: list[option[int]]], exit_self: record[size: int, empty: bool, elements: list[option[int]]], ret: record[is_null: bool, size: int, empty: bool, elements: list[option[int]], same_receiver: bool]) {
    var n: int = 
        len(entry_self.elements);
    ((((((((((exit_self.size == entry_self.size) ∧
        (exit_self.empty == entry_self.empty)) ∧
        (len(exit_self.elements) == n)) ∧
        (∀(i: int) ::
            ((0 <= i < n) ==>
                (entry_self.elements[i] == exit_self.elements[i])))) ∧
        (ret.is_null == false)) ∧
        (ret.same_receiver == false)) ∧
        (ret.size == entry_self.size)) ∧
        (ret.empty == entry_self.empty)) ∧
        (len(ret.elements) == n)) ∧
        (∀(i: int) ::
            ((0 <= i < n) ==>
                (entry_self.elements[i] == ret.elements[i]))))
}