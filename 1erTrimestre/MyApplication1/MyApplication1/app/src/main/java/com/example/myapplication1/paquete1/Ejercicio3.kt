package com.example.myapplication1.paquete1

fun main(){
    println("Ingrese la nota del alumno")
    var nota = readln().toInt()
    if(nota>10){
        println("Perfecto")
    }else if(nota>7){
        println("Notable")
    }else if(nota>5){
        println("Aprobado")
    } else{
        println("Suspenso")
    }
}