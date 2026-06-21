package com.example.apppersonajespro.data

object ChampionsData {

    val champions = List(15) { index ->
        Champion(
            id = index + 1,
            name = "Campeón ${(index + 1).toString().padStart(2, '0')}",
            subtitle = "Subtítulo del campeón",
            masteryPoints = 1000 + index * 275,
            damage = 7,
            toughness = 5,
            utility = 6,
            difficulty = 4
        )
    }

    fun getChampionById(id: Int): Champion {
        return champions.firstOrNull { it.id == id } ?: champions.first()
    }
}