package com.example.calculadoraapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class PrimGrad : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_prim_grad)

        var bResolverPrimGrad = findViewById<Button>(R.id.bResolverPrimGrad)

        val bRegresarPrim = findViewById<Button>(R.id.bRegresarPrim)

        bResolverPrimGrad.setOnClickListener {

            var txtA1 = findViewById<EditText>(R.id.txtA1).getText().toString().toDouble()
            var txtB1 = findViewById<EditText>(R.id.txtB1).getText().toString().toDouble()
            var txtC1 = findViewById<EditText>(R.id.txtC1).getText().toString().toDouble()
            var txtA2 = findViewById<EditText>(R.id.txtA2).getText().toString().toDouble()
            var txtB2 = findViewById<EditText>(R.id.txtB2).getText().toString().toDouble()
            var txtC2 = findViewById<EditText>(R.id.txtC2).getText().toString().toDouble()


            var txtX = findViewById<TextView>(R.id.txtX)

            var txtY = findViewById<TextView>(R.id.txtY)

            var Op = (txtA1 * txtB2) - (txtA2 * txtB1)

            var OpX = (txtC1 * txtB2) - (txtC2 * txtB1)
            var X = OpX / Op

            var Opy = (txtA1 * txtC2) - (txtA2 * txtC1)
            var Y = Opy / Op

            X.toString()
            Y.toString()


            if ((X.toString().equals("NaN") || X.toString().equals("Infinity")) && (Y.toString()
                    .equals("NaN") || Y.toString().equals("Infinity"))
            ) {
                txtX.setText("NO TIENE SOLUCIÓN")
                txtY.setText("NO TIENE SOLUCIÓN")
            } else {
                txtX.setText(X.toString())
                txtY.setText(Y.toString())
            }

        }

        bRegresarPrim.setOnClickListener {

            finish()
        }

    }
}