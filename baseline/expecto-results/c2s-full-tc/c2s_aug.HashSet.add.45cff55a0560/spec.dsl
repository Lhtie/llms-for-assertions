predicate spec(param: record[e: option[int]], entry_self: record[size: int, empty: bool, elements: list[option[int]]], exit_self: record[size: int, empty: bool, elements: list[option[int]]], ret: bool) {
    Contains(exit_self.elements, param.e)
}

predicate Contains(lst: list[option[int]], val: option[int]) {
    any(lambda (x) = (x == val), lst)
}