"""
    Operador ?:
        Exercício 2: Escreva um programa que leia 2 números inteiros do teclado , e os imprima na tela em
        ordem ascendente

        <in python: a if condition else b
"""
a = int(input("Enter a number: "))
b = int(input('Enter another number: '))

print((a,b) if a <= b else (b,a))