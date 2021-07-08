package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btCalcular = calcular
        val resultado = resultado

        btCalcular.setOnClickListener {
            val nota1 = Integer.parseInt(nota1.text.toString())
            val nota2 = Integer.parseInt(nota2.text.toString())
            val media = (nota1 +nota2)/2

            if (media >=6){
                resultado.setText("Você foi aprovado :D" + "\n" + "Nota final:"+ media)
            }
            else {
                resultado.setText("Você foi reprovado :c" + "\n" + "Nota final:" + media)
            }

        }
    }
}