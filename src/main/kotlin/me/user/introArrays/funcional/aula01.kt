package me.user.introArrays.funcional

fun main() {
    val minhaFuncao: () -> Unit = ::teste
    minhaFuncao()

    val minhaFuncaoClasse: () -> Unit = Teste()
    minhaFuncaoClasse()

    val minhaFuncaoClasse2 = Teste2()
    minhaFuncaoClasse2()

    val minhaFuncaoLambda: () -> Unit = { println("Executa como lambda")}
    minhaFuncaoLambda()

    val minhaFuncaoLambda2 = fun() { println("Executa como lambda2")}
    minhaFuncaoLambda2()
}

fun teste(){
    println("executa teste")
}

class Teste : () -> Unit {
    override fun invoke() {
        println("executa invoke do Teste")
    }
}

class Teste2 {
    operator fun invoke() {
        println("executa invoke do Teste3")
    }
}

