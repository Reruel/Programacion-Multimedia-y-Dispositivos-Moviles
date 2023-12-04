package com.example.myapplication1.clase27deNoviembre

fun perimetro(a:Int):Int{
    var res = a*4
    return res
}
fun superficie(a:Int):Int{
    var res = a*a
    return res
}
fun main(){
    println("Ingresa el lado de un cuadrado")
    var num1 = readLine()?.toIntOrNull() ?:0

    println("Quieres calcular su: \n1-Perimetro\n2-Superficie")
    var opc = readln().toInt()
    var res = 0
    if (opc == 1){
        res = perimetro(num1)
        println("El perimetro es: $res")
    }else{
        res = superficie(num1)
        println("La superficie es: $res")
    }
}