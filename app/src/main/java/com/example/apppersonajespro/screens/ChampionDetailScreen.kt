package com.example.apppersonajespro.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.apppersonajespro.data.ChampionsData

@Composable
fun ChampionDetailScreen(
    championId: Int,
    onBackClick: () -> Unit
) {
    val champion = ChampionsData.getChampionById(championId)

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(
                Brush.horizontalGradient(
                    listOf(
                        Color(0xFF06111D),
                        Color(0xFF12314A),
                        Color(0xFF06111D)
                    )
                )
            )
            .padding(20.dp)
    ) {
        IconButton(
            onClick = onBackClick,
            modifier = Modifier
                .align(Alignment.TopStart)
                .size(44.dp)
                .clip(CircleShape)
                .background(Color.Black.copy(alpha = 0.45f))
        ) {
            Text(
                text = "←",
                color = Color.White,
                fontSize = 28.sp
            )
        }

        Column(
            modifier = Modifier
                .align(Alignment.CenterStart)
                .width(330.dp)
                .padding(start = 16.dp)
        ) {
            Text(
                text = champion.name.uppercase(),
                color = Color.White,
                fontSize = 42.sp,
                fontWeight = FontWeight.Bold
            )

            Text(
                text = champion.subtitle,
                color = Color(0xFFD7B45A),
                fontSize = 18.sp
            )

            Spacer(modifier = Modifier.height(24.dp))

            Text("Daño: ${champion.damage}/10", color = Color.White)
            Text("Resistencia: ${champion.toughness}/10", color = Color.White)
            Text("Utilidad: ${champion.utility}/10", color = Color.White)
            Text("Dificultad: ${champion.difficulty}/10", color = Color.White)

            Spacer(modifier = Modifier.height(24.dp))

            Text(
                text = "Aquí irán las 5 habilidades",
                color = Color.White.copy(alpha = 0.8f)
            )
        }

        Box(
            modifier = Modifier
                .align(Alignment.Center)
                .size(width = 330.dp, height = 360.dp)
                .background(Color.White.copy(alpha = 0.08f)),
            contentAlignment = Alignment.Center
        ) {
            Text(
                text = "MODELO 3D",
                color = Color.White.copy(alpha = 0.7f),
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold
            )
        }

        Text(
            text = "📖\n\n📍\n\n☎\n\n↗",
            color = Color.White,
            fontSize = 28.sp,
            modifier = Modifier.align(Alignment.CenterEnd)
        )
    }
}