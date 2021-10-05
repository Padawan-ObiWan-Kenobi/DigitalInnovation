package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.classes.Cliente
import one.digitalinnovation.digionebank.classes.TipoCliente

fun main() {
    val jose = Cliente(
        nome = "Jose da Silva",
        cpf = "123.123.456-77",
        tipoCliente = TipoCliente.PF ,
        senha = "123456"
    )

    println(jose)

    TesteAutenticacao().autentica(jose)

}
