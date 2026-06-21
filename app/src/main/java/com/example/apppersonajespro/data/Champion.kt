package com.example.apppersonajespro.data

data class Champion(
    val id: Int,
    val name: String,
    val subtitle: String,
    val region: String,
    val phone: String,
    val lore: String,
    val masteryPoints: Int,
    val damage: Int,
    val toughness: Int,
    val utility: Int,
    val difficulty: Int,
    val cardImageName: String,
    val voicePath: String,
    val skills: List<Skill>,
    val skins: List<Skin>
)