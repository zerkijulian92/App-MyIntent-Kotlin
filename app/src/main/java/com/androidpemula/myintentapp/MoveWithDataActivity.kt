package com.androidpemula.myintentapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MoveWithDataActivity : AppCompatActivity() {
    // Menerima data dari Activity asal berdasarkan key yang telah dibuat
    companion object {
        const val EXTRA_AGE     = "extra_age"
        const val EXTRA_NAME    = "extra_name"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_move_with_data)

        // Deklarasi & Casting View
        val tvDataReceived: TextView = findViewById(R.id.tv_data_received)

        // Mendapatkan Data yang dikirim menggunakan GET

        /* NOTE : Di sini kita akan mengirimkan data bertipe string ke MoveWithDataActivity.
        Di dalam MoveWithdataActivity kita akan mengambil nilai data berdasarkan key
        yang dikirimkan dengan menggunakan metode getIntent().getStringExtra(key).
        Implementasinya sebagai berikut:
        * */
        val name = intent.getStringExtra(EXTRA_NAME) // Kalau datanya bertipe String gunakan getStringExtra
        val age  = intent.getIntExtra(EXTRA_AGE, 0) // kalau datanya bertipe Integer gunakan getIntExtra

        val text = "Name : $name, Your Age : $age"
        tvDataReceived.text = text
    }
}