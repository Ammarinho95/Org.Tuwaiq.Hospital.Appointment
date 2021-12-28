package com.example.orgtuwaiqhospitalappointment.model

import java.io.Serializable

data class Clinic(
    val Location: String,
    val description: String,
    val id: String,
    val name: String
): Serializable