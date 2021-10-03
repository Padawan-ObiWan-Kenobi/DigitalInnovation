package one.digitalinnovation.collections

class Pessoa {
    var nome: String = "Jether"
    var cpf: String = "123.123.123-12"
}

fun main() {
    val jether = Pessoa()

    println(jether.nome)
    println(jether.cpf)
}