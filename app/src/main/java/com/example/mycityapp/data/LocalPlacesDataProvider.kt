package com.example.mycityapp.data

import com.example.mycityapp.R
import com.example.mycityapp.model.Category
import com.example.mycityapp.model.Places
import kotlin.random.Random

/*
COFFEE_SHOPS(title = R.string.category_coffee),
RESTAURANTS(title = R.string.category_restaurants),
KID_FRIENDLY(title = R.string.category_kid_friendly),
PARKS(title = R.string.category_parks),
SHOPPING_CENTERS(title = R.string.category_shopping_centers),

*/

object LocalPlacesDataProvider {

    val defaultPlace: Places = Places(
        id = 1,
        name = R.string.coffee_shop_01,
        description = R.string.place_description_default,
        rating = Random.nextInt(1, 10),
        image = R.drawable.coffe_shop_template
    )

    private val coffeeDataProvider: List<Places> = listOf(
        Places(
            id = 1,
            image = R.drawable.coffe_place_01,
            name = R.string.coffee_shop_01,
            description = R.string.coffee_shop_descr_01,
            rating = Random.nextInt(1, 10)
        ),
        Places(
            id = 2,
            image = R.drawable.coffe_place_02,
            name = R.string.coffee_shop_02,
            description = R.string.coffee_shop_descr_02,
            rating = Random.nextInt(1, 10)
        ),
        Places(
            id = 3,
            image = R.drawable.coffe_place_03,
            name = R.string.coffee_shop_03,
            description = R.string.coffee_shop_descr_03,
            rating = Random.nextInt(1, 10)
        ),
        Places(
            id = 4,
            image = R.drawable.coffe_place_04,
            name = R.string.coffee_shop_04,
            description = R.string.coffee_shop_descr_04,
            rating = Random.nextInt(1, 10)
        ),
        Places(
            id = 5,
            image = R.drawable.coffe_place_05,
            name = R.string.coffee_shop_05,
            description = R.string.coffee_shop_descr_05,
            rating = Random.nextInt(1, 10)
        ),
        Places(
            id = 6,
            image = R.drawable.coffe_place_06,
            name = R.string.coffee_shop_06,
            description = R.string.coffee_shop_descr_06,
            rating = Random.nextInt(1, 10)
        ),
        Places(
            id = 7,
            image = R.drawable.coffe_place_07,
            name = R.string.coffee_shop_07,
            description = R.string.coffee_shop_descr_07,
            rating = Random.nextInt(1, 10)
        ),
        Places(
            id = 8,
            image = R.drawable.coffe_place_08,
            name = R.string.coffee_shop_08,
            description = R.string.coffee_shop_descr_08,
            rating = Random.nextInt(1, 10)
        ),
    )
    private val restaurantDataProvider: List<Places> = listOf(
        Places(
            id = 1,
            image = R.drawable.restaurant_place_01,
            name = R.string.restaurant_01,
            description = R.string.restaurant_descr_01,
            rating = Random.nextInt(1, 10)
        ),
        Places(
            id = 2,
            image = R.drawable.restaurant_place_02,
            name = R.string.restaurant_02,
            description = R.string.restaurant_descr_02,
            rating = Random.nextInt(1, 10)
        ),
        Places(
            id = 3,
            image = R.drawable.restaurant_place_03,
            name = R.string.restaurant_03,
            description = R.string.restaurant_descr_03,
            rating = Random.nextInt(1, 10)
        ),
        Places(
            id = 4,
            image = R.drawable.restaurant_place_04,
            name = R.string.restaurant_04,
            description = R.string.restaurant_descr_04,
            rating = Random.nextInt(1, 10)
        ),
        Places(
            id = 5,
            image = R.drawable.restaurant_place_05,
            name = R.string.restaurant_05,
            description = R.string.restaurant_descr_05,
            rating = Random.nextInt(1, 10)
        ),
        Places(
            id = 6,
            image = R.drawable.restaurant_place_06,
            name = R.string.restaurant_06,
            description = R.string.restaurant_descr_06,
            rating = Random.nextInt(1, 10)
        ),
        Places(
            id = 7,
            image = R.drawable.restaurant_place_07,
            name = R.string.restaurant_07,
            description = R.string.restaurant_descr_07,
            rating = Random.nextInt(1, 10)
        ),
        Places(
            id = 8,
            image = R.drawable.restaurant_place_08,
            name = R.string.restaurant_08,
            description = R.string.restaurant_descr_08,
            rating = Random.nextInt(1, 10)
        ),
    )
    private val kidFriendlyDataProvider: List<Places> = listOf(
        Places(
            id = 1,
            image = R.drawable.kid_friendly_place_01,
            name = R.string.kid_places_01,
            description = R.string.kid_place_descr_01,
            rating = Random.nextInt(1, 10)
        ),
        Places(
            id = 2,
            image = R.drawable.kid_friendly_place_02,
            name = R.string.kid_places_02,
            description = R.string.kid_place_descr_02,
            rating = Random.nextInt(1, 10)
        ),
        Places(
            id = 3,
            image = R.drawable.kid_friendly_place_03,
            name = R.string.kid_places_03,
            description = R.string.restaurant_descr_03,
            rating = Random.nextInt(1, 10)
        ),
        Places(
            id = 4,
            image = R.drawable.kid_friendly_place_04,
            name = R.string.kid_places_04,
            description = R.string.restaurant_descr_04,
            rating = Random.nextInt(1, 10)
        ),
        Places(
            id = 5,
            image = R.drawable.kid_friendly_place_05,
            name = R.string.kid_places_05,
            description = R.string.restaurant_descr_05,
            rating = Random.nextInt(1, 10)
        ),
        Places(
            id = 6,
            image = R.drawable.kid_friendly_place_06,
            name = R.string.kid_places_06,
            description = R.string.restaurant_descr_06,
            rating = Random.nextInt(1, 10)
        ),
        Places(
            id = 7,
            image = R.drawable.kid_friendly_place_07,
            name = R.string.kid_places_07,
            description = R.string.restaurant_descr_07,
            rating = Random.nextInt(1, 10)
        ),
        Places(
            id = 8,
            image = R.drawable.kid_friendly_place_08,
            name = R.string.kid_places_08,
            description = R.string.restaurant_descr_08,
            rating = Random.nextInt(1, 10)
        ),
    )

    fun loadUIPlaces(): Map<Category, List<Places>> {
        val resultMap = mutableMapOf<Category, List<Places>>()
        resultMap[Category.COFFEE_SHOPS] = coffeeDataProvider
        resultMap[Category.RESTAURANTS] = restaurantDataProvider
        resultMap[Category.KID_FRIENDLY] = kidFriendlyDataProvider
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

    fun getPlacesById(placeId: Long): Places {
        return coffeeDataProvider.firstOrNull { it.id == placeId }
            ?: coffeeDataProvider.first()
    }
}