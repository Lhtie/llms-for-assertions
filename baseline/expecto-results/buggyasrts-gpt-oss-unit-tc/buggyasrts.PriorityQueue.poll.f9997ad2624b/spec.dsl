predicate spec(param: record[], entry_self: record[size: int, empty: bool, elements: list[option[int]]], exit_self: record[size: int, empty: bool, elements: list[option[int]]], ret: option[int]) {
    var esize: int = 
        entry_self.size;
    var esize_out: int = 
        exit_self.size;
    var eempty: bool = 
        entry_self.empty;
    ((¬ eempty) ==>
        (esize_out == (esize - 2)))
}