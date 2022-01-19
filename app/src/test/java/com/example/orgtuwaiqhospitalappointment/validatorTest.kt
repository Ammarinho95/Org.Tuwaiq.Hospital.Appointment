package com.example.orgtuwaiqhospitalappointment

import com.example.orgtuwaiqhospitalappointment.UnitTesting.validator
import com.google.common.truth.Truth.assertThat
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4


@RunWith(JUnit4::class)

class validatorTest {

    @Test
    fun whenInputIsValid() {

        val Email = 100
        val Password = "Less than 6 nunmbers or leter"
        val result= validator.validateInput(Email,Password)
        assertThat(result).isEqualTo(false)


    }
}