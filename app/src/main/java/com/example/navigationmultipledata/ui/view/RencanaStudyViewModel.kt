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

    fun setMatakuliah(mkPilihan: String){
        _krsState.update { stateMk -> stateMk.copy(matakuliah = mkPilihan) }
    }

    fun setKelas(KelasPilihan:String){
        _krsState.update { stateKelas -> stateKelas.copy(kelas = KelasPilihan) }
    }

    fun saveDataKRS(ls: MutableList<String>){
        _krsState.update { status -> status.copy(
            matakuliah = ls[0],
            kelas = ls[1]
        ) }
    }
}