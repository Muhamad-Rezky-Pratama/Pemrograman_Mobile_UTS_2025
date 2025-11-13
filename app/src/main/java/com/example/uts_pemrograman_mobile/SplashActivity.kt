package com.example.uts_pemrograman_mobile

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        // Handler untuk penundaan 5000ms (5 detik)
        Handler(Looper.getMainLooper()).postDelayed({
            // Perintah pindah layar ke DashboardActivity
            val intent = Intent(this, DashboardActivity::class.java)
            startActivity(intent)

            // Tutup SplashActivity
            finish()
        }, 5000)
    }
}