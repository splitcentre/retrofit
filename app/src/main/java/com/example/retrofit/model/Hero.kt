package com.example.retrofit.model

import com.google.gson.annotations.SerializedName

data class Hero(
    @SerializedName("data")
    val `data`: List<Data>
)
