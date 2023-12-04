package com.example.myapplication1.clase01deDiciembre

open class Animal(val nombre:String, val edad:Int) {
    fun hacerSonido(){
        println("El animal hizó un sonido")
    }
}
class Perro (nombre: String,edad: Int, val raza:String) : Animal(nombre,edad){
    fun ladrar(){
        println("Guau guau")
    }
}
fun main(){
    val miPerro = Perro("perro1", 2, "raza1")
    println("Nombre: ${miPerro.nombre}")
    println("Edad: ${miPerro.edad}")
    println("Raza: ${miPerro.raza}")
    miPerro.ladrar()
    miPerro.hacerSonido()

}