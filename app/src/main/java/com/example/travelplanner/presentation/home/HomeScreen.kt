package com.example.travelplanner.presentation.home

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.travelplanner.domain.model.Trip
import com.example.travelplanner.presentation.components.TripCard

@Composable
fun HomeScreen() {

    val nextTrip = Trip(
        id = 1,
        destination = "Rome",
        countryEmoji = "🇮🇹",
        startDate = "September 12",
        endDate = "September 18"
    )

    LazyColumn(
        modifier = Modifier.fillMaxSize(),
        contentPadding = PaddingValues(20.dp),
        verticalArrangement = Arrangement.spacedBy(20.dp)
    ) {
        item {
            Column {
                Text(
                    text = "Good morning"
                )

                Text(
                    text = "Ready for your next adventure?"
                )
            }
        }

        item {
            Text(
                text = "Your next trip"
            )
        }

        item {
            TripCard(trip = nextTrip)
        }
    }
}