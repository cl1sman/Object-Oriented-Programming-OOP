"""
    Instrução for

        Exercício 5: Escreva um programa que imprima os números pares entre 1 e 100.
"""
x = range(1, 101)
for n in x:
    if (n%2) == 0:
        print(n)
