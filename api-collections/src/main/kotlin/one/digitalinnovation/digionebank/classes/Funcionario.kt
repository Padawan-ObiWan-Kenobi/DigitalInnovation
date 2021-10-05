package one.digitalinnovation.digionebank.classes

import java.math.BigDecimal

abstract class Funcionario(
    nome: String, // Funcao para sobescrever a val
    cpf: String, // Funcao para sobescrever a val
    val salario: BigDecimal
) : Pessoa(nome, cpf) {
    abstract fun calculoAuxilio();
}