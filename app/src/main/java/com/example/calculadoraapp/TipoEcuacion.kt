package com.example.calculadoraapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class TipoEcuacion : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tipo_ecuacion)

        val bPrimGrad = findViewById<Button>(R.id.bPrimGrad)
        val bSegGrad = findViewById<Button>(R.id.bSegGrad)

        bPrimGrad.setOnClickListener {
            var intent = Intent(this, PrimGrad::class.java)
            startActivity(intent)
        }

        bSegGrad.setOnClickListener {
            var intent = Intent(this, SegGrad::class.java)
            startActivity(intent)
        }

    }
}