package com.example.orgtuwaiqhospitalappointment.view.signup

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.widget.Button
import com.example.orgtuwaiqhospitalappointment.R
import com.example.orgtuwaiqhospitalappointment.view.Home.HomeActivity
import com.google.android.material.textfield.TextInputEditText
import com.google.firebase.auth.ktx.auth
import com.google.firebase.firestore.ktx.firestore
import com.google.firebase.ktx.Firebase

class SignUpActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)

        var email = findViewById<TextInputEditText>(R.id.inputEmail)
        var password = findViewById<TextInputEditText>(R.id.inputPassword)
        var fname = findViewById<TextInputEditText>(R.id.InputFullName)
        var phone = findViewById<TextInputEditText>(R.id.inputPhone)
        var btnsignup = findViewById<Button>(R.id.buttonsignUp)

        btnsignup.setOnClickListener {

            var auth = Firebase.auth

            auth.createUserWithEmailAndPassword(email.text.toString(), password.toString())
                .addOnCompleteListener { task ->

                    if (task.isSuccessful) {
                        println("User has been registered successfully with UID" + auth.currentUser?.uid)

                        val u = hashMapOf(
                            "email" to email.text.toString(),
                            "password" to password.text.toString(),
                            "phone" to phone.text.toString(),
                            "fullname" to fname.text.toString()

                        )
                        var db = Firebase.firestore

                        db.collection("users").document(auth.currentUser?.uid.toString())
                            .set(u)
                    } else {

                        println("Error")
                    }
                }.addOnFailureListener {
                    println(it.message)
                }


        }
    }
}