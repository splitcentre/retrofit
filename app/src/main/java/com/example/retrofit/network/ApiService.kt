package com.example.retrofit.network

import com.example.retrofit.model.Hero
import retrofit2.Call
import retrofit2.http.GET

interface ApiService {
    @GET("data.php")
    fun getAllChars(): Call<Hero>
}