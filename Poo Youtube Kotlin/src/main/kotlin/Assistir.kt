class Assistir(Gafanhoto: Gafanhoto, Video: Video){
    //Atributos
    var espectador = Gafanhoto
        private set
     var video = Video
        private set
    init {
        video.play()
        espectador.viuMaisUm()
    }

    //Metodos publicos
    fun detalhesassis(){
        println("\tEspectador: ")
        espectador.detalhesgaf()
        println("-".repeat(100))
        println("\tVideo:")
        video.detalhesfilm()
    }

}