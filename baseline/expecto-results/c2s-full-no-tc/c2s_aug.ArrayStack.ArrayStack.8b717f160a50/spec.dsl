predicate spec(param: record[initialSize: int], entry_self: nonetype, exit_self: record[size: int, empty: bool, elements: list[option[int]]], ret: nonetype) {
    var init: int = 
        param.initialSize;
    ((init >= 0) ==>
        (exit_self.empty == true))
}