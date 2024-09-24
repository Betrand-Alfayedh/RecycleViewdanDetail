package com.login.mobilee

import android.annotation.SuppressLint
import android.os.Bundle
import android.util.Log
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat


class DetailMovieActivity : AppCompatActivity() {

    @SuppressLint("MissingInflatedId")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_detail_movie)

        val imageResId = intent.getIntExtra("image", 0)
        val title = intent.getStringExtra("deskripsi")
        val tanggal = intent.getStringExtra("tanggal")
        val sinopsis = intent.getStringExtra("sinopsis")


        val imageView = findViewById<ImageView>(R.id.imageViewDetail)
        val textViewTitle = findViewById<TextView>(R.id.textViewTitle)
        val textViewJudul = findViewById<TextView>(R.id.textViewJudul)
        val textViewDesc = findViewById<TextView>(R.id.textViewDesc)


        imageView.setImageResource(imageResId)
        textViewTitle.setText(title)
        textViewJudul.setText(tanggal)
        textViewDesc.setText(sinopsis)


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
            }
        }
}
