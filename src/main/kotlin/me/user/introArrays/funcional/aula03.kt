package me.user.introArrays.funcional

fun main() {

//    aqui há necessidade do label para retornar outro valor que não seja a ultima linha
    val calculaBonficacao: (salario: Double) -> Double = lambda@{
        if(it > 1000.0){
            return@lambda it + 50
        }
        it + 100
    }

    println("Bonificação: ${calculaBonficacao(1010.0)}")

    val calculaBanificacaoAnonima = fun(salario: Double): Double {
        if(salario > 1000.0){
            return salario + 50
        }
        return salario + 100
    }
    println("Bonificação: ${calculaBanificacaoAnonima(1010.0)}")

}