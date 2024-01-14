package com.example.myapplication1.clase01deDiciembre

class Dado(var valor: Int){

    fun tirar() {
        valor = ((Math.random() * 6) + 1).toInt()
        imprimir()
    }

    fun imprimir() {
        println("Valor del dado: $valor")
    }
}