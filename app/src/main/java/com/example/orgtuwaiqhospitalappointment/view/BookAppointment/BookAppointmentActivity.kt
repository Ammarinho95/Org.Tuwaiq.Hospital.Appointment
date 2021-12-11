package com.example.orgtuwaiqhospitalappointment.view.BookAppointment

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.example.orgtuwaiqhospitalappointment.R
import com.example.orgtuwaiqhospitalappointment.view.row.rowActivity

class BookAppointmentActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_book_appointment)

        Handler().postDelayed({
            var i= Intent(this,rowActivity::class.java)
            startActivity(i)

        },3000)

    }
}