package com.example.mycityapp.model

import androidx.annotation.StringRes
import com.example.mycityapp.R

enum class MyCityScreen(@StringRes val title: Int) {
    CATEGORY_LIST(title = R.string.screen_title_category),
    PLACE_LIST(title = R.string.screen_title_place_list),
    PLACE_DETAIL(title = R.string.screen_title_place_detail),
}