package com.example.navigationmultipledata.navigation

import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.navigationmultipledata.ui.screen.MahasiswaFormView
import com.example.navigationmultipledata.ui.screen.RencanaStudyView
import com.example.navigationmultipledata.ui.screen.SplashView
import com.example.navigationmultipledata.ui.screen.TampilView
import com.example.navigationmultipledata.ui.view.MahasiswaViewModel
import com.example.navigationmultipledata.ui.view.RencanaStudyViewModel

enum class Halaman{
    Splash,
    Mahasiswa,
    Matakuliah,
    Tampil
}

@Composable
fun MahasiswaApp(
    modifier: Modifier = Modifier,
    MahasiswaViewModel: MahasiswaViewModel =  viewModel(),
    RencanaStudyViewModel: RencanaStudyViewModel = viewModel(),
    navController: NavHostController = rememberNavController()
) {

}