package com.example.uts_pemrograman_mobile

import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.Fragment

class CuacaFragment : Fragment(R.layout.fragment_cuaca) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // --- Mengambil Referensi Widgets ---
        val tvTemperature = view.findViewById<TextView>(R.id.tvTemperature)
        val tvCondition = view.findViewById<TextView>(R.id.tvCondition)
        val imgWeatherIcon = view.findViewById<ImageView>(R.id.imgWeatherIcon)
        val tvLocation = view.findViewById<TextView>(R.id.tvLocation)

        // --- Menetapkan Data Statis ---
        // Data masih statis, persiapkan untuk informasi suhu, kelembapan, dan lain-lainnya
        tvLocation.text = "📍 Bandung, Jawa Barat"
        tvTemperature.text = "22°"
        tvCondition.text = "Cerah Berawan"

        // Atur Gambar Animasi (Ganti R.drawable.ic_weather_sunny dengan drawable yang Anda buat)
        // Gambar animasi kondisi cuaca yang cakep
        imgWeatherIcon.setImageResource(R.drawable.ic_weather_cloudy)

        // Catatan: Statis data kelembaban dan angin sudah langsung ada di XML layout.
    }
}