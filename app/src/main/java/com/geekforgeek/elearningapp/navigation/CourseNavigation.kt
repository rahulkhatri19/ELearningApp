package com.geekforgeek.elearningapp.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.geekforgeek.elearningapp.ExploreScreen
import com.geekforgeek.elearningapp.HomeScreen
import com.geekforgeek.elearningapp.MyCourses
import com.geekforgeek.elearningapp.ProfileScreen

@Composable
fun CourseNavigation(navigationController: NavHostController) {
    NavHost(
        navController = navigationController,
        startDestination = BottomNavigationItems.Home.route
    ) {
        composable(BottomNavigationItems.Home.route) {
            HomeScreen()
        }
        composable(BottomNavigationItems.Explore.route) {
            ExploreScreen()
        }
        composable(BottomNavigationItems.My_Course.route) {
            MyCourses()
        }
        composable(BottomNavigationItems.Profile.route) {
            ProfileScreen()
        }
    }
}

object CourseRoute {
    const val HOME_SCREEN = "Home"
    const val EXPLORE_SCREEN = "Explore"
    const val MY_COURSES = "My Courses"
    const val PROFILE = "Profile"
}