package com.example.orgtuwaiqhospitalappointment.view.Home

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import com.example.orgtuwaiqhospitalappointment.R
import com.example.orgtuwaiqhospitalappointment.view.BookAppointment.BookAppointmentActivity
import com.example.orgtuwaiqhospitalappointment.view.Profile.ProfileActivity

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        var bna = findViewById<ImageView>(R.id.imageViewBook)
        var vba = findViewById<ImageView>(R.id.imageViewViewAppointment)
        var EditProfile= findViewById<Button>(R.id.buttonEdit)


        bna.setOnClickListener {
            var i = Intent(this, BookAppointmentActivity::class.java)
            startActivity(i)



        }
        EditProfile.setOnClickListener {
            var i = Intent(this,ProfileActivity::class.java)
            startActivity(i)
        }


    }
}