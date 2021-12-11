package com.example.orgtuwaiqhospitalappointment.view.signup

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.example.orgtuwaiqhospitalappointment.R
import com.example.orgtuwaiqhospitalappointment.view.Home.HomeActivity

class SignUpActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)

        Handler().postDelayed({
            var i= Intent(this, HomeActivity::class.java)
            startActivity(i)

        },3000)
    }
}