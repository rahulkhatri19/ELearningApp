package com.geekforgeek.elearningapp

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.KeyboardArrowRight
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun ProfileScreen() {
    Column {
        Spacer(Modifier.height(56.dp))

        Card(
            modifier = Modifier
                .padding(16.dp)
                .fillMaxWidth(),
            elevation = CardDefaults.cardElevation(defaultElevation = 8.dp)
        ) {
            Column(
                modifier = Modifier.padding(16.dp)
            ) {

                Row {
                    Icon(
                        Icons.Default.Person,
                        contentDescription = "Profile Image",
                        modifier = Modifier
                            .fillMaxWidth(0.3f)
                            .height(70.dp)
                            .align(Alignment.CenterVertically)
                    )

                    Column {
                        Text(
                            text = "Rahul Khatri"
                        )

                        Text(
                            text = "@rahulkhatri"
                        )

                        Text(
                            text = "Maharishi Arvinf College of Engg. & Tech. (MACET)"
                        )
                    }

                }

                Row(
                    horizontalArrangement = Arrangement.SpaceBetween,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(8.dp)
                ) {
                    Column(
                        modifier = Modifier
                            .border(BorderStroke(1.dp, Color.Black))
                            .padding(8.dp)
                    ) {
                        Text(
                            "0",
                            fontWeight = FontWeight.Bold,
                            modifier = Modifier.align(Alignment.CenterHorizontally)
                        )
                        Text("Followers")
                    }
                    Column(
                        modifier = Modifier
                            .border(BorderStroke(1.dp, Color.Black))
                            .padding(8.dp)
                    ) {
                        Text("0", fontWeight = FontWeight.Bold)
                        Text("Following")
                    }
                    Column(
                        modifier = Modifier
                            .border(BorderStroke(1.dp, Color.Black))
                            .padding(8.dp)
                    ) {
                        Text("0", fontWeight = FontWeight.Bold)
                        Text("Articles")
                    }
                }
            }
        }

        Card(
            modifier = Modifier.padding(start = 16.dp, end = 16.dp),
            elevation = CardDefaults.cardElevation(defaultElevation = 8.dp)
        ) {
            Column {
                Text(
                    text = "Content",
                    fontWeight = FontWeight.Bold,
                    fontSize = 18.sp,
                    modifier = Modifier.padding(vertical = 16.dp, horizontal = 28.dp)
                )

                Row(
                    modifier = Modifier
                        .padding(start = 16.dp, end = 16.dp, bottom = 16.dp)
                        .fillMaxWidth()
                        .border(BorderStroke(1.dp, Color.Black)),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {

                    Row {
                        Icon(
                            Icons.Default.Home,
                            "Home Icon",
                            modifier = Modifier.padding(start = 16.dp, top = 16.dp)
                        )
                        Text(
                            text = "My Courses",
                            fontWeight = FontWeight.Bold,
                            fontSize = 16.sp,
                            modifier = Modifier
                                .padding(start = 8.dp, top = 16.dp)
                        )
                    }


                    Icon(
                        Icons.Default.KeyboardArrowRight,
                        contentDescription = "Left Arrow",
                        modifier = Modifier.padding(16.dp)
                    )

                }

            }

        }
    }
}
















