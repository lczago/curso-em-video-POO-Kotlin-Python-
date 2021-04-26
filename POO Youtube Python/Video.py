from Gafanhoto import Gafanhoto


class Video:
    # Atributos
    __avaliacao = "Neutra"
    __views = 0
    __curtidas = 0
    __quemcur = []
    __quemncur = []
    __dislikes = 0
    __reproduzindo = False

    # Construtor
    def __init__(self, Titulo: str):
        self.__titulo = Titulo

    # Metodos publicos
    def play(self):
        self.__reproduzindo = True
        self.__views += 1

    def pause(self):
        self.__reproduzindo = False

    def like(self, Espectador: Gafanhoto):
        if Espectador.login in self.__quemcur:
            print("Gafanhoto já curtiu!")
        else:
            self.__quemcur.append(Espectador.login)
            self.__curtidas += 1

    def dislike(self, Espectador: Gafanhoto):
        if Espectador.login in self.__quemncur:
            print("Gafanhoto já deu dislike!")
        else:
            self.__quemncur.append(Espectador.login)
            self.__dislikes += 1

    # Metodos especiais
    def __repr__(self):
        if self.__curtidas > self.__dislikes:
            self.__avaliacao = "Positiva!"
        elif self.__curtidas < self.__dislikes:
            self.__avaliacao = "Negativa!"
        elif self.__curtidas == self.__dislikes:
            self.__avaliacao = "Neutra!"
        return f'{self.__titulo}, {self.__avaliacao}, {self.__views}'

    @property
    def avaliacao(self):
        return self.__avaliacao
