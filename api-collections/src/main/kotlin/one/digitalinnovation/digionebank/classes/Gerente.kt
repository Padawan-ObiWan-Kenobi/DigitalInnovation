package one.digitalinnovation.digionebank.classes

    class Gerente(
    nome: String,
    cpf: String,
    salario: Double,
    val senha: String

) : Funcionario(nome = nome, cpf = cpf, salario = salario), Login {
    override fun calculoAuxilio(): Double = salario * 0.4
        override fun login(): Boolean = "senha123" == senha

        //override fun Login(): Boolean = "senha123" == senha
}