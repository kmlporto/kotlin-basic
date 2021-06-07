package me.user.introArrays.funcional

import me.user.introArrays.models.Autenticavel
import me.user.introArrays.models.SistemaInterno

fun main() {
    somaReceiver(1, 3, resultado = {
        println(this)
    })

    val autenticavel = object : Autenticavel{
        val senha = 1234
        override fun autentica(senha: Int) = this.senha == senha
    }


    val sistemaInterno = SistemaInterno()

    sistemaInterno.entraReceiver(autenticavel, 1234, autenticado= {
        println("realizar pagamento")
        pagamento()
    })
}

fun somaReceiver(a:Int, b:Int, resultado: Int.() -> Unit){
    println("antes da soma")
    val total = a + b
    total.resultado()
    println("depois da soma")
}