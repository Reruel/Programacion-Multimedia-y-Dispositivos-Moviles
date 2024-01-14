package com.example.myapplication1.clase24deNoviembre

fun main(){
    val arrayValores = arrayOf(1,2,3,4,5,6,7,8,9)
    for(i in 0 until arrayValores.size step 2){
        println(arrayValores[i])
    }
    var arrayValores2 = arrayOf("A","B","C")
    for(i in 0 until arrayValores2.size ){
        println(arrayValores2[i])
    }

    var arrayValores3 = arrayOf("Laura",30,"Ana",24)
    for(i in arrayValores3.size-1 downTo 0){
        println(arrayValores3[i])
    }

    //que cuente al réves
    for(i in arrayValores.size-1 downTo 0  step 2){
        println(arrayValores[i])
    }

    val arrayFloat = floatArrayOf(3.5f,2.4f)
    for(i in 0 until arrayFloat.size){
        println(arrayFloat[i])
    }

    val arrayVacio = arrayOfNulls<String>(3)
    arrayVacio[0] = "Málaga"
    arrayVacio[1] = "Sevilla"
    arrayVacio[2] = "Granada"
    for(i in 0 until arrayVacio.size){
        println(arrayVacio[i])
    }
    println(arrayVacio.get(0))

    //array de enteros
    var arrayVacio2 = arrayOfNulls<Int>(3)
    arrayVacio2[0] = 1
    arrayVacio2[1] = 2
    arrayVacio2[2] = 3
    for(i in 0 until arrayVacio2.size){
        println(arrayVacio2[i])
    }
    println(arrayVacio2.get(1))
    println(arrayVacio2.joinToString())


    //usando float
    var arrayVacio3 = arrayOfNulls<Float>(3)
    arrayVacio3[0] = 1.4f
    arrayVacio3[1] = 2.5f
    arrayVacio3[2] = 3.33f
    for(i in 0 until arrayVacio3.size){
        println(arrayVacio3[i])
    }
    println(arrayVacio3.get(2))

    val array1 = arrayOfNulls<String>(3)
    array1[0] = "W"
    array1[1] = "X"
    array1[2] = "Y"
    val array2 = array1.copyOf(array1.size + 1)
    array2[array1.size] = "Z"
    println("Array1: ${array1.joinToString(", ")}")
    println("Array2: ${array2.joinToString(", ")}")



    val arrayPaises = arrayOfNulls<String>(3)
    arrayPaises[0] = "Alemania"
    arrayPaises[1] = "Francia"
    arrayPaises[2] = "Italia"
    val arrayPaises2 = arrayPaises.copyOf(arrayPaises.size + 2)
    arrayPaises2[arrayPaises.size] = "España"
    arrayPaises2[arrayPaises.size+1] = "Grecia"
    println("ArrayPaises: ${arrayPaises.joinToString(", ")}")
    println("ArrayPaises2: ${arrayPaises2.joinToString(", ")}")


    val arrayEmpresa = arrayOfNulls<String>(3)
    arrayEmpresa[0] = "Microsoft"
    arrayEmpresa[1] = "Meta"
    arrayEmpresa[2] = "Apple"
    val arrayEmpresa2 = arrayPaises.copyOf(arrayEmpresa.size + 2)
    arrayEmpresa2[0] = "SAMSUNG"
    arrayEmpresa2[1] = "LENOVO"
    arrayEmpresa2[2] = "XIAOMI"
    arrayEmpresa2[arrayEmpresa.size] = "INTEL"
    arrayEmpresa2[arrayEmpresa.size+1] = "AMD"
    println("ArrayEmpresas: ${arrayEmpresa.joinToString(", ")}")
    println("ArrayEmpresas2: ${arrayEmpresa2.joinToString(", ")}")


    val arrayMultitipo = arrayOf(1,"Monitor",2,"Tablet")
    val arrayMultitipo2 = arrayMultitipo.copyOf(arrayMultitipo.size + 2)
    arrayMultitipo2[arrayMultitipo.size+1] = 3
    arrayMultitipo2[arrayMultitipo.size+1] = "Celular"
    println("ArrayMultitipo: ${arrayMultitipo.joinToString(", ")}")
    println("ArrayMultitipo2: ${arrayMultitipo2.joinToString(", ")}")


}