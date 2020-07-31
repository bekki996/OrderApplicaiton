package com.hfad.orderapplicaton.api

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET

interface ProductsApi {
    @GET("product")


    companion object{
        fun invoke():ProductsApi{
        return Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create())
            .baseUrl("http://prod-api.hojibobo.com/api/mobile")
            .build()
            .create(ProductsApi::class.java)
        }
    }
}