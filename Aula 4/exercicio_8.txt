"""
    Intrução do-while
        Exercício 8: Escreva um programa que testa a capacidade de adivinhar um letra. Supondo que a letra
        ‘secreta’ seja a letra ‘A’, o programa deve ao final informar a quantidade de tentativas de usuário até
        acertar a letra
"""

i = 0
x = 'letra secreta'
while x != 'a':
    x = str(input('Tentativa: '))
    i += 1

print('numero de tentativas: ', i)