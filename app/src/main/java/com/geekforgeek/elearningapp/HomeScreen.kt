package com.geekforgeek.elearningapp

import android.content.Context
import android.content.Intent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
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
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil3.compose.AsyncImage
import coil3.request.ImageRequest
import coil3.request.crossfade
import com.geekforgeek.PaymentActivity
import com.geekforgeek.elearningapp.model.CourseModel

@Composable
fun HomeScreen() {
    val context = LocalContext.current
    Column(
        modifier = Modifier.padding(16.dp)
    ) {
        val homeScreenData = CourseRepo().getJsonData(LocalContext.current)
        val courseList = CourseRepo().getHomeCourseData(homeScreenData)
        Spacer(Modifier.height(56.dp))

        LazyColumn {
            items(courseList) { list ->
                CourseCard(list, context)
            }
        }
    }
}

@Composable
fun CourseCard(list: CourseModel, context: Context) {
    Card(
        modifier = Modifier.padding(16.dp),
        elevation = CardDefaults.cardElevation(defaultElevation = 8.dp),
        onClick = {

        }
    ) {
        Column {
            // course Image
            AsyncImage(
                model = ImageRequest.Builder(LocalContext.current)
                    .data(list.courseImage)
                    .crossfade(true)
                    .build(),
                contentDescription = "Course Image",
                contentScale = ContentScale.Crop,
                modifier = Modifier.size(height = 180.dp, width = 500.dp)
            )

//                Course Name
            Text(
                text = list.courseTitle,
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
                        Text(list.rating)
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
                    text = "${list.numberOfGeeks} Interested Geeks",
                    modifier = Modifier.align(Alignment.CenterVertically)
                )
            }

            // Enroll Button
            Button(
                onClick = {
                    val paymentIntent = Intent(context, PaymentActivity::class.java)
                    context.startActivity(paymentIntent)
                },
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



























