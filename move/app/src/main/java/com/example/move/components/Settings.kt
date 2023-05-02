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
fun Settings(navController: NavController) {
    Column {
        Text(
            text = "Settings",
        )

        Button(
            onClick = {
                navController.navigate(Screen.Login.route)
            },
            modifier = Modifier.align(Alignment.End)
        ) {
            Text(text = "Logout")
        }
    }
}