package com.dicoding.newsapp.data.remote.retrofit

import com.dicoding.newsapp.data.remote.response.NewsResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {
    @GET("everything?q=tesla&sortBy=publishedAt")
    fun getNews(@Query("apiKey") apiKey: String): Call<NewsResponse>
}