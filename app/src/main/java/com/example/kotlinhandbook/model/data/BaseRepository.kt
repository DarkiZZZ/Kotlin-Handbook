package com.example.kotlinhandbook.model.data

import com.example.kotlinhandbook.model.Repository

typealias MainListener = (MainTopic) -> Unit

interface BaseRepository : Repository {

    var currentTopic: MainTopic

    fun getAvailableTopics(): List<MainTopic>

    fun getById(id: Long): MainTopic

    fun addListener(listener: MainListener)

    fun removeListener(listener: MainListener)

}