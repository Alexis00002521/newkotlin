package com.alexis.practiceapp.data

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import com.alexis.practiceapp.model.objectSong


val myplaylist : MutableState<MutableList<objectSong>> = mutableStateOf(mutableListOf())
// play list - es un estado mutable que es una lista de objeto cancion que es una lista de canciones que posee objeto Song
