package com.example.mycityapp.view

import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.material3.windowsizeclass.WindowWidthSizeClass
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.example.mycityapp.R
import com.example.mycityapp.model.MyCityScreen
import com.example.mycityapp.viewmodel.CityPlaceViewModel

@Composable
fun MyCityApp(
    windowSize: WindowWidthSizeClass,
    modifier: Modifier = Modifier,
    navController: NavHostController = rememberNavController(),
) {
    val viewModel: CityPlaceViewModel = viewModel()
    val cityPlaceViewModel = viewModel.uiState.collectAsState().value

    val backStackEntry by navController.currentBackStackEntryAsState()
    val currentScreen =
        MyCityScreen.valueOf(backStackEntry?.destination?.route ?: MyCityScreen.CATEGORY_LIST.name)

    var isExpanded: Boolean = false

    when (windowSize) {
        WindowWidthSizeClass.Compact,
        WindowWidthSizeClass.Medium,
        -> isExpanded = false

        WindowWidthSizeClass.Expanded -> isExpanded = true
    }

    Scaffold(
        topBar = {
            MyCityTopBar(currentScreen = currentScreen,
                canNavigateBack = navController.previousBackStackEntry != null,
                navigateUp = { navController.navigateUp() }
            )
        }
    ) { innerPadding ->

        // Navigation host
        NavHost(
            navController = navController,
            startDestination = MyCityScreen.CATEGORY_LIST.name,
            modifier = modifier.padding(innerPadding)
        ) {
            composable(route = MyCityScreen.CATEGORY_LIST.name) {
                StartScreenView(cityUIStates = cityPlaceViewModel, {
                    viewModel.updateCurrentCategory(it)
                    navController.navigate(MyCityScreen.PLACE_LIST.name)
                })
            }

            composable(route = MyCityScreen.PLACE_LIST.name) {
                if (!isExpanded) {
                    PlaceDisplayList(
                        viewModel = viewModel,
                        onClickItem = {
                            viewModel.updateCurrentPlace(it)
                            navController.navigate(MyCityScreen.PLACE_DETAIL.name)
                        })
                } else {
                    ListPlaceWithDetailsExpanded(
                        viewModel = viewModel,
                        onClickItem = { viewModel.updateCurrentPlace(it) })
                }
            }

            composable(route = MyCityScreen.PLACE_DETAIL.name) {
                PlaceDetail(places = viewModel.currentPlace())
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MyCityTopBar(
    currentScreen: MyCityScreen,
    canNavigateBack: Boolean,
    navigateUp: () -> Unit,
    modifier: Modifier = Modifier,
) {
    CenterAlignedTopAppBar(title = { Text(stringResource(id = currentScreen.title)) },
        colors = TopAppBarDefaults.mediumTopAppBarColors(
            containerColor = MaterialTheme.colorScheme.primaryContainer
        ),
        modifier = modifier,
        navigationIcon = {
            if (canNavigateBack) {
                IconButton(onClick = navigateUp) {
                    Icon(
                        imageVector = Icons.AutoMirrored.Filled.ArrowBack,
                        contentDescription = stringResource(R.string.btn_back)
                    )
                }
            }
        })
}
