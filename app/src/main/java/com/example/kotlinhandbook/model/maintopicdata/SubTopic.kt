package com.example.kotlinhandbook.model.maintopicdata

data class SubTopic(
    val id: Long,
    val nameRes: Int,
    var isRead: Boolean = false
)