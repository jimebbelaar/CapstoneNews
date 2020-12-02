package com.example.capstonenews.`interface`

import android.telecom.Call
import com.example.capstonenews.model.WebSite
import retrofit2.http.GET

interface NewsService {

    @get:GET("v2/sources?apiKey=8c51232dce9742fdb24ba656a1c1dc35")
    val sources: Call<WebSite>
}