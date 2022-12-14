package com.example.homework2

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

open class DataModel: ViewModel(){
    val idclick :MutableLiveData<String> by lazy{
        MutableLiveData<String>()
    }
}