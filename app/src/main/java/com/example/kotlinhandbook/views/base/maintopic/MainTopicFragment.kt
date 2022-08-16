package com.example.kotlinhandbook.views.base.maintopic

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import core.views.BaseFragment
import core.views.BaseScreen
import core.views.BaseViewModel
import core.views.screenViewModel

class MainTopicFragment: BaseFragment() {

    override val viewModel: BaseViewModel by screenViewModel<MainTopicViewModel>()



    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val adapter = ListViewAdapter(viewModel)
        return super.onCreateView(inflater, container, savedInstanceState)
    }

    class Screen : BaseScreen


}