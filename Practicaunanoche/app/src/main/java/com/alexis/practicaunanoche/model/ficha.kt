package com.alexis.practicaunanoche.model

data class ObjectFicha(
    private var nombre: String,
    private var valor: String,

    ){
    fun getPropertyOne():String{
        return nombre
    }
    fun getPropertyTwo():String{
        return valor
    }

}