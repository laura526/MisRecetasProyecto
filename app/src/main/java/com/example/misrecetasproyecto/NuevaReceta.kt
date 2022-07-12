package com.example.misrecetasproyecto

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class NuevaReceta : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_nueva_receta)
        //Creación de Botones para ir a otras activities
        val btnInicio: Button = findViewById(R.id.btnInicio)
        val btnFavoritas: Button = findViewById(R.id.btnFavoritas)
        val btnMisRecetas: Button = findViewById(R.id.btnMisRecetas)
        //Creación de Listeners de botones
        btnInicio.setOnClickListener{
            val intent: Intent = Intent(this,MainActivity:: class.java)
            startActivity(intent)
        }
        btnFavoritas.setOnClickListener{
            val intent: Intent = Intent(this,Favoritas:: class.java)
            startActivity(intent)
        }
        btnMisRecetas.setOnClickListener{
            val intent: Intent = Intent(this,MisRecetas:: class.java)
            startActivity(intent)
        }
    }
}