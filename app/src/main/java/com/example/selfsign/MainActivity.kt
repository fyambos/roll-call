package com.example.selfsign

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.FirebaseUser
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // récuperer le bouton "login" crée dans le xml
        val loginButton: Button = findViewById(R.id.login)

        // ajouter une action au bouton lors du clic, dont l'intent est de rediriger vers une page "ScheduleActivity"
        loginButton.setOnClickListener{
            startActivity(Intent(this, ScheduleActivity::class.java))
            finish()
        }
    }
}