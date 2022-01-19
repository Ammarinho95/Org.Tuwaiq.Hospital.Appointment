package com.example.orgtuwaiqhospitalappointment.network

import com.example.orgtuwaiqhospitalappointment.model.Appointment
import com.example.orgtuwaiqhospitalappointment.model.Clinic
import retrofit2.Call
import retrofit2.http.GET

interface AppointmentService {

    @GET("Appointment")
    fun getAllAppointment(): Call<List<Appointment>>
}