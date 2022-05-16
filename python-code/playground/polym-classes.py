class Animal:
    def __init__(self, name=None, sound=None):
        self.name = name
        self.sound = sound

    def Animal_details(self):
        print("Name: {}\nSound: {}".format(self.name,self.sound))

class Dog(Animal):
    def __init__(self, name, sound, family=None):
        self.family = family
        super().__init__(name,sound)

    def Animal_details(self):
        super().Animal_details()
        print("Family: {}".format(self.family))

class Sheep(Animal):
    def __init__(self, name, sound, color=None):
        self.color = color
        super().__init__(name,sound)

    def Animal_details(self):
        super().Animal_details()
        print("Color: {}".format(self.color))




d = Dog("Pongo", "Woof Woof", "Husky")
d.Animal_details()
print(" ")
s = Sheep("Billy", "Baaa Baaa", "White")
s.Animal_details()
