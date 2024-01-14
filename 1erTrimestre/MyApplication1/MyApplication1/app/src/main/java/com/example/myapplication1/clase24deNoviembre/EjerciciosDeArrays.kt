package com.example.myapplication1.clase24deNoviembre

fun main(){
    var arrayNumeros = arrayOf(1,4,56,3,77,23,55,98,76,3,5,49)
    var suma = 0
    var prom = 0
    for (num in arrayNumeros){
        suma +=num
    }
    prom = suma/arrayNumeros.size
    println("La suma de todos los números del array es: $suma")
    println("El promedio de todos los números del array es: $prom")

    for(i in 0 until arrayNumeros.size){
        if (arrayNumeros[i]==55){
            println("Elemento encontrado en la posición: $i")
        }
    }
}