predicate spec(param: record[o: option[int]], entry_self: record[size: int, empty: bool, elements: list[option[int]]], exit_self: record[size: int, empty: bool, elements: list[option[int]]], ret: bool) {
    var len_exit: int = 
        len(exit_self.elements);
    (ret ==>
        (is_some(param.o) ==>
            (∀(i: int) ::
                ((0 <= i < len_exit) ==>
                    (exit_self.elements[i] != param.o)))))
}