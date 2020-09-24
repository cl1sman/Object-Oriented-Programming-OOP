"""
    Operador ?:

        Exercício 3: Escreva um programa que determina o valor absolute de um número inteiro lido do teclado

        <in python: a if condition else b
"""
a = int(input('Enter a number: '))
print(a*-1 if a <= 0 else a)