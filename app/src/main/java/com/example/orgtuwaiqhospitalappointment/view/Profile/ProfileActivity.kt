package com.example.orgtuwaiqhospitalappointment.view.Profile

import android.content.ContentValues.TAG
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.example.orgtuwaiqhospitalappointment.R
import com.example.orgtuwaiqhospitalappointment.model.User
import com.example.orgtuwaiqhospitalappointment.view.Login.LoginActivity
import com.google.firebase.auth.ktx.auth
import com.google.firebase.auth.ktx.userProfileChangeRequest
import com.google.firebase.firestore.ktx.firestore
import com.google.firebase.ktx.Firebase

class ProfileActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)
        var db = Firebase.firestore
        var auth = Firebase.auth
        val user = Firebase.auth.currentUser

        var EmailAdd= findViewById<TextView>(R.id.textViewEmailAdd)
        var fullname= findViewById<EditText>(R.id.editTextTextFullName)
        var phone= findViewById<EditText>(R.id.editTextPhone)
        var delbutton= findViewById<Button>(R.id.buttonDelete)
        var update= findViewById<Button>(R.id.buttonUpdate)

        EmailAdd.text = auth.currentUser?.email





        update.setOnClickListener {
            println("Update is Pressed")

            val profileUpdates = userProfileChangeRequest {
                displayName = fullname.text.toString()

            }

            user!!.updateProfile(profileUpdates)
                .addOnCompleteListener { task ->
                    if (task.isSuccessful) {
                        Log.d(TAG, "User profile updated.")
                    }
                }


        }

        delbutton.setOnClickListener {
            println("Delete is Pressed")
            auth.currentUser?.delete()
            finish()
            startActivity(Intent(this,LoginActivity::class.java))






        }
    }
}