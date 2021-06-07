package me.user.introArrays.arrays

import me.user.introArrays.bigDecimalArrayOf
import me.user.introArrays.media
import me.user.introArrays.somatoria
import java.math.BigDecimal
import java.math.RoundingMode

fun main(){
    val salarios = Array<BigDecimal>(4){ BigDecimal.ZERO}
    println(salarios.contentToString())
    salarios[0] = "1500.55".toBigDecimal()
    salarios[1] = "2000.00".toBigDecimal()
    salarios[2] = "5000.00".toBigDecimal()
    salarios[3] = "10000.00".toBigDecimal()
    println(salarios.contentToString())

    val salarios2 = bigDecimalArrayOf("1000.00", "3000.00")
    println(salarios2.contentToString())

    val aumento = "1.1".toBigDecimal()
    val salarioComAumento: Array<BigDecimal> = salarios
        .map { salario -> calculaAumentoRelativo(salario, aumento) }
        .toTypedArray()

    println(salarioComAumento.contentToString())
    val gastoInicial = salarioComAumento.somatoria()
    println(gastoInicial)

    val meses = 6.toBigDecimal()
    val gastoSeisMeses = salarioComAumento.fold(gastoInicial) { acc, salario ->
        acc + (salario * meses).setScale(2, RoundingMode.UP)
    }
    println(gastoSeisMeses)

    val media = salarioComAumento
        .sorted()
        .takeLast(3)
        .toTypedArray()
        .media()
    println(media)

}

fun calculaAumentoRelativo(
    salario: BigDecimal,
    aumento: BigDecimal
) = if (salario < "5000".toBigDecimal()) {
    salario + "500".toBigDecimal()
} else {
    (salario * aumento).setScale(2, RoundingMode.UP)
}
