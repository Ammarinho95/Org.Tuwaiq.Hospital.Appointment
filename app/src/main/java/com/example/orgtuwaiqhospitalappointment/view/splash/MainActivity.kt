package com.example.orgtuwaiqhospitalappointment.view.splash

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.example.orgtuwaiqhospitalappointment.R
import com.example.orgtuwaiqhospitalappointment.Util.SharedPreference
import com.example.orgtuwaiqhospitalappointment.view.Home.HomeActivity
import com.example.orgtuwaiqhospitalappointment.view.Login.LoginActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var userId = SharedPreference.getUserId(this)

        Handler().postDelayed({

            if(userId == "null") {
                var i = Intent(this, LoginActivity::class.java)
                startActivity(i)
            }else {
                var i = Intent(this, HomeActivity::class.java)
                startActivity(i)
            }

        },3000)
    }
}
