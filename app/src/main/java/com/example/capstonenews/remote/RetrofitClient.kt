package com.example.capstonenews.remote

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


interface RetrofitClient {
    private var retrofit: Retrofit?=null

    fun getClient(baseUrl:String?):Retrofit{
        if(retrofit == null)
        {
            retrofit = retrofit.Builder()
                .baseUrl(baseUrl)
                .addConverterFactory(GsonConverterFactory.create())
                .build()
        }
        return retrofit!!
    }
}