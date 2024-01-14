package com.example.myapplication1.paquete1

fun main(){
    println("Ingrese el sueldo del empleado")
    var sueldo = readln().toDouble()
    if(sueldo > 3000){
        println("Debes pagar impuestos")
    }else{
        println("La pobreza no paga impuestos")
    }
}