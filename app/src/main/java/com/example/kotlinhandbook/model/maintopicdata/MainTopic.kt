package com.example.kotlinhandbook.model.maintopicdata

import com.example.kotlinhandbook.model.subtopicdata.SubTopic

data class MainTopic(
    val id: Long,
    val nameRes: Int,
    val subTopics: List<SubTopic>
)