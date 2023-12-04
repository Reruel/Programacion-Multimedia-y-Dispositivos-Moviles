package com.example.myapplication1.clase21deNoviembre

fun main(){
    do {
        println("Ingresa un número entre 1 y 999")
        var num = readln().toInt()
        if(num<10){
            println("El número $num tiene un digito")
        }else if(num <100){
            println("El número $num tiene dos digitos")
        }else if(num <1000){
            println("El número $num tiene tres digitos")
        }else{
            println("El número no está dentro de los parámetros")
        }
    }while (num != 0)
}