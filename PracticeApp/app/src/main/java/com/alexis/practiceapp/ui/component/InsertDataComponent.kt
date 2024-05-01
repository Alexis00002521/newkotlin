package com.alexis.practiceapp.ui.component

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import com.alexis.practiceapp.model.objectSong

@Composable
fun InsertDataComponent(modifier: Modifier = Modifier){


    val textFieldName:MutableState<String> = remember { mutableStateOf("") }
    val textFieldAuthor: MutableState<String> = remember { mutableStateOf("") }

        Column (
            modifier = modifier.fillMaxWidth(), horizontalAlignment = Alignment.CenterHorizontally
        ){

            Text(modifier = Modifier.padding(bottom = 5.dp), text = "Insert your song here")

            //textfield
            TextField(modifier = Modifier.padding(bottom = 5.dp),
                singleLine = true,
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text),
                value = textFieldName.value,
                onValueChange = { textFieldName.value =  it },
                placeholder = {
                    Text(text = "Insert Song here")
                })

            TextField(modifier = Modifier.padding(bottom = 5.dp), singleLine = true,
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text),
                value = textFieldAuthor.value,
                onValueChange = { textFieldAuthor.value = it },
                placeholder = {
                    Text(text = "Insert Author here")
                })
                //button

            Button(
                modifier = Modifier.padding(bottom = 5.dp),
                onClick = {

                    objectSong(name = textFieldName.value, author = textFieldAuthor.value)


                }) {
                Text(text = "Add Song")
            }

        }
}