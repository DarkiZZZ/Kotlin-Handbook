package com.example.kotlinhandbook.model

data class MainTopic(
    val id: Long,
    val nameRes: Int,
    val subTopics: List<SubTopic>
)