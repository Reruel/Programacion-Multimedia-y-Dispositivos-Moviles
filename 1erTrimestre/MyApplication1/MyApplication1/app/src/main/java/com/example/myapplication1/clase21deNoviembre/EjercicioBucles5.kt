package com.example.myapplication1.clase21deNoviembre

fun main(){
    var notasMenores = 0
    var notasMayores = 0
    for(a in 1..10){
        println("Ingresa una nota")
        var num = readln().toInt()
        when(num){
            1,2,3,4,5,6 -> notasMenores++
            7,8,9,10 -> notasMayores++
            else -> println("El número no es válido")
        }
    }
    println("Hay $notasMenores notas menores a 7")
    println("Hay $notasMayores notas mayores o iguales a 7")
}