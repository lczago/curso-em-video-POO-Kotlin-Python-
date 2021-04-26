class Gafanhoto(Login: String, Nome: String, Idade: Int, Sexo: String): Pessoa(Nome, Idade, Sexo) {
    //Atributos
    var login = Login
        protected set
    var totasst: Int = 0
        protected set
    var likes: Int = 0
        protected set

    //Metodos Publicos
    fun viuMaisUm(){
        this.totasst += 1
        ganharExperiencia(100)
    }
    fun detalhesgaf(){
        detalhespess()
        println("Login: $login, Total assistido: $totasst")
    }
}