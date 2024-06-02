package com.alexis.practicaunanoche.component

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.alexis.practicaunanoche.data.alertDialogStatus
import com.alexis.practicaunanoche.model.ObjectFicha
import com.alexis.practicaunanoche.model.ObjtTask
import com.alexis.practicaunanoche.viewmodel.DataViewModel

@Composable
fun contenList(){



    val data: MutableState<MutableList<ObjtTask>> = remember { mutableStateOf(mutableListOf()) }
    val viewModel = DataViewModel()
    data.value = viewModel.getData()




    LazyColumn(
        modifier = Modifier
            .padding(5.dp)
    ) {
        itemsIndexed(data.value){index, item ->
            Column(
                modifier = Modifier
                    .padding(20.dp)
                    .clip(RoundedCornerShape(20.dp))
                    .background(Color.Cyan)
                    .padding(20.dp)
                    .fillMaxWidth()
                    .clickable {

                        alertDialogStatus.value = true


                    }
            ) {
                Text(
                    text = item.getTitle(),
                    textAlign = TextAlign.Center,
                    modifier = Modifier
                        .padding(15.dp)
                        .fillMaxWidth(),
                    style = TextStyle(fontSize = 20.sp)

                )
                Text(
                    text = "Description: " + item.getTask() ,
                    style = TextStyle(fontSize = 15.sp),
                    textAlign = TextAlign.Justify
                )
            }
        }

    }
}
