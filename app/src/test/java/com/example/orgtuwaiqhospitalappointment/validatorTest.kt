package com.example.orgtuwaiqhospitalappointment

import com.example.orgtuwaiqhospitalappointment.UnitTesting.validator
import com.google.common.truth.Truth.assertThat
import org.junit.Assert
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4
import javax.xml.validation.Validator


@RunWith(JUnit4::class)

class validatorTest {
    @Test
    fun whenInputIsValid() {

        Assert.assertEquals(validator.validateEmptyInput(""),true)



    }
}