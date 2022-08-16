package com.example.kotlinhandbook

import android.app.Application
import com.example.kotlinhandbook.model.data.BaseRepository
import com.example.kotlinhandbook.model.data.TopicRepository
import core.BaseApplication
import core.model.Repository

class App : Application(), BaseApplication {
    override val repositories: List<Repository> = listOf<BaseRepository>(
        TopicRepository()
    )


}