package com.example.capstonenews.common

import com.example.capstonenews.`interface`.NewsService
import com.example.capstonenews.remote.RetrofitClient

object Common {
    val BASE_URL = "https://newsapi.org/"
    val API_KEY = "8c51232dce9742fdb24ba656a1c1dc35"

    val newsService:NewsService
    get()=RetrofitClient.getClient(BASE_URL).create(NewsService::class.java)
}