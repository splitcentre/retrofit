package com.example.retrofit.network

import com.example.retrofit.model.Hero
import retrofit2.Call
import retrofit2.http.GET

interface ApiService {
    @GET("hero")
    fun getAllUsers(): Call<Hero>
}