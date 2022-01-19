package com.example.orgtuwaiqhospitalappointment.UnitTesting

object validator {
    fun validateInput(Email: Int, Password: String): Boolean {
        return !(Email <= 0 || Password.isEmpty())

    }
}