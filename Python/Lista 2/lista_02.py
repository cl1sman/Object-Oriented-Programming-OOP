"""
    POO - LISTA 2

    1.Construa um programa que executa as operações básicas da matemática com valores digitados pelo usuário:
        a.Somar.
        b.Subtrair.
        c.Dividir.
        d.Multiplicar.
        e.Com todos os anteriores juntos onde o usuário seleciona qual ele quer utilizar.
"""
# função com as funções matematicas da calculadora
def calculadora_marota(opcao, x, y):
    if opcao == 1:
        print('\n{} + {} ='.format(x, y), x + y)
    if opcao == 2:
        print('\n{} - {} ='.format(x, y), x - y)
    if opcao == 3:
        print('\n{} / {} ='.format(x, y), x / y)
    if opcao == 4:
        print('\n{} * {} ='.format(x, y), x * y)

x = int(input('Informe o primeiro número: '))
y = int(input('Informe o segundo número: '))
opcao = int(input(r"""
Qual operação deseja realizar?

1 - soma
2 - subtração
3 - divisão
4 - multiplicação
                     
Opção: """))

# o proximo passo é para verificar se deseja continuar
i = 's'
while i != 'n':
    calculadora_marota(opcao, x, y)

    i = input(r"""
Deseja continuar?
s - sim
n - não
Opção: """)
    if i == 's':
        x = int(input('Informe o primeiro número: '))
        y = int(input('Informe o segundo número: '))
        opcao = int(input(r"""
Qual operação deseja realizar?

1 - soma
2 - subtração
3 - divisão
4 - multiplicação
                    
Opção: """))