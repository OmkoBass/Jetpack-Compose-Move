package com.example.move

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.move.components.Counter
import com.example.move.components.Login
import com.example.move.components.Settings
import com.example.move.components.Welcome
import com.example.move.viewModels.CounterViewModel
import com.example.move.viewModels.WelcomeViewModel

@Composable
fun BottomNavGraph(navController: NavHostController) {
    val welcomeViewModel = WelcomeViewModel();
    val counterViewModel = CounterViewModel();

    NavHost(
        navController = navController,
        startDestination = Screen.Home.route
    ) {
        composable(route = Screen.Home.route) {
            Welcome(viewModel = welcomeViewModel, navController = navController)
        }
        composable(route = Screen.Counter.route) {
            Counter(viewModel = counterViewModel)
        }
        composable(route = Screen.Settings.route) {
            Settings(navController = navController)
        }
        composable(route = Screen.Login.route) {
            Login(navController = navController)
        }
    }
}