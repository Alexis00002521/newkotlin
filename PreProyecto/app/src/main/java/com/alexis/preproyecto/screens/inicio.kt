package com.alexis.preproyecto.screens

import android.graphics.drawable.Icon
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CutCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.outlined.AccountCircle
import androidx.compose.material.icons.outlined.Add
import androidx.compose.material.icons.outlined.Home
import androidx.compose.material.icons.outlined.Person
import androidx.compose.material.icons.outlined.Search
import androidx.compose.material3.AlertDialogDefaults
import androidx.compose.material3.AlertDialogDefaults.shape
import androidx.compose.material3.Badge
import androidx.compose.material3.BadgedBox
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.alexis.preproyecto.R
import com.alexis.preproyecto.screens.navegationcomponent.top
import java.lang.reflect.Modifier


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun navBar(

){
    //var selected = remember{ mutableIntStateOf(0) }
    var selected by remember { mutableIntStateOf(0) }


    Scaffold(

        topBar = {
            top()
        },

        bottomBar = {
            NavigationBar {

                bottomNavItem.forEachIndexed{ index, bottomNavItem ->
                    NavigationBarItem(


                        selected = index == selected ,
                        onClick = {
                            selected = index
                            //navController.navegate(bottomNavItem.route)
                        },
                        icon = {
                            BadgedBox(
                                badge = {
                                    if(bottomNavItem.badges != 0 ){
                                        Badge{
                                            Text(text = bottomNavItem.badges.toString())
                                        }
                                    } else if (bottomNavItem.hasNews){
                                        Badge()
                                    }
                                } ) {
                                Icon(
                                    imageVector =
                                    if(index == selected)
                                        bottomNavItem.selectedIcon
                                    else
                                        bottomNavItem.unselectedIcon,

                                    contentDescription = bottomNavItem.title
                                )
                            }
                        },
                        //texto
                        label = {
                            Text(text = bottomNavItem.title)
                        },



//C9ADA7

                    )
                }
            }
        }
        
    ) {

        val padding = it
    }
}





