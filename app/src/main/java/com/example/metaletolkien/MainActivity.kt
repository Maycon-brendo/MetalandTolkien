package com.example.metaletolkien

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.metaletolkien.databinding.ActivityMainBinding

// primeira tela para o nome


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.btnAvancaTela2.setOnClickListener{
            if(!binding.inputNome.text.isNullOrBlank()) {
                val nome = binding.inputNome.text.toString()
                val intent = Intent(this, QuestoesActivity::class.java)
                intent.putExtra(NOME, nome)
                startActivity(intent)
            }
        }
    }

    companion object{
        val NOME = "NOME"
    }
}