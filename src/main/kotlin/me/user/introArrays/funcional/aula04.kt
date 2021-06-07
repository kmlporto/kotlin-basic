package me.user.introArrays.funcional

import me.user.introArrays.models.Endereco

fun main() {

    val endereco = Endereco()
        .also { println("Criando um endereço") }
        .apply {
            logradouro = "rua nova"
            numero = 2341
        }
    val enderecoEmMaiusculo = "${endereco.logradouro}, ${endereco.numero}".toUpperCase()
    println(enderecoEmMaiusculo)

    Endereco(logradouro = "rua verqueiro", numero = 1234)
        .let {
            "${it.logradouro}, ${it.numero}".toUpperCase()
        }.let (::println)

    Endereco(logradouro = "rua verqueiro", numero = 1234)
        .run {
            "$logradouro, $numero".toUpperCase()
        }.let (::println)

    with(endereco) {
        "$logradouro, $numero".toUpperCase()
    }.let (::println)


    soma2(1, 3, resultado = ::println)
}

fun soma2(b: Int, a:Int, resultado: (Int) -> Unit){
    println(":::antes da soma:::")
    resultado(a + b)
    println(":::depois da soma:::")
}
