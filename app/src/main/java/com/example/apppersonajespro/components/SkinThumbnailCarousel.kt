package com.example.apppersonajespro.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.apppersonajespro.data.Skin

@Composable
fun SkinThumbnailCarousel(
    skins: List<Skin>,
    selectedIndex: Int,
    onSkinClick: (Int) -> Unit,
    modifier: Modifier = Modifier
) {
    Row(
        modifier = modifier,
        horizontalArrangement = Arrangement.spacedBy(10.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        skins.forEachIndexed { index, skin ->
            val imageRes = getDrawableId(skin.backgroundName)

            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier.clickable { onSkinClick(index) }
            ) {
                Image(
                    painter = painterResource(id = imageRes),
                    contentDescription = skin.name,
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .size(width = 88.dp, height = 54.dp)
                        .border(
                            width = if (index == selectedIndex) 2.dp else 1.dp,
                            color = if (index == selectedIndex) Color(0xFFD7B45A) else Color.White.copy(alpha = 0.35f),
                            shape = RoundedCornerShape(4.dp)
                        )
                )

                Text(
                    text = skin.name,
                    color = Color.White,
                    fontSize = 10.sp,
                    maxLines = 1
                )
            }
        }
    }
}