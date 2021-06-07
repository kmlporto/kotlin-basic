package me.user.introArrays.arrays

fun main(){
    val idades: IntArray = intArrayOf(10, 11, 18, 20)
    val maiorIdade = idades.maxOrNull()
    println("Maior idade $maiorIdade")

    val menorIdade = idades.minOrNull()
    println("Menor idade $menorIdade")

    val media = idades.average()
    println("Média $media")

    val todosMaiores = idades.all { it >= 18 }
    println("Todos maiores de 18? $todosMaiores")

    val algumMenor = idades.any { it < 18 }
    println("Algum menor? $algumMenor")

    val maiores = idades.filter { it >= 18 }
    println("Maiores: $maiores")

    val find = idades.find { it == 18 }
    println("Encontra o 18: $find")

}
