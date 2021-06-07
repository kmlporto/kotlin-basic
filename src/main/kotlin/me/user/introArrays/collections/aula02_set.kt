package me.user.introArrays.collections

fun main() {
    val assistiramCursoAndroid = listOf("Alex", "Fran", "Gui", "Maria")
    val assistiramCursokotlin = listOf("Alex", "Paulo", "Maria")

    val assistiramAmbos = assistiramCursoAndroid + assistiramCursokotlin
    println(assistiramAmbos.distinct())


//    aqui, quando o android é uma set, o assisti
    val assistiramCursoAndroid2 = setOf("Alex", "Fran", "Gui", "Maria")
    val assistiramCursokotlin2 = setOf("Alex", "Paulo", "Maria")
    val assistiramAmbos2 = mutableSetOf<String>()
    assistiramAmbos2.addAll(assistiramCursoAndroid2)
    assistiramAmbos2.addAll(assistiramCursokotlin2)
//    aqui não adiciona, pois ja existe
    assistiramAmbos2.add("Alex")
    assistiramAmbos2.add("Ana")
    println(assistiramAmbos2)

}