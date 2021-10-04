package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.TipoCliente

fun main() {
    TipoCliente.values().forEach { elemento -> // Uma das formas de apresentar a informacao do tipo de conta do cliente
        println("${elemento.name} - ${elemento.descricao}")

    }

    TipoCliente.values().forEach {
        println("${it.name} - ${it.descricao}") // Outra forma de apresentar a informacao do tipo de conta do cliente

    }

    val pf = TipoCliente.PF
    println("${pf.name}-${pf.descricao}") // Outra forma de apresentar a informacao do tipo de conta do cliente

    val pj = TipoCliente.PJ
    println("${pj.name}-${pj.descricao}") // Outra forma de apresentar a informacao do tipo de conta do cliente
}

// Testando a funcao Enum