package one.digitalinnovation.digionebank.classes

data class Banco(
    val nome: String,
    val numero: Int
) {
    fun infoBanco() = "$nome - $numero" // Recurso para unir as duas informacoes que serao utilizadas na Classe BancoTeste
}
