package com.example.metaletolkien

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import androidx.navigation.findNavController
import com.example.metaletolkien.databinding.FragmentQuestao3Binding


class Questao3Fragment : Fragment() {


    private var _binding: FragmentQuestao3Binding? = null
    private val binding get() = _binding!!

    val viewModel: MainViweModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentQuestao3Binding.inflate(inflater, container, false)
        val view = binding.root

        binding.btnConfirmaRespostaQ3.setOnClickListener(){
            if(binding.radioGroupQ3.checkedRadioButtonId != -1){
                when(binding.radioGroupQ3.checkedRadioButtonId){
                    R.id.rb_q3_item_a -> {viewModel.somarContador(1)}
                    R.id.rb_q3_item_b -> {viewModel.somarValor(1)}
                    R.id.rb_q3_item_c -> {viewModel.somarContador(1)}
                    R.id.rb_q3_item_d -> {viewModel.somarContador(1)}
                }

                //navegar pro prox fragmento
                view.findNavController().navigate(R.id.action_questao3Fragment_to_questao4Fragment)

            }
        }

        return view
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}