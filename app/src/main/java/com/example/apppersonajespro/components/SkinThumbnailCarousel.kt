package com.example.apppersonajespro.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.gestures.detectHorizontalDragGestures
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.animation.core.animateDpAsState
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.zIndex
import com.example.apppersonajespro.data.Skin

@Composable
fun SkinThumbnailCarousel(
    skins: List<Skin>,
    selectedIndex: Int,
    onSkinClick: (Int) -> Unit,
    modifier: Modifier = Modifier
) {
    Box(
        modifier = modifier
            .width(230.dp)
            .height(70.dp)
            .pointerInput(selectedIndex) {
                var totalDrag = 0f

                detectHorizontalDragGestures(
                    onDragStart = {
                        totalDrag = 0f
                    },
                    onHorizontalDrag = { _, dragAmount ->
                        totalDrag += dragAmount
                    },
                    onDragEnd = {
                        if (totalDrag < -40f) {
                            val next = if (selectedIndex == skins.lastIndex) 0 else selectedIndex + 1
                            onSkinClick(next)
                        } else if (totalDrag > 40f) {
                            val previous = if (selectedIndex == 0) skins.lastIndex else selectedIndex - 1
                            onSkinClick(previous)
                        }
                    }
                )
            },
        contentAlignment = Alignment.Center
    ) {
        skins.forEachIndexed { index, skin ->
            val imageRes = getDrawableId(skin.backgroundName)
            val isSelected = index == selectedIndex

            val offsetTarget = when (index) {
                selectedIndex -> 0.dp
                (selectedIndex + 1) % skins.size -> 58.dp
                else -> (-58).dp
            }

            val widthTarget = if (isSelected) 105.dp else 82.dp
            val heightTarget = if (isSelected) 58.dp else 46.dp
            val alphaTarget = if (isSelected) 1f else 0.58f

            val animatedOffset by animateDpAsState(targetValue = offsetTarget, label = "skinOffset")
            val animatedWidth by animateDpAsState(targetValue = widthTarget, label = "skinWidth")
            val animatedHeight by animateDpAsState(targetValue = heightTarget, label = "skinHeight")
            val animatedAlpha by animateFloatAsState(targetValue = alphaTarget, label = "skinAlpha")

            Box(
                modifier = Modifier
                    .offset(x = animatedOffset)
                    .zIndex(if (isSelected) 10f else 1f)
                    .size(width = animatedWidth, height = animatedHeight)
                    .shadow(
                        elevation = if (isSelected) 10.dp else 3.dp,
                        shape = RoundedCornerShape(4.dp)
                    )
                    .border(
                        width = if (isSelected) 2.dp else 1.dp,
                        color = if (isSelected) Color(0xFFD7B45A) else Color.White.copy(alpha = 0.25f),
                        shape = RoundedCornerShape(4.dp)
                    )
                    .background(Color.Black.copy(alpha = 0.4f))
            ) {
                Image(
                    painter = painterResource(id = imageRes),
                    contentDescription = skin.name,
                    contentScale = ContentScale.Crop,
                    alpha = animatedAlpha,
                    modifier = Modifier.fillMaxSize()
                )
            }
        }
    }
}