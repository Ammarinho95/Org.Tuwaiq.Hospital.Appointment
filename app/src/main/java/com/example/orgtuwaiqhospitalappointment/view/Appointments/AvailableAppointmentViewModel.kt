//package com.example.orgtuwaiqhospitalappointment.view.Appointments
//
//import androidx.lifecycle.MutableLiveData
//import androidx.lifecycle.ViewModel
//import com.example.orgtuwaiqhospitalappointment.model.Appointment
//import com.example.orgtuwaiqhospitalappointment.repository.AppointmentRepository
//
//class AvailableAppointmentViewModel: ViewModel() {
//    fun getAllAppointment():MutableLiveData<List<Appointment>>{
//        var mutableLiveData= MutableLiveData<List<Appointment>>()
//        var AppoiRepo= AppointmentRepository()
//        AppoiRepo.getAllAppointment().observeForever {
//            if (it)
//        }
//
//
//    }
//}