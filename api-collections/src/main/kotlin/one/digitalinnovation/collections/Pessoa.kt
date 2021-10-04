package one.digitalinnovation.collections

class Pessoa {
    var nome: String = "Jether" // Utilizando private como um modificador de visualidade, para que a variavel nao possa ser alterada em tempo de execucao, sendo visivel somente dentro do escopo da classe
    var cpf: String = "123.123.123-12" // Utilizando private como um modificador de visualidade, para que a variavel nao possa ser alterada em tempo de execucao, sendo visivel somente dentro do escopo da classe
    private set // Deixa o get publico, e o set privado

    constructor()

    fun pessoaInfo() = "$nome e $cpf"
}

fun main() {
    val jether = Pessoa()

    println(jether.pessoaInfo())
}