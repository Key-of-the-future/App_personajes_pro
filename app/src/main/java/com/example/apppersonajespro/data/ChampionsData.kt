package com.example.apppersonajespro.data

object ChampionsData {

    val champions = listOf(
        champion(
            id = 1,
            name = "Ahri",
            subtitle = "La Zorra de Nueve Colas",
            region = "Ionia",
            skins = listOf("Ahri", "Spirit Blossom Ahri", "Spirit Blossom Springs Ahri"),
            fileKey = "ahri",
            lore = "Aquí escribes el lore personalizado de Ahri.",
            imageOffsetX = 0.35f,
            imageOffsetY = -0.25f
        ),
        champion(
            id = 2,
            name = "Lux",
            subtitle = "La Dama Luminosa",
            region = "Demacia",
            skins = listOf("Base", "Empyrean", "Space Groove"),
            fileKey = "lux",
            lore = "Aquí escribes el lore personalizado de Ahri.",
            imageOffsetX = 0.3f,
            imageOffsetY = -0.25f
        ),
        champion(
            id = 3,
            name = "Senna",
            subtitle = "La Redentora",
            region = "Islas de la Sombra",
            skins = listOf("Base", "High Noon", "Winterblessed"),
            fileKey = "senna",
            lore = "Aquí escribes el lore personalizado de Ahri.",
            imageOffsetX = 0.25f,
            imageOffsetY = -0.25f
        ),
        champion(
            id = 4,
            name = "Gwen",
            subtitle = "La Costurera Sagrada",
            region = "Camavor",
            skins = listOf("Base", "Cafe Cuties", "Space Groove"),
            fileKey = "gwen",
            lore = "Aquí escribes el lore personalizado de Ahri.",
            imageOffsetX = 0.05f,
            imageOffsetY = -0.25f
        ),
        champion(
            id = 5,
            name = "Thresh",
            subtitle = "El Carcelero Implacable",
            region = "Islas de la Sombra",
            skins = listOf("Unbound", "Spirit Blossom", "Janitor"),
            fileKey = "thresh",
            lore = "Aquí escribes el lore personalizado de Ahri.",
            imageOffsetX = 0.01f,
            imageOffsetY = 50f
        ),
        champion(
            id = 6,
            name = "Kayn",
            subtitle = "El Segador Sombrío",
            region = "Ionia",
            skins = listOf("Base", "Odyssey", "Heartsteel"),
            fileKey = "kayn",
            lore = "Aquí escribes el lore personalizado de Ahri.",
            imageOffsetX = 0f,
            imageOffsetY = -0.25f
        ),
        champion(
            id = 7,
            name = "Akali",
            subtitle = "La Asesina Sigilosa",
            region = "Ionia",
            skins = listOf("Base", "Star Guardian", "Empyrean"),
            fileKey = "akali",
            lore = "Aquí escribes el lore personalizado de Ahri.",
            imageOffsetX = 0.05f,
            imageOffsetY = -0.25f
        ),
        champion(
            id = 8,
            name = "Seraphine",
            subtitle = "La Cantante Soñadora",
            region = "Piltover",
            skins = listOf("Base", "Prestige Ocean Song", "Battle Dove"),
            fileKey = "seraphine",
            lore = "Aquí escribes el lore personalizado de Ahri.",
            imageOffsetX = -0.2f,
            imageOffsetY = -0.25f
        ),
        champion(
            id = 9,
            name = "Morgana",
            subtitle = "La Caída",
            region = "Demacia",
            skins = listOf("Base", "Coven", "Prestige Veiled Lady"),
            fileKey = "morgana",
            lore = "Aquí escribes el lore personalizado de Ahri.",
            imageOffsetX = 0.75f,
            imageOffsetY = -0.25f
        ),
        champion(
            id = 10,
            name = "Teemo",
            subtitle = "El Explorador Veloz",
            region = "Bandle City",
            skins = listOf("Base", "Omega Squad", "Space Groove"),
            fileKey = "teemo",
            lore = "Aquí escribes el lore personalizado de Ahri.",
            imageOffsetX = 0.15f,
            imageOffsetY = -0.25f
        ),
        champion(
            id = 11,
            name = "Rell",
            subtitle = "La Doncella de Hierro",
            region = "Noxus",
            skins = listOf("Rell", "Battle Queen", "Star Guardian"),
            fileKey = "rell",
            lore = "Aquí escribes el lore personalizado de Ahri.",
            imageOffsetX = -0.02f,
            imageOffsetY = -0.25f
        ),
        champion(
            id = 12,
            name = "Evelynn",
            subtitle = "El Abrazo Agónico",
            region = "Runaterra",
            skins = listOf("Evelynn", "Coven", "K/DA ALL OUT"),
            fileKey = "evelynn",
            lore = "Aquí escribes el lore personalizado de Ahri.",
            imageOffsetX = 0.05f,
            imageOffsetY = -0.25f
        ),
        champion(
            id = 13,
            name = "Vex",
            subtitle = "La Melancolista",
            region = "Islas de la Sombra",
            skins = listOf("Vex", "Dawnbringer", "Surprise Party"),
            fileKey = "vex",
            lore = "Aquí escribes el lore personalizado de Ahri.",
            imageOffsetX = 0.28f,
            imageOffsetY = -0.25f
        ),
        champion(
            id = 14,
            name = "Jhin",
            subtitle = "El Virtuoso",
            region = "Ionia",
            skins = listOf("Jhin", "Dark Star", "PROJECT"),
            fileKey = "jhin",
            lore = "Aquí escribes el lore personalizado de Ahri.",
            imageOffsetX = 0.15f,
            imageOffsetY = -0.25f
        ),
        champion(
            id = 15,
            name = "Viego",
            subtitle = "El Rey Arruinado",
            region = "Camavor",
            skins = listOf("Viego", "Soul Fighter", "Pentakill"),
            fileKey = "viego",
            lore = "Aquí escribes el lore personalizado de Ahri.",
            imageOffsetX = 0.65f,
            imageOffsetY = -0.25f
        )
    )

    fun getChampionById(id: Int): Champion {
        return champions.firstOrNull { it.id == id } ?: champions.first()
    }

    private fun champion(
        id: Int,
        name: String,
        subtitle: String,
        region: String,
        skins: List<String>,
        fileKey: String,
        lore: String = "Aquí irá el lore del campeón.",
        imageOffsetX: Float = 0f,
        imageOffsetY: Float = 0f
    ): Champion {
        return Champion(
            id = id,
            name = name,
            subtitle = subtitle,
            region = region,
            phone = "47700000${id.toString().padStart(2, '0')}",
            lore = lore,
            masteryPoints = 12000 + id * 850,
            damage = (5..9).random(),
            toughness = (3..8).random(),
            utility = (4..9).random(),
            difficulty = (3..9).random(),
            cardImageName = "${fileKey}_card",
            voicePath = "voices/${fileKey}_intro.mp3",
            skills = defaultSkills(fileKey),
            splashImageName = "${fileKey}splash_1",
            imageOffsetX = imageOffsetX,
            imageOffsetY = imageOffsetY,
            skins = skins.map { skinName ->
                val skinKey = skinName
                    .lowercase()
                    .replace("/", "")
                    .replace(" ", "_")
                    .replace("-", "_")

                Skin(
                    name = skinName,
                    modelPath = "models/$fileKey/$skinKey.glb",
                    backgroundName = "${fileKey}_${skinKey}_bg"
                )
            }
        )
    }

    private fun defaultSkills(fileKey: String): List<Skill> {
        return listOf(
            Skill("Pasiva", "Descripción de la pasiva. Editar después.", "${fileKey}_passive"),
            Skill("Habilidad 1", "Descripción de la primera habilidad. Editar después.", "${fileKey}_q"),
            Skill("Habilidad 2", "Descripción de la segunda habilidad. Editar después.", "${fileKey}_w"),
            Skill("Habilidad 3", "Descripción de la tercera habilidad. Editar después.", "${fileKey}_e"),
            Skill("Definitiva", "Descripción de la definitiva. Editar después.", "${fileKey}_r")
        )
    }
}