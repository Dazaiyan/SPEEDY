package com.example.speedy

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pantalla_principal)

        val btn: Button = findViewById(R.id.button)
        btn.setOnClickListener{

            val intent: Intent = Intent(this, PantallaPrincipal:: class.java)
            startActivity(intent)
        }

        val btn2: Button = findViewById(R.id.button2)
        btn2.setOnClickListener{
            val intent: Intent = Intent(this, PantallaSecundaria:: class.java)
            startActivity(intent)
        }
    }
}
