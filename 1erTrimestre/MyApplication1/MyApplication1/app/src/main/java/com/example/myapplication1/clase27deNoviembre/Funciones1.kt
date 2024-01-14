package com.example.myapplication1.clase27deNoviembre

import kotlin.random.Random

fun sumar(a: Int, b: Int):Int{
    var res = a + b
    return res
}

fun restar(a: Int, b: Int):Int{
    var res = a - b
    return res
}

fun multiplicar(a: Int, b: Int):Int{
    var res = a * b
    return res
}

fun dividir(a: Int, b: Int):Int{
    var res = a / b
    return res
}
fun fibonachi (a:Int){
    var num1 = 0
    var num2 = 1
    var siguiente = 0
    for(i in 0..a-2){
        if(num1 < 1){
            println(num1)
            num1++
            println(num1)
        }else{
            println(num2)
            siguiente = num1 + num2
            num1 = num2
            num2 = siguiente
        }
    }
}

fun main(){
    var salida = false
    var ppt = false
    var fib = false
    var resultado = 0
    while(!salida){
        println("Indicame una opción: \n1-Suma \n2-Resta\n3-Multiplicación\n4-División\n5-Piedra/" +
                "Papel/Tijera\n6-Fibonachi\n7-Salir")
        var opcion = readln().toInt()
        var num1 = 0
        var num2 = 0
        if(opcion <5){
            println("Indicame un numero")
            num1 = readLine()?.toIntOrNull() ?:0
            println("Indicame otro numero")
            num2 = readLine()?.toIntOrNull() ?:0

        }

        when(opcion){
            1 -> resultado = sumar(num1,num2)
            2 ->resultado = restar(num1,num2)
            3 -> resultado = multiplicar(num1,num2)
            4 -> resultado = dividir(num1,num2)
            5 -> ppt = true
            6 -> fib = true
            7 -> salida = true
        }
        if (ppt){
            println("Elige una opción: \n1-Piedra\n2-Papel\n3-Tijera")
            var eleccion = readln().toInt()
            var maquina = Random.nextInt(1,4)
            if(eleccion == maquina){
                println("Es un empate")
            }
            else if (eleccion == 1 && maquina == 3 || eleccion == 2 && maquina == 1
                || eleccion == 3 && maquina == 2){
                println("Ganaste el juego")
            }else{
                println("Perdiste el juego")
            }
            println ("Eleccion del sistema: $maquina")
        }

        if (fib){
            fibonachi(5)
        }
        if(opcion!=5){
            println("El resultado de la operación es: $resultado")
        }
    }





}