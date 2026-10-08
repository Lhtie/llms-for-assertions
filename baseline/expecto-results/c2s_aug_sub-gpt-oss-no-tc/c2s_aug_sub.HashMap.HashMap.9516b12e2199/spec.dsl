predicate spec(param: record[m: record[is_null: bool, size: int, empty: bool]], entry_self: nonetype, exit_self: record[size: int, empty: bool], ret: nonetype) {
    ((¬ param.m.is_null) ==>
        (exit_self.size == param.m.size))
}