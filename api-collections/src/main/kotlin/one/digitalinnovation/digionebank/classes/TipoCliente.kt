package one.digitalinnovation.digionebank.classes

enum class TipoCliente(val descricao: String) { // Para que seja possivel acessar o get devemos declarar a descricao como uma val
    PF("Pessoa Fisica"),
    PJ("Pessoa Juridica");
}

// Funcao Enum