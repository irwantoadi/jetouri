package com.goprojectstudio.jetouri

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class WelcomeActivity : AppCompatActivity() {

    lateinit var btn_masuk : ImageButton
    lateinit var btn_daftar : ImageButton
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)

        btn_masuk = findViewById(R.id.btn_login)
        btn_daftar = findViewById(R.id.btn_daftar)

        btn_masuk.setOnClickListener {
            var intent = Intent(this@WelcomeActivity, LoginActivity::class.java)
            startActivity(intent)
            finish()
        }
        btn_daftar.setOnClickListener {
            var intent = Intent(this@WelcomeActivity, RegisterActivity::class.java)
            startActivity(intent)
        }
    }
}