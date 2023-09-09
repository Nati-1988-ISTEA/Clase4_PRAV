package com.example.clase_04

abstract class Persona
(
    private val nombre : String,
    private val edad : Int,

)
{
    abstract fun obtenerNombre() : String
    abstract fun obtenerEdad() : String

}