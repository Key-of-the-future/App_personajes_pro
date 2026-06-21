package com.example.apppersonajespro.data

data class Champion(
    val id: Int,
    val name: String,
    val subtitle: String,
    val masteryPoints: Int,
    val damage: Int,
    val toughness: Int,
    val utility: Int,
    val difficulty: Int
)