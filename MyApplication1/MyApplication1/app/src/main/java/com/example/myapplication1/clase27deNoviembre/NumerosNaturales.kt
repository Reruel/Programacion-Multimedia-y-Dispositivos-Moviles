package com.example.myapplication1.clase27deNoviembre

fun sumaNaturales(n:Int):Int{
    return if(n<=0){
        0
    }else{
        n + sumaNaturales(n-1)
    }
}
fun main(){
    println("Ingresa un numero para calcular la suma")
    val num = readLine()?.toIntOrNull() ?: 0
    if(num >=0){
        val res = sumaNaturales(num)
        print ("La suma de los $num primeros numeros naturales es $res")
    }else{
        println("Por favor ingresa un número no negativo")
    }
}