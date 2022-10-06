package com.example.metaletolkien

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel


// criando viewmodel

class MainViweModel: ViewModel() {

    val TAG = "VM"

    //variavel a ser observada
    private val _numero: MutableLiveData<Int> by lazy{
        MutableLiveData<Int>()
    }
    val numero: LiveData<Int> = _numero

    fun setNumero(value: Int){
        _numero.postValue(value)
        setContador(value)
    }

    fun somarValor(valor: Int){

        var valorAtual = numero.value
        if (valorAtual != null) {
            setNumero(valorAtual + valor)
        }
        somarContador(valor)
    }

    private val _contador: MutableLiveData<Int> by lazy{
        MutableLiveData<Int>()
    }
    val contador: LiveData<Int> = _contador

    fun setContador(value: Int){
        _contador.postValue(value)
    }

    fun somarContador(valor: Int){

        var valorAtual = contador.value

        if (valorAtual != null) {
            setContador(valorAtual + valor)
        }
    }
}



