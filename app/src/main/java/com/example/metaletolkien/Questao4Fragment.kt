package com.example.metaletolkien

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import androidx.navigation.findNavController
import com.example.metaletolkien.databinding.FragmentQuestao4Binding


class Questao4Fragment : Fragment() {


    private var _binding: FragmentQuestao4Binding? = null
    private val binding get() = _binding!!

    val viewModel: MainViweModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentQuestao4Binding.inflate(inflater, container, false)
        val view = binding.root

        binding.btnConfirmaRespostaQ4.setOnClickListener(){

            if(binding.radioGroupQ4.checkedRadioButtonId != -1){

                when(binding.radioGroupQ4.checkedRadioButtonId){
                    R.id.rb_q4_item_a -> {viewModel.somarContador(1)}
                    R.id.rb_q4_item_b -> {viewModel.somarContador(1)}
                    R.id.rb_q4_item_c -> {viewModel.somarValor(1)}
                }

                //navegar pro prox fragmento
                view.findNavController().navigate(R.id.action_questao4Fragment_to_questao5Fragment)

            }
        }

        return view
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}