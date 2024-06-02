package com.alexis.practicaunanoche.component

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.alexis.practicaunanoche.ui.theme.PracticaUnaNocheTheme

@Composable
fun tablero( modifier: Modifier = Modifier) {
    Column (
        modifier = Modifier
            .background(Color.DarkGray)
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Text(text = "probando cosas xD")
        Box(modifier = modifier
            .background(Color.Gray)
        ){
            Column() {

                Row(
                    modifier = Modifier

                ) {
                    Box(modifier = Modifier
                        .background(Color.White)
                        .width(5.dp)
                        .height(5.dp))
                    Box(modifier = Modifier
                        .background(Color.Black)
                        .width(5.dp)
                        .height(5.dp))
                    Box(modifier = Modifier
                        .background(Color.White)
                        .width(5.dp)
                        .height(5.dp))
                }
                Row(
                    modifier = Modifier

                ) {
                    Box(modifier = Modifier
                        .background(Color.Black)
                        .width(5.dp)
                        .height(5.dp))
                    Box(modifier = Modifier
                        .background(Color.White)
                        .width(5.dp)
                        .height(5.dp))
                    Box(modifier = Modifier
                        .background(Color.Black)
                        .width(5.dp)
                        .height(5.dp))
                }
                Row(
                    modifier = Modifier

                ) {
                    Box(modifier = Modifier
                        .background(Color.White)
                        .width(5.dp)
                        .height(5.dp))
                    Box(modifier = Modifier
                        .background(Color.Black)
                        .width(5.dp)
                        .height(5.dp))
                    Box(modifier = Modifier
                        .background(Color.White)
                        .width(5.dp)
                        .height(5.dp))
                }
            }

        }
        contenList()


    }
}
@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    PracticaUnaNocheTheme {
        tablero()
    }
}