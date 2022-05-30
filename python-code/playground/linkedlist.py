class Node:
    def __init__(self, data):
        self.data = data
        self.next = None

class LinkedList:
    def __init__(self):
        self.head = None

    def append_list(self, item):
        new_node = Node(item)
        if self.head is None:
            self.head = new_node
            return
        last_node = self.head
        while last_node.next:
            last_node = last_node.next
        last_node.next = new_node

    def display_list(self):
        cur_node = self.head
        while cur_node:
            print(cur_node.data)
            cur_node = cur_node.next

    def prepend(self, item):
        new_node = Node(item)
        new_node.next = self.head
        self.head = new_node

    def insert_after_node(self, prev_node, item):
        if not pre_node:
            print("Previous node does not exist.")
            return
        new_node = Node(item)
        new_node.next = prev_node.next
        prev_node.next = new_node


if __name__ == '__main__':
    nList = LinkedList()
    nList.display_list()
    nList.append_list("A")
    nList.append_list("t")
    nList.append_list("M")
    nList.display_list()
    nList.prepend("Fis")
    nList.display_list()
