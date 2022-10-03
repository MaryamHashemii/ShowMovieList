package com.boomino.test.data.local.dto

import android.os.Parcelable
import androidx.room.Entity
import kotlinx.parcelize.Parcelize


@Entity(tableName = "category", primaryKeys = ["id"])
@Parcelize
data class ItemCategoryRepositoryModel(
    val id: String,
    val name: String,
) : Parcelable