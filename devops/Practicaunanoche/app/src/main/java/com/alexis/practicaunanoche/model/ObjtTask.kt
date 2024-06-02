package com.alexis.practicaunanoche.model

data class ObjtTask(
    private var title: String,
    private var task: String,
    private var state: Boolean,
){

    fun getTitle():String{
        return title
    }
    fun getTask():String{
        return task
    }
    fun getState():Boolean{
        return state
    }
}
