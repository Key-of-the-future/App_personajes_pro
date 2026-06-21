package com.example.apppersonajespro.components

import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext

@Composable
fun getDrawableId(
    imageName: String
): Int {

    val context = LocalContext.current

    return context.resources.getIdentifier(
        imageName,
        "drawable",
        context.packageName
    )
}