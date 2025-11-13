package com.example.uts_pemrograman_mobile

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

// Pastikan import StaticData ada
import com.example.uts_pemrograman_mobile.StaticData

class BeritaFragment : Fragment(R.layout.fragment_berita) {
    // Pastikan layout constructor merujuk ke R.layout.fragment_berita

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // 1. Temukan RecyclerView di layout
        val recyclerView: RecyclerView = view.findViewById(R.id.recyclerViewNews)

        // 2. Atur tata letak
        recyclerView.layoutManager = LinearLayoutManager(context)

        // 3. Pasang Adapter dengan data statis (StaticData.newsList dari Langkah 7)
        recyclerView.adapter = NewsAdapter(StaticData.newsList)
    }
}