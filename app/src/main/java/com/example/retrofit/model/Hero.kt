package com.example.retrofit.model

import com.google.gson.annotations.SerializedName

data class Hero(
    @SerializedName("result")
    val `result`: List<Data>
)
