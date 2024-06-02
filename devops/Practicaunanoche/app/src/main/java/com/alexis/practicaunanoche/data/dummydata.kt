package com.alexis.practicaunanoche.data

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import com.alexis.practicaunanoche.model.ObjectFicha
import com.alexis.practicaunanoche.model.ObjtTask

var objectList: MutableState<MutableList<ObjectFicha>> = mutableStateOf(mutableListOf())

var taskList: MutableState<MutableList<ObjtTask>> = mutableStateOf(mutableListOf())

var alertDialogStatus: MutableState<Boolean> = mutableStateOf(false)




