package com.robbie.test_studi_independen

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_soal4.*

class Soal4 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_soal4)
        btn_balik.setOnClickListener {
            val inputKta = masukan.text.toString()

            balik.text = inputKta.reversed()
        }
    }
}

