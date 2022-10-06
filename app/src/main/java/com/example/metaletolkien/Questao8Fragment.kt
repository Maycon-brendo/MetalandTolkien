package com.example.metaletolkien

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import androidx.navigation.findNavController
import com.example.metaletolkien.databinding.FragmentQuestao8Binding


class Questao8Fragment : Fragment() {
    private var _binding: FragmentQuestao8Binding? = null
    private val binding get() = _binding!!

    val viewModel: MainViweModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentQuestao8Binding.inflate(inflater, container, false)
        val view = binding.root

        binding.btnConfirmaRespostaQ8.setOnClickListener(){
            if(binding.radioGroupQ8.checkedRadioButtonId != -1){
                when(binding.radioGroupQ8.checkedRadioButtonId){
                    R.id.rb_q8_item_a -> {viewModel.somarContador(1)}
                    R.id.rb_q8_item_b -> {viewModel.somarValor(1)}
                    R.id.rb_q8_item_c -> {viewModel.somarContador(1)}
                    R.id.rb_q8_item_d -> {viewModel.somarContador(1)}
                }

                //navegar pro prox fragmento
                view.findNavController().navigate(R.id.action_questao8Fragment_to_questao9Fragment)

            }
        }

        return view
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}