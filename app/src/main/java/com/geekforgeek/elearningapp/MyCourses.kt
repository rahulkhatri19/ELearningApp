package com.geekforgeek.elearningapp

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp

@Composable
fun MyCourses() {
    Column {
        Spacer(Modifier.height(56.dp))
        Card(
            modifier = Modifier.padding(16.dp),
            elevation = CardDefaults.cardElevation(defaultElevation = 8.dp)
        ) {
            Row(
                Modifier
                    .fillMaxWidth()
                    .height(140.dp)) {
                Image(
                    painter = painterResource(R.drawable.ic_dsa_course),
                    contentDescription = "",
                    modifier = Modifier
                        .fillMaxWidth(.4f)
                        .fillMaxHeight(),
                    contentScale = ContentScale.FillBounds
                )

                Column {

                    Text(
                        text = "DSA to Development a Complete Guide",
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier.padding(start = 16.dp, end = 16.dp, top = 16.dp)
                    )

                    Card(
                        modifier = Modifier.padding(8.dp),
                        elevation = CardDefaults.cardElevation(defaultElevation = 8.dp)
                    ) {
                        Text(
                            "Paid",
                            modifier = Modifier.padding(6.dp)
                        )
                    }
                }
            }
        }
    }
}