package com.example.myapplication1.clase21deNoviembre

fun main(){
    var i = 1
    while(i<=10){
        var resultado=5*i
        println("El resultado de 5 * $i es $resultado")
        i++
    }
    println("")
    i=1
    do {
        var res2 = 5*i
        println("El resultado de 5 * $i es $res2")
        i++
    }while(i<=10)
}