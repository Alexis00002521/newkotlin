package com.auroagroup.myapppractice.data

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import com.auroagroup.myapppractice.model.objetTask

var taskList: MutableState<MutableList<objetTask>> = mutableStateOf(mutableListOf())
