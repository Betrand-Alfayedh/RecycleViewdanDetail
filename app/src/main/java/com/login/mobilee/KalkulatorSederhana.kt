package com.login.mobilee

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class KalkulatorSederhana : AppCompatActivity() {

    private lateinit var etAngka1: EditText
    private lateinit var etAngka2: EditText
    private lateinit var btnTambah: Button
    private lateinit var btnKali: Button
    private lateinit var btnKurang: Button
    private lateinit var txtHasil: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_kalkulator_sederhana)

        etAngka1 = findViewById(R.id.etAngka1)
        etAngka2 = findViewById(R.id.etAngka2)
        btnKurang = findViewById(R.id.btnKurang)
        btnTambah = findViewById(R.id.btnTambah)
        btnKali = findViewById(R.id.btnKali)
        txtHasil = findViewById(R.id.txtHasil)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        btnTambah.setOnClickListener() {
            val angka1 = etAngka1.text.toString().toInt()
            val angka2 = etAngka2.text.toString().toInt()
            val hasil = angka1 + angka2
            txtHasil.setText("Hasil Tambah : " + hasil)
        }
        btnKali.setOnClickListener() {
            val angka1 = etAngka1.text.toString().toInt()
            val angka2 = etAngka2.text.toString().toInt()
            val hasil = angka1 * angka2
            txtHasil.setText("Hasil Kali : " + hasil)
        }
        btnKurang.setOnClickListener() {
            val angka1 = etAngka1.text.toString().toInt()
            val angka2 = etAngka2.text.toString().toInt()
            val hasil = angka1 - angka2
            txtHasil.setText("Hasil Kurang : " + hasil)
        }
    }
}