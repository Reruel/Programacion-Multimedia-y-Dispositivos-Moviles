package com.example.myapplication1.clase24deNoviembre

fun main(){
    val array2d = arrayOf(arrayOf(1,2,3), arrayOf("A","B",-1))
    for(fila in array2d){
        for(elemento in fila){
            print("$elemento/")
        }
        println()
    }


    val array2d2 = arrayOf(arrayOf("Alberto",1,"Victor",2), arrayOf(35,-20,16))
    for(fila in array2d2){
        for(elemento in fila){
            print("$elemento/")
        }
        println()
    }

    var matricesEnteros = arrayOf(intArrayOf(3,2,1),intArrayOf(4,5),intArrayOf(6))
    matricesEnteros[0][2] = 56
    matricesEnteros[0].set(1,98)
    println(matricesEnteros[0].joinToString())


    var matricesEnteros2 = arrayOf(intArrayOf(12,15,21,45),intArrayOf(14,25,16),intArrayOf(23,24))
    matricesEnteros2[0][2] = 50
    println("Valor cambiado a: " + matricesEnteros2[0][2])
    matricesEnteros2[0].set(2,110)
    println("Valor cambiado con set a: " + matricesEnteros2[0][2])
    matricesEnteros2[2][0] = 93
    println("Valor cambiado a: " + matricesEnteros2[2][0])
    matricesEnteros2[2].set(0,110)
    println("Valor cambiado con set a: " + matricesEnteros2[2][0])

    for(fila in matricesEnteros2){
        for(elemento in fila){
            print("$elemento/")
        }
        println()
    }
}