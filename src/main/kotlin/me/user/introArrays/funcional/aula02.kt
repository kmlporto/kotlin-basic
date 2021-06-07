package me.user.introArrays.funcional

fun main() {

    val minhaSoma = ::soma
    println(minhaSoma(1, 2,))

    val minhaSomaClass = Soma()
    println(minhaSomaClass(1, 2))

    val minhaSomaLambda = { a: Int, b: Int -> a + b }
    println(minhaSomaLambda(1,2))

    val minhaSomaAnonima = fun(a: Int, b: Int): Int { return a + b }
    println(minhaSomaAnonima(1,2))
}

fun soma(a: Int, b:Int): Int = a+b

class Soma: (Int, Int) -> Int {
    override fun invoke(p1: Int, p2: Int): Int = p1 + p2
}