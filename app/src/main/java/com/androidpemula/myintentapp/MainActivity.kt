package com.androidpemula.myintentapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity(), View.OnClickListener { // Tambahkan View.OnClickListener

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Deklarasi & Casting Button
        val btnMoveActivity: Button     = findViewById(R.id.btn_move_activity)

        // BtnMoveActivity ketika di klik
        btnMoveActivity.setOnClickListener(this)
    }

    // Fungsi OnClickListener
    override fun onClick(v: View) {
        when (v.id) {
            R.id.btn_move_activity -> {
                // Berpindah Activity dari MainActivity ke MoveActivity
                val moveIntent = Intent(this@MainActivity, MoveActivity::class.java)
                startActivity(moveIntent)
            }
        }
    }
}
