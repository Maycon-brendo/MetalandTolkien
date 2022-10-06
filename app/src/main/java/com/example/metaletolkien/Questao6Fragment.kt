package com.example.metaletolkien

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import androidx.navigation.findNavController
import com.example.metaletolkien.databinding.FragmentQuestao6Binding


class Questao6Fragment : Fragment() {
    private var _binding: FragmentQuestao6Binding? = null
    private val binding get() = _binding!!

    val viewModel: MainViweModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentQuestao6Binding.inflate(inflater, container, false)
        val view = binding.root

        binding.btnConfirmaRespostaQ6.setOnClickListener(){
            if(binding.radioGroupQ6.checkedRadioButtonId != -1){
                when(binding.radioGroupQ6.checkedRadioButtonId){
                    R.id.rb_q6_item_a -> {viewModel.somarValor(1)}
                    R.id.rb_q6_item_b -> {viewModel.somarContador(1)}
                    R.id.rb_q6_item_c -> {viewModel.somarContador(1)}
                    R.id.rb_q6_item_d -> {viewModel.somarContador(1)}
                }

                //navegar pro prox fragmento
                view.findNavController().navigate(R.id.action_questao6Fragment_to_questao7Fragment)

            }
        }

        return view
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}