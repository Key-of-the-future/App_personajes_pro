package com.example.apppersonajespro.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import com.example.apppersonajespro.components.SkinThumbnailCarousel
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Call
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.Icon
import androidx.compose.foundation.Image
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import com.example.apppersonajespro.components.getDrawableId
import androidx.compose.foundation.clickable
import androidx.compose.foundation.shape.RoundedCornerShape
import com.example.apppersonajespro.components.ChampionModelViewer
import androidx.compose.ui.platform.LocalContext
import androidx.compose.foundation.border
import androidx.compose.runtime.LaunchedEffect
import android.content.Context
import android.content.Intent
import android.graphics.BitmapFactory
import android.net.Uri
import androidx.core.content.FileProvider
import java.io.File
import java.io.FileOutputStream
import androidx.compose.runtime.DisposableEffect
import com.example.apppersonajespro.utils.MusicPlayer
import com.example.apppersonajespro.utils.SoundPlayer
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
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

    var showLore by remember {
        mutableStateOf(false)
    }

    var selectedSkill by remember {
        mutableStateOf<com.example.apppersonajespro.data.Skill?>(null)
    }

    val champion = ChampionsData.getChampionById(currentChampionId)

    val context = LocalContext.current

    val currentMusicPath =
        champion.skins[selectedSkin].musicPath

    val currentVoicePath = champion
        .skins[selectedSkin]
        .forms[selectedForm]
        .voicePath

    LaunchedEffect(currentVoicePath) {
        SoundPlayer.playFromAssets(context, currentVoicePath)
    }

    LaunchedEffect(currentMusicPath) {

        MusicPlayer.play(
            context,
            currentMusicPath
        )
    }

    DisposableEffect(Unit) {
        onDispose {
            SoundPlayer.stop()
            MusicPlayer.stop()
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
                    .width(295.dp)
                    .padding(start = 64.dp)
            ) {

                Text(
                    text = champion.name.uppercase(),
                    color = Color.White,
                    fontSize = 33.sp,
                    fontWeight = FontWeight.Bold
                )

                Text(
                    text = champion.skins[selectedSkin].name,
                    color = Color(0xFFD7B45A),
                    fontSize = 15.sp
                )

                Spacer(modifier = Modifier.height(1.dp))

                Row(
                    horizontalArrangement = Arrangement.spacedBy(14.dp),
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Column(
                        modifier = Modifier.weight(0.05f),
                        verticalArrangement = Arrangement.spacedBy(1.dp)
                    ) {
                        StatBar("Damage", champion.damage)
                        StatBar("Utility", champion.utility)
                    }

                    Column(
                        modifier = Modifier.weight(0.05f),
                        verticalArrangement = Arrangement.spacedBy(1.dp),
                    ) {
                        StatBar("Toughness", champion.toughness)
                        StatBar("Difficulty", champion.difficulty)
                    }
                }

                Spacer(modifier = Modifier.height(15.dp))

                Row(
                    horizontalArrangement = Arrangement.spacedBy(12.dp)
                ) {

                    champion.skins[selectedSkin].forms[selectedForm].skills.forEach { skill ->

                        val skillImage = getDrawableId(skill.iconName)

                        Image(
                            painter = painterResource(skillImage),
                            contentDescription = skill.name,
                            modifier = Modifier
                                .size(36.dp)
                                .clip(RoundedCornerShape(6.dp))
                                .border(
                                    width = 1.dp,
                                    color = Color(0xFFD7B45A).copy(alpha = 0.85f),
                                    shape = RoundedCornerShape(6.dp)
                                )
                                .background(Color.Black.copy(alpha = 0.35f))
                                .clickable {
                                    selectedSkill = skill
                                },
                            contentScale = ContentScale.Crop
                        )
                    }
                }

                Spacer(modifier = Modifier.height(58.dp))

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
                            width = 480.dp,
                            height = 600.dp
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
                    .align(Alignment.TopEnd)
                    .padding(
                        top = 50.dp,
                        end = 22.dp),
                verticalArrangement = Arrangement.spacedBy(25.dp)
            ) {
                IconButton(
                    onClick = {
                        showLore = true
                    },
                    modifier = Modifier.size(20.dp)
                ) {
                    Icon(
                        Icons.Default.Info,
                        contentDescription = "Lore",
                        tint = Color(0xFFD7B45A),
                        modifier = Modifier.size(20.dp)
                    )
                }

                IconButton(
                    onClick = {
                        openChampionLocation(context, champion.region)
                    },
                    modifier = Modifier.size(20.dp)
                ) {
                    Icon(
                        Icons.Default.LocationOn,
                        contentDescription = "Ubicacion",
                        tint = Color(0xFFD7B45A),
                        modifier = Modifier.size(20.dp)
                    )
                }

                IconButton(
                    onClick = {
                        callChampion(context, champion.phone)
                    },
                    modifier = Modifier.size(20.dp)
                ) {
                    Icon(
                        Icons.Default.Call,
                        contentDescription = "Llamar",
                        tint = Color(0xFFD7B45A),
                        modifier = Modifier.size(20.dp)
                    )
                }

                IconButton(
                    onClick = {
                        shareChampion(
                            context = context,
                            imageRes = backgroundImage,
                            championName = champion.name,
                            skinName = champion.skins[selectedSkin].name
                        )
                    },
                    modifier = Modifier.size(20.dp)
                ) {
                    Icon(
                        Icons.Default.Share,
                        contentDescription = "Compartir",
                        tint = Color(0xFFD7B45A),
                        modifier = Modifier.size(20.dp)
                    )
                }
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
                    .align(Alignment.BottomStart)
                    .padding(
                        bottom = 135.dp,
                        start = 12.dp)
            ) {
                Text(
                    text = "‹",
                    color = Color.Yellow,
                    fontSize = 44.sp
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
                    .align(Alignment.BottomEnd)
                    .padding(
                        bottom = 135.dp,
                        end = 12.dp)
            ) {
                Text(
                    text = "›",
                    color = Color.Yellow,
                    fontSize = 44.sp
                )
            }

            if (selectedSkill != null) {
                androidx.compose.material3.AlertDialog(
                    modifier = Modifier.fillMaxWidth(0.82f),
                    onDismissRequest = {
                        selectedSkill = null
                    },
                    containerColor = Color(0xCC07121C),
                    title = {
                        Text(
                            text = selectedSkill!!.name.uppercase(),
                            color = Color(0xFFD7B45A),
                            fontSize = 18.sp,
                            fontWeight = FontWeight.Bold
                        )
                    },
                    text = {
                        Column(
                            modifier = Modifier
                                .heightIn(max = 360.dp)
                                .verticalScroll(rememberScrollState()),
                            horizontalAlignment = Alignment.CenterHorizontally
                        ) {
                            val skillImage = getDrawableId(selectedSkill!!.iconName)

                            Image(
                                painter = painterResource(id = skillImage),
                                contentDescription = selectedSkill!!.name,
                                modifier = Modifier
                                    .size(90.dp)
                                    .clip(RoundedCornerShape(12.dp)),
                                contentScale = ContentScale.Crop
                            )

                            Spacer(modifier = Modifier.height(16.dp))

                            Text(
                                text = selectedSkill!!.description,
                                color = Color.White,
                                fontSize = 13.sp
                            )
                        }
                    },
                    confirmButton = {
                        Text(
                            text = "Cerrar",
                            color = Color(0xFFD7B45A),
                            fontWeight = FontWeight.Bold,
                            modifier = Modifier
                                .clickable {
                                    selectedSkill = null
                                }
                                .padding(12.dp)
                        )
                    }
                )
            }

            if (showLore) {
                androidx.compose.material3.AlertDialog(
                    modifier = Modifier.fillMaxWidth(0.82f),
                    onDismissRequest = {
                        showLore = false
                    },
                    containerColor = Color(0xCC07121C),
                    title = {
                        Text(
                            text = champion.skins[selectedSkin].name.uppercase(),
                            color = Color(0xFFD7B45A),
                            fontSize = 18.sp,
                            fontWeight = FontWeight.Bold
                        )
                    },
                    text = {
                        Text(
                            text = champion.skins[selectedSkin].lore,
                            color = Color.White,
                            fontSize = 13.sp
                        )
                    },
                    confirmButton = {
                        Text(
                            text = "Cerrar",
                            color = Color(0xFFD7B45A),
                            fontWeight = FontWeight.Bold,
                            modifier = Modifier
                                .clickable {
                                    showLore = false
                                }
                                .padding(12.dp)
                        )
                    }
                )
            }
        }
    }
}

private fun callChampion(context: Context, phone: String) {
    val intent = Intent(Intent.ACTION_DIAL).apply {
        data = Uri.parse("tel:$phone")
    }

    context.startActivity(intent)
}

private fun openChampionLocation(context: Context, region: String) {
    val uri = Uri.parse("geo:0,0?q=${Uri.encode("$region Runeterra")}")

    val intent = Intent(Intent.ACTION_VIEW, uri)

    context.startActivity(intent)
}

private fun shareChampion(
    context: Context,
    imageRes: Int,
    championName: String,
    skinName: String
) {
    val bitmap = BitmapFactory.decodeResource(
        context.resources,
        imageRes
    )

    val file = File(
        context.cacheDir,
        "${championName}_share.png"
    )

    FileOutputStream(file).use { output ->
        bitmap.compress(
            android.graphics.Bitmap.CompressFormat.PNG,
            100,
            output
        )
    }

    val uri = FileProvider.getUriForFile(
        context,
        "${context.packageName}.provider",
        file
    )

    val shareIntent = Intent(Intent.ACTION_SEND).apply {
        type = "image/png"
        putExtra(Intent.EXTRA_STREAM, uri)
        putExtra(
            Intent.EXTRA_TEXT,
            "Mira a $championName con la skin $skinName en mi app Legends Atlas."
        )
        addFlags(Intent.FLAG_GRANT_READ_URI_PERMISSION)
    }

    context.startActivity(
        Intent.createChooser(shareIntent, "Compartir campeón")
    )
}