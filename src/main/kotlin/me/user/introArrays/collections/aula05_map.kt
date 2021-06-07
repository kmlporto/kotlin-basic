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
    val d1 = pedidos[4]
    println(d1)

//    aqui não existe, então dá uma exception
//    val d2 = pedidos.getValue(5)
//    println(d2)

    println(pedidos.getOrElse(4, {"Não tem pedido com esse valor"}))
    println(pedidos.getOrDefault(4, -1.0))
    println(pedidos.keys)
    println(pedidos.values)

    println(pedidos.filterKeys { chave -> chave % 2 == 0 })
    println(pedidos.filterValues { valor -> valor > 70 })

    val paresMaiorQueDez = pedidos.filter { (k, v) -> k % 2 == 0 && v > 10 }
    println(paresMaiorQueDez)

}