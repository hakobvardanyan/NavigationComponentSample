package com.hakvardanyan.navigationsample.home

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.asSharedFlow
import kotlinx.coroutines.launch

class HomeGraphViewModel : ViewModel() {

    private val _testValue = MutableSharedFlow<String>()
    val testValue = _testValue.asSharedFlow()

    fun submitValue(testValue: String) {
        viewModelScope.launch {
            _testValue.emit(testValue)
        }
    }
}
