package me.user.introArrays.list

import me.user.introArrays.models.Livro
import me.user.introArrays.imprime

fun main(){
    val livro1 = Livro(
        titulo = "titulo1",
        autor = "autor 1",
        anoPublicacao = 2000
    )
    val livro2 = Livro(
        titulo = "titulo2",
        autor = "Mariana",
        anoPublicacao = 2001
    )
    val livro3 = Livro(
        titulo = "titulo3",
        autor = "Ayrla",
        anoPublicacao = 2002,
        editora = "Editora A"
    )
    val livro4 = Livro(
        titulo = "titulo4",
        autor = "Bianca",
        anoPublicacao = 2012,
        editora = "Editora B"
    )

    val livros: MutableList<Livro> = mutableListOf(livro1, livro2, livro3, livro4)
    livros.add(
        Livro(
            titulo = "titulo a",
            autor = "autor 1",
            anoPublicacao = 2021,
            editora = "Editora C"
        )
    )

//    livros.imprime()

    livros.remove(livro1)
//    livros.imprime()

//    livros.sorted().imprime()

//    livros.sortedBy { it.titulo }.imprime()

//    livros.sortedBy { it.autor }.imprime()

    livros.filter { it.autor == "Ayrla" }.imprime()
}