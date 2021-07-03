package com.goprojectstudio.jetouri

import android.os.Bundle
import android.widget.ImageButton
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class RegisterActivity : AppCompatActivity() {
    lateinit var btn_daftar : ImageButton
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        btn_daftar = findViewById(R.id.btn_register)

        btn_daftar.setOnClickListener {
            Toast.makeText(this, "Pendaftaran Berhasil", Toast.LENGTH_SHORT).show()
            finish()
        }
    }
}