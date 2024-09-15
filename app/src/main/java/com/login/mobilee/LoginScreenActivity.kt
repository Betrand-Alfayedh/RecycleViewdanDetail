package com.login.mobilee

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class LoginScreenActivity : AppCompatActivity() {

    private lateinit var etUsername : EditText
    private lateinit var etPassword : EditText
    private lateinit var btnLogin : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_login_screen)

        etPassword = findViewById(R.id.etPassword)
        etUsername = findViewById(R.id.etUsername)
        btnLogin = findViewById(R.id.btnLogin)

        btnLogin.setOnClickListener(){
            //passing data dengan intent --> mengirim data atau value dari satu activity ke activity lain
            var intent = Intent(this@LoginScreenActivity, WelcomeActivity::class.java)
            val nUsername = etUsername.text.toString()
            val nPassword = etPassword.text.toString()
            //kirimkan data
            intent.putExtra("username", nUsername)
            intent.putExtra("password", nPassword)
            Log.d("username", nUsername)
            Log.d("Password", nPassword)
            startActivity(intent)
        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}