package com.example.apppersonajespro.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.apppersonajespro.screens.ChampionDetailScreen
import com.example.apppersonajespro.screens.ChampionListScreen

object Routes {
    const val LIST = "champion_list"
    const val DETAIL = "champion_detail/{championId}"

    fun detail(championId: Int): String {
        return "champion_detail/$championId"
    }
}

@Composable
fun AppNavigation() {
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = Routes.LIST
    ) {
        composable(Routes.LIST) {
            ChampionListScreen(
                onChampionClick = { championId ->
                    navController.navigate(Routes.detail(championId))
                }
            )
        }

        composable(
            route = Routes.DETAIL,
            arguments = listOf(
                navArgument("championId") {
                    type = NavType.IntType
                }
            )
        ) { backStackEntry ->
            val championId = backStackEntry.arguments?.getInt("championId") ?: 1

            ChampionDetailScreen(
                championId = championId,
                onBackClick = {
                    navController.popBackStack()
                }
            )
        }
    }
}