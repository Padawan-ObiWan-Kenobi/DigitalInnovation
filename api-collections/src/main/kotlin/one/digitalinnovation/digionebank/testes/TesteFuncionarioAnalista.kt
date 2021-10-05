package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.classes.Analista

fun main() {

    val joao = Analista("Joao Pedro ","12312312312", 2000.0)
    ImprimeRelatorioFuncionario.imprime(joao)
}

