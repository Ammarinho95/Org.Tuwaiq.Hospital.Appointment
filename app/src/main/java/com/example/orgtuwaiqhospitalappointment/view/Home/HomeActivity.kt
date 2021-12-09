package com.example.orgtuwaiqhospitalappointment.view.Home

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.example.orgtuwaiqhospitalappointment.R
import com.example.orgtuwaiqhospitalappointment.view.BookAppointment.BookAppointmentActivity

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        Handler().postDelayed({
            var i= Intent(this,BookAppointmentActivity::class.java)
            startActivity(i)

        },3000)

    }
}