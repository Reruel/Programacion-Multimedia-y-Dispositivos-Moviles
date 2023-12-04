package com.example.myapplication1.clase21deNoviembre

fun main(){
    var cant = 1
    var suma = 0
    do {
        println("Ingresa un número")
        var num = readln().toInt()

        if(num!=0){
            suma += num
            var prom = suma/cant
            println("El promedio de los números ingresados es $prom")
            cant++
        }

    }while(num !=0)
}