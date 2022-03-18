package com.example.calculadoraapp

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

        var a: Double
        var b: Double
        var c: Double
        var x1: Double
        var x2: Double
        val bRegresarSeg = findViewById<Button>(R.id.bRegresarSeg)


        var txtA = findViewById<EditText>(R.id.txtA)
        var txtB = findViewById<EditText>(R.id.txtB)
        var txtC = findViewById<EditText>(R.id.txtC)
        var bResolver = findViewById<Button>(R.id.bResolver)


        var txtTitulo = findViewById<TextView>(R.id.txtTitulo)

        var txtResultado = findViewById<EditText>(R.id.txtResultado)

        bResolver.setOnClickListener {
            a = txtA.text.toString().toDouble()
            b = txtB.text.toString().toDouble()
            c = txtC.text.toString().toDouble()
            var resul1 = ((b * b) - 4 * (a * c))
            if (resul1 < 0) {
                Toast.makeText(this, "No se puede porque es 0", Toast.LENGTH_SHORT).show()
            } else if (resul1 === 0.0) {
                x1 = (-b) / (2 * a)
                x2 = x1
            } else if (resul1 > 0.0) {
                x1 = (-b + Math.sqrt(resul1)) / (2 * a)
                x2 = (-b - Math.sqrt(resul1)) / (2 * a)
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