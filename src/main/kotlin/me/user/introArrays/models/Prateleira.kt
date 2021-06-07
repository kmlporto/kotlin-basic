package me.user.introArrays.models

class Prateleira (
    val livros: List<Livro>,
    val genero: String
){
    fun organizaPorAutor(): List<Livro?> {
        return livros.sortedBy { it.autor }.toMutableList()
    }

    fun organizaPorAnoPublicacao(): List<Livro?> {
        return livros.sortedBy { it.anoPublicacao }.toMutableList()
    }
}