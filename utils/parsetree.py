class treeNode:
    def __init__(self, value):
        self.value = value
        self.children = []
        self.parent = None

    def add_child(self, child_node):
        child_node.parent = self
        self.children.append(child_node)

    def __repr__(self):
        return f"treeNode({self.value})"

class parseTree:
    def __init__(self):
        self.root = None

    def add_node(self, value, parent):
        new_node = treeNode(value)
        if parent is None:
            self.root = new_node
        else:
            parent.add_child(new_node)
        return new_node
    
    def __repr__(self):
        return f"parseTree({self.root})"

