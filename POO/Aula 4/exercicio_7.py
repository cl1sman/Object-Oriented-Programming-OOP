"""
    Instrução do-while
        Exercício 7: Escreva um programa que lê números do teclado enquanto esses números são menores que 10.
"""
"""
    Não existe Do-While in python, mas posso simular da seguinte maneira:

    i = 1

    while True:
        print(i)
        i = i + 1
        if(i > 3):
            break
"""
i = 0
while i < 10:
    i = int(input())