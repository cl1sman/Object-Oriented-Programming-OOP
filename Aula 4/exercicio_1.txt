"""
    Instrução if
        Exercício 1: Escrever um programa que leia três números inteiros do teclado, e os imprima na tela em
        ordem ascendente.
"""
a = int(input('Enter number 1 '))
b = int(input('Enter number 2 '))
c = int(input('Enter number 3 '))

if a <= b and b <= c:
    print(a, b, c)
elif a <= c and c <= b:
    print(a, c, b)
elif b <= a and a <= c:
    print(b, a, c)
elif b <= c and c <= a:
    print(b, c, a)
elif c <= a and a <= b:
    print(c, a, b)
else: # c <= b and b < a
    print(c, b, a)