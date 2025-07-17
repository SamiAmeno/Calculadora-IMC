package com.comunidadedevspace.imc

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

//Criar chaves em variaveis é essencial para não se confundir

const val Chave_Result = "ResultActivity.Chave.IMC"


class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_result)

        val resultado = intent.getFloatExtra(Chave_Result, 0f)

        val TvResult = findViewById<TextView>(R.id.tv_result)
        val TvClassificacao = findViewById<TextView>(R.id.tv_classificacao)
        TvResult.text = resultado.toString()

        val classificacao: String =
            if (resultado <= 18.5) {
                "Magreza"
            } else if (resultado >= 18.6 && resultado <= 25) {
                "Normal"
            } else if (resultado >= 26 && resultado <= 30) {
                "Sobrepeso"
            } else if (resultado >= 31 && resultado <= 40) {
                "Obesidade"
            } else {
                "Obesidade Grave"
            }
            TvClassificacao.text = classificacao

    }
}
