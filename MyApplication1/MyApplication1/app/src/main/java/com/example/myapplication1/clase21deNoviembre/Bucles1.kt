package com.example.myapplication1.clase21deNoviembre

fun main(){
    for(a in 0..10 step 2){
        println(a)
    }

    for(a in 20 downTo  0 step 2){
        println(a)
    }

    //Tabla de multiplicar
    for(a in 0..10){
        var resultado = a*5
        println("El resultado de 5 * $a es $resultado")
    }

    println("Tabla inversa")
    for(a in 10 downTo 0){
        var resultado = a*5
        println("El resultado de 5 * $a es $resultado")
    }
}