package com.example.mycityapp.model

import androidx.annotation.DrawableRes
import androidx.annotation.IntRange
import androidx.annotation.StringRes

data class Places(
    val id : Long,
    @DrawableRes val image: Int = -1,
    @StringRes val name: Int = -1,
    @StringRes val description: Int =-1,
    @IntRange(from = 1, to = 10) val rating: Int = 1,
)