package com.goprojectstudio.jetouri

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class HotelActivity : AppCompatActivity() {

    lateinit var btn_back : ImageButton
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hotel)

        btn_back = findViewById(R.id.btn_back)

        btn_back.setOnClickListener {
            finish()
        }
    }
}