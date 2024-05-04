package com.alexis.practicaunanoche

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.alexis.practicaunanoche.component.AlertdialogComponent
import com.alexis.practicaunanoche.component.tablero
import com.alexis.practicaunanoche.data.alertDialogStatus
import com.alexis.practicaunanoche.ui.theme.PracticaUnaNocheTheme

class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalMaterial3Api::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            PracticaUnaNocheTheme {

                Scaffold(
                    topBar = {
                        TopAppBar(
                            title = { Text(text = "simple", color = Color.Black) }
                        )
                    },
                    floatingActionButton = {
                        FloatingActionButton(
                            onClick = {
                                alertDialogStatus.value = true

                            }
                        ) {
                            Icon(Icons.Default.Add, contentDescription = "Add To-Do")
                        }
                    }

                )
                { innerPadding ->
                    tablero(modifier =Modifier.padding(innerPadding) )
                    AlertdialogComponent()

                }

            }
        }
    }
}
