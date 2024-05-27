package com.alexis.preproyecto.screens.navegationcomponent

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.AlertDialogDefaults
import androidx.compose.material3.AlertDialogDefaults.shape
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.unit.dp
import com.alexis.preproyecto.R
import com.alexis.preproyecto.screens.bottomNavItem2


@Composable
fun top(){
    var selected2 by remember { mutableIntStateOf(0) }
    val back = colorResource(id = R.color.first)
    val select = colorResource(id = R.color.selected)
    val unsect = colorResource(id = R.color.unselected)


    NavigationBar (
        modifier = Modifier
            .clip(AlertDialogDefaults.shape),
        containerColor = back, // Color de fondo (purple_700)
        contentColor = Color.White // Color del contenido (iconos y texto)

    ) {
        Column(
            modifier = Modifier.background(back),

        ) {

            Text(text = "Categorias")
            Row {
                bottomNavItem2.forEachIndexed{ index, bottomNavItem2 ->
                    NavigationBar {
                        
                    }
                    NavigationBarItem(
                        selected = index == selected2 ,
                        onClick = {
                            selected2 = index
                            //navController.navegate(bottomNavItem.route)
                        },
                        icon = {

                        },
                        label = {
                            Box(
                                modifier = Modifier
                                    .background(
                                        if (index == selected2)
                                            select
                                        else
                                            unsect
                                    )
                                    .align(alignment = Alignment.CenterVertically)
                                    .border(
                                        border = BorderStroke(
                                            2.dp,
                                            back
                                        ), // Tamaño y color del borde
                                        shape = RoundedCornerShape(16.dp) // Bordes redondeados
                                    )

                            ){
                                Text(text = bottomNavItem2.title, modifier = Modifier.padding(13.dp))
                            }
                        },



                        )
                }
            }
        }
    }
}
