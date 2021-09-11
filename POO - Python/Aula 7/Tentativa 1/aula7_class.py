"""
    * Modelo de dados para um cadastro de clientes.
        1. Identificar as principais classes
            > Cliente, Endereço, Telefone, Data.
        2. Identificar atributos
            > Cliente: nome, RG, CPF, telefone, data de nascimento e endereço
            > Endereço: nome do logradouro, número, bairro, cidade e estado.
            > Telefone: DDD e número básico.
            > Data: Dia, mês e ano
        3. Identificar os métodos
        4. Definir construtores
            > Considerar construtor default e contrutor com todas ass informações
        5. Criar aplicação
            > Criar um objeto do tipo Cliente, a partir de dados fornecidos pelo
            usuário, e ao final, imprimir os valores dos atributos do objeto Cliente.
"""

class Cliente:
    def __init__(self):
        self.nome = 'nome'
        self.rg = 'rg'
        self.cpf = 'cpf'
        self.telefone = 'telefone'
        self.data_de_nascimento = 'data_de_nascimento'
        self.endereco = 'endereco'
    
    def set_cliente(self):
        self.nome = input('Nome: ')
        self.rg = input('RG: ')
        self.cpf = input('CPF: ')

        self.telefone = Telefone()
        self.telefone.set_telefone()

        self.data_de_nascimento = Data()
        self.data_de_nascimento.set_data()
        
        self.endereco = Endereco()
        self.endereco.set_endereco()

    def get_cliente(self):
        lista_cliente = [self.nome, self.rg, self.cpf, self.telefone.get_telefone(), self.data_de_nascimento.get_data(), self.endereco.get_endereco()]
        return lista_cliente



class Endereco():
    def __init__(self):
        self.nome_do_logradouro = 'Nome do logradouro'
        self.numero = 'Número'
        self.bairro = 'Bairro'
        self.cidade = 'Cidade'
        self.estado = 'Estado'
    def set_endereco(self):
        self.nome_do_logradouro = input('Nome do logradouro: ')
        self.numero = input('Número: ')
        self.bairro = input('Bairro: ')
        self.cidade = input('Cidade: ')
        self.estado = input('Estado: ')

    def get_endereco(self):
        lista_endereco = [self.nome_do_logradouro, self.numero, self.bairro, self.cidade, self.estado]
        return lista_endereco

class Telefone:
    def __init__(self):
        self.ddd = 'ddd'
        self.numero_basico = 'numero_basico'

    def set_telefone(self):
        self.ddd = input('DDD: ')
        self.numero_basico = input('Número básico: ')
    
    def get_telefone(self):
        lista_telefone = [self.ddd, self.numero_basico]
        return lista_telefone

class Data:
    def __init__(self):
        self.dia = 'dia'
        self.mes = 'mes'
        self.ano = 'ano'

    def set_data(self):
        self.dia = input('Dia: ')
        self.mes = input('Mês: ')
        self.ano = input('Ano: ')

    def get_data(self):
        lista_data = [self.dia, self.mes, self.ano]
        return lista_data


