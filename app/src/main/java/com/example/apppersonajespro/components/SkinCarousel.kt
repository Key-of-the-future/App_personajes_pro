package com.example.apppersonajespro.components

import androidx.compose.foundation.layout.*
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.example.apppersonajespro.data.Skin

@Composable
fun SkinCarousel(
    skins: List<Skin>,
    selectedIndex: Int,
    onSkinChange: (Int) -> Unit,
    modifier: Modifier = Modifier
) {
    Row(
        modifier = modifier.width(360.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Center
    ) {
        IconButton(
            onClick = {
                val newIndex = if (selectedIndex == 0) skins.lastIndex else selectedIndex - 1
                onSkinChange(newIndex)
            }
        ) {
            Text("‹", color = Color.White, fontWeight = FontWeight.Bold)
        }

        Text(
            text = skins[selectedIndex].name.uppercase(),
            color = Color(0xFFD7B45A),
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(horizontal = 18.dp)
        )

        IconButton(
            onClick = {
                val newIndex = if (selectedIndex == skins.lastIndex) 0 else selectedIndex + 1
                onSkinChange(newIndex)
            }
        ) {
            Text("›", color = Color.White, fontWeight = FontWeight.Bold)
        }
    }
}