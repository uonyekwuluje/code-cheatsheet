class Calculator:
    def __init__(self, a, b):
        self.a = a
        self.b = b

    def add(self):
        return (self.a + self.b)

    def subtract(self):
        return (self.a - self.b)

    def multiply(self):
        return (self.a * self.b)

    def divide(self):
        return (self.b / self.a)

obj = Calculator(10, 94)
print(obj.add())
print(obj.subtract())
print(obj.multiply())
print(obj.divide())
