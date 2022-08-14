package com.example.kotlinhandbook

import android.app.Application
import com.example.kotlinhandbook.model.data.TopicRepository

class App : Application() {

    val models = listOf<Any>(
        TopicRepository()
    )
}