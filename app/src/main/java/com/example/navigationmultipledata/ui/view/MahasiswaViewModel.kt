package com.example.navigationmultipledata.ui.view

import androidx.lifecycle.ViewModel
import com.example.navigationmultipledata.model.Mahasiswa
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

class MahasiswaViewModel: ViewModel() {
    private val _mahasiswaStateUI =
        MutableStateFlow(Mahasiswa())

    val mahasiswaUiState:
            StateFlow<Mahasiswa> =
        _mahasiswaStateUI.asStateFlow()
}