package com.example.travelplanner.domain.model

data class Trip(
    val id: Long,
    val destination: String,
    val countryEmoji: String,
    val startDate: String,
    val endDate: String
)