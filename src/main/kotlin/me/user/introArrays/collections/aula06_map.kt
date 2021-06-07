package me.user.introArrays.collections

fun main() {
    val pedidos: MutableMap<Int, Double> = mutableMapOf(
        Pair(1, 20.0),
        Pair(2, 34.0),
        3 to 50.0,
        4 to 60.0,
        5 to 90.0,
        6 to 80.0,
        8 to 0.0
    )
//  as operações não alteram o map de pedidos, cria um novo map
    println("criado outra lista com pedidos:" + (pedidos + Pair(10, 9.0)))
    println("criado outra lista com pedidos:" + (pedidos + mapOf(7 to 45, 11 to 20)))
    println("pedidos não é alterado: $pedidos")

    println("criado outra lista com pedidos:" + (pedidos - 6))
    println("criado outra lista com pedidos:" + (pedidos - listOf(6,8)))
    println("pedidos não é alterado: $pedidos")


//  aqui modifica pedidos, tanto o putAll como o +=
    pedidos.putAll(listOf(7 to 90.0, 9 to 20.0))
    println("adiciona lista à pedidos: $pedidos")
    pedidos += listOf(10 to 95.0, 11 to 50.0)
    println("adiciona lista à pedidos: $pedidos")


//  removendo valores com chaves e valores:
    pedidos.values.remove(50.0)
    println("remove primeiro com valor 50: $pedidos")

    pedidos.values.remove(50.0)
    println("remove segundo com valor 50: $pedidos")

    pedidos.keys.remove(1)
    println("remove valor na posição 1: $pedidos")

    pedidos -= 6
    println("remove valor na posição 6: $pedidos")


}