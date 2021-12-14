package com.example.orgtuwaiqhospitalappointment.view.Login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import com.example.orgtuwaiqhospitalappointment.R
import com.example.orgtuwaiqhospitalappointment.view.signup.SignUpActivity
import com.google.android.material.textfield.TextInputEditText
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_log_in_page)

        var email = findViewById<TextInputEditText>(R.id.textInputEmail)
        var password = findViewById<TextInputEditText>(R.id.textInputPassword)
        var blogin = findViewById<Button>(R.id.buttonLogin)
        var newUser = findViewById<TextView>(R.id.textViewSignup)



        blogin.setOnClickListener {

            var auth = Firebase.auth

            auth.signInWithEmailAndPassword(email.text.toString(), password.text.toString())
                .addOnCompleteListener { task ->
                    if (task.isSuccessful) {
                        var user = auth.currentUser
                        Toast.makeText(this, "Login Failed", Toast.LENGTH_SHORT).show()

                    }
                }

        }

        newUser.setOnClickListener {

            var i = Intent(this, SignUpActivity::class.java)
            startActivity(i)


        }

    }
}