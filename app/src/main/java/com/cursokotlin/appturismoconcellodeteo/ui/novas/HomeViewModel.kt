package com.cursokotlin.appturismoconcellodeteo.ui.novas

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class HomeViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Novas Fragment"
    }
    val text: LiveData<String> = _text
}