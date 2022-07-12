package com.example.misrecetasproyecto

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class Login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val btnLogin = findViewById<Button>(R.id.btnLogin)
        val btnRegisterGoogle = findViewById<Button>(R.id.btnRegisterGoogle)
        val btnRegisterNow = findViewById<Button>(R.id.btnRegisterNow)

        btnLogin.setOnClickListener(){
            Toast.makeText(this@Login,"Inciando sesion...",Toast.LENGTH_SHORT).show()
        }

        btnRegisterGoogle.setOnClickListener(){
            Toast.makeText(this@Login,"Inciando sesion con Google...",Toast.LENGTH_SHORT).show()
        }

        btnRegisterNow.setOnClickListener(){
            Toast.makeText(this@Login,"Redirigiendo...",Toast.LENGTH_SHORT).show()
        }
    }
}