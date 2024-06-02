package com.alexis.practicaflow

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

class ExampleViewModel : ViewModel()  {

}// Crear un MutableStateFlow con un valor inicial
private val _count = MutableStateFlow(0)

// Exponer como StateFlow para que no pueda ser modificado externamente
val count: StateFlow<Int> get() = _count

fun incrementCount() {
    _count.value++
}

@Composable
fun ExampleScreen(viewModel: ExampleViewModel) {
    // Observar el StateFlow
    val count by viewModel.count.collectAsState()

    Column {
        Text("Count: $count")
        Button(onClick = { viewModel.incrementCount() }) {
            Text("Increment")
        }
    }
}
