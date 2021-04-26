from Gafanhoto import Gafanhoto
from Video import Video


class Visualizacao:
    # Construtor
    def __init__(self, Espectador: Gafanhoto, Vid: Video):
        self.espectador = Espectador
        self.video = Vid
        self.espectador.viumaisum()
        self.video.play()

    # Metodos publicos
        #def avaliar(self):
            #self.video.like()'''

    def avaliarnota(self):
        return self.video.avaliacao

    # Metodos especiais
    def __repr__(self):
        return f'{self.espectador.__repr__()}\n{self.video.__repr__()}'
