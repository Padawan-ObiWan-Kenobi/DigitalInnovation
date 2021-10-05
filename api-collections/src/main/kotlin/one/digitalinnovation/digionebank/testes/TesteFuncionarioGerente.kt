package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.classes.Gerente

fun main() {

    val maria = Gerente("Maria do Carmo ","12312312312", 5000.0)
    ImprimeRelatorioFuncionario.imprime(maria)
}

