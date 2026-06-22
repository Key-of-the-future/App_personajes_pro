package com.example.apppersonajespro.data

data class Champion(
    val id: Int,
    val name: String,
    val subtitle: String,
    val region: String,
    val phone: String,
    val masteryPoints: Int,
    val damage: Int,
    val toughness: Int,
    val utility: Int,
    val difficulty: Int,
    val cardImageName: String,
    val splashImageName: String,
    val voicePath: String,
    val imageOffsetX: Float = 0f,
    val imageOffsetY: Float = 0f,
    val skills: List<Skill>,
    val skins: List<Skin>
)