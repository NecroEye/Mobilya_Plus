package com.muratcangzm.mobilyaarti.navigation.destination

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.muratcangzm.mobilyaarti.presentation.screen.home.composables.HomeScreen
import com.muratcangzm.mobilyaarti.presentation.screen.productDetails.composables.ProductDetailsScreen
import com.muratcangzm.mobilyaarti.presentation.screen.products.composables.ProductsScreen


@Composable
fun NavDestination() {

    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = "home") {

        composable("home") {
            HomeScreen()
        }
        composable("products") {
            ProductsScreen(navController = navController)
        }
        composable("details") {
            ProductDetailsScreen(navController = navController)
        }

    }

}