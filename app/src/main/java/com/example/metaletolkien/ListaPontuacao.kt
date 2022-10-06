package com.example.metaletolkien

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.metaletolkien.databinding.ActivityListaPontuacaoBinding
import com.example.metaletolkien.models.JogadorPonto
import com.example.metaletolkien.models.JogadorPontoAdapter

class ListaPontuacao : AppCompatActivity() {

    private lateinit var binding: ActivityListaPontuacaoBinding

    val ListaJogadoresPontos: MutableList<JogadorPonto> by lazy{
        mutableListOf<JogadorPonto>()
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityListaPontuacaoBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        setup()
    }

    private fun setup() {
        setupRecycleView()
    }

    private fun setupRecycleView() {
        setupInitialList()

        val adapter = JogadorPontoAdapter()
        binding.rvJogadoresPontuacao.adapter= adapter

        binding.rvJogadoresPontuacao.layoutManager = LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false)
        adapter.submitList(ListaJogadoresPontos)
    }

    private fun setupInitialList() {
        ListaJogadoresPontos.add(JogadorPonto("joao", 6))
        ListaJogadoresPontos.add(JogadorPonto("mateus", 10))
        ListaJogadoresPontos.add(JogadorPonto("Marcos", 8))
        ListaJogadoresPontos.add(JogadorPonto("jose", 10))
        ListaJogadoresPontos.add(JogadorPonto("joao", 6))
        ListaJogadoresPontos.add(JogadorPonto("mateus", 10))
        ListaJogadoresPontos.add(JogadorPonto("Marcos", 8))
        ListaJogadoresPontos.add(JogadorPonto("jose", 10))
        ListaJogadoresPontos.add(JogadorPonto("joao", 6))
        ListaJogadoresPontos.add(JogadorPonto("mateus", 10))
        ListaJogadoresPontos.add(JogadorPonto("Marcos", 8))
        ListaJogadoresPontos.add(JogadorPonto("jose", 10))
        ListaJogadoresPontos.add(JogadorPonto("joao", 6))
        ListaJogadoresPontos.add(JogadorPonto("mateus", 10))
        ListaJogadoresPontos.add(JogadorPonto("Marcos", 8))
        ListaJogadoresPontos.add(JogadorPonto("jose", 10))
        ListaJogadoresPontos.add(JogadorPonto("joao", 6))
        ListaJogadoresPontos.add(JogadorPonto("mateus", 10))
        ListaJogadoresPontos.add(JogadorPonto("Marcos", 8))
        ListaJogadoresPontos.add(JogadorPonto("jose", 10))
    }
}