package com.example.move
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Settings
import androidx.compose.ui.graphics.vector.ImageVector

sealed class Screen(
    val route: String,
    val title: String,
    val icon: ImageVector?
) {
    object Home : Screen(
        route = "/home",
        title = "Home",
        icon = Icons.Default.Home
    )

    object Counter : Screen(
        route = "/counter",
        title = "Counter",
        icon = Icons.Default.Add
    )

    object Settings: Screen(
        route = "/settings",
        title = "Settings",
        icon = Icons.Default.Settings
    )

    object Login : Screen(
        route = "/login",
        title = "Login",
        icon = null
    )
}