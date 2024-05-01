package com.alexis.practiceapp.ui.screen

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.alexis.practiceapp.ui.component.InsertDataComponent






@Composable
fun HomeScreen() {
    Column(horizontalAlignment = Alignment.CenterHorizontally) {
        InsertDataComponent(modifier = Modifier.weight(2.5f))

    }
}

@Preview(showSystemUi = true)
@Composable
private fun HomeScreenPreview() {
    HomeScreen()
}