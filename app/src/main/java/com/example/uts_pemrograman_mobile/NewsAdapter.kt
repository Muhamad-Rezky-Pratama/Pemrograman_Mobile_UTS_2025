package com.example.uts_pemrograman_mobile

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

import com.example.uts_pemrograman_mobile.R

class NewsAdapter(private val newsItems: List<NewsItem>) :
    RecyclerView.Adapter<NewsAdapter.NewsViewHolder>() {

    // Kelas ViewHolder: Menyimpan referensi ke elemen tampilan (ID dari item_news.xml)
    class NewsViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val title: TextView = view.findViewById(R.id.newsTitle)
        val source: TextView = view.findViewById(R.id.newsSource) // NEW
        val date: TextView = view.findViewById(R.id.newsDate)     // NEW
        val image: ImageView = view.findViewById(R.id.newsImage)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NewsViewHolder {
        // Mengubah XML layout menjadi objek View (item_news.xml)
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_news, parent, false)
        return NewsViewHolder(view)
    }

    override fun onBindViewHolder(holder: NewsViewHolder, position: Int) {
        val item = newsItems[position]
        holder.title.text = item.title

        // Perubahan di sini: Mengisi dua TextView terpisah
        holder.source.text = item.source // Mengisi Sumber
        holder.date.text = item.date     // Mengisi Tanggal

        holder.image.setImageResource(item.imageResId)
    }
    override fun getItemCount() = newsItems.size
}