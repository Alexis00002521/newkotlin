package com.alexis.practicaunanoche.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.alexis.practicaunanoche.data.objectList
import com.alexis.practicaunanoche.data.taskList
import com.alexis.practicaunanoche.model.ObjtTask
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch


class DataViewModel: ViewModel() {

    fun setData(myList: MutableList<ObjtTask>){

        taskList.value = myList
    }

    fun getData(): MutableList<ObjtTask>{
        return  taskList.value
    }

    fun getObjet(int: Int): ObjtTask{
        return taskList.value[int]

    }


}
