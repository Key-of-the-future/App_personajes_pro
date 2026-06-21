package com.example.apppersonajespro.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.foundation.Image
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import com.example.apppersonajespro.components.getDrawableId
import com.example.apppersonajespro.components.ChampionModelViewer
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.apppersonajespro.components.SkinCarousel
import com.example.apppersonajespro.components.StatBar
import com.example.apppersonajespro.data.ChampionsData

@Composable
fun ChampionDetailScreen(
    championId: Int,
    onBackClick: () -> Unit
) {

    val champion = ChampionsData.getChampionById(championId)

    var selectedSkin by remember {
        mutableIntStateOf(0)
    }

    val backgroundImage = getDrawableId(
        champion.splashImageName
    )

    Box(
        modifier = Modifier.fillMaxSize()
    ) {

        Image(
            painter = painterResource(id = backgroundImage),
            contentDescription = champion.name,
            contentScale = ContentScale.Crop,
            modifier = Modifier.fillMaxSize()
        )

        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(
                    Color.Black.copy(alpha = 0.45f)
                )
        )
        {

            // Flecha volver

            IconButton(
                onClick = onBackClick,
                modifier = Modifier
                    .align(Alignment.TopStart)
                    .size(52.dp)
                    .clip(CircleShape)
                    .background(Color.Black.copy(alpha = 0.35f))
            ) {
                Text(
                    text = "←",
                    color = Color.White,
                    fontSize = 28.sp
                )
            }

            // Columna izquierda

            Column(
                modifier = Modifier
                    .align(Alignment.CenterStart)
                    .width(330.dp)
                    .padding(start = 20.dp)
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

                StatBar(
                    label = "Damage",
                    value = champion.damage
                )

                Spacer(modifier = Modifier.height(12.dp))

                StatBar(
                    label = "Toughness",
                    value = champion.toughness
                )

                Spacer(modifier = Modifier.height(12.dp))

                StatBar(
                    label = "Utility",
                    value = champion.utility
                )

                Spacer(modifier = Modifier.height(12.dp))

                StatBar(
                    label = "Difficulty",
                    value = champion.difficulty
                )

                Spacer(modifier = Modifier.height(24.dp))

                Row(
                    horizontalArrangement = Arrangement.spacedBy(10.dp)
                ) {

                    repeat(5) {

                        Box(
                            modifier = Modifier
                                .size(52.dp)
                                .background(
                                    Color.White.copy(alpha = 0.1f),
                                    shape = CircleShape
                                ),
                            contentAlignment = Alignment.Center
                        ) {
                            Text(
                                text = "${it + 1}",
                                color = Color.White
                            )
                        }
                    }
                }
            }

            // Centro modelo

            Column(
                modifier = Modifier
                    .align(Alignment.CenterEnd)
                    .padding(end = 35.dp)
                    .offset(y = 90.dp),
            ) {

                Box(
                    modifier = Modifier
                        .size(
                            width = 550.dp,
                            height = 550.dp
                        ),
                    contentAlignment = Alignment.Center
                ) {
                    ChampionModelViewer(
                        modelPath = champion.skins[selectedSkin].modelPath,
                        modifier = Modifier.fillMaxSize()
                    )
                }

                Spacer(modifier = Modifier.height(20.dp))

                SkinCarousel(
                    skins = champion.skins,
                    selectedIndex = selectedSkin,
                    onSkinChange = {
                        selectedSkin = it
                    }
                )
            }

            // Botones derecha

            Column(
                modifier = Modifier
                    .align(Alignment.CenterEnd)
                    .padding(end = 18.dp),
                verticalArrangement = Arrangement.spacedBy(22.dp)
            ) {

                Text(
                    text = "📖",
                    fontSize = 28.sp
                )

                Text(
                    text = "📍",
                    fontSize = 28.sp
                )

                Text(
                    text = "☎",
                    fontSize = 28.sp
                )

                Text(
                    text = "↗",
                    fontSize = 28.sp
                )
            }

            // Flechas laterales

            Text(
                text = "‹",
                color = Color.White,
                fontSize = 42.sp,
                modifier = Modifier
                    .align(Alignment.CenterStart)
                    .padding(start = 360.dp)
            )

            Text(
                text = "›",
                color = Color.White,
                fontSize = 42.sp,
                modifier = Modifier
                    .align(Alignment.CenterEnd)
                    .padding(end = 90.dp)
            )
        }
    }
}