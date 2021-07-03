package com.goprojectstudio.jetouri

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.widget.ImageButton
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    lateinit var btn_home : ImageButton
    lateinit var btn_hotel : ImageButton
    lateinit var btn_transportasi : ImageButton
    lateinit var btn_pembayaran : ImageButton
    lateinit var btn_profil : ImageButton

    var doubleBackToExitOnce : Boolean = false
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_home = findViewById(R.id.btn_home)
        btn_hotel = findViewById(R.id.btn_hotel)
        btn_transportasi = findViewById(R.id.btn_transportasi)
        btn_pembayaran = findViewById(R.id.btn_pembayaran)
        btn_profil = findViewById(R.id.btn_profil)

        btn_home.setOnClickListener {
            var intent = Intent(this@MainActivity, HomeActivity::class.java)
            startActivity(intent)
        }
        btn_hotel.setOnClickListener {
            var intent = Intent(this@MainActivity, HotelActivity::class.java)
            startActivity(intent)
        }
        btn_transportasi.setOnClickListener {
            var intent = Intent(this@MainActivity, TransportasiActivity::class.java)
            startActivity(intent)
        }
        btn_pembayaran.setOnClickListener {
            var intent = Intent(this@MainActivity, PembayaranActivity::class.java)
            startActivity(intent)
        }
        btn_profil.setOnClickListener {
            var intent = Intent(this@MainActivity, ProfilActivity::class.java)
            startActivity(intent)
        }
    }

    override fun onBackPressed() {
        if (doubleBackToExitOnce){
            super.onBackPressed()
            return
        }

        this.doubleBackToExitOnce = true;

        Toast.makeText(this, "Tekan satu kali lagi untuk keluar", Toast.LENGTH_SHORT).show()

        Handler().postDelayed({
            kotlin.run { doubleBackToExitOnce = false }
        }, 2000)
    }
}