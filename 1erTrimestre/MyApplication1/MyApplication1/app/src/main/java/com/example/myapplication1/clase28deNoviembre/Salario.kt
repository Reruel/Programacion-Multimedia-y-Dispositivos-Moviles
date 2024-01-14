package com.example.myapplication1.clase28deNoviembre

import kotlin.math.round

class Salario {
    var nombre:String = ""
    var ingresos:Int = 0

    constructor(nombre:String,ingresos:Int){
        this.nombre = nombre
        this.ingresos = ingresos
    }

    fun mostrarDatos(){
        println("Nombre: $nombre\nIngresos: $ingresos")
    }

    fun eresRico(){
        if(ingresos > 2000){
            println("Eres rico")
        }else{
            println("Eres pobre")
        }
    }

    fun complemento(){
        var complemento:Float = 0f
        if (ingresos>3000){
            complemento=ingresos*0.2f
        }else if(ingresos>2000){
            complemento=ingresos*0.1f
        }else{
            complemento=ingresos*0.05f
        }
        println("El complemento es %.2f".format(complemento))
        println("La suma es: %.2f".format(complemento+ingresos))

        var retencion = ((complemento+ingresos)*0.85)
        println("Su salario neto es: %.2f".format(retencion))
    }
}

fun main(){
    val salario1:Salario = Salario("Juani",3001)
    salario1.mostrarDatos()
    salario1.eresRico()
    salario1.complemento()
    println()
    val salario2:Salario = Salario("Nombre1",1200)
    salario2.mostrarDatos()
    salario2.eresRico()
    salario2.complemento()
}