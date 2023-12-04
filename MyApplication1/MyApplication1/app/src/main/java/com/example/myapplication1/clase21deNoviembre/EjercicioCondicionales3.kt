package com.example.myapplication1.clase21deNoviembre

fun main(){
    println("Ingresa un número")
    var num1 = readln().toInt()
    println("Ingresa otro número")
    var num2 = readln().toInt()

    if(num1<num2){
        var sum = num1+num2
        var res = num2-num1
        println("La suma entre los dos números es $sum")
        println("La suma entre los dos números es $res")
    }else{
        var prod = num1*num2
        var div = num1/num2
        println("La suma entre los dos números es $prod")
        println("La suma entre los dos números es $div")
    }
}