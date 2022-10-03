package com.boomino.test.data.remote.dto.response

import com.boomino.test.data.local.dto.ItemVideoRepositoryModel
import com.boomino.test.domain.model.ItemVideo

data class Categoryvideo(
    val `360d`: Boolean,
    val autoplay: Boolean,
    val big_poster: String,
    val create_date: String,
    val deleteurl: String,
    val duration: Int,
    val frame: String,
    val id: String,
    val isHidden: Boolean,
    val official: String,
    val process: String,
    val profilePhoto: String,
    val sdate: String,
    val sdate_timediff: Int,
    val sender_name: String,
    val small_poster: String,
    val title: String,
    val uid: String,
    val userid: String,
    val username: String,
    val video_date_status: String,
    val visit_cnt: Int
)

fun List<Categoryvideo>.toItemVideoList(): List<ItemVideo> {
    return map {
        ItemVideo(
            id = it.id,
            images = it.big_poster,
            name = it.title,
            username = it.username,
            profilePhoto = it.profilePhoto,
            visit_cnt = it.visit_cnt,
            frame = it.frame
        )
    }
}

fun List<Categoryvideo>.toItemVideoRepositoryList(): List<ItemVideoRepositoryModel> {
    return map {
        ItemVideoRepositoryModel(
            id = it.id,
            big_poster = it.big_poster,
            title = it.title,
            username = it.username,
            profilePhoto = it.profilePhoto,
            visit_cnt = it.visit_cnt,
            frame = it.frame
        )
    }
}
