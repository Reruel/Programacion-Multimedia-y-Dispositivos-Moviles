package com.example.myapplication1.clase21deNoviembre

fun main(){
    var suma = 0
    var prom = 0
    for(a in 1..3){
        println("Ingresa una nota")
        var nota = readln().toInt()
        suma += nota
        prom =  suma/a
    }

    if(prom<4){
        println("Reprobado")
    }else if(prom < 7){
        println("Regular")
    }else{
        println("Promocionado")
    }
}