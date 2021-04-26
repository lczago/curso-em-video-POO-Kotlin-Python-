abstract class Pessoa(Nome: String, Idade: Int, Sexo: String) {
    //Atributos
    var nome = Nome
        private set
    var idade = Idade
        private set
    var sexo: String
        private set
    var exp: Int = 0
        private set
    init {
        if (Sexo.trim().equals("M", true) || Sexo.trim().equals("F", true)) {
            this.sexo = Sexo.capitalize()
        }else{
            throw IllegalArgumentException("Digite M ou F")
        }
    }
    //Metodos publicos
    fun ganharExperiencia(Quantidade: Int){
        this.exp += Quantidade
    }
    fun detalhespess(){
         println("Nome: $nome, $idade anos, $sexo, Exp: $exp")
    }
}