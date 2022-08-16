package com.example.kotlinhandbook.views.base.maintopic

import androidx.lifecycle.MutableLiveData
import com.example.kotlinhandbook.model.data.BaseRepository
import com.example.kotlinhandbook.model.data.MainTopic
import core.navigator.Navigator
import core.uiactions.UiActions
import core.views.BaseViewModel

class MainTopicViewModel(
    private val navigator: Navigator,
    private val uiActions: UiActions,
    private val repository: BaseRepository
): BaseViewModel(), ListViewAdapter.ItemListener {



    override fun onSubTopicChosen(topic: MainTopic) {

    }


}