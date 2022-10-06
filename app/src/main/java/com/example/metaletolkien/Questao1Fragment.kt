package com.example.metaletolkien


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import androidx.navigation.findNavController
import com.example.metaletolkien.databinding.FragmentQuestao1Binding


/**
 * primeira questão
 */
class Questao1Fragment : Fragment() {

    private var _binding: FragmentQuestao1Binding? = null
    private val binding get() = _binding!!

    val viewModel: MainViweModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentQuestao1Binding.inflate(inflater, container, false)
        val view = binding.root

        binding.btnConfirmaRespostaQ1.setOnClickListener(){
            if(binding.radioGroupQ1.checkedRadioButtonId != -1){
                when(binding.radioGroupQ1.checkedRadioButtonId){
                    R.id.rb_q1_item_a -> {viewModel.setNumero(1)}
                    R.id.rb_q1_item_b -> {viewModel.setContador(1)}
                    R.id.rb_q1_item_c -> {viewModel.setContador(1)}
                    R.id.rb_q1_item_d -> {viewModel.setContador(1)}
                }

                //navegar pro prox fragmento
                view.findNavController().navigate(R.id.action_questao1Fragment_to_questao2Fragment2)

            }
        }

        return view
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}