package com.example.navhostandroute.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.navhostandroute.screen.CarScreen
import com.example.navhostandroute.screen.HomeScreen
import com.example.navhostandroute.screen.ToiletScreen

@Composable
fun AppNavHost(navController: NavHostController) {

    NavHost(
        navController = navController,
        startDestination = "home"
    ) {
        composable("home") {
            HomeScreen(
                onNavigateToCar = { navController.navigate("car") },
                onNavigateToToilet = { navController.navigate("toilet") }
            )
        }
        composable("car") {
            CarScreen(onBack = { navController.popBackStack() })
        }
        composable("toilet") {
            ToiletScreen(onBack = { navController.popBackStack() })
        }
    }
}