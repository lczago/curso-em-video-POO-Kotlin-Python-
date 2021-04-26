from Gafanhoto import Gafanhoto
from Video import Video
from Visualizacao import Visualizacao

# Objeto Gafanhoto(parametros necessários)

g = [Gafanhoto()]

# Objeto Video(parametros necessários)

v = [Video()]

# Objeto Assistir(parametros: Gafanhoto, Video)

assistir = [Visualizacao(g[0], v[0])]
print(assistir[0])
