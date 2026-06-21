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
import com.example.apppersonajespro.components.SkinThumbnailCarousel
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.foundation.Image
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import com.example.apppersonajespro.components.getDrawableId
import androidx.compose.foundation.clickable
import androidx.compose.foundation.shape.RoundedCornerShape
import com.example.apppersonajespro.components.ChampionModelViewer
import androidx.compose.ui.platform.LocalContext
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.DisposableEffect
import androidx.compose.ui.platform.LocalContext
import com.example.apppersonajespro.utils.SoundPlayer
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.apppersonajespro.components.StatBar
import com.example.apppersonajespro.data.ChampionsData

@Composable
fun ChampionDetailScreen(
    championId: Int,
    onBackClick: () -> Unit
) {

    var currentChampionId by remember {
        mutableIntStateOf(championId)
    }

    var selectedSkin by remember {
        mutableIntStateOf(0)
    }

    var selectedForm by remember {
        mutableIntStateOf(0)
    }

    val champion = ChampionsData.getChampionById(currentChampionId)

    val context = LocalContext.current

    val currentVoicePath = champion
        .skins[selectedSkin]
        .forms[selectedForm]
        .voicePath

    LaunchedEffect(currentVoicePath) {
        SoundPlayer.playFromAssets(context, currentVoicePath)
    }

    DisposableEffect(Unit) {
        onDispose {
            SoundPlayer.stop()
        }
    }

    val backgroundImage = getDrawableId(
        champion.skins[selectedSkin].backgroundName
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
                    .width(300.dp)
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

                Row(
                    horizontalArrangement = Arrangement.spacedBy(14.dp),
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Column(
                        modifier = Modifier.weight(1f),
                        verticalArrangement = Arrangement.spacedBy(10.dp)
                    ) {
                        StatBar("Damage", champion.damage)
                        StatBar("Utility", champion.utility)
                    }

                    Column(
                        modifier = Modifier.weight(1f),
                        verticalArrangement = Arrangement.spacedBy(10.dp)
                    ) {
                        StatBar("Toughness", champion.toughness)
                        StatBar("Difficulty", champion.difficulty)
                    }
                }

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

                Spacer(modifier = Modifier.height(16.dp))

                SkinThumbnailCarousel(
                    skins = champion.skins,
                    selectedIndex = selectedSkin,
                    onSkinClick = {
                        selectedSkin = it
                        selectedForm = 0
                    },
                    modifier = Modifier.fillMaxWidth()
                )

                if (champion.skins[selectedSkin].forms.size > 1) {
                    Spacer(modifier = Modifier.height(10.dp))

                    Row(
                        horizontalArrangement = Arrangement.spacedBy(8.dp)
                    ) {
                        champion.skins[selectedSkin].forms.forEachIndexed { index, form ->
                            Text(
                                text = form.name,
                                color = if (selectedForm == index) Color(0xFFD7B45A) else Color.White,
                                fontSize = 12.sp,
                                fontWeight = FontWeight.Bold,
                                modifier = Modifier
                                    .background(
                                        Color.Black.copy(alpha = 0.45f),
                                        shape = RoundedCornerShape(6.dp)
                                    )
                                    .clickable {
                                        selectedForm = index
                                    }
                                    .padding(horizontal = 10.dp, vertical = 6.dp)
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
                        modelPath = champion.skins[selectedSkin].forms[selectedForm].modelPath,
                        modifier = Modifier.fillMaxSize()
                    )
                }
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

            // Flecha izquierda: campeón anterior
            IconButton(
                onClick = {
                    currentChampionId =
                        if (currentChampionId == 1) ChampionsData.champions.size
                        else currentChampionId - 1

                    selectedForm = 0
                },
                modifier = Modifier
                    .align(Alignment.CenterStart)
                    .padding(start = 360.dp)
            ) {
                Text(
                    text = "‹",
                    color = Color.White,
                    fontSize = 42.sp
                )
            }

         // Flecha derecha: siguiente campeón
            IconButton(
                onClick = {
                    currentChampionId =
                        if (currentChampionId == ChampionsData.champions.size) 1
                        else currentChampionId + 1

                    selectedForm = 0
                },
                modifier = Modifier
                    .align(Alignment.CenterEnd)
                    .padding(end = 90.dp)
            ) {
                Text(
                    text = "›",
                    color = Color.White,
                    fontSize = 42.sp
                )
            }
        }
    }
}