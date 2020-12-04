package com.example.lokersoloandronity.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.lokersoloandronity.MainActivity
import com.example.lokersoloandronity.R
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        btnlogin.setOnClickListener {
        val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

//        register.setOnClickListener {
//        val intent = Intent(this, RegisterActivity::class.java)
//            startActivity(intent)
//        }
    }
}
