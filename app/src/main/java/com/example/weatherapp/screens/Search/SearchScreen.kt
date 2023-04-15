package com.example.weatherapp.screens.Search

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Column
import androidx.compose.material.Scaffold
import androidx.compose.material.Surface
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import com.example.weatherapp.widgets.WeatherAppBar

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun SearchScreen(navController: NavController) {
 Scaffold(topBar = {
     WeatherAppBar(
         title = "Search",
         navController = navController,
         icon = Icons.Default.ArrowBack,
         isMainScreen = false ) {
         navController.popBackStack()
     }

 }) {
            Surface() {
                Column() {

                }
            }
 }

}