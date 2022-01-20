package com.example.orgtuwaiqhospitalappointment.Util

import android.content.Context

class SharedPreference {
    companion object{
        fun saveUserId(context: Context,userId:String){
            val sharedPreference =  context.getSharedPreferences("MY_Pref",Context.MODE_PRIVATE)
            var editor = sharedPreference.edit()
            editor.putString("userid",userId)
            editor.commit()
        }

        fun getUserId(context: Context):String{
            var userId= ""
            val sharedPreference= context.getSharedPreferences("MY_Pref",Context.MODE_PRIVATE)
            userId = sharedPreference.getString("userid","null").toString()
            return userId

        }

    }
}