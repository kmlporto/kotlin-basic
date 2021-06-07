package me.user.introArrays.list

import me.user.introArrays.imprime
import me.user.introArrays.listaDeLivros
import me.user.introArrays.listaLivrosComNulos
import me.user.introArrays.models.Livro
import me.user.introArrays.models.Prateleira

fun main() {
    listaLivrosComNulos.imprime()
    listaDeLivros
        .groupBy { it.editora ?: "Editora desconhecida" }
        .forEach { (editora: String, livros: List<Livro>) ->
            println("$editora: ${livros.joinToString { it.titulo }}")
        }
    val prateleira = Prateleira(genero = "Literatura", livros = listaDeLivros)

    val porAutor = prateleira.organizaPorAutor()
    val porAno = prateleira.organizaPorAnoPublicacao()

    porAutor.imprime()
    porAno.imprime()

}