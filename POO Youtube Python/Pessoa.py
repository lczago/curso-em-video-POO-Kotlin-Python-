from abc import ABC


class Pessoa(ABC):
    # Atributos
    __exp = 0

    # Construtor
    def __init__(self, Nome: str, Idade: int, Sexo: str):
        if Sexo.upper().strip() not in ['M', 'F']:
            raise TypeError('Digite "M" ou "F"')
        else:
            self.sexo = Sexo
        self.nome = Nome
        self.idade = Idade

    # Metodos publicos
    def ganharexp(self, Experiencia: int):
        self.__exp += Experiencia

    # Metodos especiais
    @property
    def exp(self):
        return self.__exp
