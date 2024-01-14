package com.example.myapplication1.clase01deDiciembre

class PersonaDelMundo(val nombre:String, val apellidos:String, val edad:Int) {
    constructor(nombre: String,apellidos: String) : this(nombre,apellidos,0)
    fun mostrarInfo(){
        println("Nombre: $nombre")
        println("Apellidos: $apellidos")
        println("Edad: $edad")
    }
}
fun main(){
    val persona = PersonaDelMundo("Juani","Quintero",19)
    val p = PersonaDelMundo("nombre1","nombre2")
    persona.mostrarInfo()
    println()
    p.mostrarInfo()
}