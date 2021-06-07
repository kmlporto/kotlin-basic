package me.user.introArrays

import me.user.introArrays.models.Livro

val listaDeLivros: MutableList<Livro> = mutableListOf(
    Livro(
        titulo = "Grande Sertão: Veredas",
        autor = "João Guimarães Rosa",
        anoPublicacao = 1956
    ),
    Livro(
        titulo = "Minha vida de menina",
        autor = "Helena Morley",
        anoPublicacao = 1942,
        editora = "Editora A"
    ),
    Livro(
        titulo = "Memórias Póstumas de Brás Cubas",
        autor = "Machado de Assis",
        anoPublicacao = 1881
    ),
    Livro(
        titulo = "Iracema",
        autor = "José de Alencar",
        anoPublicacao = 1865,
        editora = "Editora B"
    ),
    Livro(
        titulo = "titulo4",
        autor = "Bianca",
        anoPublicacao = 2012,
        editora = "Editora B"
    )
)

val listaLivrosComNulos: MutableList<Livro?> = mutableListOf(
    Livro(
        titulo = "Grande Sertão: Veredas",
        autor = "João Guimarães Rosa",
        anoPublicacao = 1956
    ),
    null,
    Livro(
        titulo = "Minha vida de menina",
        autor = "Helena Morley",
        anoPublicacao = 1942,
        editora = "Editora A"
    ),
    null,
    Livro(
        titulo = "Memórias Póstumas de Brás Cubas",
        autor = "Machado de Assis",
        anoPublicacao = 1881
    ),
    Livro(
        titulo = "Iracema",
        autor = "José de Alencar",
        anoPublicacao = 1865,
        editora = "Editora B"
    ),
    null,
    Livro(
        titulo = "titulo4",
        autor = "Bianca",
        anoPublicacao = 2012,
        editora = "Editora B"
    )
)
