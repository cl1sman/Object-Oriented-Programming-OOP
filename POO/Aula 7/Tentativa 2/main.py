from class_ import Cliente
from class_ import Endereco
from class_ import Telefone
from class_ import Data


def new():
    cliente = Cliente()
    endereco = Endereco()
    telefone = Telefone()
    data = Data()

    cliente.set_endereco = endereco
    cliente.set_endereco.set_endereco()


    cliente.set_telefone = telefone
    cliente.set_telefone.set_telefone()

    cliente.set_data = data
    cliente.set_data.set_data()

    # print(cliente.set_endereco.get_endereco())
    # print(cliente.set_telefone.get_telefone())
    # print(cliente.set_data.get_data())

cliente = new()
print(type(cliente))