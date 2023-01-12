package com.candra.submissionjetpackcomposebootcamp.navigation

sealed class Screen(
    val route: String
){
    object Home: Screen("home")
    object Profile: Screen("profile")
    object DetailProgram: Screen("home/{programsId}"){
        fun createRoute(programsId: Int) = "home/$programsId"
    }
}
