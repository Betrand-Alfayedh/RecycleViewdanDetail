package com.login.mobilee

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

//    private  lateinit var txtView1 :
    private lateinit var btnClick : Button
    private lateinit var btnMenu2 : Button
    private lateinit var txtDisplay : TextView
    private lateinit var btnPassing : Button
    private lateinit var btnListview : Button
    private lateinit var btnRvBuku : Button
    private lateinit var btnRvBuah : Button
    private lateinit var btnMovie : Button


    //Cara :
    //declare variable widget beserta tipe widget nya
    //findview widget sesuai dengan yg di declare di layout xml
    //set on click --> agar bisa d klik

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        btnClick = findViewById(R.id.btnClickHere)
        btnMenu2 = findViewById(R.id.btnPageKedua)
        txtDisplay = findViewById(R.id.textView)
        btnPassing = findViewById(R.id.btnPassingData)
        btnListview = findViewById(R.id.btnListview)
        btnRvBuku = findViewById(R.id.btnRecycleView)
        btnRvBuah = findViewById(R.id.btnRvBuah)
        btnMovie = findViewById(R.id.btnMovie)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        btnMovie.setOnClickListener(){
            //perpindahan dari page satu ke yg lain
            //intent
            //Intent implicit : intent yg kita buat sendiri
            //intent explicit : intent yg memanggil library atau class lain
            val intenMenu2 = Intent(this@MainActivity, RecycleViewCardMovie::class.java)
            startActivity(intenMenu2)
        }
        btnRvBuah.setOnClickListener(){
            //perpindahan dari page satu ke yg lain
            //intent
            //Intent implicit : intent yg kita buat sendiri
            //intent explicit : intent yg memanggil library atau class lain
            val intenMenu2 = Intent(this@MainActivity, CustomImageRecycleView::class.java)
            startActivity(intenMenu2)
        }

        btnClick.setOnClickListener(){
            txtDisplay.setText("Anda Klik ini!")
            print("Anda klik ini!")
            Toast.makeText(this, "Anda klik ini!", Toast.LENGTH_SHORT).show()
        }

        btnMenu2.setOnClickListener(){
            //perpindahan dari page satu ke yg lain
            //intent
            //Intent implicit : intent yg kita buat sendiri
            //intent explicit : intent yg memanggil library atau class lain
            val intenMenu2 = Intent(this@MainActivity, PageKedua::class.java)
            startActivity(intenMenu2)
        }
        btnPassing.setOnClickListener(){
            //perpindahan dari page satu ke yg lain
            //intent
            //Intent implicit : intent yg kita buat sendiri
            //intent explicit : intent yg memanggil library atau class lain
            val intenMenu2 = Intent(this@MainActivity, LoginScreenActivity::class.java)
            startActivity(intenMenu2)
        }
        btnListview.setOnClickListener(){
            //perpindahan dari page satu ke yg lain
            //intent
            //Intent implicit : intent yg kita buat sendiri
            //intent explicit : intent yg memanggil library atau class lain
            val intenMenu2 = Intent(this@MainActivity, ListViewActivity::class.java)
            startActivity(intenMenu2)
        }
        btnRvBuku.setOnClickListener(){
            //perpindahan dari page satu ke yg lain
            //intent
            //Intent implicit : intent yg kita buat sendiri
            //intent explicit : intent yg memanggil library atau class lain
            val intenMenu2 = Intent(this@MainActivity, RecycleviewActivity::class.java)
            startActivity(intenMenu2)
        }
    }
}