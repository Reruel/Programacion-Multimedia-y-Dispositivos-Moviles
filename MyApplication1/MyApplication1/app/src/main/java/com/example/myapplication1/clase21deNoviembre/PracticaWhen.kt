package com.example.myapplication1.clase21deNoviembre

fun main(){
    println("Ingresa un número")
    val num: Int? = readLine()?.toInt()
    when(num){
        0,1,2,3,4 -> println("Suspenso")
        5 -> println ("Suficiente")
        6 -> println ("Bien")
        7,8 ->println ("Notable")
        9,10 -> println("Sobresaliente")
    }
    when(num){
        1 -> println("Lunes")
        2 -> println("Martes")
        3 -> println("Miercoles")
        4 -> println("Jueves")
        5 -> println("Viernes")
        6 -> println("Sábado")
        7 -> println("Domingo")
    }
    when(num){
        1 -> println("Enero")
        2 -> println("Febrero")
        3 -> println("Marzo")
        4 -> println("Abril")
        5 -> println("Mayo")
        6 -> println("Junio")
        7 -> println("Julio")
        8 -> println("Agosto")
        9 -> println("Septiembre")
        10 -> println("Octubre")
        11 -> println("Noviembre")
        12 -> println("Diciembre")
    }
}