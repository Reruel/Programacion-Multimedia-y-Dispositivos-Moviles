package com.example.myapplication1.clase28deNoviembre

class Notas {
    var nombre:String = ""
    var asignatura:String=""
    var calificacion:Float=0f

    constructor(nombre:String,asignatura:String,calificacion:Float){
        this.nombre = nombre
        this.asignatura = asignatura
        this.calificacion = calificacion
    }
    fun mostrarDatos(){
        println("Nombre: $nombre\nAsignatura: $asignatura\nCalificación: $calificacion")
    }
    fun nota(){
        var nota = ""
        if (calificacion > 9){
            nota = "sobresaliente"
        }else if(calificacion > 7){
            nota = "notable"
        }else if(calificacion >= 5.5){
            nota = "bien"
        }else if(calificacion >= 4.5){
            nota = "aprobado"
        }else{
            nota = "suspenso"
        }
        println("La nota es: $nota")
    }
}
fun main(){
    var alumno:Notas = Notas("Juani", "Programación multimedia", 10f)
    alumno.mostrarDatos()
    alumno.nota()
    println()
    var alumno2:Notas= Notas("Alumno1", "SGE", 5.4f)
    alumno2.mostrarDatos()
    alumno2.nota()
}