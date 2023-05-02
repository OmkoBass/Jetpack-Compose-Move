package com.example.move.components

import androidx.compose.foundation.layout.Column
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import com.example.move.Screen

@Composable
fun Login(navController: NavController) {
    Column {
        Text(
            text = "Login",
        )

        Button(
            onClick = {
                navController.navigate(Screen.Home.route)
            },
            modifier = Modifier.align(Alignment.End)
        ) {
            Text(text = "Login")
        }
    }
}