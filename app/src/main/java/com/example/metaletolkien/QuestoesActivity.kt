package com.example.metaletolkien

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import com.example.metaletolkien.databinding.ActivityQuestoesBinding

class QuestoesActivity : AppCompatActivity() {

    private lateinit var binding: ActivityQuestoesBinding
    val viewModel: MainViweModel by viewModels()
    var nome =""


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityQuestoesBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        nome = intent.getStringExtra(MainActivity.NOME)?:""
        setup()
    }

    private fun setup() {
        setupObservers()
    }

    private fun setupObservers() {
        viewModel.contador.observe(this) {
            if (it == 9) {
                concluirQuestionario()
            } else {
                binding.tvTitulo.text = "Questão"
            }
        }
        viewModel.numero.observe(this){
            if (it == 9) {
                concluirQuestionario()
            }

        }
    }

    fun concluirQuestionario(){
        var textoEnviado = "$nome seu resultado é : \n \n \n \n"
        if(viewModel.numero.value == 1 || viewModel.numero.value == 2 || viewModel.numero.value == 3 ){
            textoEnviado += "Você acertou ${viewModel.numero.value}, \n \n \n mas ainda não é \n suficiente 'If you're not into metal, you are not my friend' - ManOwaR"
        }else if(viewModel.numero.value == 4 || viewModel.numero.value == 5 || viewModel.numero.value ==6){
            textoEnviado += "Você acertou ${viewModel.numero.value}, \n \n \n Você é um guerreiro do verdadeiro metal \n 'Brothers of true metal proud and standing tall' - ManOwaR"
        }else if(viewModel.numero.value == 7 || viewModel.numero.value == 8){
            textoEnviado += "Você acertou ${viewModel.numero.value}, \n \n \n Você é true \n você escuta apenas o mais underground do metal"
        }else if(viewModel.numero.value == 9){
            textoEnviado += "Você acertou ${viewModel.numero.value} \n \n \n Você é um dos deus do metal \n Tem lugar ao lado de Ozzy,\n Rob halford, Steve harris e Dio "
        } else{
                textoEnviado += "Você errou todas POSER, \n Como o ManOwaR diria 'wimps and posers leave the hall' "
        }

        val intentResposta = Intent(this, ResultadoActivity::class.java)
        intentResposta.putExtra(MainActivity.NOME, nome)
        intentResposta.putExtra(RESULTADO, textoEnviado)
        startActivity(intentResposta)
    }

    companion object{
        val RESULTADO = "Resultado"
    }
}