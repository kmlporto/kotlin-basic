package me.user.introArrays.models


abstract class Conta(
    val titular: Cliente,
    val numero: Int
) : Autenticavel by titular{
    var saldo = 0.0
        protected set

    companion object {
        var total = 0
            private set
    }

    init {
        total++
    }

    fun deposita(valor: Double) {
        if (valor > 0) {
            this.saldo += valor
        }
    }

    abstract fun saca(valor: Double)

    fun transfere(valor: Double, destino: Conta, senha: Int){

        if(saldo < valor)
            throw SaldoInsuficienteException()

        if(!autentica(senha))
            throw FalhaAutenticacaoException()

        saldo -= valor
        destino.deposita(valor)

    }
//
//    override fun autentica(senha: Int): Boolean {
//        return titular.autentica(senha)
//    }
}