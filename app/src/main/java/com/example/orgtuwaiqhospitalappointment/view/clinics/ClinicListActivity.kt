package com.example.orgtuwaiqhospitalappointment.view.clinics

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.orgtuwaiqhospitalappointment.R

class ClinicListActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_clinic_list)

        val vm : ClinicListViewModel by viewModels()
        var mRecyclerView = findViewById<RecyclerView>(R.id.mRecyclerView)

        mRecyclerView.layoutManager = LinearLayoutManager(this)
        vm.getAllClinics().observe(this,{
            mRecyclerView.adapter = ClinicAdapter(it)
        })

    }
}
