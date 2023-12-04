package com.example.myapplication1.clase28deNoviembre

class Cliente {
    var nombre:String =""
    var apellidos:String = ""
    var tipo:String = ""
    var ingresos:Double = 0.0

    constructor(nombre:String,apellidos:String, tipo:String,ingresos:Double ){
        this.nombre = nombre
        this.apellidos = apellidos
        this.tipo = tipo
        this.ingresos = ingresos
    }
    fun imprimir(){
        println("Nombre: $nombre"  +
                "\nApellidos: $apellidos" +
                "\nTipo: $tipo" +
                "\nIngresos: $ingresos")
    }
    fun tipoF(){
        if(tipo.lowercase().equals("Empresa")){
            println("Lo atiende la oficina central")
        }else if(tipo.lowercase().equals("particular")){
            println("Lo atiende la oficina local")
        }
    }
}
fun main(){
    var cliente:Cliente = Cliente("Juani","Quintero","Empresa",3000.0)
    cliente.imprimir()
    cliente.tipoF()
}