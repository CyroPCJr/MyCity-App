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
        description = R.string.place_description,
        rating = Random.nextInt(1, 10),
        image = R.drawable.coffe_shop_template
    )

    private val coffeeDataProvider: List<Places> = listOf(
        Places(
            id = 1,
            image = R.drawable.coffe_place_01,
            name = R.string.coffee_shop_01,
            description = R.string.place_description,
            rating = Random.nextInt(1, 10)
        ),
        Places(
            id = 2,
            image = R.drawable.coffe_place_02,
            name = R.string.coffee_shop_02,
            description = R.string.place_description,
            rating = Random.nextInt(1, 10)
        ),
        Places(
            id = 3,
            image = R.drawable.coffe_place_03,
            name = R.string.coffee_shop_03,
            description = R.string.place_description,
            rating = Random.nextInt(1, 10)
        ),
        Places(
            id = 4,
            image = R.drawable.coffe_place_04,
            name = R.string.coffee_shop_04,
            description = R.string.place_description,
            rating = Random.nextInt(1, 10)
        ),
        Places(
            id = 5,
            image = R.drawable.coffe_place_05,
            name = R.string.coffee_shop_05,
            description = R.string.place_description,
            rating = Random.nextInt(1, 10)
        ),
        Places(
            id = 6,
            image = R.drawable.coffe_place_06,
            name = R.string.coffee_shop_06,
            description = R.string.place_description,
            rating = Random.nextInt(1, 10)
        ),
        Places(
            id = 7,
            image = R.drawable.coffe_place_07,
            name = R.string.coffee_shop_07,
            description = R.string.place_description,
            rating = Random.nextInt(1, 10)
        ),
        Places(
            id = 8,
            image = R.drawable.coffe_place_08,
            name = R.string.coffee_shop_08,
            description = R.string.place_description,
            rating = Random.nextInt(1, 10)
        ),
    )
    private val restaurantDataProvider: List<Places> = listOf(
        Places(
            id = 1,
            image = -1,
            name = R.string.restaurant_01,
            description = R.string.place_description,
            rating = Random.nextInt(1, 10)
        ),
        Places(
            id = 2,
            image = -1,
            name = R.string.restaurant_02,
            description = R.string.place_description,
            rating = Random.nextInt(1, 10)
        ),
        Places(
            id = 3,
            image = -1,
            name = R.string.restaurant_03,
            description = R.string.place_description,
            rating = Random.nextInt(1, 10)
        ),
        Places(
            id = 4,
            image = -1,
            name = R.string.restaurant_04,
            description = R.string.place_description,
            rating = Random.nextInt(1, 10)
        ),
        Places(
            id = 5,
            image = -1,
            name = R.string.restaurant_05,
            description = R.string.place_description,
            rating = Random.nextInt(1, 10)
        ),
        Places(
            id = 6,
            image = -1,
            name = R.string.restaurant_06,
            description = R.string.place_description,
            rating = Random.nextInt(1, 10)
        ),
        Places(
            id = 7,
            image = -1,
            name = R.string.restaurant_07,
            description = R.string.place_description,
            rating = Random.nextInt(1, 10)
        ),
        Places(
            id = 8,
            image = -1,
            name = R.string.restaurant_08,
            description = R.string.place_description,
            rating = Random.nextInt(1, 10)
        ),
    )
    val kidFriendlyDataProvider: List<Places> = listOf()

    fun loadUIPlaces(): Map<Category, List<Places>> {
        val resultMap = mutableMapOf<Category, List<Places>>()
        resultMap[Category.COFFEE_SHOPS] = coffeeDataProvider
        resultMap[Category.RESTAURANTS] = restaurantDataProvider
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