package me.user.introArrays

import java.math.BigDecimal

fun bigDecimalArrayOf(vararg valores: String): Array<BigDecimal>{
    return Array<BigDecimal>(valores.size){ i ->
        valores[i].toBigDecimal()
    }
}

//“extension function”
fun Array<BigDecimal>.somatoria(): BigDecimal {
    return this.reduce{ acc, valor ->
        acc + valor
    }
}

fun Array<BigDecimal>.media(): BigDecimal{
    return if(this.isEmpty()){
        BigDecimal.ZERO
    }else{
        this.somatoria() / this.size.toBigDecimal()
    }

}