package com.geekforgeek.elearningapp

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid
import androidx.compose.foundation.lazy.staggeredgrid.StaggeredGridCells
import androidx.compose.foundation.lazy.staggeredgrid.items
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun ExploreScreen() {

    val exploreList = arrayListOf<ExploreModel>()
    exploreList.add(
        ExploreModel(
            "DSA course",
            "Python, Java, ML",
            listOf(
                Color(0xffC6FFDD),
                Color(0xffFBD786),
                Color(0xfff7797d)
            )
        )
    )
    exploreList.add(
        ExploreModel(
            "DSA course is Good Nice",
            "Python, Java, ML",
            listOf(
                Color(0xffC6FFDD),
                Color(0xffFBD786),
                Color(0xfff7797d)
            )
        )
    )
    exploreList.add(
        ExploreModel(
            "Computer Programming course is Great Course",
            "Python, Java, ML",
            listOf(
                Color(0xffC6FFDD),
                Color(0xffFBD786),
                Color(0xfff7797d)
            )
        )
    )
    exploreList.add(
        ExploreModel(
            "DSA course",
            "Python, Java, ML",
            listOf(
                Color(0xffC6FFDD),
                Color(0xffFBD786),
                Color(0xfff7797d)
            )
        )
    )

    Column {

        Spacer(Modifier.height(56.dp))

        LazyVerticalStaggeredGrid (
            columns = StaggeredGridCells.Fixed(2)
        ) {
            items(exploreList) { list ->
                Card(
                    modifier = Modifier
                        .padding(8.dp)
                        .fillMaxSize(),
                    elevation = CardDefaults.cardElevation(defaultElevation = 8.dp)
                ) {
                    Box(
                        modifier = Modifier
                            .background(Brush.horizontalGradient(list.colorList))
                            .fillMaxWidth()
                    ) {
                        Column {
                            Text(
                                text = list.title,
                                modifier = Modifier.padding(
                                    start = 16.dp,
                                    end = 16.dp,
                                    top = 16.dp
                                ),
                                color = Color.White
                            )

                            Text(
                                text = list.description,
                                modifier = Modifier.padding(
                                    start = 16.dp,
                                    end = 16.dp,
                                    top = 4.dp,
                                    bottom = 16.dp
                                ),
                                fontSize = 12.sp,
                                color = Color.White
                            )
                        }
                    }
                }
            }
        }
    }
}






















