# self - refers to the instance that is calling the method (o objeto que chamou este metodo)
# __init__ method stands for the initialization method. Every class definition in Python should start with the __init__ method. 

class Student:
    def __init__(self, name, grade):
        self.name = name
        self.grade = grade

john = Student("John", "A")
jane = Student("Jane", "B")
print(john.name)
print(john.grade)
print(jane.name)
print(jane.grade)
