package com.celeste.myapplication

import java.util.Date

/**
 * Principio de sustitución de Segregación de interfaces
 * Una clase nunca deberia depender de metodos que no usa.
 * Desacoplando modulos
 *
 * Se Incumple Cuando:
 * - Si al implementar una interface que varios de los metodos no tienen sentido y se quedan vacios
 * */

/**
 * Se incumple el principio
 * */

/*
interface Producto{
    val name: String
    val stock: Int
    val numeroDiscos: Int
    val fechaPublicacion: Date
    val edadRecomendada: Int
}

class CD(
    override val name: String,
    override val stock: Int,
    override val numeroDiscos: Int,
    override val fechaPublicacion: Date
) : Producto{
    override val edadRecomendada: Int
        get() = TODO("Not yet implemented")

}
*/


/**
 * Solución Al principio
 * */

interface Producto{
    val name: String
    val stock: Int
    val numeroDiscos: Int
    val fechaPublicacion: Date
}

interface EdadRecomendada{
    val edadRecomendada: Int
}

class CD(
    override val name: String,
    override val stock: Int,
    override val numeroDiscos: Int,
    override val fechaPublicacion: Date,
) : Producto{}

class DVD(
) : Producto, EdadRecomendada{
    override val name: String
        get() = TODO("Not yet implemented")
    override val stock: Int
        get() = TODO("Not yet implemented")
    override val numeroDiscos: Int
        get() = TODO("Not yet implemented")
    override val fechaPublicacion: Date
        get() = TODO("Not yet implemented")
    override val edadRecomendada: Int
        get() = TODO("Not yet implemented")
}