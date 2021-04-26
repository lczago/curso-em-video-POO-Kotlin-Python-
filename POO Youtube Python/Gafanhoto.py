from Pessoa import Pessoa


class Gafanhoto(Pessoa):
    # Atributos
    __totassis = 0

    # Construtor
    def __init__(self, Nome: str, Idade: int, Sexo: str, Login: str):
        super().__init__(Nome, Idade, Sexo)
        self.login = Login

    # Metodos publicos
    def viumaisum(self):
        self.__totassis += 1
        self.ganharexp(100)

    # Metodos especiais
    def __repr__(self):
        return f'{self.nome}, {self.idade}, {self.sexo}, {self.login}, {self.__totassis}, {self.exp}'
