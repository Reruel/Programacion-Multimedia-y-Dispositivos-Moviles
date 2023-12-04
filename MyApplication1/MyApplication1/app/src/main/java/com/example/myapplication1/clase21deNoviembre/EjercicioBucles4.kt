package com.example.myapplication1.clase21deNoviembre

fun main(){
    var suma = 0
    for(a in 1..10){
        println("Ingrese un número $a/10")
        var num= readln().toInt()
        suma +=num
    }
    println("La suma de los 10 números es $suma")
}
