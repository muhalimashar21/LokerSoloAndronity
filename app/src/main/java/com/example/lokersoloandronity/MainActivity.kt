package com.example.lokersoloandronity

import android.os.Bundle
import com.google.android.material.bottomnavigation.BottomNavigationView
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.example.lokersoloandronity.fragment.AkunPFragment
import com.example.lokersoloandronity.fragment.BerandaFragment

class MainActivity : AppCompatActivity() {

    private val onNavigationItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener { item ->
        when (item.itemId) {
            R.id.navigation_home -> {

                val fragment = BerandaFragment()
                addfragment(fragment)
                return@OnNavigationItemSelectedListener true
            }
//            R.id.navigation_dashboard -> {
//                val fragment = InformasiFragment()
//                addfragment(fragment)
//                return@OnNavigationItemSelectedListener true
//            }
            R.id.navigation_notifications -> {
                val fragment = AkunPFragment()
                addfragment(fragment)
                return@OnNavigationItemSelectedListener true
            }
        }
        false
    }

    private fun addfragment(fragment: Fragment){
        supportFragmentManager
            .beginTransaction()
            .setCustomAnimations(R.anim.design_bottom_sheet_slide_in, R.anim.design_bottom_sheet_slide_out)
            .replace(R.id.content, fragment, fragment.javaClass.getSimpleName())
            .commit()
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val navView: BottomNavigationView = findViewById(R.id.nav_view)

        navView.setOnNavigationItemSelectedListener(onNavigationItemSelectedListener)
        val fragment = BerandaFragment()
        addfragment(fragment)
    }
}
