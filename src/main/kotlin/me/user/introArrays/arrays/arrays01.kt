package me.user.introArrays.arrays

fun main(){
    val idades: IntArray = intArrayOf(25, 19 , 33, 20, 1000, 10)

    var maiorIdade = 0
    for(idade in idades){
        if(idade > maiorIdade)
            maiorIdade = idade
    }
    println(maiorIdade)


    var menorIdade = Int.MAX_VALUE
    idades.forEach { idade ->
        if(idade < menorIdade)
            menorIdade = idade
    }
    println(menorIdade)
}