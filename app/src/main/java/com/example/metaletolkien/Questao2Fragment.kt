package com.example.metaletolkien

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import androidx.navigation.findNavController
import com.example.metaletolkien.databinding.FragmentQuestao2Binding


class Questao2Fragment : Fragment() {

    private var _binding: FragmentQuestao2Binding? = null
    private val binding get() = _binding!!

    val viewModel: MainViweModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentQuestao2Binding.inflate(inflater, container, false)
        val view = binding.root

        binding.btnConfirmaRespostaQ2.setOnClickListener(){

            if(binding.radioGroupQ2.checkedRadioButtonId != -1){
                viewModel.somarContador(1)
                when(binding.radioGroupQ2.checkedRadioButtonId){
                    R.id.rb_q2_item_a -> {viewModel.somarContador(1)}
                    R.id.rb_q2_item_b -> {viewModel.somarContador(1)}
                    R.id.rb_q2_item_c -> {viewModel.somarValor(1)}
                    R.id.rb_q2_item_d -> {viewModel.somarContador(1)}
                }

                //navegar pro prox fragmento
                view.findNavController().navigate(R.id.action_questao2Fragment_to_questao3Fragment)

            }
        }

        return view
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}