package com.celeste.myapplication


/**
 * Principio Abierto/Cerrado
 * Un modulo debe estar abierto para su extensión pero cerrado para modificación
 *
 * Se Incumple Cuando:
 * - Identificar las clases que estamos modificando con frecuencia
 * */


/**
 * Se incumple el principio
 * */
enum class VehiculoTipo {
    CAR, MOTORBIKE
}

class VehiculoBad(val tipo: VehiculoTipo)


fun pintarBad(vehiculoP: VehiculoBad){
    when(vehiculoP.tipo){
        VehiculoTipo.CAR -> pintarCarro(vehiculoP)
        VehiculoTipo.MOTORBIKE -> pintarMoto(vehiculoP)
    }
}

fun pintarCarro(vehiculoP: VehiculoBad){}

fun pintarMoto(vehiculoP: VehiculoBad) {}


/**
 * Solución Al principio
 * */
class VehiculoGood : IVehiculoP{
    override fun pintar() {
        pintarGood(this)
    }
}
class Moto : IVehiculoP{
    override fun pintar() {
        pintarGood(this)
    }

}

fun pintarGood(vehiculo: IVehiculoP){
    vehiculo.pintar()
}

interface IVehiculoP{
    fun pintar()
}
