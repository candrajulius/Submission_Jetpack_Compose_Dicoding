package com.candra.submissionjetpackcomposebootcamp

import androidx.compose.foundation.layout.padding
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Home
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.candra.submissionjetpackcomposebootcamp.navigation.NavigationItem
import com.candra.submissionjetpackcomposebootcamp.navigation.Screen
import com.candra.submissionjetpackcomposebootcamp.ui.components.ProfileItems
import com.candra.submissionjetpackcomposebootcamp.ui.screen.detail.DetailProgram
import com.candra.submissionjetpackcomposebootcamp.ui.screen.home.HomeScreen
import com.candra.submissionjetpackcomposebootcamp.ui.theme.SubmissionJetpackComposeBootcampTheme

@Composable
fun ProgramAppNavigation(
    modifier: Modifier = Modifier,
    navController: NavHostController = rememberNavController()
)
{
    val navBackStackEntry by navController.currentBackStackEntryAsState()
    val currentRoute = navBackStackEntry?.destination?.route

    Scaffold(
        bottomBar = {
            if (currentRoute != Screen.DetailProgram.route){
                BottomBar(navController)
            }
        },
        modifier = modifier
    ) { innerPadding ->
        NavHost(navController = navController, startDestination = Screen.Home.route,
        modifier = Modifier.padding(innerPadding))
        {
            composable(Screen.Home.route)
            {
                HomeScreen(navigateToDetail = { programsId ->
                    navController.navigate(Screen.DetailProgram.createRoute(programsId))
                })
            }
            composable(Screen.Profile.route){
                ProfileItems()
            }
            composable(
                route = Screen.DetailProgram.route,
                arguments = listOf(navArgument("programsId"){type = NavType.IntType}),
            ){
                val idProgram = it.arguments?.getInt("programsId") ?: -1
                DetailProgram(programId = idProgram, navigateToBack = {
                    navController.navigateUp()
                })
            }
        }
    }
}

@Composable
private fun BottomBar(
    navController: NavController,
    modifier: Modifier = Modifier
){
    BottomNavigation(
        modifier = modifier
    ) {
        val navBackStackEntry by navController.currentBackStackEntryAsState()
        val currentRoute = navBackStackEntry?.destination?.route

        val navigationItems = listOf(
            NavigationItem(
                title = "Home",
                icon = Icons.Default.Home,
                screen = Screen.Home
            ),
            NavigationItem(
                title = "Profile",
                icon = Icons.Default.AccountCircle,
                screen = Screen.Profile
            ),
        )

        BottomNavigation {
            navigationItems.map { items ->
                BottomNavigationItem(
                    icon = {
                        Icon(
                            imageVector = items.icon,
                            contentDescription = items.title
                        )
                    },
                    label = { Text(text = items.title)},
                    selected = currentRoute == items.screen.route,
                    onClick = {navController.navigate(items.screen.route){
                        popUpTo(navController.graph.findStartDestination().id){
                            saveState = true
                        }
                        restoreState = true
                        launchSingleTop = true
                    } }
                )
            }
        }
    }
}
@Preview(showBackground = true)
@Composable
fun ProgramThemePreview()
{
    SubmissionJetpackComposeBootcampTheme {
        ProgramAppNavigation()
    }
}