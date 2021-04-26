fun main() {
    //Objeto Gafanhoto
    val g = mutableListOf<Gafanhoto>()
    g.add(Gafanhoto("Leozin", "Leonardo", 24, "m"))
    g.add(Gafanhoto("Nc8", "Nick", 12, "m"))
    //Objeto Video
    val v = mutableListOf<Video>()
    v.add(Video("A volta dos que n foram"))
    //Ojbeto Assistir
    val assis = mutableListOf<Assistir>()
    assis.add(Assistir(g[0], v[0]))
    assis.add(Assistir(g[0], v[1]))
    assis[0].detalhesassis()
}