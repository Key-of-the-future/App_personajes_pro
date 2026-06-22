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
            skinLores = listOf(
                "Ahri es una vastaya de aspecto vulpino conectada de forma innata a la magia del reino de los espíritus; puede manipular las emociones de sus presas y consumir su esencia, por lo que recibe fragmentos de su memoria y conocimiento de cada alma que consume. Ahri antes era una depredadora poderosa y descarriada, pero ahora viaja por el mundo en busca de vestigios de sus antepasados, mientras intenta sustituir los recuerdos que robó de sus víctimas por otros creados por ella misma.",
                "El afamado Espíritu de la Salvación y la vulpina hacia la que todos los mortales son atraídos cuando sus almas llegan al reino espiritual. Un espíritu caprichoso y enigmático que percibe el destino de los vivos como un juego de persecución, les ofrece a las almas la oportunidad de encontrar su descanso final... pero no intervendrá si se desvían del camino.",
                "Ella es la guardiana de un oasis escondido en su montaña favorita. Gracias a su profundo conocimiento del descanso y la magia, dirige estas aguas termales donde los espíritus y visitantes pueden calentar sus cuerpos, sanar sus almas y revivir recuerdos felices."
            ),
            imageOffsetX = 0.35f,
            imageOffsetY = -0.25f
        ),
        champion(
            id = 2,
            name = "Lux",
            subtitle = "La Dama Luminosa",
            region = "Demacia",
            skins = listOf("Lux", "Empyrean Lux", "Space Groove Lux"),
            fileKey = "lux",
            skinLores = listOf(
                "Luxanna Guardia de la Corona proviene de Demacia, un reino aislado en el que la gente observa con terror y sospecha a las habilidades mágicas. Con el talento de manipular la luz a su voluntad, Lux creció temiendo que la descubrieran y exiliaran, lo que la obligó a mantener su poder en secreto para conservar el estado de nobleza de su familia. Sin embargo, su optimismo y resistencia la llevaron a aceptar sus talentos únicos y ahora los utiliza en secreto para servir a su tierra.",
                "Lux es una refugiada interdimensional que sobrevivió milagrosamente a la aniquilación absoluta de su realidad nativa. A diferencia de su historia original en Demacia, donde ocultaba su magia para proteger a su noble familia, aquí sus poderes se convirtieron en la llave para escapar de la muerte y abrazar una libertad cósmica salvaje pero autodestructiva.",
                "Lux es una chica común de un planeta aburrido que se convierte en la heroína más grande de la galaxia al descubrir que puede canalizar el poder del Ritmo puro."
            ),
            imageOffsetX = 0.3f,
            imageOffsetY = -0.25f
        ),
        champion(
            id = 3,
            name = "Senna",
            subtitle = "La Redentora",
            region = "Islas de la Sombra",
            skins = listOf("Senna", "High Noon Senna", "Winterblessed Senna"),
            fileKey = "senna",
            skinLores = listOf(
                "Maldita desde la infancia a ser perseguida por la sobrenatural Niebla Negra, Senna se unió a una orden secreta conocida como los Centinelas de la Luz para intentar huir de tan terrible augurio. Aunque se defendió ferozmente, terminó siendo asesinada por Thresh, quien reclamó su alma dentro de su cruel linterna. Pero la Centinela se negó a perder la esperanza. Durante su cautiverio, Senna aprendió a controlar la niebla para eventualmente regresar de entre los muertos, aunque cambiada para siempre. Ahora que blande tanto la oscuridad como la luz, Senna busca acabar con la amenaza de la Niebla Negra de una vez por todas, un disparo a la vez, redimiendo a las almas que la Ruina reclamó.",
                "Senna la Forajida es la pistolera más letal del continente, una criatura renacida que porta el corazón de un ángel y cabalga para imponer la justicia divina.",
                "Senna Favor del Invierno es el avatar y encarnación viviente de la Aurora, portando el título divino de Polaris. Su lore explora la carga psicológica de una deidad cíclica que imparte bendiciones y castigos en el mundo mortal, mientras lidia con la trágica pérdida total de su identidad."
            ),
            imageOffsetX = 0.25f,
            imageOffsetY = -0.25f
        ),
        champion(
            id = 4,
            name = "Gwen",
            subtitle = "La Costurera Sagrada",
            region = "Camavor",
            skins = listOf("Gwen", "Cafe Cuties Gwen", "Space Groove Gwen"),
            fileKey = "gwen",
            skinLores = listOf(
                "Gwen, una antigua muñeca que se transformó y cobró vida a través de la magia, usa las mismas herramientas que en su momento la crearon. Lleva el peso del amor de su creadora a cada paso, sin dar nada por sentado. Bajo su mando está la Niebla Sagrada, una magia antigua y protectora que bendijo las tijeras, las agujas y el hilo de coser de Gwen. Muchas cosas son nuevas para Gwen, pero sigue decidida a luchar con gozo por el bien que prevalece en un mundo roto.",
                "Gwen es la encargada de dar la bienvenida a todos los comensales que visitan la cafetería. Es famosa por recibir a los clientes con una sonrisa radiante y por servir pastelillos presentados de forma impecable y milimétrica.",
                "Gwen deja atrás las telas medievales y la melancolía para convertirse en la maestra de intendencia, jefa de logística y diseñadora oficial de los héroes de la galaxia. Su misión en esta línea temporal es combatir a las fuerzas del Bajón armando a sus amigos con las prendas más fabulosas y llenas de ritmo del cosmos."
            ),
            imageOffsetX = 0.05f,
            imageOffsetY = -0.25f
        ),
        champion(
            id = 5,
            name = "Thresh",
            subtitle = "El Carcelero Implacable",
            region = "Islas de la Sombra",
            skins = listOf("Unbound Thresh", "Spirit Blossom Thresh", "Janitor Thresh"),
            fileKey = "thresh",
            skinLores = listOf(
                "Thresh es un ambicioso, incansable, astuto y sádico espectro de las Islas de la Sombra. En vida, fue custodio de innumerables secretos arcanos. Su vida de ambición terminó cuando un poder más allá de la vida y la muerte lo destrozó. Ahora, subsiste del tormento que inflige a los vivos con su terrible ingenio. Ni la muerte puede aliviar el sufrimiento que Thresh provoca, pues este espectro encierra las almas de sus víctimas en su profana lámpara, donde son torturadas por toda la eternidad.",
                "Thresh es el Espíritu de la Obsesión, un antiguo demonio que acecha el más allá como el supremo recolector de almas. Redefine por completo la linterna y las cadenas del campeón para adaptarlas a un mito espiritual de tintes orientales, dividiendo el inframundo entre los espíritus pacíficos (Kanmei) y los atormentados (Akana).",
                "Thresh Conserje es el encargado de limpieza más amargado, meticuloso y secretamente peligroso de las oficinas corporativas. Este aspecto transforma sus armas de tortura eterna en herramientas de limpieza industrial y sátira laboral."
            ),
            imageOffsetX = 0.01f,
            imageOffsetY = 50f
        ),
        champion(
            id = 6,
            name = "Kayn",
            subtitle = "El Segador Sombrío",
            region = "Ionia",
            skins = listOf("Kayn", "Odyssey Kayn", "Heartsteel Kayn"),
            fileKey = "kayn",
            skinLores = listOf(
            ),
        ).copy(
            skins = listOf(
                Skin(
                    name = "Kayn",
                    backgroundName = "kaynsplash_1",
                    lore = "Shieda Kayn, un practicante sin igual de la letal magia sombría, lucha para alcanzar su verdadero destino: conducir la Orden de la Sombra hacia una nueva era de supremacía joniana. Esgrime la oscura arma viviente Rhaast, inmutable ante la progresiva corrupción de su cuerpo y mente. Solo hay dos resultados posibles: o Kayn somete el arma a su voluntad... o la cuchilla malévola lo consume por completo.",
                    musicPath = "music/kayn_theme.mp3",
                    forms = listOf(
                        ChampionForm("Kayn", "models/kayn/kayn.glb", "voices/kayn.m4a", kaynSkills()),
                        ChampionForm("Rhaast", "models/kayn/kayn_rhaast.glb", "voices/rhaast.m4a", rhaastSkills()),
                        ChampionForm("Asesino", "models/kayn/kayn_assasin.glb", "voices/assasin.m4a", assasinSkills())
                    )
                ),
                Skin(
                    name = "Odyssey Kayn",
                    backgroundName = "kaynsplash_2",
                    lore =  "Kayn Odisea es el Alto Defensor del Imperio Demaxiano, un líder militar cruel y el antagonista principal de la tripulación de la Estrella del Alba. Reescribe el conflicto con su arma para conectarlo de forma directa con la poderosa sustancia cósmica conocida como Ora y el vacío de la Estrella Oscura.",
                    musicPath = "music/odyssey_kayn_theme.mp3",
                    forms = listOf(
                        ChampionForm("Kayn", "models/kayn/odyssey_kayn.glb", "voices/odyssey_kayn.m4a", kaynSkills()),
                        ChampionForm("Rhaast", "models/kayn/odyssey_kayn_rhaast.glb", "voices/odyssey_rhaast.m4a", rhaastSkills()),
                        ChampionForm("Asesino", "models/kayn/odyssey_kayn_assasin.glb", "voices/odyssey_assasin.m4a", assasinSkills())
                    )
                ),
                Skin(
                    name = "Heartsteel Kayn",
                    backgroundName = "kaynsplash_3",
                    lore = "Kayn HEARTSTEEL es el rapero principal, compositor y una de las mentes creativas más caóticas de la boyband. Su dinámica interna de doble personalidad con Rhaast se reescribe como una lucha de egos artísticos y un trastorno de identidad musical.",
                    musicPath = "music/heartsteel_kayn_theme.mp3",
                    forms = listOf(
                        ChampionForm("Kayn", "models/kayn/heartsteel_kayn.glb", "voices/heartsteel_kayn.m4a", kaynSkills()),
                        ChampionForm("Rhaast", "models/kayn/heartsteel_kayn_rhaast.glb", "voices/heartsteel_rhaast.m4a", rhaastSkills()),
                        ChampionForm("Asesino", "models/kayn/heartsteel_kayn_assasin.glb", "voices/heartsteel_assasinkayn.m4a", assasinSkills())
                    )
                )
            )
        ),
        champion(
            id = 7,
            name = "Akali",
            subtitle = "La Asesina Sigilosa",
            region = "Ionia",
            skins = listOf("Akali", "Star Guardian Akali", "Empyrean Akali"),
            fileKey = "akali",
            skinLores = listOf(
                "Tras renunciar a la Orden Kinkou y a su título como el Puño de la Sombra, Akali pelea a solas, lista para ser el arma letal que su pueblo necesita. Aunque conserva todo lo que aprendió de su maestro Shen, juró defender a Jonia de sus enemigos... una víctima a la vez. Puede que Akali ataque en silencio, pero su mensaje resonará con fuerza y claridad: témanle a la asesina sin maestro.",
                "Akali es una guerrera veterana y la mano derecha de Kai'Sa que lucha en secreto contra la corrupción de la Estrella Oscura. Explora la profunda tragedia de una protectora que se está quebrando por dentro debido al peso de la guerra, el trauma y la duda.",
                "Akali es una de las pocas supervivientes de su dimensión, transformada en una cazadora implacable infundida con el fuego psicodélico del Reino Floral. En esta línea temporal, ella ya no lucha por honor o por su orden ninja, sino por pura supervivencia en un cosmos que se está desmoronando a gran velocidad."
            ),
            imageOffsetX = 0.05f,
            imageOffsetY = -0.25f
        ),
        champion(
            id = 8,
            name = "Seraphine",
            subtitle = "La Cantante Soñadora",
            region = "Piltover",
            skins = listOf("Seraphine", "Ocean Song Sera", "Battle Dove Sera"),
            fileKey = "seraphine",
            skinLores = listOf(
                "Nacida en Piltóver de padres zaunitas, Seraphine es capaz de escuchar las almas de otros; el mundo canta para ella, y ella canta para él. Aunque estos sonidos la abrumaban en su juventud, ahora acude a ellos para inspirarse y convertir el caos en una sinfonía. Se presenta en las ciudades hermanas para recordarles a sus ciudadanos que no están solos, que son más fuertes juntos y que, ante sus ojos, su potencial es ilimitado.",
                "Seraphine Canción del Océano Prestigiosa deja de ser solo una cantante pop de playa para transformarse en una musa de la alta costura y un ícono de las pasarelas que fusiona la moda con la magia marina. ",
                "En el universo futurista y de ciencia ficción de Escuadrón Animalia, Seraphine Paloma de Batalla es una idol del pop global convertida en soldado de élite y líder de la resistencia humana."
            ),
            imageOffsetX = -0.2f,
            imageOffsetY = -0.25f
        ),
        champion(
            id = 9,
            name = "Morgana",
            subtitle = "La Caída",
            region = "Demacia",
            skins = listOf("Morgana", "Coven Morgana", "Prestige Veiled Lady Morgana"),
            fileKey = "morgana",
            skinLores = listOf(
                "Atribulada entre su naturaleza celestial y mortal, Morgana ató sus alas para aceptar su humanidad e inflige su dolor y amargura en los deshonestos y los corruptos. Rechaza las leyes y tradiciones que considera injustas y pelea por la verdad desde las sombras de Demacia con escudos y cadenas de fuego oscuro, aun cuando otros tratan de reprimirla. Pero, ante todo, Morgana cree que incluso los parias y los desterrados serán capaces de elevarse de nuevo un día.",
                "Morgana Aquelarre es la Reina de las Brujas, la tejedora del destino y la deidad suprema en la Tierra del culto de los Dioses Antiguos. A diferencia de otras brujas que sirven como herederas o vasallas, Morgana es la líder espiritual indiscutible que entregó su humanidad para convertirse en el recipiente del renacimiento de sus amos caídos.",
                "Morgana la Dama Velada es un aspecto de categoría Prestigio profundamente arraigado en el lore canónico y principal de Runaterra. Representa la deificación, los mitos y la perspectiva religiosa que la gente común de Demacia tiene sobre ella como su deidad protectora oculta."
            ),
            imageOffsetX = 0.75f,
            imageOffsetY = -0.25f
        ),
        champion(
            id = 10,
            name = "Teemo",
            subtitle = "El Explorador Veloz",
            region = "Bandle City",
            skins = listOf("Teemo", "Omega Squad Teemo", "Space Groove Teemo"),
            fileKey = "teemo",
            skinLores = listOf(
                "Teemo no se inmuta ante los obstáculos más peligrosos y amenazadores mientras explora el mundo con un entusiasmo infinito y un espíritu lleno de alegría. Es un yordle con una moralidad inquebrantable que se enorgullece de seguir el código de los exploradores de Bandle, a veces con tanto ímpetu que no se percata de las consecuencias de sus acciones. Aunque algunos dicen que la existencia de los exploradores es cuestionable, algo es seguro: no hay que meterse con la convicción de Teemo.",
                "Teemo es el último superviviente traumatizado de una unidad militar de élite y una máquina de matar despiadada.",
                "Teemo no es un yordle, sino un explorador espacial que pilota un avanzado traje robótico con forma de Teemo, impulsado por el poder del Ritmo puro. Este aspecto cambia por completo las vibras bélicas del personaje para convertirlo en un héroe de la pista de baile intergaláctica."
            ),
            imageOffsetX = 0.15f,
            imageOffsetY = -0.25f
        ),
        champion(
            id = 11,
            name = "Rell",
            subtitle = "La Doncella de Hierro",
            region = "Noxus",
            skins = listOf("Rell", "Battle Queen Rell", "Star Guardian Rell"),
            fileKey = "rell",
            skinLores = listOf(
                "Producto de brutales experimentos realizados por la Rosa Negra, Rell es un arma viviente rebelde con la firme determinación de acabar con Noxus. Su infancia estuvo llena de miseria y horror. Tuvo que soportar procedimientos atroces para perfeccionar y convertir en un arma mortal su control mágico del metal… hasta que huyó de forma súbita y mató a muchos de sus captores en el proceso. Rell, considerada ahora una criminal, ataca a cualquier soldado noxiano que se cruce en su camino mientras busca sobrevivientes de su antigua ''academia'', defiende a los débiles y da una muerte violenta a sus antiguos supervisores.",
                "Rell Reina Guerrera es una joven prodigio de la ferromancia que lucha en un torneo global para defender a su nación y reclamar su derecho al trono.",
                "Rell es una guardiana delgada, solitaria y delincuente que prefiere alejar a las personas antes que hacer amigos. Proveniente de una ciudad hermana de Valoran City junto a Quinn, su dura personalidad oculta a una guerrera feroz con una furia interna que canaliza para defender a los indefensos."
            ),
            imageOffsetX = -0.02f,
            imageOffsetY = -0.25f
        ),
        champion(
            id = 12,
            name = "Evelynn",
            subtitle = "El Abrazo Agónico",
            region = "Runaterra",
            skins = listOf("Evelynn", "Coven Evelynn", "K/DA ALL OUT Evelynn"),
            fileKey = "evelynn",
            skinLores = listOf(
            ),
        ).copy(
            skins = listOf(
                Skin(
                    name = "Evelynn",
                    backgroundName = "evelynnsplash_1",
                    lore = "Dentro de las oscuras vetas de Runaterra, la demonio Evelynn acecha a su siguiente víctima. Seduce a su presa con la apariencia voluptuosa de una mujer humana, pero una vez que alguien sucumbe ante sus encantos, Evelynn revela su verdadera forma. Es en ese momento somete a su víctima a un inimaginable tormento y se deleita con su dolor. Para el demonio, estos encuentros son amoríos inocentes. Para el resto de Runaterra, son historias macabras de lujuria que terminaron mal y atroces recordatorios del costo que tiene el deseo lascivo.",
                    musicPath = "music/evelynn_theme.mp3",
                    forms = listOf(
                        ChampionForm("Normal", "models/evelynn/evelynn.glb", "voices/evelynn.m4a", defaultSkills("evelynn")),
                        ChampionForm("Demoníaca", "models/evelynn/evelynn_demon.glb", "voices/evelynn_demon.m4a", defaultSkills("evelynn"))
                    )
                ),
                Skin(
                    name = "Coven Evelynn",
                    backgroundName = "evelynnsplash_2",
                    lore = "Evelynn Aquelarre es una de las brujas más poderosas, letales y singulares del culto, nacida como una criatura híbrida: mitad humana y mitad Dios Antiguo. A diferencia de sus hermanas que son mortales que ganaron poder mediante pactos, el poder de Evelynn es de nacimiento.",
                    musicPath = "music/coven_evelynn_theme.mp3",
                    forms = listOf(
                        ChampionForm("Normal", "models/evelynn/coven_evelynn.glb", "voices/coven_evelynn.m4a", defaultSkills("evelynn")),
                        ChampionForm("Demoníaca", "models/evelynn/coven_evelynn_demon.glb", "voices/coven_evelynn_demon.m4a", defaultSkills("evelynn"))
                    )
                ),
                Skin(
                    name = "K/DA ALL OUT Evelynn",
                    backgroundName = "evelynnsplash_3",
                    lore = "Evelynn K/DA ALL OUT es la vocalista principal, diva definitiva y la fuerza creativa más imponente del grupo. Esta era discográfica, que acompaña al lanzamiento del EP ALL OUT, muestra a una Evelynn mucho más madura, enfocada en la alta costura y en consolidar su estatus como un ícono de la moda global.",
                    musicPath = "music/kda_all_out_evelynn_theme.mp3",
                    forms = listOf(
                        ChampionForm("Normal", "models/evelynn/k_da_all_out_evelynn.glb", "voices/k_da_all_out_evelynn.m4a", defaultSkills("evelynn")),
                        ChampionForm("Demoníaca", "models/evelynn/k_da_all_out_evelynn_demon.glb", "voices/k_da_all_out_demon_evelynn.m4a", defaultSkills("evelynn"))
                    )
                )
            )
        ),
        champion(
            id = 13,
            name = "Vex",
            subtitle = "La Melancolista",
            region = "Islas de la Sombra",
            skins = listOf("Vex", "Dawnbringer Vex", "Surprise Party Vex"),
            fileKey = "vex",
            skinLores = listOf(
                "En el corazón negro de las Islas de la Sombra, una yordle solitaria va arrastrando los pies entre la niebla espectral, regocijándose en su oscura miseria. Vex, un pozo sin fondo de malestar adolescente, habita su propio rinconcito de la miseria, con una poderosa sombra que la sigue a todas partes y muy lejos del repugnante júbilo del mundo ''normie''. Aunque carece de ambición, es rápida para fulminar el color y la felicidad, frenando a todos los posibles intrusos con su malestar mágico.",
                "Vex Dawnbringer es un agente divino del Orden Cósmico, aunque ejerce su rol de una forma extremadamente apática y perezosa. A diferencia de deidades apasionadas como Riven o Soraka, Vex no busca la luz por heroísmo, sino porque el caos le parece demasiado ruidoso.",
                "Vex Fiesta de Sorpresas es una payasa gótica que descubrió su verdadera vocación al darse cuenta de que infunde terror en los demás. A diferencia de su contraparte original que odia la interacción social por simple apatía, aquí utiliza la temática festiva de forma irónica y maliciosa para perturbar a la gente."
            ),
            imageOffsetX = 0.28f,
            imageOffsetY = -0.25f
        ),
        champion(
            id = 14,
            name = "Jhin",
            subtitle = "El Virtuoso",
            region = "Ionia",
            skins = listOf("Jhin", "Dark Cosmic Jhin", "Project Jhin"),
            fileKey = "jhin",
            skinLores = listOf(
                "Jhin es un psicópata meticuloso que cree que el asesinato es un arte. Alguna vez un prisionero jonio, pero liberado por elementos sombríos dentro del concejo líder de Jonia, el asesino en serie ahora presta sus servicios como sicario a esa camarilla. Utilizando su arma como un pincel, Jhin crea obras de arte brutales que horrorizan a sus víctimas y testigos. Mostrar sus obras de horripilante drama le causa un placer retorcido, lo que lo convierte en la mejor opción para mandar el más poderoso de los mensajes: el terror.",
                "Jhin Oscuridad Cósmica es una entidad celestial corrompida con delirios de grandeza que destruye galaxias enteras para crear \"obras de arte\" con sus restos. A diferencia de los monstruos puros de la Estrella Oscura que devoran todo por hambre infinita, Jhin actúa por pura vanidad estética.",
                "hin es un criminal demente y un asesino cibernético del mercado negro que se ha convertido en una de las mayores amenazas para la Megaciudad. A diferencia de otros campeones que buscan la libertad o el control corporativo, Jhin solo busca la expresión artística a través de la modificación corporal forzada y el asesinato."
            ),
            imageOffsetX = 0.15f,
            imageOffsetY = -0.25f
        ),
        champion(
            id = 15,
            name = "Viego",
            subtitle = "El Rey Arruinado",
            region = "Camavor",
            skins = listOf("Viego", "Soul Fighter Viego", "Pentakill Viego"),
            fileKey = "viego",
            skinLores = listOf(
                "Otrora gobernante de un reino perdido en el tiempo, Viego falleció hace más de mil años cuando su intento de regresar a su esposa de la muerte desencadenó la catástrofe mágica conocida como la Ruina. Transformado en un poderoso espectro, y torturado por una interminable obsesión por su reina muerta hace siglos, Viego ahora es el Rey Arruinado. Sus sirvientes, los letales Harrowings, se esparcen por el mundo mientras Viego azota Runaterra con la Niebla Negra que brota continuamente de su cruel y roto corazón, condenado a una perpetua cruzada por traer de regreso a su esposa.",
                "Viego es un competidor formidable que busca despertar por completo el espíritu de Isolde. A diferencia de su trágica y oscura historia original, aquí trabaja activamente en el Torneo de las Almas para salvar a su amada, sintiendo un cariño más genuino que la obsesión mostrada en el canon principal.",
                "Viego es una deidad corrupta y un artista destructivo conocido como el Heraldo de la Disonancia. A diferencia de la banda principal, él no pertenece formalmente a Pentakill, sino que actúa como su antagonista principal bajo el aspecto de Viego Disonancia de Pentakill."
            ),
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
        skinLores: List<String> = List(skins.size) { "Lore pendiente de skin." },
        imageOffsetX: Float = 0f,
        imageOffsetY: Float = 0f
    ): Champion {
        return Champion(
            id = id,
            name = name,
            subtitle = subtitle,
            region = region,
            phone = "47700000${id.toString().padStart(2, '0')}",
            masteryPoints = 12000 + id * 850,
            damage = (5..9).random(),
            toughness = (3..8).random(),
            utility = (4..9).random(),
            difficulty = (3..9).random(),
            cardImageName = "${fileKey}_card",
            voicePath = "voices/${fileKey}.m4a",
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

                val modelFileName = if (skinName == name) {
                    "$fileKey.glb"
                } else {
                    "$skinKey.glb"
                }

                val skinIndex = skins.indexOf(skinName)

                Skin(
                    name = skinName,
                    backgroundName = "${fileKey}splash_${skinIndex + 1}",
                    lore = skinLores.getOrElse(skinIndex) { "Lore pendiente de skin." },
                    musicPath = "music/${skinKey}.mp3",
                    forms = listOf(
                        ChampionForm(
                            name = "Base",
                            modelPath = "models/$fileKey/$modelFileName",
                            voicePath = "voices/$skinKey.m4a",
                            skills = defaultSkills(fileKey)
                        )
                    )
                )
            }
        )
    }

    private fun defaultSkills(fileKey: String): List<Skill> {
        return when (fileKey) {

            "ahri" -> listOf(
                Skill("Ladrona de Esencias", "Al lanzar 3 habilidades que impacten a un enemigo, la siguiente la curará al igual si un enemigo muere cerca de ella.", "ahri_passive"),
                Skill("Orbe del Engaño", "Lanza un orbe que hace daño mágico de ida y vuelta.", "ahri_q"),
                Skill("Fuego Zorruno", "Obtiene velocidad de movimiento y lanza 3 proyectiles mágicos al enemigo más cercano.", "ahri_w"),
                Skill("Encanto", "Ahri lanza un beso que encanta al primer enemigo alcanzado y lo provoca a acercarse a ella.", "ahri_e"),
                Skill("Impulso Espiritual", "Obtiene 3 cargas para desplazarse mientras dispara rayos de esencia al usarla.", "ahri_r")
            )

            "lux" -> listOf(
                Skill("Iluminación", "Los hechizos dañinos de Lux cargan de energía al objetivo durante algunos segundos. Su siguiente ataque desata la energía e inflige daño mágico adicional al objetivo (según el nivel de Lux).", "lux_passive"),
                Skill("Hechizo Luminoso", "Lux desata una esfera de luz que atrapa e inflige daño hasta a dos unidades enemigas.", "lux_q"),
                Skill("Barrera Prismática", "Lux lanza su vara y deforma la luz alrededor de cualquier objetivo aliado que alcanza, lo que los protege del daño enemigo.", "lux_w"),
                Skill("Singularidad Brillante", "Dispara una anomalía de luz retorcida en una zona que ralentiza a los enemigos cercanos. Lux puede detonarla para infligir daño a los enemigos en el área de efecto.", "lux_e"),
                Skill("Chispa Final", "Tras reunir la energía necesaria, Lux lanza un rayo de luz que inflige daño a todos los objetivos en el área. Además, activa la habilidad pasiva de Lux y restablece la duración de Iluminación.", "lux_r")
            )

            "senna" -> listOf(
                Skill("Absolución", "Cuando las unidades mueren cerca de Senna, la Niebla Negra atrapa sus almas periódicamente. Senna puede atacar a estas almas para liberarlas, con lo que absorbe la niebla que las mantiene muertas. La niebla alimenta el poder de su cañón reliquia con daño de ataque, alcance de ataque y probabilidad de golpe crítico aumentados. Los ataques del cañón reliquia de Senna tardan más en disparar, infligen daño adicional y le otorgan una porción de la velocidad de movimiento de su objetivo por un momento.", "senna_passive"),
                Skill("Oscuridad Lacerante", "Desde los dos compartimentos de su cañón reliquia, Senna dispara un rayo combinado de luz y sombra contra un objetivo, lo que cura a aliados y daña a enemigos.", "senna_q"),
                Skill("Abrazo Final", "Senna lanza una ola de Niebla Negra. Si impacta a un enemigo, la oleada hambrienta se abalanza sobre él para inmovilizarlo, junto con todas las unidades cercanas después de un momento.", "senna_w"),
                Skill("Maldición de la Niebla Negra", "Senna canaliza la niebla que almacena en su arma, genera una tormenta a su alrededor y abraza la oscuridad para convertirse en un espectro. Los aliados que entren en la zona se camuflan y también aparecen como espectros mientras la niebla los cubre. Los espectros obtienen velocidad de movimiento aumentada, no son seleccionables y ocultan su identidad.", "senna_e"),
                Skill("Cañón de las sombras", "Senna invoca las piedras reliquia de los Centinelas caídos, partiendo su cañón reliquia en un despliegue de sombra y luz. Después dispara un rayo global que escuda a los aliados contra el daño, mientras los enemigos en el centro reciben daño.", "senna_r")
            )

            "gwen" -> listOf(
                Skill("Mil Cortes", "Los ataques de Gwen infligen daño mágico adicional según la vida de los objetivos. Se cura una parte del daño que inflige a campeones con este efecto.", "gwen_passive"),
                Skill("¡A Cortar!", "Gwen corta con sus tijeras hasta 6 veces en un cono para infligir daño mágico. Gwen inflige daño verdadero a unidades en el centro y les aplica su pasiva con cada corte.", "gwen_q"),
                Skill("Niebla Consagrada", "Gwen invoca niebla que la protege de los enemigos que están fuera de ella. Solo los enemigos que entren a la niebla la pueden fijar como objetivo.", "gwen_w"),
                Skill("Costura Letal", "Gwen se desplaza una corta distancia para luego obtener velocidad de ataque, alcance de ataque y daño mágico al impacto durante unos segundos. Si impacta a un enemigo en ese tiempo, el enfriamiento de esta habilidad se restablece parcialmente.", "gwen_e"),
                Skill("Ráfaga de Agujas", "Gwen lanza una aguja que ralentiza a los enemigos alcanzados, inflige daño mágico y aplica Mil Cortes a los campeones impactados. Esta habilidad se puede lanzar hasta dos veces más. Cada lanzamiento arroja agujas adicionales e inflige más daño.", "gwen_r")
            )

            "thresh" -> listOf(
                Skill("Condenación", "Thresh puede cosechar las almas de enemigos que mueren cerca de él, lo que le otorga Armadura y Poder de Habilidad de forma permanente.", "thresh_passive"),
                Skill("Sentencia a Muerte", "Thresh envuelve a un enemigo en cadenas y lo jala hacia él. Activar esta habilidad por segunda vez atrae a Thresh hacia el enemigo.", "thresh_q"),
                Skill("Pasaje Oscuro", "Thresh lanza una linterna que protege a los campeones aliados cercanos contra daño. Los aliados pueden hacer clic en la linterna para desplazarse hacia Thresh.", "thresh_w"),
                Skill("Despellejar", "Los ataques de Thresh se cargan e infligen más daño mientras más espere entre ataques. Al activarse, Thresh desliza su cadena y lanza a todos los enemigos alcanzados hacia la dirección del impacto.", "thresh_e"),
                Skill("La Caja", "Una prisión de muros que ralentiza e inflige daño al romperse.", "thresh_r")
            )

            "akali" -> listOf(
                Skill("Marca de la Asesina", "Al infligir daño de hechizos a un campeón, se crea un anillo de energía a su alrededor. Al salir de ese anillo, potencia el siguiente ataque de Akali con alcance y daño adicionales.", "akali_passive"),
                Skill("Ráfaga de los Cinco Filos", "Akali arroja cinco kunai que ralentizan e infligen daño según su daño de ataque y su poder de habilidad adicionales.", "akali_q"),
                Skill("Manto Crepuscular", "Akali desata una cortina de humo y obtiene velocidad de movimiento por un momento. Al estar dentro del manto, Akali se vuelve invisible y no puede ser alcanzada por hechizos y ataques enemigos. Quedará revelada por un instante si ataca o usa habilidades.", "akali_w"),
                Skill("Maniobra de Shuriken", "Realiza una voltereta hacia atrás y arroja un shuriken hacia adelante que inflige daño mágico. El primer enemigo o nube de humo impactados quedan marcados. Vuelve a lanzarlo para desplazarte hacia el objetivo marcado e infligir daño adicional.", "akali_e"),
                Skill("Ejecución Perfecta", "Akali salta hacia una dirección para infligir daño a los enemigos alcanzados. Relanzamiento: Akali se desplaza en una dirección y ejecuta a todos los enemigos alcanzados.", "akali_r")
            )

            "seraphine" -> listOf(
                Skill("Presencia Escénica", "Seraphine lanzará dos veces cada segundo hechizo básico. Además, lanzar hechizos cerca de aliados le otorga daño mágico y alcance adicionales en su siguiente ataque básico.", "seraphine_passive"),
                Skill("Nota Alta", "Seraphine lanza un proyectil e inflige daño en una zona.", "seraphine_q"),
                Skill("Sonido Envolvente", "Seraphine escuda y acelera a los aliados cercanos. Si ya tiene un escudo, también curará a los aliados cercanos.", "seraphine_w"),
                Skill("¡Siente el Ritmo!", "Seraphine inflige daño y reduce la velocidad de movimiento de los enemigos en una línea.", "seraphine_e"),
                Skill("¡Otra!", "Seraphine inflige daño y encanta a los enemigos alcanzados, lo que restablece el alcance con cada campeón enemigo o aliado impactado.", "seraphine_r")
            )

            "morgana" -> listOf(
                Skill("Sifón del Alma", "Morgana drena el espíritu de sus enemigos y se cura mientras inflige daño a campeones, súbditos grandes y monstruos de la jungla grandes y medianos.", "morgana_passive"),
                Skill("Hechizo Oscuro", "Morgana inmoviliza a un enemigo con magia oscura y lo obliga a sentir el dolor que ha causado, lo que le inflige daño mágico.", "morgana_q"),
                Skill("Sombra Maldita", "Morgana proyecta una sombra maldita en un área que inflige daño a los enemigos que osen pisar su círculo oscuro. Reciben daño mágico prolongado que aumenta entre menos vida tenga el enemigo afectado.", "morgana_w"),
                Skill("Escudo Negro", "Morgana confiere a un aliado una barrera protectora de fuego estelar que absorbe daño mágico y anula efectos de control de masas hasta que se rompe.", "morgana_e"),
                Skill("Grilletes del Alma", "Morgana libera toda la fuerza de su poder celestial mientras abre sus alas y se eleva. Lanza cadenas de dolor oscuro a los campeones enemigos cercanos, con lo que obtiene velocidad de movimiento. Las cadenas ralentizan, infligen daño inicial y, después de un momento, aturden a los que no pueden romperlas.", "morgana_r")
            )

            "teemo" -> listOf(
                Skill("Tiro Tóxico", "Los ataques básicos envenenan al impacto e infligen daño mágico por segundo en un lapso de 4 segundos.", "teemo_passive"),
                Skill("Dardo Cegador", "Nubla la visión de un enemigo con un potente veneno, lo que le inflige daño y lo ciega mientras dure el efecto.", "teemo_q"),
                Skill("Movimiento Rápido", "Dá velocidad de movimiento pasiva hasta entrar en combate o recibir daño, al activarla rueda un pequeño tramo para obtener velocidad de movimiento duplicada aunque se reciba daño.", "teemo_w"),
                Skill("Tácticas de Guerrilla", "Teemo se camufla y se vuelve invisible en un radio al rededor de él, lo pueden localizar los enemigos al acercarse más de ese radio o después de que teemo se haya movido por más de 3 segundos con la habilidad activa", "teemo_e"),
                Skill("Trampa Nociva", "Teemo arroja una trampa venenosa explosiva utilizando uno de los hongos que lleva en su mochila. Si un enemigo la pisa, la trampa libera una nube venenosa que ralentiza a los enemigos y les inflige daño prolongado. Si Teemo arroja un hongo hacia otro hongo, este rebotará y obtendrá alcance adicional.", "teemo_r")
            )

            "rell" -> listOf(
                Skill("Rompemoldes", "Los ataques y las habilidades de Rell infligen daño mágico adicional y roban armadura y resistencia mágica al impacto.", "rell_passive"),
                Skill("Golpe Devastador", "Rell inflige daño mágico a las unidades en una línea, rompe sus escudos y los aturde.", "rell_q"),
                Skill("Ferromancia: Desplome", "Montada: Rell se desmonta y cae con fuerza en su armadura, lo que lanza por el aire a los enemigos y obtiene un escudo grande. Mientras esté desmontada, obtiene armadura, resistencia mágica, velocidad de ataque y alcance de ataque, pero queda ralentizada. Desmontada: Rell forma su montura para obtener un aumento de velocidad y lanzar por el aire al próximo enemigo que ataque.", "rell_w"),
                Skill("Tilteo Total", "Pasiva: Rell obtiene velocidad de movimiento fuera de combate. Activa: Rell y un aliado obtienen velocidad de movimiento progresiva que se duplica al desplazarse hacia enemigos y entre sí. Su siguiente ataque explota, lo que inflige daño mágico.", "rell_e"),
                Skill("Tormenta Magnética", "Rell explota con una furia magnética, la cual atrae hacia ella de forma violenta a los enemigos cercanos. Luego, Rell arrastra hacia ella a los enemigos cercanos de forma continua por un breve periodo e inflige daño mágico prolongado.", "rell_r")
            )

            "evelynn" -> listOf(
                Skill("Sombra Demoníaca", "Cuando no se encuentra en combate, Evelynn activa Sombra Demoníaca. Sombra Demoníaca cura a Evelynn cuando tiene poca vida y le otorga Camuflaje a partir del nivel 5.", "evelynn_passive"),
                Skill("Púas de Odio", "Desata dos líneas de púas, lo que inflige daño mágico y se puede relanzar en un lapso de 4 seg.", "evelynn_q"),
                Skill("Seducción", "Evelynn maldice a su objetivo, lo que hace que, tras una espera, su siguiente ataque o hechizo encante y reduzca la resistencia mágica de su objetivo.", "evelynn_w"),
                Skill("Latigazo", "Evelynn ataca a su objetivo con su látigo, lo que inflige daño. Luego, obtiene velocidad de movimiento durante unos momentos.", "evelynn_e"),
                Skill("Última Caricia", "Evelynn se vuelve inalcanzable y diezma la zona frente a ella antes de teletransportarse una larga distancia hacia atrás.", "evelynn_r")
            )

            "vex" -> listOf(
                Skill("Pena y Pesar", "Vex se potencia de forma periódica, lo que hace que su siguiente habilidad básica asuste a los enemigos e interrumpa los desplazamientos. Cada vez que un enemigo cercano se desplaza, Vex aplica una marca que se puede consumir para infligir daño adicional que también reduce el enfriamiento de su estado potenciado.", "vex_passive"),
                Skill("Descarga Mistral", "Lanza un misil dañino que acelera durante su vuelo.", "vex_q"),
                Skill("Espacio Personal", "Obtiene un escudo y daña a los enemigos cercanos.", "vex_w"),
                Skill("Amenaza Umbría", "Invoca una zona dañina y ralentizadora que aplica Pesar a los enemigos.", "vex_e"),
                Skill("¡Haz lo Tuyo, Sombra!", "Dispara un misil que marca a un campeón enemigo. Vuelve a lanzarla para desplazarte hacia ellos e infligirles daño.", "vex_r")
            )

            "jhin" -> listOf(
                Skill("Murmullo", "El cañón de mano de Jhin, Murmullo, es un instrumento preciso diseñado para infligir daño superior. Dispara a una velocidad fija y solo tiene cuatro disparos. Jhin imbuye la última bala con magia oscura para realizar un golpe crítico e infligir daño de ejecución adicional. Cada vez que Murmullo inflige un golpe crítico, inspira a Jhin con un aumento de velocidad de movimiento.", "jhin_passive"),
                Skill("Granada Bailarina", "Jhin lanza un cartucho mágico contra el enemigo. Puede golpear hasta cuatro objetivos y obtiene daño cada vez que mata.", "jhin_q"),
                Skill("Brote Mortal", "Jhin esgrime su bastón y dispara una sola bala con un enorme alcance. Atraviesa a los súbditos y monstruos, pero se detiene en el primer campeón impactado. El objetivo queda inmovilizado si fue alcanzado recientemente por ataques de aliados de Jhin, Trampas de Loto, o si recibió daño de Jhin.", "jhin_w"),
                Skill("Audiencia Cautiva", "Jhin coloca una trampa de loto invisible que florece cuando se camina por encima de ella y ralentiza a los enemigos cercanos antes de infligir daño con una explosión de pétalos serrados. La Belleza de la Muerte: Cuando Jhin mata a un campeón enemigo, una trampa florecerá cerca del cadáver.", "jhin_e"),
                Skill("Llamado a Escena", "Jhin canaliza, lo que transforma a Murmullo en un mega cañón montado al hombro. Puede disparar 4 superbalas desde distancias extremas que atraviesan a los súbditos y a los monstruos, pero se detienen en el primer campeón que impacta. Murmullo incapacita a los enemigos que golpea, lo que los ralentiza y retrasa el daño de ejecución. El cuarto disparo está perfectamente diseñado, es épicamente poderoso, y garantiza un golpe crítico.", "jhin_r")
            )

            "viego" -> listOf(
                Skill("Dominio del Soberano", "Los enemigos que caen ante Viego se convierten en espectros. Viego se apodera por un momento del cuerpo del enemigo muerto cuando ataca a un espectro, con lo que se cura un porcentaje de la vida máxima de su objetivo y obtiene acceso a sus habilidades básicas y objetos. Reemplaza su definitiva por un lanzamientos sin costo de su propia definitiva.", "viego_passive"),
                Skill("Espada del Rey Arruinado", "La espada espectral de Viego inflige daño adicional al impacto igual a un porcentaje de la vida actual de forma pasiva y ataca dos veces a los enemigos que haya impactado recientemente con una habilidad para robarles vida. Viego puede activar esta habilidad para realizar una estocada con su mandoble y empalar a los enemigos delante de él.", "viego_q"),
                Skill("Fauces Espectrales", "Viego carga antes de desplazarse hacia adelante y libera una bola de Niebla Negra concentrada que aturde al primer enemigo alcanzado.", "viego_w"),
                Skill("Sendero Arruinado", "Viego ordena a la Niebla Negra que vigile y rodee una parte del terreno. Viego puede esconderse en la Niebla como un espectro y así obtener camuflaje, velocidad de movimiento y velocidad de ataque.", "viego_e"),
                Skill("Rompecorazones", "Viego se teletransporta a un lugar cercano y ejecuta a un campeón enemigo al llegar, perforando su corazón y causando una onda de choque destructiva a su alrededor que repele a sus aliados.", "viego_r")
            )

            else -> listOf(
                Skill("Pasiva", "Descripción pendiente.", "${fileKey}_passive"),
                Skill("Q", "Descripción pendiente.", "${fileKey}_q"),
                Skill("W", "Descripción pendiente.", "${fileKey}_w"),
                Skill("E", "Descripción pendiente.", "${fileKey}_e"),
                Skill("R", "Descripción pendiente.", "${fileKey}_r")
            )
        }
    }

    private fun kaynSkills(): List<Skill> = listOf(
        Skill("La Guadaña Darkin", "Kayn empuña un arma antigua y pelea contra Rhaast, el darkin en su interior, por el control de su cuerpo. El Darkin triunfará o Kayn dominará a Rhaast y se convertirá en el Asesino Sombrío. Darkin: cura un porcentaje del daño de hechizos infligido a campeones. Asesino Sombrío: inflige daño adicional los primeros segundos en combate contra campeones enemigos.", "kayn_passive"),
        Skill("Corte Segador", "Kayn se desplaza y luego ataca. Ambas acciones infligen daño físico.", "kayn_q"),
        Skill("Alcance de Cuchilla", "Kayn inflige daño físico y ralentiza objetivos en una línea.", "kayn_w"),
        Skill("Paso Sombrío", "Kayn obtiene velocidad de movimiento y se cura mientras pueda caminar por el terreno.", "kayn_e"),
        Skill("Transgresión del Umbral", "Kayn se esconde en el cuerpo de un enemigo e inflige daño físico masivo cuando sale.", "kayn_r")
    )

    private fun rhaastSkills(): List<Skill> = listOf(
        Skill("La Guadaña Darkin (Rhaast)", "El Oscuro ha tomado el control. Se especializa en el aguante y control de masas contra tanques. Cuando inflige daño a campeones enemigos se cura por el daño infligido.", "rhaast_passive"),
        Skill("Corte Segador (Rhaast)", "Inflige más daño en base a la vida máxima de los enemigos.", "rhaast_q"),
        Skill("Alcance de Cuchilla (Rhaast)", "Ahora al usarla, levanta a los enemigos por los aires.", "rhaast_w"),
        Skill("Paso Sombrío (Rhaast)", "Puede caminar sobre muros.", "rhaast_e"),
        Skill("Transgresión del Umbral (Rhaast)", "Al usarla hace daño en base a la vida del enemigo y se cura en base a esta misma.", "rhaast_r")
    )

    private fun assasinSkills(): List<Skill> = listOf(
        Skill("La Guadaña Darkin (Asesino Sombrío)", "Kayn ha dominado a Rhaast. Se especializa en eliminar objetivos frágiles con gran movilidad. Cuando Kayn no ha recibido daño sus ataques y habilidades se potencian con daño mágico contra campeones.", "assasin_passive"),
        Skill("Corte Segador", "Deslizamiento y ataque circular con un aumento de rango de desplazamiento.", "assasin_q"),
        Skill("Alcance de Cuchilla", "Kayn ahora puede moverse mientras usa esta habilidad y aumenta el alcance de esta misma.", "assasin_w"),
        Skill("Paso Sombrío", "Obtiene un aumento de velocidad de movimiento al usarla y se vuelve inmune a ralentizaciones.", "assasin_e"),
        Skill("Transgresión del Umbral", "Aumenta el alcance de la habilidad antes y después de salir de la posesión al enemigo.", "assasin_r")
    )
}