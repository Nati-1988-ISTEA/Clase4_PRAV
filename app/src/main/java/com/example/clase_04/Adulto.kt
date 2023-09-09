package com.example.clase_04

class Adulto (
    private val nombre : String,
    private val edad : Int,
    private val profesion : String,
    private val estadoCivil : EstadoCivil,

    ) : Persona(nombre, edad), AccionesAdulto, Acciones
{

    override fun obtenerNombre() : String
    {
        return  "Mi nombre es... ${this.nombre}"
    }

    override fun obtenerEdad() : String
    {
        return  "Mi edad es... ${this.edad}"

    }
    fun obtenerProfesion() : String
    {
        return  "Mi profesion es... ${this.profesion}"

    }
    enum class EstadoCivil{
        CASADO,
        SOLTERO,
        DIVORCIADO,
        CONVIVIENTE,
        VIUDO


    }

    override fun trabajar(): String {
        return  "Estoy Laburando"
    }

    override fun estudiar(): String {
        return  "Estoy Estudiando"
    }

    override fun comer(): String {
        return  "Estoy Comiendo"
    }

}