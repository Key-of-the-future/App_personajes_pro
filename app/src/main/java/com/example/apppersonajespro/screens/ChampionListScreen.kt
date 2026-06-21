package com.example.apppersonajespro.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.apppersonajespro.components.ChampionCard
import com.example.apppersonajespro.data.ChampionsData

@Composable
fun ChampionListScreen(
    onChampionClick: (Int) -> Unit
) {
    var searchText by rememberSaveable { mutableStateOf("") }

    val filteredChampions = ChampionsData.champions.filter {
        it.name.contains(searchText.trim(), ignoreCase = true)
    }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(
                Brush.verticalGradient(
                    listOf(
                        Color(0xFF06111D),
                        Color(0xFF0A2235),
                        Color(0xFF06111D)
                    )
                )
            )
            .padding(horizontal = 24.dp, vertical = 16.dp)
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Column(
                modifier = Modifier.weight(1f)
            ) {
                Text(
                    text = "LEGENDS ATLAS",
                    color = Color.White,
                    fontSize = 27.sp,
                    fontWeight = FontWeight.Bold
                )

                Text(
                    text = "Colección de campeones",
                    color = Color(0xFFAFC6D6),
                    fontSize = 13.sp
                )
            }

            OutlinedTextField(
                value = searchText,
                onValueChange = { searchText = it },
                modifier = Modifier.width(310.dp),
                label = { Text("Buscar campeón") },
                placeholder = { Text("Escribe su nombre") },
                singleLine = true,
                shape = RoundedCornerShape(12.dp)
            )
        }

        Spacer(modifier = Modifier.height(16.dp))

        LazyVerticalGrid(
            columns = GridCells.Fixed(5),
            modifier = Modifier.fillMaxSize(),
            horizontalArrangement = Arrangement.spacedBy(12.dp),
            verticalArrangement = Arrangement.spacedBy(12.dp)
        ) {
            items(
                items = filteredChampions,
                key = { it.id }
            ) { champion ->
                ChampionCard(
                    champion = champion,
                    onClick = {
                        onChampionClick(champion.id)
                    }
                )
            }
        }
    }
}