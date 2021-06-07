package me.user.introArrays.collections

import me.user.introArrays.models.Pedido

fun main() {
    val pedidos = listOf(
        Pedido(1, 20.0),
        Pedido(2, 24.0),
        Pedido(3, 30.0),
        Pedido(4, 76.0),
        Pedido(5, 20.0),
        Pedido(6, 90.0),
    )
    println(pedidos)
    val pedidosMapeados = pedidos.associate { pedido: Pedido -> Pair(pedido.numero, pedido) }
    println(pedidosMapeados)
//  outra forma de associar:
    val pedidosMapeados2 = pedidos.associateBy { pedido -> pedido.numero }

    val pedidosFreteGratis = pedidos.associateWith { pedido: Pedido -> pedido.valor > 50.0 }
    println(pedidosFreteGratis)

//    tentativa falha de colocar todos os pedidos que tem frete gratis em um map com chave true
//    val mapa = pedidos.associateBy { pedido -> pedido.valor > 50.0 }
//    println(mapa)

    val pedidosFreteGratisAgrupados = pedidos.groupBy { pedido: Pedido -> pedido.valor > 50 }
    println(pedidosFreteGratisAgrupados)
    println("pedidos com frete gratis: " + pedidosFreteGratisAgrupados[true])

    val pedidosFreteAgrupados = pedidos.groupingBy { pedido -> pedido.valor > 50 }
    println("pedidos com frete gratis: $pedidosFreteAgrupados")
    println("quantias: " + pedidosFreteAgrupados.eachCount())

    val nomes = listOf(
        "Alex",
        "Fran",
        "Gui",
        "Ana",
        "Paulo",
        "Maria",
        "Gisele",
        "Aretuza"
    )

    val agenda = nomes.groupBy { it.first() }
    println("agrupa nomes pela primeira letra: $agenda")
    println("consulta nomes com a letra a: ${agenda['A']}")
}