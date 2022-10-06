package com.example.metaletolkien

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import com.example.metaletolkien.databinding.FragmentQuestao9Binding


class Questao9Fragment : Fragment() {
    private var _binding: FragmentQuestao9Binding? = null
    private val binding get() = _binding!!

    val viewModel: MainViweModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentQuestao9Binding.inflate(inflater, container, false)
        val view = binding.root

        binding.btnConfirmaRespostaQ9.setOnClickListener(){
            if(binding.radioGroupQ9.checkedRadioButtonId != -1){
                when(binding.radioGroupQ9.checkedRadioButtonId){
                    R.id.rb_q9_item_a -> {viewModel.somarContador(1)}
                    R.id.rb_q9_item_b -> {viewModel.somarContador(1)}
                    R.id.rb_q9_item_c -> {viewModel.somarContador(1)}
                    R.id.rb_q9_item_d -> {viewModel.somarContador(1)}
                    R.id.rb_q9_item_e -> {viewModel.somarValor(1)}
                }
            }
        }

        return view
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}