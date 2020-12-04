package com.example.lokersoloandronity.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.lokersoloandronity.R
import kotlinx.android.synthetic.main.activity_tambah_loker.*
import kotlinx.android.synthetic.main.fragment_beranda.*

class TambahLokerActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tambah_loker)

        SimpanTambahLoker.setOnClickListener {
            val intent = Intent(this, SelesaiSimpanLokerActivity::class.java)
            startActivity(intent)
        }
    }
}
