package com.example.metaletolkien

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import com.example.metaletolkien.databinding.ActivityResultadoBinding

class ResultadoActivity : AppCompatActivity() {

    private lateinit var binding: ActivityResultadoBinding
    val viewModel: MainViweModel by viewModels()

    var nome =""
    var resultado = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityResultadoBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        nome = intent.getStringExtra(MainActivity.NOME)?:""
        resultado = intent.getStringExtra(QuestoesActivity.RESULTADO)?:""

        binding.nomeResultado.text = nome
        binding.textoResultado.text = resultado


        setup()

    }

    private fun setup() {
        setupClickListener()
    }

    private fun setupClickListener() {
        // abrir ranking
        binding.btnVerLista.setOnClickListener(){
            val intent = Intent(this, ListaPontuacao::class.java)
            startActivity(intent)

        }

        // compartihar texto
        binding.tbnCompartilhar.setOnClickListener(){
            val sendIntent = Intent().apply {
                action = Intent.ACTION_SEND
                putExtra(Intent.EXTRA_TEXT, "O jogador ${nome} fez a seguinte pontuação \n" +
                        " Pontuação: ${resultado}")
                type = "text/plain"
            }
            // Verifica se o dispositivo é capaz de realizar a ação
            if (sendIntent.resolveActivity(packageManager) != null) {
                // inicia a intent implícita
                startActivity(sendIntent)
            }

        }
    }
}