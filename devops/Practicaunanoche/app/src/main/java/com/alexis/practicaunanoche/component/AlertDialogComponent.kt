package com.alexis.practicaunanoche.component

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Dialog
import com.alexis.practicaunanoche.data.alertDialogStatus
import com.alexis.practicaunanoche.model.ObjtTask
import com.alexis.practicaunanoche.viewmodel.DataViewModel


@Composable
fun AlertdialogComponent( objtTasks: ObjtTask

){
    val textFieldPropertyOne: MutableState<String> = remember { mutableStateOf("") }
    val textFieldPropertyTwo: MutableState<String> = remember { mutableStateOf("") }
    

    Column(
        modifier = Modifier
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        val hidden: MutableState<Boolean> = remember { alertDialogStatus }


        if (hidden.value) {
            Dialog(onDismissRequest = { hidden.value = false }){

                Card(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(375.dp)
                        .padding(16.dp),
                    shape = RoundedCornerShape(16.dp),
                ){
                    //ingresar datos
                    TextField(modifier = Modifier.padding(bottom = 5.dp),
                        singleLine = true,
                        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text),
                        value = textFieldPropertyOne.value,
                        onValueChange = { textFieldPropertyOne.value =  it },
                        placeholder = {
                            Text(text = "Insert first property here")
                        })

                    TextField(modifier = Modifier.padding(bottom = 5.dp), singleLine = true,
                        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text),
                        value = textFieldPropertyTwo.value,
                        onValueChange = { textFieldPropertyTwo.value = it },
                        placeholder = {
                            Text(text = "Insert second property here")
                        })
                    //botones
                    Row {
                        TextButton(
                            onClick = { hidden.value = false },
                            modifier = Modifier.padding(8.dp),
                        ) {
                            Text("Dismiss")
                        }
                        TextButton(
                            onClick = {
                                ObjectComponent(propertyOne = textFieldPropertyOne.value, propertyTwo = textFieldPropertyTwo.value,false)
                                hidden.value = false
                                textFieldPropertyOne.value = ""
                                textFieldPropertyTwo.value = ""

                                      },
                            modifier = Modifier.padding(8.dp),
                        ) {
                            Text("Confirm")
                        }
                    }
                }

            }
        }
    }
}