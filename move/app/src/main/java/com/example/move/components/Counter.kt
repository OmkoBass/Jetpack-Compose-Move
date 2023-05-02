package com.example.move.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import com.example.move.viewModels.CounterViewModel

@Composable
fun Counter(viewModel: CounterViewModel) {
    Column {
        Row(verticalAlignment = Alignment.CenterVertically) {
            Button(onClick = { viewModel.increment() }) {
                Text(text = "+")
            }

            Button(onClick = { viewModel.decrement() }) {
                Text(text = "-")
            }
        }

        Text(text = "Count is: ${viewModel.counter.value}")
    }
}