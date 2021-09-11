"""
    Escreva um programa que receba um vetor com 10 números inteiros. 
    Em seguida, determine e imprima na tela o maior elemento par do 
    vetor (se houver), o menor elemento ímpar do vetor (se houver), 
    o somatório dos elementos do vetor e a média.
"""

vetor = []

while len(vetor) < 10: # limito o vetor a cinco possições
    x = int(input('Enter a number: '))
    vetor.append(x)
    
maior_par = 0
maior_impar = 0
soma = 0 
for elemento in vetor: # é pra usar a função para maior  
        soma += elemento

        # maior par e maior impar
        if elemento % 2 == 0 and elemento > maior_par:
            maior_par = elemento
        else:
            if elemento > maior_impar:
                maior_impar = elemento
media = soma / len(vetor)
    
print(vetor)
print('Maior elemento par:', maior_par)
print('Maior elemento impar:', maior_impar)
print('Somatorio dos elementos do vetor:', soma)
print('Média:', media)