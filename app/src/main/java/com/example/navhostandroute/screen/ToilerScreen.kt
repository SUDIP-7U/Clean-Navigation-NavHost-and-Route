package com.example.navhostandroute.screen

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun ToiletScreen(onBack: () -> Unit) {
    Column {
        Text("🚻 Toilet Screen")
        Button(onClick = onBack) { Text("Back") }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun ToiletScreenPreview() {
    ToiletScreen(onBack = {})
}
