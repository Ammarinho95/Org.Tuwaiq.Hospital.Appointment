package com.example.orgtuwaiqhospitalappointment.view.BookAppointment

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.widget.Button
import android.widget.RadioButton
import com.example.orgtuwaiqhospitalappointment.R
import com.example.orgtuwaiqhospitalappointment.view.row.rowActivity
import com.google.android.material.textfield.TextInputEditText

class BookAppointmentActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_book_appointment)

        var inperson = findViewById<RadioButton>(R.id.radioButtonInperson)
        var virtual = findViewById<RadioButton>(R.id.radioButtonVirtual)
        var PatientName = findViewById<TextInputEditText>(R.id.textPatientName1)
        var ClincName = findViewById<TextInputEditText>(R.id.textClincName1)
        var HealthCareCenter = findViewById<TextInputEditText>(R.id.textHealthCenter1)
        var btnBook= findViewById<Button>(R.id.buttonBook)















        Handler().postDelayed({
            var i = Intent(this, rowActivity::class.java)
            startActivity(i)

        }, 3000)


    }
}