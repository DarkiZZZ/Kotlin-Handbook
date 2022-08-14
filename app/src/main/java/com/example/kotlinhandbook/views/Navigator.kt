package com.example.kotlinhandbook.views

import com.example.kotlinhandbook.views.base.BaseScreen

/*This interface shows actions, which responsible for navigation between fragments*/

interface Navigator {

    fun launch(screen: BaseScreen)

    fun goBack(result: Any? = null)
}