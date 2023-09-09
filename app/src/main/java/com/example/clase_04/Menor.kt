package com.example.clase_04

class Menor (
    private val nombre : String,
    private val edad : Int,
    private val colegio : String,
    private val actividad : Actividad,

    ) : Persona(nombre, edad), AccionesMenor, Acciones
{
    override fun obtenerNombre() : String
    {
        return  "Mi nombre es... ${this.nombre}"
    }

    override fun obtenerEdad() : String
    {
        return  "Mi edad es... reservada"

    }
    fun obtenerColegio() : String
    {
        return  "Mi colegio es... ${this.colegio}"

    }
    enum class Actividad{
        FUTBOL,
        PINTURA,
        DANZA,
        CANTO,
        MUSICA


    }

    override fun jugar(): String {
        return  "Estoy jugando"
    }

    override fun estudiar(): String {
        return  "Estoy Estudiando"
    }

    override fun comer(): String {
        return  "Estoy Comiendo"
    }
}