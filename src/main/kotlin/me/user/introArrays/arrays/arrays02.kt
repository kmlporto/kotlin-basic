package me.user.introArrays.arrays

fun main(){
    val salarios: DoubleArray = doubleArrayOf(1500.5, 2300.0, 5000.0, 8000.0, 10000.0)
    val aumento = 1.1

//    assim não é possível
//    for(salario in salarios){
//        salario *= aumento
//    }

    for(indice in salarios.indices)
        salarios[indice] = salarios[indice] * aumento
    println(salarios.contentToString())

    salarios.forEachIndexed { index, salario ->
        salarios[index] = salario * aumento
    }
    println(salarios.contentToString())

//  duas formas de instanciar array de string:

    val contatos: Array<String> = Array<String>(3) { "" }
    contatos[0] = "Roberto"
    contatos[1] = "Ana"
    contatos[2] = "Paula"

    val contatos2 = arrayOf("Roberto", "Ana", "Paula")
}