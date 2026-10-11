predicate spec(param: record[], entry_self: record[size: int, empty: bool, elements: list[option[int]]], exit_self: record[size: int, empty: bool, elements: list[option[int]]], ret: option[int]) {
    var sz: int = 
        entry_self.size;
    var lastIdx: int = (sz - 1);
    ((entry_self.empty == false) ==>
        (ret == entry_self.elements[lastIdx]))
}