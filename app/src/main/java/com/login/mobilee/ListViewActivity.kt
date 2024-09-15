package com.login.mobilee

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class ListViewActivity : AppCompatActivity() {

    private lateinit var lvitem : ListView

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_list_view)

        //list view
        //list view widget --> adapter --> data source(array list)

        lvitem = findViewById(R.id.lvHewan)

        //bikin array list
        val namahewan = listOf("gajah","ular","burung","panda","ikan","sapi","kambing")

        //menghubungkan drawble dengan gambar
        val gambarHewanMap = mapOf(
            "gajah" to R.drawable.gajah,
            "ular" to R.drawable.ular,
            "burung" to R.drawable.burung,
            "panda" to R.drawable.panda,
            "ikan" to R.drawable.ikan,
            "sapi" to R.drawable.sapi,
            "kambing" to R.drawable.kambing
        )
        //masukkan data arrray hewan ke adapter
        //android layout -->
        lvitem.adapter = ArrayAdapter(this,android.R.layout.simple_list_item_1,namahewan)

        //untuk bisa diklik setipa item dari list
        lvitem.setOnItemClickListener(){_, _, position, _ ->
            val selectedHewan = namahewan[position]
            Toast.makeText(this,"Anda memilih:$selectedHewan", Toast.LENGTH_SHORT).show()

            //intent ke detail activity

            val intent = Intent(this,DetailHewanActivity::class.java)
            intent.putExtra("namaHewan",selectedHewan)
            intent.putExtra("gambarHewan",gambarHewanMap[selectedHewan] ?:0)
            startActivity(intent)
        }
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}