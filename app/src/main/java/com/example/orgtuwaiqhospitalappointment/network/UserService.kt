package com.example.orgtuwaiqhospitalappointment.network

import com.example.orgtuwaiqhospitalappointment.model.User
import retrofit2.Call
import retrofit2.http.GET

interface UserService {
    @GET ("user")
    fun getUserByFbId(): Call<List<User>>
}