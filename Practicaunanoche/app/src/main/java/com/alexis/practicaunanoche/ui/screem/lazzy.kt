package com.alexis.practicaunanoche.ui.screem


import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.alexis.practicaunanoche.model.ObjectFicha

@Composable
fun lazzy(){
    val textFieldPropertyOne: MutableState<String> = remember { mutableStateOf("") }
    val textFieldPropertyTwo: MutableState<String> = remember { mutableStateOf("") }

    val data: MutableState<MutableList<ObjectFicha>> = remember {mutableStateOf(mutableListOf()) }

    LazyColumn(
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 8.dp, start = 8.dp, end = 8.dp)
    ) {
        itemsIndexed(data.value){index, item ->
            Row (Modifier.padding(5.dp)){
                Text(text = item.getPropertyOne(), modifier = Modifier.padding(3.dp) )
                Text(text = item.getPropertyTwo(), modifier = Modifier.padding(3.dp) )


            }

        }

    }

}
