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
        self.nome = None
        self.rg = None
        self.cpf = None
        self.telefone = None
        self.data_de_nascimento = None
        self.endereco = None
    

    "Partindo destes métodos que as outras classes serão associadas"
    # set endereço
    def set_endereco(self, endereco):
        self.endereco = endereco
    
    # set telefone
    def set_telefone(self, telefone):
        self.telefone = telefone
    
    # set data
    def set_data(self, data):
        self.data = data


class Endereco:
    def __init__(self):
        self.nome_do_logradouro = None
        self.numero = None
        self.bairro = None
        self.cidade = None
        self.estado = None
    
    # set endereço
    def set_endereco(self):
        self.nome_do_logradouro = input('Nome do logradouro: ')
        self.numero = int(input('Número: '))
        self.bairro = input('Bairro: ')
        self.cidade = input('Cidade: ')
        self.estado = input('Estado: ')
    

    def get_endereco(self):
        endereco = r"""
        Nome do logradouro: {0}
        Número: {1}
        Bairro: {2}
        Cidade: {3}
        Estado: {4}
        """.format(self.nome_do_logradouro, self.numero, self.bairro, self.cidade, self.estado)
        return endereco


class Telefone:
    def __init__(self):
        self.ddd = None
        self.numero_basico = None
    
    # set telefone
    def set_telefone(self):
        self.ddd = int(input('DDD: '))
        self.numero_basico = int(input('Número básico: '))

    # get telefone
    def get_telefone(self):
        telefone = r"""
        DDD: {0}
        Número básico: {1}
        """.format(self.ddd, self.numero_basico)
        return telefone


class Data:
    def __init__(self):
        self.dia = None
        self.mes = None
        self.ano = None
    
    # set data
    def set_data(self):
        self.dia = int(input('Dia: '))
        self.mes = int(input('Mês: '))
        self.ano = int(input('Ano: '))
    

    # get data
    def get_data(self):
        data = r"""
        Dia: {0}
        Mês: {1}
        Ano: {2}
        """.format(self.dia, self.mes, self.ano)
        return data