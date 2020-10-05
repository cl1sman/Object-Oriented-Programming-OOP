"""
Escreva um programa que recebe valores para duas matrizes 3x3 de inteiros. 
Criar uma terceira matriz que é a matriz soma das anteriores e imprimi-la
ao final.
"""
# MATRIZ A
matriz_a = [[0, 0, 0], [0, 0, 0], [0, 0, 0]]
for linha in range(0, 3): # como a linha vai até 3, uso o valor 3, pois 0, 1, 2 linhas, resultando em três linhas
    for coluna in range(0, 3): # idem a linha
        matriz_a[linha][coluna] = int(input('Digite um valor para a matriz A [{} : {}]'.format(linha, coluna)))

# MATRIZ B
matriz_b = [[0, 0, 0], [0, 0, 0], [0, 0, 0]]
for linha in range(0, 3): # como a linha vai até 3, uso o valor 3, pois 0, 1, 2 linhas, resultando em três linhas
    for coluna in range(0, 3): # idem a linha
        matriz_b[linha][coluna] = int(input('Digite um valor para a matriz B [{} : {}]'.format(linha, coluna)))

# SOMA DE MATRIZES
matriz_resultado = []
vetor_linha = []
for linha in range(0, 3):
    vetor_linha = []
    for coluna in range(0, 3):
        vetor_linha.append(matriz_a[linha][coluna] + matriz_b[linha][coluna])
    
    matriz_resultado.append(vetor_linha)



print('matriz A:', matriz_a)
print('matriz B:', matriz_b)
print('Matriz resultado', matriz_resultado)