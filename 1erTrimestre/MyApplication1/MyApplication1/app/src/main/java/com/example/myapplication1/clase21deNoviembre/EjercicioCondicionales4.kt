package com.example.myapplication1.clase21deNoviembre

fun main(){
    println("Ingresa un número")
    var num1 = readln().toInt()
    println("Ingresa otro número")
    var num2 = readln().toInt()

    var numMasGrande = 0

    if(num1 > num2){
        numMasGrande = num1
        println("El numero más grande es: $numMasGrande")
    } else if (num2 > num1){
        numMasGrande = num2
        println("El numero más grande es: $numMasGrande")
    }else{
        println("Los numeros son iguales")
    }
}