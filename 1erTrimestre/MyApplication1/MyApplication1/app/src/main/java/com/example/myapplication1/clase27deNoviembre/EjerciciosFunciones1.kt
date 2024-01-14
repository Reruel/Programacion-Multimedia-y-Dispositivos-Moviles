package com.example.myapplication1.clase27deNoviembre

fun pres():String{
    return "Bienvenido al programa"
}

fun suma(a:Int, b:Int):Int{
    var res = a + b
    return res
}
fun fin():String{
    return "Ha finalizado el programa"
}

fun main(){
    println(pres())
    println("Indicame un numero")
    var num1 = readLine()?.toIntOrNull() ?:0
    println("Indicame otro numero")
    var num2 = readLine()?.toIntOrNull() ?:0
    var res = suma(num1,num2)
    println("El resultado es $res")
    println(fin())

}