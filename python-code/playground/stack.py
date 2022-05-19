class Stack:
    def __init__(self):
        self.stack_name = []

    def push(self, item):
        self.stack_name.append(item)

    def pop(self):
        return self.stack_name.pop()

    def display(self):
        return self.stack_name

if __name__ == '__main__':
    nstack = Stack()
    print(nstack.display())
    nstack.push(4)
    print(nstack.display())
