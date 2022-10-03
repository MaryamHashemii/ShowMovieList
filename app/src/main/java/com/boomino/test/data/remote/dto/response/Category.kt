package com.boomino.test.data.remote.dto.response

import com.boomino.test.data.local.dto.ItemCategoryRepositoryModel

data class Category(
    val id: String,
    val name: String
)

fun List<Category>.toCategoryRepositoryModelList(): List<ItemCategoryRepositoryModel> {
    return map {
        ItemCategoryRepositoryModel(
            id = it.id,
            name = it.name
        )
    }
}

fun List<ItemCategoryRepositoryModel>.toCategoryList(): List<Category> {
    return map {
        Category(
            id = it.id.toString(),
            name = it.name
        )
    }
}