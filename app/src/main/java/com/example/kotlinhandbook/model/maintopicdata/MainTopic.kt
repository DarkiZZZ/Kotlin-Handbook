package com.example.kotlinhandbook.model.maintopicdata

data class MainTopic(
    val id: Long,
    val nameRes: Int,
    val subTopics: List<SubTopic>
)