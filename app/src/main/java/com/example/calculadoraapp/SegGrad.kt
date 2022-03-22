package com.example.calculadoraapp

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class SegGrad : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_seg_grad)

        val bRegresarSeg = findViewById<Button>(R.id.bRegresarSeg)
        var valorA: Double
        var valorB: Double
        var valorC: Double
        var x1: Double
        var x2: Double
        var txtA = findViewById<EditText>(R.id.txtA)
        var txtB = findViewById<EditText>(R.id.txtB)
        var txtC = findViewById<EditText>(R.id.txtC)
        var bResolver = findViewById<Button>(R.id.bResolver)

        var txtResultado = findViewById<EditText>(R.id.txtResultado)

        bResolver.setOnClickListener {
            valorA = txtA.text.toString().toDouble()
            valorB = txtB.text.toString().toDouble()
            valorC = txtC.text.toString().toDouble()
            var resul1 = ((valorB * valorB) - 4 * ( valorA* valorC))
            if (resul1 < 0) {
                txtResultado.setText("No se puede realizar porque los valores dan como resultado un numero negativo")
            } else if (resul1 === 0.0) {

                x1 = (-valorB) / (2 * valorA)
                x2 = x1
                var rounded=String.format("%.2f",x1)
                var rounded1=String.format("%.2f",x2)
                txtResultado.setText("x1=$rounded \n x2=$rounded1")

            } else if (resul1 > 0.0) {
                x1 = (-valorB + Math.sqrt(resul1)) / (2 * valorA)
                x2 = (-valorB - Math.sqrt(resul1)) / (2 * valorA)
                var rounded=String.format("%.2f",x1)
                var rounded1=String.format("%.2f",x2)
                txtResultado.setText("x1=$rounded \n x2=$rounded1")
            }
        }

        bRegresarSeg.setOnClickListener {
            finish()
        }
    }
}