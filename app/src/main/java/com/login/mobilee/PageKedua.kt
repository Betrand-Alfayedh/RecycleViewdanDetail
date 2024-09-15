package com.login.mobilee

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class PageKedua : AppCompatActivity() {

    private lateinit var eName : EditText
    private lateinit var bSubmit : Button
    private lateinit var vResult : TextView
    private lateinit var btnKalkulator : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_page_kedua)
        //declare widget sesuai id
        eName = findViewById(R.id.etName)
        bSubmit = findViewById(R.id.btnSubmit)
        vResult = findViewById(R.id.txtResult)
        btnKalkulator = findViewById(R.id.btnKalkulator)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        bSubmit.setOnClickListener(){

            val textInput = eName.text
            vResult.setText("Hello, Welcome to Our Club ! " + textInput)
        }

        btnKalkulator.setOnClickListener(){
            //perpindahan dari page satu ke yg lain
            //intent
            //Intent implicit : intent yg kita buat sendiri
            //intent explicit : intent yg memanggil library atau class lain
            val intenMenu2 = Intent(this@PageKedua, KalkulatorSederhana::class.java)
            startActivity(intenMenu2)
        }
    }
}