package com.example.orgtuwaiqhospitalappointment.repository

import androidx.lifecycle.MutableLiveData
import com.example.orgtuwaiqhospitalappointment.model.Clinic
import com.example.orgtuwaiqhospitalappointment.network.API
import com.example.orgtuwaiqhospitalappointment.network.ClinicService
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class ClinicRepository {

    fun getAllClinics(): MutableLiveData<List<Clinic>> {
        var mutableLiveData = MutableLiveData<List<Clinic>>()
        var clinicService = API.getInstance().create(ClinicService::class.java)
        clinicService.getAllClinics().enqueue(object : Callback<List<Clinic>> {
            override fun onResponse(call: Call<List<Clinic>>, response: Response<List<Clinic>>) {
                mutableLiveData.postValue(response.body())
            }

            override fun onFailure(call: Call<List<Clinic>>, t: Throwable) {

            }


        })



        return mutableLiveData
    }
}