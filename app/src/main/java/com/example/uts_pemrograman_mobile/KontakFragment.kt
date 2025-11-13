package com.example.uts_pemrograman_mobile

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
// Ganti com.example.uts_pemrograman_mobile dengan nama package Anda
import com.example.uts_pemrograman_mobile.R
import com.example.uts_pemrograman_mobile.StaticData

class KontakFragment : Fragment(R.layout.fragment_kontak) {
    // Pastikan layout constructor merujuk ke R.layout.fragment_kontak

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // 1. Temukan RecyclerView di layout
        val recyclerView: RecyclerView = view.findViewById(R.id.recyclerViewContacts)

        // 2. Atur tata letak (Linear/daftar ke bawah)
        recyclerView.layoutManager = LinearLayoutManager(context)

        // 3. Pasang Adapter dengan data statis (StaticData.contactsList dari Langkah 5)
        recyclerView.adapter = ContactAdapter(StaticData.contactsList)
    }
}