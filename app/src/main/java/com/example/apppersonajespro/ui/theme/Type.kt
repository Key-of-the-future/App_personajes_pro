package com.example.apppersonajespro.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import com.example.apppersonajespro.R

val LolFont = FontFamily(
    Font(R.font.lolcito)
)

val AppTypography = Typography().run {
    copy(
        displayLarge = displayLarge.copy(fontFamily = LolFont),
        displayMedium = displayMedium.copy(fontFamily = LolFont),
        displaySmall = displaySmall.copy(fontFamily = LolFont),
        headlineLarge = headlineLarge.copy(fontFamily = LolFont),
        headlineMedium = headlineMedium.copy(fontFamily = LolFont),
        headlineSmall = headlineSmall.copy(fontFamily = LolFont),
        titleLarge = titleLarge.copy(fontFamily = LolFont),
        titleMedium = titleMedium.copy(fontFamily = LolFont),
        titleSmall = titleSmall.copy(fontFamily = LolFont),
        bodyLarge = bodyLarge.copy(fontFamily = LolFont),
        bodyMedium = bodyMedium.copy(fontFamily = LolFont),
        bodySmall = bodySmall.copy(fontFamily = LolFont),
        labelLarge = labelLarge.copy(fontFamily = LolFont),
        labelMedium = labelMedium.copy(fontFamily = LolFont),
        labelSmall = labelSmall.copy(fontFamily = LolFont)
    )
}