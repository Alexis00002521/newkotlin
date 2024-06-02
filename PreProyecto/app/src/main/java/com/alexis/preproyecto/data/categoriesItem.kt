package com.alexis.preproyecto.data

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Build
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.MailOutline
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material.icons.outlined.Build
import androidx.compose.material.icons.outlined.Lock
import androidx.compose.material.icons.outlined.MailOutline
import androidx.compose.material.icons.outlined.ShoppingCart
import androidx.compose.ui.graphics.vector.ImageVector


data class BottomNavCategories(
    val title: String,
    val route: String,
    val selectedIcon: ImageVector,
    val unselectedIcon: ImageVector,
    //opcional

)



val bottomNavItem2 = listOf(
    BottomNavCategories(
        title = "home",
        route = "home",
        selectedIcon = Icons.Filled.ShoppingCart,
        unselectedIcon = Icons.Outlined.ShoppingCart
    ),
    BottomNavCategories(
        title = "search",
        route = "search",
        selectedIcon = Icons.Filled.Build,
        unselectedIcon = Icons.Outlined.Build,

    ),
    BottomNavCategories(
        title = "add",
        route = "add",
        selectedIcon = Icons.Filled.Lock,
        unselectedIcon = Icons.Outlined.Lock,

    ),
    BottomNavCategories(
        title = "Profile",
        route = "Profile",
        selectedIcon = Icons.Filled.MailOutline,
        unselectedIcon = Icons.Outlined.MailOutline,

    )
)
