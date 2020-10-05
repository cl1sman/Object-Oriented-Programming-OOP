"""
    Escrever um programa que receba 2 números e um 
    caractere operador (+, -, *, /), realize a operação 
    determinada e imprima na tela o resultado.
"""
a = float(input('Informe o primeiro número: '))
b = float(input('Informe o segundo número: '))
operador = input(r"""
                Informe a operação
                (+) = soma
                (-) = subtração
                (*) = multiplicação
                (/) = divisão
""")

class OperaçõesBasicas:
    def __init__(self, a, b, operador):
        self.a = a
        self.b = b
        self.operador = operador

    def operações(self):
        if self.operador == '+':
            print('A soma de {} + {} é igual a {} '.format(self.a, self.b, (self.a + self.b)))
        if self.operador == '-':
            print('A subtração de {} - {} é igual a {} '.format(self.a, self.b, self.a - self.b))
        if self.operador == '*':
            print('A multiplicação de {} * {} é igual a {} '.format(self.a, self.b, self.a * self.b))
        if self.operador == '/':
            print('A divisão de {} / {} é igual a {} '.format(self.a, self.b, self.a / self.b))

test = OperaçõesBasicas(a, b, operador)
test.operações()