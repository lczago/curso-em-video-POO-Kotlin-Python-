class Video(Titulo: String): VideoActions{
    //Atributos:
    var titulo = Titulo
        protected set
    var avaliacao: String = "Neutra!"
        protected set
    var views: Int = 0
        protected set
    var curtidas: Int = 0
        protected set
    var dislikes: Int = 0
        protected set
    var quemcur: MutableList<String> = mutableListOf<String>()
        private set
    var quemncur: MutableList<String> = mutableListOf<String>()
        private set
    var reproduzindo: Boolean = false
        protected set

    //Metodos abstratos
    override fun play() {
        this.reproduzindo = true
        this.views += 1
    }

    override fun pause() {
        this.reproduzindo = false
    }

    override fun like(gafanhoto: Gafanhoto) {
        if (gafanhoto.login in this.quemcur) {
            println("Esse Gafanhoto já curtiu!")
        }else{
            this.quemcur.add(gafanhoto.login)
            this.curtidas += 1
        }
    }

    override fun dislike(gafanhoto: Gafanhoto) {
        if (gafanhoto.login in this.quemncur) {
            println("Esse Gafanhoto já deu dislike!")
        }else{
            this.quemncur.add(gafanhoto.login)
            this.dislikes += 1
        }
    }

    //Metodos publicos
    fun detalhesfilm(){
        if (curtidas > dislikes){
            this.avaliacao = "Positiva!"
        }else if (curtidas < dislikes){
            this.avaliacao = "Negativa!"
        }
        println("Titulo: $titulo, Views: $views, Avaliação: $avaliacao, $curtidas, $dislikes")
    }
}