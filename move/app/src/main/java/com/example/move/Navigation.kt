package com.example.move

import android.annotation.SuppressLint
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.example.move.components.BottomBar

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun Navigation() {
    val navController = rememberNavController()

    val currentDestination = navController.currentBackStackEntryAsState().value?.destination

    if (currentDestination?.route == Screen.Login.route) {
        BottomNavGraph(navController = navController)
    } else {
        Scaffold (
            bottomBar = { BottomBar(navController = navController) }
        ) {
            BottomNavGraph(navController = navController)
        }
    }
}