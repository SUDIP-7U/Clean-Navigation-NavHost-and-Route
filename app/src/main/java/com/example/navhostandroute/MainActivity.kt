package com.example.navhostandroute

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {


        }
    }
}

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

@Composable
fun HomeScreen(onNavigateToCar: () -> Unit, onNavigateToToilet: () -> Unit) {
    Column {
        Text("🏠 Home Screen")
        Button(onClick = onNavigateToCar) { Text("Go to Car 🚗") }
        Button(onClick = onNavigateToToilet) { Text("Go to Toilet 🚻") }
    }
}

@Composable
fun CarScreen(onBack: () -> Unit) {
    Column {
        Text("🚗 Car Screen")
        Button(onClick = onBack) { Text("Back") }
    }
}

@Composable
fun ToiletScreen(onBack: () -> Unit) {
    Column {
        Text("🚻 Toilet Screen")
        Button(onClick = onBack) { Text("Back") }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun HomeScreenPreview() {
    HomeScreen(
        onNavigateToCar = {},
        onNavigateToToilet = {}
    )
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun CarScreenPreview() {
    CarScreen(onBack = {})
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun ToiletScreenPreview() {
    ToiletScreen(onBack = {})
}
