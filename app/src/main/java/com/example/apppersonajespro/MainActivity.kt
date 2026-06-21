package com.example.apppersonajespro

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.MaterialTheme
import com.example.apppersonajespro.navigation.AppNavigation
import com.example.apppersonajespro.ui.theme.AppTypography

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            MaterialTheme(
                typography = AppTypography
            ) {
                AppNavigation()
            }
        }
    }
}