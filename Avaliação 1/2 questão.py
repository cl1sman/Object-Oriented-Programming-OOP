"""
    Escreva um programa que leia um número e fale se ele é primo.
"""

x = int(input('Informe um número inteiro: '))
multiplo = 0
for y in range(2,x):
    if(x % y == 0 ):
        multiplo += 1
if(multiplo==0):
    print('É primo')
else:
    print('Não é primo')