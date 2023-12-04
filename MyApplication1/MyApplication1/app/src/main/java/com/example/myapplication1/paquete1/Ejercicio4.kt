package com.example.myapplication1.paquete1

fun main(){
    println("Ingresa un número")
    var num1 = readln().toInt()
    println("Ingresa otro número")
    var num2 = readln().toInt()
    if(num1 > num2){
        println("$num1 es mayor que $num2")
    }else{
        println("$num2 es mayor que $num1")
    }


}