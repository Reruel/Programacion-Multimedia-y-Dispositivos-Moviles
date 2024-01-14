package com.example.myapplication1.clase28deNoviembre

class Persona{
    var nombre:String = ""
    var edad:Int = 0
    var apellidos:String=""
    var provincia:String=""
    var direccion:String=""
    var ciudad:String=""
    var codPostal:Int=0

    fun inicializar(nombre:String,apellidos:String,edad:Int,ciudad:String,provincia:String,
                    direccion:String,codPostal:Int){
        this.nombre = nombre
        this.apellidos = apellidos
        this.edad = edad
        this.ciudad = ciudad
        this.direccion = direccion
        this.provincia = provincia
        this.codPostal = codPostal
    }
    fun imprimir(){
        println("Nombre completo: $nombre $apellidos " +
                "\nEdad: $edad" +
                "\nCiudad: $ciudad" +
                "\nProvincia: $edad" +
                "\nDireccion: $direccion" +
                "\nCódigo Postal: $codPostal")
    }
    fun esMayorDeEdad(){
        if(this.edad > 18){
            println("$nombre $apellidos es mayor de edad")
        }else{
            println("$nombre $apellidos es menor de edad")
        }
    }
}
fun main(){
    val persona1:Persona
    persona1 = Persona()
    persona1.inicializar("Juani","Quintero", 19, "Benalmádena","Malaga",
        "direc1",29630)
    persona1.imprimir()
    persona1.esMayorDeEdad()
    println()
    val persona2:Persona
    persona2 = Persona()
    persona2.inicializar("Nombre1", "apellido1", 15,"ciudad1","provincia1",
    "direccion1",28972)
    persona2.imprimir()
    persona2.esMayorDeEdad()
}