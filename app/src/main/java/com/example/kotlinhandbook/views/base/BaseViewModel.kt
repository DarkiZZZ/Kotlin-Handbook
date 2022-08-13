package com.example.kotlinhandbook.views.base

import androidx.lifecycle.ViewModel


open class BaseViewModel: ViewModel() {

    open fun onResult(result: Any){

    }
}