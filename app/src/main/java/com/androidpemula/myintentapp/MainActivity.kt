package com.androidpemula.myintentapp

import android.content.Intent
import android.net.Uri
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
        val btnMoveWithData: Button     = findViewById(R.id.btn_move_activity_data)
        val btnDialPhone: Button        = findViewById(R.id.btn_dial_number)

        // BtnMoveActivity ketika di klik
        btnMoveActivity.setOnClickListener(this)
        btnMoveWithData.setOnClickListener(this)
        btnDialPhone.setOnClickListener(this)
    }

    // Fungsi OnClickListener
    override fun onClick(v: View) {
        when (v.id) {
            R.id.btn_move_activity -> {
                // Berpindah Activity dari MainActivity ke MoveActivity
                val moveIntent = Intent(this@MainActivity, MoveActivity::class.java)
                startActivity(moveIntent)
            }

            R.id.btn_move_activity_data -> {
                // Berpindah Activity
                val moveWithDataIntent = Intent(this@MainActivity, MoveWithDataActivity::class.java)
                /*
                NOTE :
                EXTRA_NAME & EXTRA_AGE adalah key yang sebelumnya dibuat di MoveWithDataActivity
                 */
                moveWithDataIntent.putExtra(MoveWithDataActivity.EXTRA_NAME, "Dicoding Academy Boy")
                moveWithDataIntent.putExtra(MoveWithDataActivity.EXTRA_AGE, 5)
                startActivity(moveWithDataIntent)
            }

            R.id.btn_dial_number -> {
                // Berpindah Activity
                val phoneNumber = "081210841382"
                val dialPhoneIntent = Intent(Intent.ACTION_DIAL, Uri.parse("tel:$phoneNumber"))
                startActivity(dialPhoneIntent)
            }
        }


    }
}
