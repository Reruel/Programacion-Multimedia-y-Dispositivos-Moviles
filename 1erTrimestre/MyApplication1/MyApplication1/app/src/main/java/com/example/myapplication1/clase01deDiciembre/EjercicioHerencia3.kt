package com.example.myapplication1.clase01deDiciembre


open class Cliente3(val nombre: String, val correo: String) {
    open fun realizarCompra() {
        println("$nombre realiza una compra genérica.")
    }
}

class ClientePremium(nombre: String, correo: String, val nivel: Int) : Cliente3(nombre, correo) {
    override fun realizarCompra() {
        println("$nombre realiza una compra como cliente premium (Nivel $nivel).")
    }

    fun accesoVIP() {
        println("$nombre tiene acceso VIP a eventos exclusivos.")
    }
}

fun main() {

    val clienteRegular = Cliente3("Maria", "maria@example.com")
    val clienteVip = ClientePremium("Juan", "juan@example.com", 3)

// Acceder a las propiedades y métodos de la clase base y las clases derivadas
    clienteRegular.realizarCompra()
    clienteVip.realizarCompra()
    clienteVip.accesoVIP()
}