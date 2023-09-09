package com.example.clase_04

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.Toast
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private lateinit var  tvNombre : TextView
    private lateinit var  tvEdad : TextView
    private lateinit var  tvEstudio : TextView
    private lateinit var  tvAccion : TextView
    private lateinit var button : Button
    private lateinit var etMainName : EditText

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tvNombre = findViewById(R.id.textViewNombre)
        tvEdad = findViewById(R.id.textViewEdad)
        tvEstudio = findViewById(R.id.textViewEstudio)
        tvAccion = findViewById(R.id.TextViewAccion)
        button = findViewById(R.id.button)
        etMainName = findViewById(R.id.editTextTextName)



        //Toast.makeText(this,adultoUno.obtenerEdad(),Toast.LENGTH_LONG).show()
        //Toast.makeText(this,adultoUno.obtenerNombre(),Toast.LENGTH_LONG).show()

        button.setOnClickListener{
            val nombre = etMainName.text.toString()
            checkNAmeIsNotEmpty(nombre)


        }

    }

    private fun checkNAmeIsNotEmpty(nombre: String) {
        if(nombre.isEmpty()){
            Toast.makeText(this,"Debe agregar un normbre",Toast.LENGTH_LONG).show()
        }
        else{
            val adultoUno = Adulto(nombre=nombre, edad = 1028,profesion = "Padrino Magico", estadoCivil = Adulto.EstadoCivil.CASADO)
            tvNombre.text = adultoUno.obtenerNombre()
            tvEdad.text = adultoUno.obtenerEdad()
            tvEstudio.text = adultoUno.estudiar()
            tvAccion.text = adultoUno.comer()
        }

    }
}
// private es para evitar acceso vs internal es dentro del paquete => inner de C# class
//Si lo hace el objeto => interfaz de acciones
//Si lo hace el programa => método dentro de la interfaz de clase
//Nombre de las clases con mayúscula!