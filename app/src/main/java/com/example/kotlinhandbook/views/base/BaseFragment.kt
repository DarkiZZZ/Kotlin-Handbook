package com.example.kotlinhandbook.views.base

import androidx.fragment.app.Fragment
import com.example.kotlinhandbook.views.base.BaseViewModel

abstract class BaseFragment : Fragment() {

    abstract val viewModel: BaseViewModel

    fun notifyScreenUpdates(){
        //todo
    }
}