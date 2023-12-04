package com.example.myapplication1.clase01deDiciembre

class Cliente2(val nombre:String,var monto:Float) {
    fun depositar(monto: Float){
        this.monto += monto
    }
    fun extraer(monto: Float){
        this.monto -= monto
    }

    fun imprimir() {
        println("$nombre tiene depositado la suma de $monto")
    }
}
