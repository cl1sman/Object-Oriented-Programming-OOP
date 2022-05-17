class Student:
    def __init__(self, name): # __init__ is a constructor?
        self.name = name
    def sayHello(self):
        print("Hello, my name is " + self.name)
elisa = Student("Elisa")
elisa.sayHello()