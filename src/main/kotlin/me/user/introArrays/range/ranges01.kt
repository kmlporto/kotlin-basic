package me.user.introArrays.range

fun main(){
    val series: IntRange = 1.rangeTo(10)
    series.forEach { s -> print("$s ") }

    println()

    val numerosPares = 0..50 step 2
    numerosPares.forEach { p -> print("$p ") }

    println()

    val paresReverso = 100 downTo 0 step 2
    paresReverso.forEach { i -> print("$i ") }

    println()

    val numero = 11
    if(numero in paresReverso){
        println("Está no intervalo")
    }else{
        println("Não está no intervalo")
    }

}