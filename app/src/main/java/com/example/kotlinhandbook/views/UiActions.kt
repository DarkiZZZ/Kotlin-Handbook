package com.example.kotlinhandbook.views

/*This interface shows actions, which can be used in Ui of fragment*/

interface UiActions {

    fun toast(message: String)

    fun getString(messageRes: Int, vararg args: Any) : String
}