package com.example.misrecetasproyecto

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class Registrarse : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registrarse)

        val btnRegister = findViewById<Button>(R.id.btnRegister)
        val btnRegisterGoogle = findViewById<Button>(R.id.btnRegisterGoogle)
        val btnLoginNow = findViewById<Button>(R.id.btnLoginNow)

        btnRegister.setOnClickListener(){
            Toast.makeText(this@Registrarse,"Registrando...", Toast.LENGTH_SHORT).show()
        }

        btnRegisterGoogle.setOnClickListener(){
            Toast.makeText(this@Registrarse,"Registrandose con Google...", Toast.LENGTH_SHORT).show()
        }

        btnLoginNow.setOnClickListener(){
            Toast.makeText(this@Registrarse,"Redirigiendo...", Toast.LENGTH_SHORT).show()
        }
    }
}