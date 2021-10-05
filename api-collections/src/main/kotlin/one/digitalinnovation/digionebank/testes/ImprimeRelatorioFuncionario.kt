package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.classes.Funcionario

class ImprimeRelatorioFuncionario {
    companion object { // Metodo estatico onde com o qual eu consigo invocar este via claase e nao via instancia
        fun imprime(funcionario: Funcionario) {
            println(
                funcionario.toString()
            )
        }
    }
}