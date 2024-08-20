package com.example.mycityapp.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.mycityapp.data.LocalPlacesDataProvider
import com.example.mycityapp.model.Category
import com.example.mycityapp.model.Places
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.stateIn
import kotlinx.coroutines.flow.update

class CityPlaceViewModel : ViewModel() {

    private val _uiState = MutableStateFlow(PlacesUIStates())
    val uiState: StateFlow<PlacesUIStates> = _uiState.asStateFlow()

//    val uiState: StateFlow<PlacesUIStates> = flow {
//        emit(
//            PlacesUIStates(
//                placesMap = LocalPlacesDataProvider.loadUIPlaces(),
//                categoryUI = LocalPlacesDataProvider.loadCategoryUI()
//            )
//        )
//    }.stateIn(viewModelScope, SharingStarted.WhileSubscribed(5000), PlacesUIStates())

    init {
        _uiState.update { placesUIStates ->
            placesUIStates.copy(
                placesMap = LocalPlacesDataProvider.loadUIPlaces(),
                categoryUI = LocalPlacesDataProvider.loadCategoryUI()
            )
        }

    }

    fun currentCategory() : Category {
        return _uiState.value.currentCategory
    }

    fun currentPlace() : Places {
        return _uiState.value.currentPlaces
    }

    fun loadPlacesUIbyCategory(): List<Places> {
        val map = _uiState.value.placesMap[currentCategory()]
        return map!!
    }

    fun loadPlacesUIbyCategory(category: Category): List<Places> {
        val map = _uiState.value.placesMap[category]
        return map!!
    }


    fun updateCurrentPlace(places: Places) {
        _uiState.update {
            it.copy(currentPlaces = places)
        }
    }

    fun updateCurrentCategory(category: Category) {
        _uiState.update {
            it.copy(currentCategory = category)
        }
    }

    fun navigateToListPlaces() {
        _uiState.update {
            it.copy(isShowingListPlaces = true)
        }
    }

    fun navigateToListCategory() {
        _uiState.update {
            it.copy(isShowingListPlaces = false)
        }
    }

}

data class PlacesUIStates(
    val placesMap: Map<Category, List<Places>> = emptyMap(),
    val categoryUI: Map<Category, Int> = emptyMap(),
    val currentCategory: Category = Category.COFFEE_SHOPS,
    val currentPlaces: Places = LocalPlacesDataProvider.defaultPlace,
    val isShowingListPlaces: Boolean = false,
)