package com.example.uts_pemrograman_mobile

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView

// WAJIB ADA: IMPORTS UNTUK KELAS YANG ADA DI PACKAGE YANG SAMA
import com.example.uts_pemrograman_mobile.R
import com.example.uts_pemrograman_mobile.BiodataFragment
import com.example.uts_pemrograman_mobile.KontakFragment
import com.example.uts_pemrograman_mobile.KalkulatorFragment
import com.example.uts_pemrograman_mobile.CuacaFragment
import com.example.uts_pemrograman_mobile.BeritaFragment


class DashboardActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)

        val bottomNav = findViewById<BottomNavigationView>(R.id.bottom_navigation)

        // Atur Fragment default
        if (savedInstanceState == null) { loadFragment(BiodataFragment()) }

        bottomNav.setOnItemSelectedListener { item ->
            // Perhatikan penggunaan R.id.nav_biodata, dst.
            val fragment: Fragment = when (item.itemId) {
                R.id.nav_biodata -> BiodataFragment()
                R.id.nav_kontak -> KontakFragment()
                R.id.nav_kalkulator -> KalkulatorFragment()
                R.id.nav_cuaca -> CuacaFragment()
                R.id.nav_berita -> BeritaFragment()
                else -> BiodataFragment()
            }
            loadFragment(fragment)
            true
        }
    }

    private fun loadFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction()
            .replace(R.id.fragment_container, fragment)
            .commit()
    }
}