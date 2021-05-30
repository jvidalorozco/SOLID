package com.celeste.myapplication

/**
 * Principio de inversion de dependencias
 * Las clases de alto nivel, no deberian depender de las clases menores
 * Se Incumple Cuando:
 * - La logica dependera de la implementación
 * - No se puede testear de forma aislada
 * */

/**
 * Se incumple el principio
 * */
class Compra

/*
class Canasta {
    fun buy(compra: Compra){
     val db = SqlDatabase()
     db.guardar(compra)
     val credito = TarjetaCredito()
     credito.pagar(compra)
    }
}

class SqlDatabase {
    fun guardar(compra: Compra){

    }
}

class TarjetaCredito{
    fun pagar(compra: Compra){

    }
}*/


/**
 * Solución Al principio
 * */


interface Persistencia {
    fun guardar(compra: Compra)
}

interface MetodoPago{
    fun pagar(compra: Compra)
}

class SqlDatabase: Persistencia{
    override fun guardar(compra: Compra) {

    }
}

class Servidor: Persistencia{
    override fun guardar(compra: Compra) {
    }

}

class TarjetaCredito : MetodoPago{
    override fun pagar(compra: Compra){

    }
}

class Paypal: MetodoPago{
    override fun pagar(compra: Compra) {

    }

}

class Canasta(
    private val persistencia: Persistencia,
    private val metodoPago: MetodoPago
) {
    fun buy(compra: Compra){
        persistencia.guardar(compra)
        metodoPago.pagar(compra)
    }
}

fun main(){
    val sb = Canasta(Servidor(), Paypal())
    val df = Canasta(SqlDatabase(), TarjetaCredito())
}