package com.alexis.practicaunanoche.component

import com.alexis.practicaunanoche.model.ObjtTask
import com.alexis.practicaunanoche.viewmodel.DataViewModel



fun ObjectComponent(propertyOne: String, propertyTwo: String, propertyTree: Boolean) {
    val viewModel = DataViewModel()
    val updatedList = viewModel.getData().toMutableList()
    val objectTranfer = ObjtTask(propertyOne, propertyTwo,propertyTree)


    updatedList.add(objectTranfer)
    viewModel.setData(updatedList)


}

