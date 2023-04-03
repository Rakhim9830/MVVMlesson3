package com.example.mvvmlesson3.ViewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class CounterViewModel:ViewModel() {
    private var count = 0
    val counter = MutableLiveData<Int>()
    private var operationList = arrayListOf<String>()
    val operation = MutableLiveData<List<String>>()

    fun plusCount() {
        count++
       counter.value = count
       operationList.add("+")
        operation.value = operationList
    }

    fun minusCount() {
        count--
        counter.value = count
        operationList.add("-")
        operation.value = operationList

    }

}




