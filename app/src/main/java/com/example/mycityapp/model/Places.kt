package com.example.mycityapp.model

import androidx.annotation.DrawableRes
import androidx.annotation.IntRange
import androidx.annotation.StringRes
import java.util.UUID
import kotlin.random.Random

data class Places(
    val id : UUID = UUID.randomUUID(),
    @DrawableRes val image: Int = -1,
    @StringRes val name: Int = -1,
    @StringRes val description: Int =-1,
    @IntRange(from = 1, to = 10) val rating: Int = Random.nextInt(1,10),
)