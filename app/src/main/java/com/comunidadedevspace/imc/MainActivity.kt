package com.comunidadedevspace.imc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.google.android.material.snackbar.Snackbar
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Recuperar os componentes EditText.
        // Criar uma Variavel e associar (=) ao componente de UI-EditText
        // Recuperar o botao da tela
        // Colocar a acao no Botao (setOnClickListener)
        // O setOnClickListener serve para dar o CLIQUE para o botão
        // Recuperar o texto digitado na View e colocar ela para ser ultilizada (Text)
        // O findViewById serve para instanciar as Views e para manipular-las. Se tem uma View de Botão esse comando faz com que o usuario possa clicar tendo resultado, e se tiver qualquer outra View esse comando faz com que ela funcione perfeitamente.

        val edtPeso = findViewById<TextInputEditText>(R.id.edit_peso)
        val edtAltura = findViewById<TextInputEditText>(R.id.edit_altura)
        val btnCalcular = findViewById<Button>(R.id.BtnCalcular)

// colocando o clique do botao
        btnCalcular.setOnClickListener {

            val pesoStr: String = edtPeso.text.toString()
            val alturaStr: String = edtAltura.text.toString()

            if (pesoStr == "" || alturaStr == "") {
                // Mostrar mensagem para o usuario

                Snackbar.make(
                    edtPeso,
                    "Preencha todos os campos",
                    Snackbar.LENGTH_LONG
                ).show()

            } else {
                val peso = pesoStr.toFloat()
                val altura = alturaStr.toFloat()

                val Imc = peso / (altura * altura)
                println("Seu Imc =" + Imc)
            }
        }
    }
}