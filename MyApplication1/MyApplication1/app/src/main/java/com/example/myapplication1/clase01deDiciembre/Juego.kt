package com.example.myapplication1.clase01deDiciembre

class Juego {
    val dado1 = Dado(1)
    val dado2 = Dado(1)
    val dado3 = Dado(1)

    fun jugar():Boolean {
        dado1.tirar()
        dado2.tirar()
        dado3.tirar()
        if (dado1.valor == dado2.valor && dado2.valor == dado3.valor) {
            println("Ganó")
            return true
        }else{
            println("Perdió")
            return false
        }

    }
}

fun main(parametro: Array<String>) {
    val juego1 = Juego()
    do {
      val resultado =juego1.jugar()
        println()
    }while(!resultado)

}
