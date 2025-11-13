package com.example.uts_pemrograman_mobile

// WAJIB ADA: Mengimpor Data Class Contact
import com.example.uts_pemrograman_mobile.Contact
import com.example.uts_pemrograman_mobile.NewsItem
// WAJIB ADA: Mengimpor Class R untuk drawable
import com.example.uts_pemrograman_mobile.R

object StaticData {

    // Daftar ini menampung 15 kontak telepon statis (Sesuai Permintaan)
    val contactsList = listOf(
        // 1. Dosen Pengampu
        Contact(
            name = "Galih Ashari R., S.Si., MT",
            phone = "7272215",
            imageResId = R.drawable.ic_avatar_1
        ),

        // 2. Mahasiswa AA
        Contact(
            name = "Mahasiswa AA",
            phone = "0811-1111-2222",
            imageResId = R.drawable.ic_avatar_2
        ),

        // 3. Mahasiswa BB
        Contact(
            name = "Mahasiswa BB",
            phone = "0813-3333-4444",
            imageResId = R.drawable.ic_avatar_3
        ),

        // 4. Staf IT ITENAS
        Contact(
            name = "Staf IT ITENAS",
            phone = "022-7272-215 (Ext. 100)",
            imageResId = R.drawable.ic_avatar_4
        ),

        // 5. Dekanat Fakultas
        Contact(
            name = "Dekanat Fakultas",
            phone = "022-7272-215 (Ext. 201)",
            imageResId = R.drawable.ic_avatar_5
        ),

        // 6. Rekan Kampus A
        Contact(
            name = "Rekan Kampus A",
            phone = "0856-7890-1234",
            imageResId = R.drawable.ic_avatar_6
        ),

        // 7. Rekan Kampus B
        Contact(
            name = "Rekan Kampus B",
            phone = "0878-1234-5678",
            imageResId = R.drawable.ic_avatar_7
        ),

        // 8. Perpustakaan
        Contact(
            name = "Perpustakaan",
            phone = "022-7272-215 (Ext. 305)",
            imageResId = R.drawable.ic_avatar_8
        ),

        // 9. Orang Tua
        Contact(
            name = "Orang Tua",
            phone = "0815-9999-0000",
            imageResId = R.drawable.ic_avatar_9
        ),

        // 10. Teman SMA
        Contact(
            name = "Teman SMA",
            phone = "0896-1122-3344",
            imageResId = R.drawable.ic_avatar_10
        ),

        // 11. Layanan Darurat Kampus
        Contact(
            name = "Layanan Darurat Kampus",
            phone = "022-7272-118",
            imageResId = R.drawable.ic_avatar_11
        ),

        // 12. Koordinator Asisten
        Contact(
            name = "Koordinator Asisten",
            phone = "0821-5566-7788",
            imageResId = R.drawable.ic_avatar_12
        ),

        // 13. Nomor Darurat Pribadi
        Contact(
            name = "Nomor Darurat Pribadi",
            phone = "0888-1010-2020",
            imageResId = R.drawable.ic_avatar_13
        ),

        // 14. Kontak Magang
        Contact(
            name = "Kontak Magang",
            phone = "0819-3030-4040",
            imageResId = R.drawable.ic_avatar_14
        ),

        // 15. Kontak Terakhir
        Contact(
            name = "Kontak Terakhir",
            phone = "0810-0000-0000",
            imageResId = R.drawable.ic_avatar_15
        )
    )
    // Pastikan kode ini ditambahkan di dalam object StaticData { ... }

    val newsList = listOf(
        // [Contoh 1] - Sesuai gambar UTS
        NewsItem(
            title = "OpenAI announces platform for making custom ChatGPTs - Th...",
            source = "The Verge",
            date = "2023/11/01",
                imageResId = R.drawable.img_news_1
        ),

        // [Contoh 2] - Sesuai gambar UTS
        NewsItem(
            title = "The National Zoo's panda program is ending after more L...",
            source = "CNN",
            date = "2023/10/25",
            imageResId = R.drawable.img_news_2
        ),

        // [Contoh 3]
        NewsItem(
            title = "Kebijakan Moneter Global: Dampak pada Pasar Asia Tenggara",
            source = "Financial Times",
            date = "2025/11/12",
            imageResId = R.drawable.img_news_3
        ),

        // [Contoh 4] - Gaya Hidup/Tips (TEMA BARU)
        NewsItem(
            title = "Rahasia Makanan Sehat untuk Meningkatkan Produktivitas Belajar",
            source = "Healthy Life Mag",
            date = "2025/10/01",
            imageResId = R.drawable.img_news_4
        )
    )
}