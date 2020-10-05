class CriarMatriz():
    def __init__(self, matriz):
        self.matriz = matriz

    def criar_matriz(self):
        self.matriz = [[0, 0, 0], [0, 0, 0], [0, 0, 0]]
        for linha in range(0, 3):
            for coluna in range(0, 3):
                self.matriz[linha][coluna] = int(input('Digite um valor [{} : {}]'.format(linha, coluna)))
        return self.matriz

class SomarMatriz():
    def __init__(self, matriz_a, matriz_b):
        self.matriz_a = matriz_a
        self.matriz_b = matriz_b
    
    def somar_matriz(self):
        matriz_resultado = []
        vetor_linha = []

        for linha in range(0, 3):
            vetor_linha = []
            for coluna in range(0, 3):
                vetor_linha.append(self.matriz_a[linha][coluna] + self.matriz_b[linha][coluna])
            matriz_resultado.append(vetor_linha)
        return matriz_resultado

matriz_a = CriarMatriz(1)
matriz_b = CriarMatriz(1)

matriz_resultado = SomarMatriz(matriz_a.criar_matriz(), matriz_b.criar_matriz())
print(matriz_resultado.somar_matriz())
