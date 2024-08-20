package com.example.mycityapp.model

import com.example.mycityapp.R

enum class Category(val title: Int) {
    COFFEE_SHOPS(title = R.string.category_coffee),
    RESTAURANTS(title = R.string.category_restaurants),
    KID_FRIENDLY(title = R.string.category_kid_friendly),
    PARKS(title = R.string.category_parks),
    SHOPPING_CENTERS(title = R.string.category_shopping_centers),
}