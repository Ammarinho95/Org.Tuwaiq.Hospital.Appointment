package com.example.orgtuwaiqhospitalappointment.view.clinics

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.orgtuwaiqhospitalappointment.model.Clinic
import com.example.orgtuwaiqhospitalappointment.repository.ClinicRepository

class ClinicListViewModel : ViewModel(){
    fun getAllClinics():MutableLiveData<List<Clinic>>{
        var mutableLiveData = MutableLiveData<List<Clinic>>()
        var cliRepo = ClinicRepository()
        cliRepo.getAllClinics().observeForever {
            if(it != null){
                mutableLiveData.postValue(it)
            }else {
                mutableLiveData.postValue(null)
            }
        }
        return mutableLiveData
    }
}