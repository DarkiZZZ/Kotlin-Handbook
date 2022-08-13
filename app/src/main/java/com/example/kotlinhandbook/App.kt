package com.example.kotlinhandbook

import android.app.Application
import com.example.kotlinhandbook.model.maintopicdata.MainTopicRepository
import com.example.kotlinhandbook.model.subtopicdata.SubTopicRepository

class App : Application() {

    val models = listOf<Any>(
        MainTopicRepository(),
        SubTopicRepository()
    )
}