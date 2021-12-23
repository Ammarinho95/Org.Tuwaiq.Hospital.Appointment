package com.example.orgtuwaiqhospitalappointment.view.BookAppointment

import android.app.DatePickerDialog
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.widget.Button
import android.widget.ImageView
import android.widget.RadioButton
import android.widget.TextView
import com.example.orgtuwaiqhospitalappointment.R
import com.example.orgtuwaiqhospitalappointment.view.row.rowActivity
import com.google.android.material.textfield.TextInputEditText
import java.util.*
import android.widget.RadioGroup




class BookAppointmentActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_book_appointment)



        var inperson = findViewById<RadioButton>(R.id.radioButtonInperson)
        var virtual = findViewById<RadioButton>(R.id.radioButtonVirtual)
        var PatientName = findViewById<TextInputEditText>(R.id.textPatientName1)
        var ClincName = findViewById<TextInputEditText>(R.id.textClincName1)
        var btnBook = findViewById<Button>(R.id.buttonBook)
        var selectDate = findViewById<TextView>(R.id.textViewPickdate)
        var showDate= findViewById<TextView>(R.id.textViewshowDate)
        var selectDateIcon = findViewById<ImageView>(R.id.imageViewCalender)

        selectDateIcon.setOnClickListener {
            val c = Calendar.getInstance()
            val year = c.get(Calendar.YEAR)
            val month = c.get(Calendar.MONTH)
            val day = c.get(Calendar.DAY_OF_MONTH)

            var dialogDatePickerDialog = DatePickerDialog(
                this,
                DatePickerDialog.OnDateSetListener { datePicker, year, month, day ->
                    showDate.text = "$day/$month/$year"
                },
                year,
                month,
                day
            )
            dialogDatePickerDialog.show()
        }



    }
}