package com.example.mycityapp.model

import androidx.annotation.DrawableRes
import androidx.annotation.IntRange
import androidx.annotation.StringRes

data class Places(
    @DrawableRes val image: Int,
    @StringRes val name: Int,
    @StringRes val description: Int,
    @IntRange(from = 1, to = 10) val rate: Int,
    val category: Category,
)