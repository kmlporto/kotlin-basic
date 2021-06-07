package me.user.introArrays

import me.user.introArrays.models.Livro

fun List<Livro?>.imprime(){
    val textorFormatado = this
        .filterNotNull()
        .joinToString(separator = "\n") {
        "- ${it.titulo} de ${it.autor} - editora ${it.editora}"
    }
    println("---- lista de livros ----\n$textorFormatado")

}