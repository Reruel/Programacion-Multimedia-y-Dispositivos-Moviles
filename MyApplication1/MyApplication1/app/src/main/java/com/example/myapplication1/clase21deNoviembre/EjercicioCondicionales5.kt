package com.example.myapplication1.clase21deNoviembre

fun main(){
    println("Ingresa un número")
    var num = readln().toInt()

    var resultado = 0
    if(num % 2 == 0){
        resultado = num*num
        println("El cuadrado del número ingresado es: $resultado")
    }else{
        resultado = num*num*num
        println("El cubo del número ingresado es: $resultado")
    }
}