package com.example.move.components

import androidx.compose.foundation.layout.Column
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import com.example.move.Screen
import com.example.move.viewModels.WelcomeViewModel

@Composable
fun Welcome(viewModel: WelcomeViewModel, navController: NavController) {
    Column {
        Text(text = "Welcome ${viewModel.message.value}")

        Button(
            onClick = {
                navController.navigate(Screen.Counter.route)
            },
            modifier = Modifier.align(Alignment.End)
        ) {
            Text(text = "To Counter Screen")
        }
    }
}