package com.example.firstproj.viewmodels

import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.unit.Dp
import androidx.lifecycle.ViewModel
import com.example.firstproj.data.models.ScreenDimensions

class ScreenDimensionsViewModel : ViewModel() {
    private val _screenDimensions = mutableStateOf(ScreenDimensions())

    val screenDimensions: ScreenDimensions
        get() = _screenDimensions.value

    fun setScreenDimensions(screenWidth: Dp, screenHeight: Dp) {
        _screenDimensions.value = ScreenDimensions(screenWidth, screenHeight)
    }
}