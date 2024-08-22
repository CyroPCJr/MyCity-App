package com.example.mycityapp.data

import com.example.mycityapp.R
import com.example.mycityapp.model.Category
import com.example.mycityapp.model.Places
import kotlin.random.Random

object LocalPlacesDataProvider {

    val defaultPlace: Places = Places(
        name = R.string.coffee_shop_01,
        description = R.string.place_description_default,
        rating = Random.nextInt(1, 10),
        image = R.drawable.coffe_shop_template
    )

    private val coffeeDataProvider: List<Places> = listOf(
        Places(
            image = R.drawable.coffe_place_01,
            name = R.string.coffee_shop_01,
            description = R.string.coffee_shop_descr_01,
        ),
        Places(
            image = R.drawable.coffe_place_02,
            name = R.string.coffee_shop_02,
            description = R.string.coffee_shop_descr_02,
        ),
        Places(
            image = R.drawable.coffe_place_03,
            name = R.string.coffee_shop_03,
            description = R.string.coffee_shop_descr_03,
        ),
        Places(
            image = R.drawable.coffe_place_04,
            name = R.string.coffee_shop_04,
            description = R.string.coffee_shop_descr_04,
        ),
        Places(
            image = R.drawable.coffe_place_05,
            name = R.string.coffee_shop_05,
            description = R.string.coffee_shop_descr_05,
        ),
        Places(
            image = R.drawable.coffe_place_06,
            name = R.string.coffee_shop_06,
            description = R.string.coffee_shop_descr_06,
        ),
        Places(
            image = R.drawable.coffe_place_07,
            name = R.string.coffee_shop_07,
            description = R.string.coffee_shop_descr_07,
        ),
        Places(
            image = R.drawable.coffe_place_08,
            name = R.string.coffee_shop_08,
            description = R.string.coffee_shop_descr_08,
        ),
    )
    private val restaurantDataProvider: List<Places> = listOf(
        Places(
            image = R.drawable.restaurant_place_01,
            name = R.string.restaurant_01,
            description = R.string.restaurant_descr_01,
        ),
        Places(
            image = R.drawable.restaurant_place_02,
            name = R.string.restaurant_02,
            description = R.string.restaurant_descr_02,
        ),
        Places(
            image = R.drawable.restaurant_place_03,
            name = R.string.restaurant_03,
            description = R.string.restaurant_descr_03,
        ),
        Places(
            image = R.drawable.restaurant_place_04,
            name = R.string.restaurant_04,
            description = R.string.restaurant_descr_04,
        ),
        Places(
            image = R.drawable.restaurant_place_05,
            name = R.string.restaurant_05,
            description = R.string.restaurant_descr_05,
        ),
        Places(
            image = R.drawable.restaurant_place_06,
            name = R.string.restaurant_06,
            description = R.string.restaurant_descr_06,
        ),
        Places(
            image = R.drawable.restaurant_place_07,
            name = R.string.restaurant_07,
            description = R.string.restaurant_descr_07,
        ),
        Places(
            image = R.drawable.restaurant_place_08,
            name = R.string.restaurant_08,
            description = R.string.restaurant_descr_08,
        ),
    )
    private val kidFriendlyDataProvider: List<Places> = listOf(
        Places(
            image = R.drawable.kid_friendly_place_01,
            name = R.string.kid_places_01,
            description = R.string.kid_place_descr_01,
        ),
        Places(
            image = R.drawable.kid_friendly_place_02,
            name = R.string.kid_places_02,
            description = R.string.kid_place_descr_02,
        ),
        Places(
            image = R.drawable.kid_friendly_place_03,
            name = R.string.kid_places_03,
            description = R.string.restaurant_descr_03,
        ),
        Places(
            image = R.drawable.kid_friendly_place_04,
            name = R.string.kid_places_04,
            description = R.string.restaurant_descr_04,
        ),
        Places(
            image = R.drawable.kid_friendly_place_05,
            name = R.string.kid_places_05,
            description = R.string.restaurant_descr_05,
        ),
        Places(
            image = R.drawable.kid_friendly_place_06,
            name = R.string.kid_places_06,
            description = R.string.restaurant_descr_06,
        ),
        Places(
            image = R.drawable.kid_friendly_place_07,
            name = R.string.kid_places_07,
            description = R.string.restaurant_descr_07,
        ),
        Places(
            image = R.drawable.kid_friendly_place_08,
            name = R.string.kid_places_08,
            description = R.string.restaurant_descr_08,
        ),
    )
    private val parksDataProvider: List<Places> = listOf(
        Places(
            image = R.drawable.park_place_01,
            name = R.string.park_place_01,
            description = R.string.park_place_descr_01,
        ),
        Places(
            image = R.drawable.park_place_02,
            name = R.string.park_place_02,
            description = R.string.park_place_descr_02,
        ),
        Places(
            image = R.drawable.park_place_03,
            name = R.string.park_place_03,
            description = R.string.park_place_descr_03,
        ),
        Places(
            image = R.drawable.park_place_04,
            name = R.string.park_place_04,
            description = R.string.park_place_descr_04,
        ),
        Places(
            image = R.drawable.park_place_05,
            name = R.string.park_place_05,
            description = R.string.park_place_descr_05,
        ),
        Places(
            image = R.drawable.park_place_06,
            name = R.string.park_place_06,
            description = R.string.park_place_descr_06,
        ),
        Places(
            image = R.drawable.park_place_07,
            name = R.string.park_place_07,
            description = R.string.park_place_descr_07,
        ),
        Places(
            image = R.drawable.park_place_08,
            name = R.string.park_place_08,
            description = R.string.park_place_descr_08,
        ),
    )
    private val shoppingDataProvider: List<Places> = listOf(
        Places(
            image = R.drawable.shopping_center_place_01,
            name = R.string.shopping_center_place_01,
            description = R.string.shopping_center_place_descr_01,
        ),
        Places(
            image = R.drawable.shopping_center_place_02,
            name = R.string.shopping_center_place_02,
            description = R.string.shopping_center_place_descr_02,
        ),
        Places(
            image = R.drawable.shopping_center_place_03,
            name = R.string.shopping_center_place_03,
            description = R.string.shopping_center_place_descr_03,
        ),
        Places(
            image = R.drawable.shopping_center_place_04,
            name = R.string.shopping_center_place_04,
            description = R.string.shopping_center_place_descr_04,
        ),
        Places(
            image = R.drawable.shopping_center_place_05,
            name = R.string.shopping_center_place_05,
            description = R.string.shopping_center_place_descr_05,
        ),
        Places(
            image = R.drawable.shopping_center_place_06,
            name = R.string.shopping_center_place_06,
            description = R.string.shopping_center_place_descr_06,
        ),
        Places(
            image = R.drawable.shopping_center_place_07,
            name = R.string.shopping_center_place_07,
            description = R.string.shopping_center_place_descr_07,
        ),
        Places(
            image = R.drawable.shopping_center_place_08,
            name = R.string.shopping_center_place_08,
            description = R.string.shopping_center_place_descr_08,
        ),
    )

    fun loadUIPlaces(): Map<Category, List<Places>> {
        val resultMap = mutableMapOf<Category, List<Places>>()
        resultMap[Category.COFFEE_SHOPS] = coffeeDataProvider
        resultMap[Category.RESTAURANTS] = restaurantDataProvider
        resultMap[Category.KID_FRIENDLY] = kidFriendlyDataProvider
        resultMap[Category.PARKS] = parksDataProvider
        resultMap[Category.SHOPPING_CENTERS] = shoppingDataProvider
        return resultMap
    }

    fun loadCategoryUI(): Map<Category, Int> {
        val resultMap: MutableMap<Category, Int> = mutableMapOf()
        resultMap[Category.COFFEE_SHOPS] = R.drawable.coffe_shop_template
        resultMap[Category.RESTAURANTS] = R.drawable.restaurant_template
        resultMap[Category.KID_FRIENDLY] = R.drawable.kid_friendly_template
        resultMap[Category.PARKS] = R.drawable.parks_template
        resultMap[Category.SHOPPING_CENTERS] = R.drawable.shooping_centers_template
        return resultMap
    }
}