package com.celeste.myapplication


/**
 * Principio de responsabilidad Unica
 * Un modulo tiene una razón para cambiar
 * Solo debe tener una sola funcion o cosa
 *
 * Se Incumple Cuando:
 * - En una misma clase estan involucradas dos capas de la arquitectura
 * - Numero de metodos publicos
 * - Por el numero de imports
 * - Costo al hacer Test
 * - Cada Vez Tienes que modificar una clase.
 * */


/**
 * Se incumple el principio
 * */
class VehiculoMalo(
    val numeroRuedas: Int,
    val velocidadMaxima: Int
){
    fun print(){
        println("numeroRuedas=$numeroRuedas, velocidadMaxima=$velocidadMaxima")
    }
}

/**
 * Se incumple el principio
 * */
class Vehiculo(
    val numeroRuedas: Int,
    val velocidadMaxima: Int
){
    fun print(){
        println("numeroRuedas=$numeroRuedas, velocidadMaxima=$velocidadMaxima")
    }
}

/**
 * Solución Al principio
 * */
class VehiculoBueno {
    fun printer(vehiculo: Vehiculo){
        with(vehiculo) {
            println("numeroRuedas=$numeroRuedas, velocidadMaxima=$velocidadMaxima")
        }
    }
}