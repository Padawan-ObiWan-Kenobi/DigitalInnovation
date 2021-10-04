package one.digitalinnovation.collections.testes

import one.digitalinnovation.collections.classes.Banco

fun main() {
    val digiOneBank = Banco(nome = "DigiOne", numero = 12)
    // val digiOneBank = Banco("DigiOne", 12) // Usando o recurso chamado argumentos nomeados

    println(digiOneBank.nome)
    println(digiOneBank.numero)

    val Banco2 = digiOneBank.copy(nome = "Banco2") // Recurso para poder alterar uma val

    println(Banco2.infoBanco()) // Imprime a informacao como foi declarado na funçao fun da Data Class Banco

}