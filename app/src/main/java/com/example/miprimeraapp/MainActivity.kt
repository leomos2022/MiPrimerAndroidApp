package com.example.miprimeraapp  // Asegúrate de que coincida con el nombre de tu paquete

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textoMensaje = findViewById<TextView>(R.id.textoMensaje)
        val botonCambiar = findViewById<Button>(R.id.botonCambiar)

        botonCambiar.setOnClickListener {
            textoMensaje.text = "¡Botón presionado!"
        }
    }
}
