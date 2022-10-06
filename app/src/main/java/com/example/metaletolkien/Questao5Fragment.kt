package com.example.metaletolkien

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import androidx.navigation.findNavController
import com.example.metaletolkien.databinding.FragmentQuestao5Binding


class Questao5Fragment : Fragment() {
    
    private var _binding: FragmentQuestao5Binding? = null
    private val binding get() = _binding!!

    val viewModel: MainViweModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentQuestao5Binding.inflate(inflater, container, false)
        val view = binding.root

        binding.btnConfirmaRespostaQ5.setOnClickListener(){

            if(binding.radioGroupQ5.checkedRadioButtonId != -1){

                when(binding.radioGroupQ5.checkedRadioButtonId){
                    R.id.rb_q5_item_a -> {viewModel.somarValor(1)}
                    R.id.rb_q5_item_b -> {viewModel.somarContador(1)}
                    R.id.rb_q5_item_c -> {viewModel.somarContador(1)}
                }

                //navegar pro prox fragmento
                view.findNavController().navigate(R.id.action_questao5Fragment_to_questao6Fragment)

            }
        }

        return view
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}