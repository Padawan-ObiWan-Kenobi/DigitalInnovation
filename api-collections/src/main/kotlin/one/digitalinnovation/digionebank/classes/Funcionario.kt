package one.digitalinnovation.digionebank.classes

abstract class Funcionario(
    nome: String, // Funcao para sobescrever a val
    cpf: String, // Funcao para sobescrever a val
    val salario: Double
) : Pessoa(nome, cpf) {
    protected abstract fun calculoAuxilio(): Double // Funcao protected faz com que apenas a classe funcionario e as classes filhas facam uso do membro

    override fun toString(): String = """
        nome: $nome
        cpf:  $cpf
        salario:  $salario
        auxilio:  ${calculoAuxilio()}
        
        """.trimIndent()
}