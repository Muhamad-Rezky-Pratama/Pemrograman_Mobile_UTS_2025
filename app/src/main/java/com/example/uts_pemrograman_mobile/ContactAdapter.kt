package com.example.uts_pemrograman_mobile

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
// Ganti com.example.uts_pemrograman_mobile dengan nama package Anda
import com.example.uts_pemrograman_mobile.R
import com.example.uts_pemrograman_mobile.Contact


class ContactAdapter(private val contacts: List<Contact>) :
    RecyclerView.Adapter<ContactAdapter.ContactViewHolder>() {

    // Kelas ViewHolder: Menyimpan referensi ke elemen tampilan (ID dari item_contact.xml)
    class ContactViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val name: TextView = view.findViewById(R.id.contactName)
        val phone: TextView = view.findViewById(R.id.contactPhone)
        val image: ImageView = view.findViewById(R.id.contactImage)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactViewHolder {
        // Mengubah XML layout menjadi objek View (item_contact.xml)
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_contact, parent, false)
        return ContactViewHolder(view)
    }

    override fun onBindViewHolder(holder: ContactViewHolder, position: Int) {
        // Mengisi data (nama, phone, image) dari list ke elemen tampilan
        val contact = contacts[position]
        holder.name.text = contact.name
        holder.phone.text = contact.phone
        holder.image.setImageResource(contact.imageResId)
    }

    override fun getItemCount() = contacts.size
}