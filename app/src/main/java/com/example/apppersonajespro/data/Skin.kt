package com.example.apppersonajespro.data

data class Skin(
    val name: String,
    val backgroundName: String,
    val lore: String = "Lore de skin.",
    val musicPath: String,
    val forms: List<ChampionForm>
)