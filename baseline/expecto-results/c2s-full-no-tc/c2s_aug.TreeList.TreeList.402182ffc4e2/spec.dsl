predicate spec(param: record[coll: record[is_null: bool, size: int, empty: bool, elements: list[option[int]]]], entry_self: nonetype, exit_self: record[size: int, empty: bool, elements: list[option[int]], equals_coll: bool], ret: nonetype) {
    var sz: int = 
        exit_self.size;
    ((¬ param.coll.is_null) ==>
        (∀(i: int) ::
            ((0 <= i < sz) ==>
                (exit_self.elements[i] == param.coll.elements[i]))))
}