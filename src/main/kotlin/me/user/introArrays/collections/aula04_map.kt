package me.user.introArrays.collections

fun main() {

//    podemos usar o Pair e o Infix (chave to valor) para inserir valores no map
//    se a questão de performance for importante não usar ela, e sim o Pair
    val pedidos = mutableMapOf(Pair(1, 20.0), Pair(2, 34.0), 3 to 50.0)
    println(pedidos)

    val pedido = pedidos[1]
    pedido?.let { println("pedido $it") }

    for (p in pedidos){
        println("Pedido n ${p.key}: ${p.value}")
    }

    pedidos[5] = 70.0
    println(pedidos)

    pedidos.put(4, 100.0)
    pedidos.put(4, 101.0)
    println(pedidos)

    pedidos.putIfAbsent(6, 200.0)
    pedidos.putIfAbsent(6, 200.1)
    println(pedidos)


    pedidos.remove(1)
    println("remove o 1: $pedidos")

    pedidos.remove(3, 100.0)
    println("só remove o 3 se o valor for 100: $pedidos")
    pedidos.remove(3, 50.0)
    println("só remove o 3 se o valor for 50: $pedidos")
}