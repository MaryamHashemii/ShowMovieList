package com.boomino.test.domain.model

import android.os.Parcelable
import com.boomino.test.data.local.dto.ItemVideoRepositoryModel
import kotlinx.parcelize.Parcelize

@Parcelize
data class ItemVideo(
    val id: String,
    val name: String,
    val images: String,
    val profilePhoto: String,
    val username: String,
    val visit_cnt: Int,
    val frame: String

) : Parcelable

fun ItemVideo.toItemProductRepositoryModel(): ItemVideoRepositoryModel =

    ItemVideoRepositoryModel(
        id = id,
        title = name,
        big_poster = name,
        profilePhoto = profilePhoto,
        username = username,
        visit_cnt = visit_cnt,
        frame=frame
    )

fun List<ItemVideo>.toItemVideoRepositoryModelList(): List<ItemVideoRepositoryModel> {
    return map {
        ItemVideoRepositoryModel(
            id = it.id,
            title = it.name,
            big_poster = it.images,
            profilePhoto = it.profilePhoto,
            username = it.username,
            visit_cnt = it.visit_cnt,
            frame = it.frame
        )
    }
}

fun List<ItemVideoRepositoryModel>.toItemProductRepositoryModelList2(): List<ItemVideo> {
    return map {
        ItemVideo(
            id = it.id,
            name = it.title,
            images = it.big_poster,
            profilePhoto = it.profilePhoto,
            username = it.username,
            visit_cnt = it.visit_cnt,
            frame = it.frame
        )
    }
}

