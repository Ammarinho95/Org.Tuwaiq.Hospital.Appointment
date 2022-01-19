package com.example.orgtuwaiqhospitalappointment.repository

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.orgtuwaiqhospitalappointment.model.Appointment
import com.example.orgtuwaiqhospitalappointment.model.Clinic
import com.example.orgtuwaiqhospitalappointment.network.API
import com.example.orgtuwaiqhospitalappointment.network.AppointmentService
import com.example.orgtuwaiqhospitalappointment.network.ClinicService
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class AppointmentRepository {
    fun getAllAppointment(): MutableLiveData<List<Appointment>> {
        var mutableLiveData = MutableLiveData<List<Appointment>>()
        var appointmentService = API.getInstance().create(AppointmentService::class.java)
        appointmentService.getAllAppointment().enqueue(object : Callback<List<Appointment>> {
            override fun onResponse(call: Call<List<Appointment>>, response: Response<List<Appointment>>) {
                mutableLiveData.postValue(response.body())
            }

            override fun onFailure(call: Call<List<Appointment>>, t: Throwable) {

            }


        })



        return mutableLiveData
    }
}