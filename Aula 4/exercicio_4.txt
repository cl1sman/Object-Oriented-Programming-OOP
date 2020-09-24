"""
    Instrução switch

        Exercício 4: Escrever um programa que receba 2 números e um caractere operador (+, -, *, /), realize a
        operação determina e imprima na tela o resultado

        Em python:
        "There can be zero or more elif parts, and the else part is optional. The keyword ‘elif’ is short for 
        ‘else if’, and is useful to avoid excessive indentation. An if … elif … elif … sequence is a substitute
         for the switch or case statements found in other languages."

         <https://docs.python.org/3/tutorial/controlflow.html>
"""

def switch(i, a, b):
    if i == '+':
        print('{} + {} = {}'.format(a, b, a + b))
    elif i == '-':
        print('{} - {} = {}'.format(a, b, a - b))
    elif i == '*':
        print('{} * {} = {}'.format(a, b, a * b))
    elif i == '/':
        print('{} / {} = {}'.format(a, b, a / b))
    else:
        print('Erro')

a = int(input('Enter a number: '))
b = int(input('Enter another number: '))
i = input(r"""
Operation:
        + soma
        - subtração
        * multiplicação
        / divisão
option: """)

switch(i,a,b)