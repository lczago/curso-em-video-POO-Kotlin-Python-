fun main() {
    //Objeto Gafanhoto(parametros necessários)
    val g = mutableListOf<Gafanhoto>()
    g.add(Gafanhoto())
    g.add(Gafanhoto())
    //Objeto Video(parametros necessários)
    val v = mutableListOf<Video>()
    v.add(Video())
    //Ojbeto Assistir
    val assis = mutableListOf<Assistir>()
    assis.add(Assistir(g[0], v[0]))
    assis.add(Assistir(g[0], v[1]))
    assis[0].detalhesassis()
}
