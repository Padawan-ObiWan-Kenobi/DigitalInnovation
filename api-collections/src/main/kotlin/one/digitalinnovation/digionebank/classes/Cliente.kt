package one.digitalinnovation.digionebank.classes

class Cliente(
    nome: String,
    cpf: String,
    val tipoCliente: TipoCliente,
    val senha: String
) : Pessoa(nome, cpf), Login {
    override fun login(): Boolean = "123456" == senha

    override fun toString(): String = """
        nome:     $nome
        cpf:      $cpf
        Tipo:     ${tipoCliente.descricao}
        
        
    """.trimIndent()
}