package com.example.orgtuwaiqhospitalappointment.network

import com.example.orgtuwaiqhospitalappointment.clinic
import retrofit2.Call
import retrofit2.http.GET

interface Apiinterface {

    @GET("clinics")
fun getData(): Call<List<clinic>>
}