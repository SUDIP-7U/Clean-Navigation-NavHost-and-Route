package com.example.navhostandroute.screen

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun HomeScreen(onNavigateToCar: () -> Unit, onNavigateToToilet: () -> Unit) {
    Column {
        Text("🏠 Home Screen")
        Button(onClick = onNavigateToCar) { Text("Go to Car 🚗") }
        Button(onClick = onNavigateToToilet) { Text("Go to Toilet 🚻") }
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