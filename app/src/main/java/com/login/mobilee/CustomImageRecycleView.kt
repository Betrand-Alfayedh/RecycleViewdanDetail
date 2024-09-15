package com.login.mobilee

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.login.mobilee.adapter.BuahAdapter
import com.login.mobilee.model.Mocklist
import com.login.mobilee.model.ModelBuah

class CustomImageRecycleView: AppCompatActivity() {

    private lateinit var rv_buah: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_custom_image_recycle_view)
        rv_buah = findViewById(R.id.rv_data)

        rv_buah.layoutManager = GridLayoutManager(this,1,
            GridLayoutManager.VERTICAL,false)

        //menambah item click listener
        val adapter = BuahAdapter(Mocklist.getModel() as ArrayList<ModelBuah>){buah ->
            val intent = Intent(this, DetailBuahActivity::class.java)
            intent.putExtra("namaBuah",buah.nama)
            intent.putExtra("gambarBuah",buah.image)
            startActivity(intent)
        }
        rv_buah.adapter = adapter


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}