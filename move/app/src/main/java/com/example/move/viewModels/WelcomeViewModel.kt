package com.example.move.viewModels

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel

class WelcomeViewModel: ViewModel() {
    private val _message = mutableStateOf("Hello World!")
    val message: MutableState<String> = _message;
}