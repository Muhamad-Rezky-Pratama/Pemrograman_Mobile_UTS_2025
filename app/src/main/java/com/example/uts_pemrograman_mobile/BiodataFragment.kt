package com.example.uts_pemrograman_mobile

import android.app.DatePickerDialog
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.google.android.material.textfield.TextInputEditText
import java.util.Calendar

class BiodataFragment : Fragment(R.layout.fragment_biodata) {

    private lateinit var etTglLahir: TextInputEditText

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Mengambil referensi EditText Tanggal Lahir
        etTglLahir = view.findViewById(R.id.etTglLahir)

        // Mengatur listener agar DatePickerDialog muncul saat diklik
        etTglLahir.setOnClickListener {
            showDatePicker()
        }

        // Contoh verifikasi Radio Button/Spinner saat tombol (jika ada) diklik
        // Contoh: val selectedProdi = view.findViewById<Spinner>(R.id.spinnerProdi).selectedItem.toString()
    }

    // Fungsi untuk menampilkan DatePickerDialog (Calendar Picker)
    private fun showDatePicker() {
        val calendar = Calendar.getInstance()

        // Ambil tanggal, bulan, tahun saat ini
        val year = calendar.get(Calendar.YEAR)
        val month = calendar.get(Calendar.MONTH)
        val day = calendar.get(Calendar.DAY_OF_MONTH)

        val datePickerDialog = DatePickerDialog(
            requireContext(),
            { _, selectedYear, selectedMonth, selectedDay ->
                // Format tanggal yang dipilih dan set ke EditText
                val formattedDate = "${selectedDay}/${selectedMonth + 1}/${selectedYear}"
                etTglLahir.setText(formattedDate)
            },
            year,
            month,
            day
        )
        datePickerDialog.show()
    }
}