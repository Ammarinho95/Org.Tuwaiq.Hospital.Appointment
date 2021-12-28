package com.example.orgtuwaiqhospitalappointment.network

import com.example.orgtuwaiqhospitalappointment.model.Clinic
import retrofit2.Call
import retrofit2.http.GET

interface ClinicService {

    @GET("clinics")
    fun getAllClinics(): Call<List<Clinic>>
}