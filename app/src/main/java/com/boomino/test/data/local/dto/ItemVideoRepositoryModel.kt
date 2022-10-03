package com.boomino.test.data.local.dto

import android.os.Parcelable
import androidx.room.Entity
import kotlinx.parcelize.Parcelize

@Entity(tableName = "video", primaryKeys = ["id"])
@Parcelize
data class ItemVideoRepositoryModel(
    val id: String,
    val title: String,
    val big_poster: String,
    val profilePhoto: String,
    val username: String,
    val visit_cnt: Int,
    val frame: String
) : Parcelable


