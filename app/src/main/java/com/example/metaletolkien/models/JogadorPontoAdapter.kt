package com.example.metaletolkien.models

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.metaletolkien.databinding.JogadoresPontosItemListBinding

class JogadorPontoAdapter : ListAdapter<JogadorPonto, JogadorPontoAdapter.ViewHolder>(JogadorPontoDiffCallBack()) {

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ViewHolder {
        return ViewHolder.from(parent)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = getItem(position)
        holder.bind(item)
    }

    class ViewHolder private constructor(
        val binding: JogadoresPontosItemListBinding
    ) : RecyclerView.ViewHolder(binding.root) {
        fun bind(item: JogadorPonto) {
            binding.tvNomeJogador.text = item.nome
            binding.tvPontos.text = item.pontos.toString()
        }
        companion object {
            fun from(parent: ViewGroup): ViewHolder {
                val layoutInflater = LayoutInflater.from(parent.context)
                val binding = JogadoresPontosItemListBinding.inflate(
                    layoutInflater, parent, false)
                return ViewHolder(binding)
            }
        }
    }
}

class JogadorPontoDiffCallBack: DiffUtil.ItemCallback<JogadorPonto>() {
    override fun areItemsTheSame(oldItem: JogadorPonto, newItem: JogadorPonto): Boolean {
        return oldItem.nome == newItem.nome
    }

    override fun areContentsTheSame(oldItem: JogadorPonto, newItem: JogadorPonto): Boolean {
         return oldItem == newItem
    }
}