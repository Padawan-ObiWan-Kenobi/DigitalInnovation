package one.digitalinnovation.collections

class Pessoa {
    var nome: String = "Jether" // Utilizando private como um modificador de visualidade, para que a variavel nao possa ser alterada em tempo de execucao, sendo visivel somente dentro do escopo da classe
    var cpf: String = "123.123.123-12" // Utilizando private como um modificador de visualidade, para que a variavel nao possa ser alterada em tempo de execucao, sendo visivel somente dentro do escopo da classe
    private set // Deixa o get publico, e o set privado

    //Classe interna - quando ao criar a classe principal a variavel nao foi instanciada
    //Criando uma classe dentro de outra classe
    //inner class endereco {
    //    var rua: String = "rua teste"
    //}
}

fun main() {
    val jether = Pessoa()
    //jether.cpf = "4567" // Altera a variavel em tempo de execucao, mesmo que esta variavel ja tenho sido declarado o seu valor anteriormente

    println(jether.nome)
    println(jether.cpf)
    //println(jether.endereco().rua)
}