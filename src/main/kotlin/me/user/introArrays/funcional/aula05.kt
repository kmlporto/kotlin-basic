package me.user.introArrays.funcional

import me.user.introArrays.models.Cliente
import me.user.introArrays.models.ContaPoupanca
import me.user.introArrays.models.Endereco

fun main() {

    with(Endereco()){
        logradouro = "rua vergueiro"
        numero = 1345
        bairro = "Vila Mariana"
        cidade = "São Paulo"
        estado = "SP"
        cep = "02310-063"
        complemento = "apto"
        completo()
    }.let { enderecoCompleto: String ->
        println(enderecoCompleto)
    }

    val taxaAnual = 0.05
    val taxaMensal = taxaAnual / 12

    val contaPoupanca = ContaPoupanca(Cliente(nome = "Alex", cpf = "111.111.111-11", senha = 124), 1000)

    contaPoupanca
        .run {
            deposita(1000.0)
            saldo * taxaMensal
        }.let { rendimentoMensal -> println("rendimento mensal: $rendimentoMensal") }

    val rendimentoAnual = run {
        var saldo = contaPoupanca.saldo
        repeat(12) {
            saldo += saldo * taxaMensal
        }
        saldo
    }
    println("rendimento anual: $rendimentoAnual")

}