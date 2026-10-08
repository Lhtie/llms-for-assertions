predicate spec(param: record[index: int],
               entry_self: record[elements: list[int]], ret: int) {
    (0 <= param.index and param.index < len(entry_self.elements)) implies
        ret == entry_self.elements[param.index]
}
