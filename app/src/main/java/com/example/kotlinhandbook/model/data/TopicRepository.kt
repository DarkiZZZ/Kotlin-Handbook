package com.example.kotlinhandbook.model.data

import com.example.kotlinhandbook.R

class TopicRepository: BaseRepository {

    override var currentTopic: MainTopic = AVAILABLE_TOPICS[0]
        set(value) {
            if(field != value){
                field = value
                listeners.forEach { it(value) }
            }
        }

    private val listeners = mutableSetOf<MainListener>()

    override fun getAvailableTopics(): List<MainTopic> = AVAILABLE_TOPICS

    override fun getById(id: Long): MainTopic {
        return AVAILABLE_TOPICS.first { it.id == id }
    }

    override fun addListener(listener: MainListener) {
        listeners +=listener
        listener(currentTopic)
    }

    override fun removeListener(listener: MainListener) {
        listeners -= listener
    }

    companion object{

        /*List of sub-themes:*/
        private val SUB_TOPICS_1 = listOf(
            SubTopic(1, R.string.theme_1_1),
            SubTopic(2, R.string.theme_1_2)
        )
        private val SUB_TOPICS_2 = listOf(
            SubTopic(1, R.string.theme_2_1),
            SubTopic(2, R.string.theme_2_2),
            SubTopic(3, R.string.theme_2_3),
            SubTopic(4, R.string.theme_2_4),
            SubTopic(5, R.string.theme_2_5),
            SubTopic(6, R.string.theme_2_6),
            SubTopic(7, R.string.theme_2_7),
            SubTopic(8, R.string.theme_2_8),
            SubTopic(9, R.string.theme_2_9),
            SubTopic(10, R.string.theme_2_10),
        )
        private val SUB_TOPICS_3 = listOf(
            SubTopic(1, R.string.theme_3_1),
            SubTopic(2, R.string.theme_3_2),
            SubTopic(3, R.string.theme_3_3),
            SubTopic(4, R.string.theme_3_4),
            SubTopic(5, R.string.theme_3_5),
            SubTopic(6, R.string.theme_3_6),
            SubTopic(7, R.string.theme_3_7),
            SubTopic(8, R.string.theme_3_8),
            SubTopic(9, R.string.theme_3_9)
        )
        private val SUB_TOPICS_4 = listOf(
            SubTopic(1, R.string.theme_4_1),
            SubTopic(2, R.string.theme_4_2),
            SubTopic(3, R.string.theme_4_3),
            SubTopic(4, R.string.theme_4_4),
            SubTopic(5, R.string.theme_4_5),
            SubTopic(6, R.string.theme_4_6),
            SubTopic(7, R.string.theme_4_7),
            SubTopic(8, R.string.theme_4_8),
            SubTopic(9, R.string.theme_4_9),
            SubTopic(10, R.string.theme_4_10),
            SubTopic(11, R.string.theme_4_11),
            SubTopic(12, R.string.theme_4_12),
            SubTopic(13, R.string.theme_4_13),
            SubTopic(14, R.string.theme_4_14),
        )
        private val SUB_TOPICS_5 = listOf(
            SubTopic(1, R.string.theme_5_1),
            SubTopic(2, R.string.theme_5_2),
            SubTopic(3, R.string.theme_5_3),
        )
        private val SUB_TOPICS_6 = listOf(
            SubTopic(1, R.string.theme_6_1),
            SubTopic(2, R.string.theme_6_2),
            SubTopic(3, R.string.theme_6_3),
            SubTopic(4, R.string.theme_6_4),
            SubTopic(5, R.string.theme_6_5),
            SubTopic(6, R.string.theme_6_6),
            SubTopic(7, R.string.theme_6_7),
            SubTopic(8, R.string.theme_6_8),
        )
        private val SUB_TOPICS_7 = listOf(
            SubTopic(1, R.string.theme_7_1),
            SubTopic(2, R.string.theme_7_2),
            SubTopic(3, R.string.theme_7_3),
            SubTopic(4, R.string.theme_7_4),
            SubTopic(5, R.string.theme_7_5),
            SubTopic(6, R.string.theme_7_6),
            SubTopic(7, R.string.theme_7_7),
            SubTopic(8, R.string.theme_7_8),
            SubTopic(9, R.string.theme_7_9),
            SubTopic(10, R.string.theme_7_10),
            SubTopic(11, R.string.theme_7_11),
            SubTopic(12, R.string.theme_7_12),
            SubTopic(13, R.string.theme_7_13),
            SubTopic(14, R.string.theme_7_14),
            SubTopic(15, R.string.theme_7_15),
        )
        private val SUB_TOPICS_8 = listOf(
            SubTopic(1, R.string.theme_8_1),
            SubTopic(2, R.string.theme_8_2),
            SubTopic(3, R.string.theme_8_3),
            SubTopic(4, R.string.theme_8_4),
            SubTopic(5, R.string.theme_8_5),
            SubTopic(6, R.string.theme_8_6),
            SubTopic(7, R.string.theme_8_7),
        )
        private val SUB_TOPICS_9 = listOf(
            SubTopic(1, R.string.theme_9_1),
            SubTopic(2, R.string.theme_9_2),
            SubTopic(3, R.string.theme_9_3),
            SubTopic(4, R.string.theme_9_4),
            SubTopic(5, R.string.theme_9_5),
            SubTopic(6, R.string.theme_9_6),
            SubTopic(7, R.string.theme_9_7),
            SubTopic(8, R.string.theme_9_8),
            SubTopic(9, R.string.theme_9_9),
        )

        /*List of main themes:*/
        private val AVAILABLE_TOPICS = listOf(
            MainTopic(1, R.string.theme_1, SUB_TOPICS_1),
            MainTopic(2, R.string.theme_2, SUB_TOPICS_2),
            MainTopic(3, R.string.theme_3, SUB_TOPICS_3),
            MainTopic(4, R.string.theme_4, SUB_TOPICS_4),
            MainTopic(5, R.string.theme_5, SUB_TOPICS_5),
            MainTopic(6, R.string.theme_6, SUB_TOPICS_6),
            MainTopic(7, R.string.theme_7, SUB_TOPICS_7),
            MainTopic(8, R.string.theme_8, SUB_TOPICS_8),
            MainTopic(9, R.string.theme_8, SUB_TOPICS_9),
        )


    }
}