package com.celeste.myapplication

import java.lang.Exception
import kotlin.concurrent.thread


/**
 * Principio de sustitución de Liskov
 *
 *
 * Se Incumple Cuando:
 * - Un metodo no hace nada o no tiene sentido
 * - Uno de los metodos queda vacio
 * - Si los test que se hacen no valen para la hija.
 * */


/**
 * Se incumple el principio
 * */
/*open class Animal{
    open fun andar(){}
    open fun saltar(){}
}
class Elefante: Animal() {
    override fun saltar() {
        throw Exception("Los Elefantes no saltan")
    }
}*/

/**
 * Solución Al principio
 * */
open class Animal{
    open fun andar(){}
}

open class AnimalPuedeSaltar: Animal(){
    open fun saltar(){}
}

class Elefante: AnimalPuedeSaltar() {
    override fun saltar(){}
}


fun saltar(a: AnimalPuedeSaltar){
    a.andar()
    a.saltar()
    a.andar()
}
