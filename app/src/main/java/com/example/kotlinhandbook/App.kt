package com.example.kotlinhandbook

import android.app.Application
import com.example.kotlinhandbook.model.maintopicdata.TopicRepository
import com.example.kotlinhandbook.model.subtopicdata.SubTopicRepository

class App : Application() {

    val models = listOf<Any>(
        TopicRepository(),
        SubTopicRepository()
    )
}