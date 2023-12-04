package com.example.myapplication1.clase01deDiciembre

open class Vehiculo(val modelo:String,val tipo:String, val fabricante:String) {
    fun soyVehiculo(){
        println("Soy un vehículo")
    }
}
class Coche(modelo:String,tipo:String,fabricante:String,val color:String):Vehiculo(modelo,tipo,fabricante){
    fun soyCoche(){
        println("Soy un coche")
    }
}
fun main(){
    var coche1 = Coche("modelo1","tipo1","ferrari","Magenta")
    println("Modelo: ${coche1.modelo}")
    println("Tipo: ${coche1.tipo}")
    println("Fabricante: ${coche1.fabricante}")
    println("Color: ${coche1.color}")
    coche1.soyVehiculo()
    coche1.soyCoche()
}