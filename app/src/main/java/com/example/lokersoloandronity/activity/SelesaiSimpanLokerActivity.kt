package com.example.lokersoloandronity.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.lokersoloandronity.MainActivity
import com.example.lokersoloandronity.R
import com.example.lokersoloandronity.fragment.BerandaFragment
import kotlinx.android.synthetic.main.activity_tambah_loker.*
import kotlinx.android.synthetic.main.fragment_beranda.*

class SelesaiSimpanLokerActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_selesai_simpan_loker)

        Tambahloker.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}
