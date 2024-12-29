package com.geekforgeek.elearningapp

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun HomeScreen() {
    Column(
        modifier = Modifier.padding(16.dp)
    ) {

        Spacer(Modifier.height(56.dp))
        CourseCard()

    }
}

@Composable
fun CourseCard() {
    Card(
        modifier = Modifier.padding(16.dp),
        elevation = CardDefaults.cardElevation(defaultElevation = 8.dp),
        onClick = {}
    ) {
        Column {
            // course Image
            Image(
                painter = painterResource(R.drawable.ic_dsa_course),
                contentDescription = "Course Image",
                modifier = Modifier.size(height = 180.dp, width = 500.dp),
                contentScale = ContentScale.Crop
            )

//                Course Name
            Text(
                text = "DSA course",
                fontWeight = FontWeight.Bold,
                fontSize = 18.sp,
                modifier = Modifier.padding(start = 16.dp, end = 16.dp, top = 16.dp)
            )

            Row(
                modifier = Modifier
                    .padding(start = 16.dp, end = 16.dp, top = 8.dp)
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
//                    Course Rating
                Card(
                    modifier = Modifier.padding(8.dp),
                    elevation = CardDefaults.cardElevation(defaultElevation = 8.dp)
                ) {
                    Row(
                        modifier = Modifier.padding(8.dp),
                    ) {
                        Text("4.4")
                        Icon(
                            Icons.Default.Star,
                            contentDescription = "Star",
                            modifier = Modifier
                                .size(20.dp)
                                .padding(start = 8.dp)
                        )
                    }
                }

                // How many chose the course

                Text(
                    text = "446k+ Interested Geeks",
                    modifier = Modifier.align(Alignment.CenterVertically)
                )
            }

            // Enroll Button
            Button(
                onClick = {},
                modifier = Modifier
                    .padding(
                        start = 20.dp,
                        end = 20.dp,
                        top = 8.dp,
                        bottom = 20.dp
                    )
                    .fillMaxWidth(),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color.White
                ),
                shape = RoundedCornerShape(4.dp),
                elevation = ButtonDefaults.buttonElevation(defaultElevation = 8.dp)
            ) {
                Text("Enroll Now", color = Color.Green)
            }
        }
    }
}



























