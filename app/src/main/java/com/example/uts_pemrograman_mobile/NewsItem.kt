package com.example.uts_pemrograman_mobile

data class NewsItem(
    val title: String,
    val source: String, // Sumber berita (misal: The Verge, CNN)
    val date: String,
    val imageResId: Int // Resource ID untuk gambar berita
)