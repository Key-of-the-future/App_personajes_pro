package com.example.apppersonajespro.components

import androidx.compose.animation.core.animateDpAsState
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.gestures.detectHorizontalDragGestures
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.*
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
import kotlin.math.abs

@Composable
fun SkinThumbnailCarousel(
    skins: List<Skin>,
    selectedIndex: Int,
    onSkinClick: (Int) -> Unit,
    modifier: Modifier = Modifier
) {
    var dragOffset by remember { mutableFloatStateOf(0f) }

    Box(
        modifier = modifier
            .width(230.dp)
            .height(70.dp)
            .pointerInput(selectedIndex) {
                detectHorizontalDragGestures(
                    onDragStart = {
                        dragOffset = 0f
                    },
                    onHorizontalDrag = { _, dragAmount ->
                        dragOffset += dragAmount
                    },
                    onDragEnd = {
                        if (dragOffset < -45f) {
                            val next = if (selectedIndex == skins.lastIndex) 0 else selectedIndex + 1
                            onSkinClick(next)
                        } else if (dragOffset > 45f) {
                            val previous = if (selectedIndex == 0) skins.lastIndex else selectedIndex - 1
                            onSkinClick(previous)
                        }
                        dragOffset = 0f
                    },
                    onDragCancel = {
                        dragOffset = 0f
                    }
                )
            },
        contentAlignment = Alignment.Center
    ) {
        skins.forEachIndexed { index, skin ->
            val imageRes = getDrawableId(skin.backgroundName)
            val isSelected = index == selectedIndex

            val baseOffset = when (index) {
                selectedIndex -> 0.dp
                (selectedIndex + 1) % skins.size -> 58.dp
                else -> (-58).dp
            }

            val dragDp = (dragOffset * 0.35f).dp
            val targetOffset = baseOffset + dragDp

            val targetWidth = if (isSelected) 105.dp else 82.dp
            val targetHeight = if (isSelected) 58.dp else 46.dp
            val targetAlpha = if (isSelected) 1f else 0.55f

            val animatedOffset by animateDpAsState(targetOffset, label = "skinOffset")
            val animatedWidth by animateDpAsState(targetWidth, label = "skinWidth")
            val animatedHeight by animateDpAsState(targetHeight, label = "skinHeight")
            val animatedAlpha by animateFloatAsState(targetAlpha, label = "skinAlpha")

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