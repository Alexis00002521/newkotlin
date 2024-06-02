package com.alexis.preproyecto.screens.secondScreen

import android.graphics.Color
import android.text.Layout.Alignment
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Search
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.focus.focusModifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.alexis.preproyecto.R
import com.alexis.preproyecto.data.BookItem
import com.alexis.preproyecto.data.bookListItem
import kotlinx.coroutines.selects.select
import androidx.compose.foundation.layout.Box as LayoutBox


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun adminView() {
    val Primary: androidx.compose.ui.graphics.Color = colorResource(id = R.color.first)
    val Second: androidx.compose.ui.graphics.Color = colorResource(id = R.color.unselected)
    val base: androidx.compose.ui.graphics.Color = colorResource(id = R.color.base)


    Column {
        Spacer(modifier = Modifier.size(30.dp))
        Text(
            text = "BookApp Admin view",
            modifier = Modifier
                .fillMaxWidth()
                .background(Primary),
            fontSize = 30.sp,
            color = androidx.compose.ui.graphics.Color.White

        )



        Row(modifier = Modifier
            .fillMaxWidth()
            .background(Primary)
            .padding(15.dp)

        ){

            Text(text = "search by",modifier = Modifier.background(androidx.compose.ui.graphics.Color.White).padding(15.dp) )
            Text(text = "Category",modifier = Modifier.background(androidx.compose.ui.graphics.Color.White).padding(15.dp))
            Text(text = "Text",modifier = Modifier.background(androidx.compose.ui.graphics.Color.White).padding(15.dp))
            Image(imageVector = Icons.Outlined.Search, contentDescription = "Search" ,modifier = Modifier.background(androidx.compose.ui.graphics.Color.White).padding(14.dp))
        }

        LazyColumn(
            modifier = Modifier
                .background(base)
                .padding(16.dp)
        ) {
            itemsIndexed(bookListItem) { index, bookItem ->

                Card(
                    modifier = Modifier
                        .background(base)
                        .padding(16.dp)
                        .fillMaxWidth(),
                    onClick = { /*TODO*/ }
                ) {
                    Row(
                        modifier = Modifier
                            .background(Second)
                            .padding(16.dp)
                    ) {
                        Image(painter = painterResource(bookItem.imagen), contentDescription = bookItem.titulo, modifier = Modifier.height(130.dp))

                        Column {
                            Text(text = bookItem.titulo)
                            Text(text = "En Venta")
                        }
                    }

                }
            }
        }
    }
}
@Preview(showBackground = true)
@Composable
fun preview(){
    adminView()
}