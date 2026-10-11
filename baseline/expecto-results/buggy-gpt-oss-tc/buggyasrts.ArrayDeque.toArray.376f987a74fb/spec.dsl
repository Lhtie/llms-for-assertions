predicate spec(param: record[], entry_self: record[size: int, empty: bool, elements: list[option[int]]], exit_self: record[size: int, empty: bool, elements: list[option[int]]], ret: record[is_null: bool, elements: list[option[int]]]) {
    var coll_sz: int = 
        exit_self.size;
    var arr_len: int = 
        len(ret.elements);
    (arr_len == (coll_sz + 1))
}