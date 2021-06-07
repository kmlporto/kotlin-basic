package me.user.introArrays.collections

fun main() {
    val assistiramCursoAndroid = setOf("Alex", "Fran", "Gui", "Maria")
    val assistiramCursokotlin = setOf("Alex", "Paulo", "Maria")

    println(assistiramCursoAndroid + assistiramCursokotlin)
    println(assistiramCursoAndroid union assistiramCursokotlin)

    println(assistiramCursoAndroid - assistiramCursokotlin)
    println(assistiramCursoAndroid subtract assistiramCursokotlin)

    println(assistiramCursoAndroid intersect  assistiramCursokotlin)
}