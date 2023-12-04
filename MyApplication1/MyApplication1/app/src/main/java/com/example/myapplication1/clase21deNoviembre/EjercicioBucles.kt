package com.example.myapplication1.clase21deNoviembre

fun main(){
    println("Ingresa la cantidad de piezas a analizar")
    var cant = readln().toInt()
    var aptos = 0
    for(a in 1..cant){
        println("Dime la longitud de la pieza $a")
        var longi = readln().toFloat()
        if(longi >= 1.20 && longi<=1.30){
            aptos++
        }
    }
    println("La cantidad de piezas aptas son: $aptos")
}