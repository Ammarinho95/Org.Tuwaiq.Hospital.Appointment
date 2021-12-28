package com.example.orgtuwaiqhospitalappointment.network

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


class API {
    companion object {
        private val retrofit: Retrofit

        init {
            retrofit = Retrofit.Builder()
                .baseUrl("https://61b881f064e4a10017d1900c.mockapi.io/")
                .addConverterFactory(GsonConverterFactory.create())
                .build()

        }
        fun getInstance():Retrofit{
            return retrofit
        }
    }
}