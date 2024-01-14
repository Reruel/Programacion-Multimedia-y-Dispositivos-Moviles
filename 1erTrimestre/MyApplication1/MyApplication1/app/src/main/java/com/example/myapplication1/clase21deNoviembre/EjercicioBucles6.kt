package com.example.myapplication1.clase21deNoviembre

fun main(){
    println("Ingresa la coordenada x")
    var x = readln().toInt()
    println("Ingresa la coordenada y")
    var y = readln().toInt()
    if (x>0){
        if (y>0){
            println("Se encuentra en el cuadrante 1")
        }else if (y<0){
            println("Se encuentra en el cuadrante 4")
        }else{
            println("Se encuentra en un eje")
        }
    } else if(x<0){
        if (y>0){
            println("Se encuentra en el cuadrante 2")
        }else if (y<0){
            println("Se encuentra en el cuadrante 3")
        }else{
            println("Se encuentra en un eje")
        }
    }else{
        println("Se encuentra en un eje")
    }
}