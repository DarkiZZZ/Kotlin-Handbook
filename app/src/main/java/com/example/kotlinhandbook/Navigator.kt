package com.example.kotlinhandbook

/*This interface shows actions, which responsible for navigation between fragments*/

interface Navigator {

    fun launch(/*todo: as argument - screen(fragment basically)*/)

    fun goBack(/*todo: as argument - Result class, through this class i will transfer information between fragments*/)
}