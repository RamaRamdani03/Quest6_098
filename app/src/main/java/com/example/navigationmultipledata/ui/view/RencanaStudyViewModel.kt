package com.example.navigationmultipledata.ui.view

import androidx.lifecycle.ViewModel
import com.example.navigationmultipledata.model.RencanaStudy
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

class RencanaStudyViewModel:ViewModel() {
    private val _krsState = MutableStateFlow(RencanaStudy())
    val krsStateUi: StateFlow<RencanaStudy> = _krsState.asStateFlow()
}