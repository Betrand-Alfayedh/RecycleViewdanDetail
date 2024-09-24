package com.login.mobilee

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class DetailBuahActivity : AppCompatActivity() {

    private lateinit var txtdetailbuah: TextView
    private lateinit var imgdetailbuah: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_detail_buah)

        txtdetailbuah = findViewById(R.id.txtdetailbuah)
        imgdetailbuah = findViewById(R.id.imgdetailbuah)

        val detailText = intent.getStringExtra("deskripsi")
        val detailImage = intent.getIntExtra("image", 0)

        txtdetailbuah.setText(detailText)
        imgdetailbuah.setImageResource(detailImage)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}