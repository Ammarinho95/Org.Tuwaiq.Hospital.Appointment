package com.example.orgtuwaiqhospitalappointment.view.Login

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import com.example.orgtuwaiqhospitalappointment.R
import com.example.orgtuwaiqhospitalappointment.view.BookAppointment.BookAppointmentActivity
import com.example.orgtuwaiqhospitalappointment.view.Home.HomeActivity
import com.example.orgtuwaiqhospitalappointment.view.signup.SignUpActivity
import com.google.android.material.textfield.TextInputEditText
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_log_in_page)


        var email = findViewById<TextInputEditText>(R.id.textInputEmail1)
        var password = findViewById<TextInputEditText>(R.id.textInputPassword1)
        var blogin = findViewById<Button>(R.id.buttonLogin)
        var newUser = findViewById<TextView>(R.id.textViewSignup)
        var contactus= findViewById<TextView>(R.id.textViewcontactus)




        blogin.setOnClickListener {

            var auth = Firebase.auth

            auth.signInWithEmailAndPassword(email.text.toString(), password.text.toString())
                .addOnCompleteListener { task ->
                    if (task.isSuccessful) {
                        var user = auth.currentUser
                        Toast.makeText(this, "Login success", Toast.LENGTH_SHORT).show()

                        var i = Intent(this, HomeActivity::class.java)
                        startActivity(i)

                    } else {
                        println("failed")
                    }

                }
                .addOnFailureListener {

                }

        }

        newUser.setOnClickListener {

            var i = Intent(this, SignUpActivity::class.java)
            startActivity(i)

        }
        contactus.setOnClickListener {
            val u = Uri.parse("tel:0553175793")
            val i = Intent(Intent.ACTION_DIAL, u)
            try {
                startActivity(i)
            } catch (s: SecurityException) {
                Toast.makeText(this, "An error occurred", Toast.LENGTH_LONG)
                    .show()


            }

        }


    }


}
