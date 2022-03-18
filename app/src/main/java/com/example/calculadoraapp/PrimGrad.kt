package com.example.calculadoraapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class PrimGrad : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_prim_grad)

        val bRegresarPrim = findViewById<Button>(R.id.bRegresarPrim)

        bRegresarPrim.setOnClickListener {
            finish()
        }

    }
}