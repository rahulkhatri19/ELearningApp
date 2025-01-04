package com.geekforgeek.elearningapp.navigation

import android.annotation.SuppressLint
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun MainCourseScreen() {
    val navController = rememberNavController()
    val bottomNavItem = listOf(
        BottomNavigationItems.Home,
        BottomNavigationItems.Explore,
        BottomNavigationItems.My_Course,
        BottomNavigationItems.Profile,
    )

    Scaffold(
        bottomBar = {
            CourseBottomNavigation(navController, bottomNavItem)
        }
    ) {
        CourseNavigation(navController)
    }
}

@Composable
fun CourseBottomNavigation(
    navController: NavHostController,
    bottomMenuList: List<BottomNavigationItems>
) {
    NavigationBar {
        val currentRoute = createRoute(navController)
        bottomMenuList.forEach { list ->
            NavigationBarItem(
                icon = {
                    Icon(list.icon, contentDescription = "")
                },
                label = {
                    Text(text = list.label)
                },
                selected = currentRoute == list.route,
                onClick = {
                    if (currentRoute != list.route) {
                        navController.navigate(list.route)
                    }
                }
            )
        }
    }

}

@Composable
fun createRoute(navController: NavHostController): String? {
    val navBackStackEntry by navController.currentBackStackEntryAsState()
    return navBackStackEntry?.destination?.route
}





















