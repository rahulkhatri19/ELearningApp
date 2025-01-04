package com.geekforgeek.elearningapp.navigation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Search
import androidx.compose.ui.graphics.vector.ImageVector
import com.geekforgeek.elearningapp.navigation.CourseRoute.HOME_SCREEN
import com.geekforgeek.elearningapp.navigation.CourseRoute.EXPLORE_SCREEN
import com.geekforgeek.elearningapp.navigation.CourseRoute.MY_COURSES
import com.geekforgeek.elearningapp.navigation.CourseRoute.PROFILE

sealed class BottomNavigationItems(val route: String, val icon: ImageVector, val label: String) {
    data object Home: BottomNavigationItems(HOME_SCREEN, Icons.Default.Home, HOME_SCREEN)
    data object Explore: BottomNavigationItems(EXPLORE_SCREEN, Icons.Default.Search, EXPLORE_SCREEN)
    data object My_Course: BottomNavigationItems(MY_COURSES, Icons.Default.Info, MY_COURSES)
    data object Profile: BottomNavigationItems(PROFILE, Icons.Default.Person, PROFILE)
}
