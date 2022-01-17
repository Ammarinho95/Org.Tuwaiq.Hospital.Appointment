package com.example.orgtuwaiqhospitalappointment.repository

import androidx.lifecycle.MutableLiveData
import com.example.orgtuwaiqhospitalappointment.model.User
import com.example.orgtuwaiqhospitalappointment.network.API
import com.example.orgtuwaiqhospitalappointment.network.UserService
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class UserRepository {
    fun getUserAppointment(): MutableLiveData<List<User>> {
        var mutableLiveData = MutableLiveData<List<User>>()
        var UserService = API.getInstance().create(UserService::class.java)
        UserService.getUserByFbId().enqueue(object : Callback<List<User>> {
            override fun onResponse(call: Call<List<User>>, response: Response<List<User>>) {
                mutableLiveData.postValue(response.body())
            }

            override fun onFailure(call: Call<List<User>>, t: Throwable) {


            }

        })
        return mutableLiveData


    }

}
