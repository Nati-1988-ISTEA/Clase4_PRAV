package com.example.clase_04

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val adultoUno = Adulto(nombre="Cosme Fulanito", edad = 1040,profesion = "Padrino Mágico", estadoCivil = Adulto.EstadoCivil.CASADO)
        Toast.makeText(this,adultoUno.obtenerEdad(),Toast.LENGTH_LONG).show()
        Toast.makeText(this,adultoUno.obtenerNombre(),Toast.LENGTH_LONG).show()
    }
}
// private es para evitar acceso vs internal es dentro del paquete => inner de C# class
//Si lo hace el objeto => interfaz de acciones
//Si lo hace el programa => método dentro de la interfaz de clase
//Nombre de las clases con mayúscula!