package com.robbie.test_studi_independen

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val pindah1: Button = findViewById(R.id.btn_soal1)
        val pindah2: Button = findViewById(R.id.btn_soal2)
        val pindah3: Button = findViewById(R.id.btn_soal3)
        val pindah4: Button = findViewById(R.id.btn_soal4)
        val pindah5: Button = findViewById(R.id.btn_soal5)
        pindah1.setOnClickListener(this)
        pindah2.setOnClickListener(this)
        pindah3.setOnClickListener(this)
        pindah4.setOnClickListener(this)
        pindah5.setOnClickListener(this)
    }
    override fun onClick(v: View) {
        when (v?.id) {
            R.id.btn_soal1 -> {
                val move1 = Intent(this@MainActivity, Soal1 ::class.java )
                startActivity(move1)

            }
            R.id.btn_soal2 -> {
                val move2 = Intent(this@MainActivity, Soal2 ::class.java )
                startActivity(move2)

            }
            R.id.btn_soal3 -> {
                val move3 = Intent(this@MainActivity, Soal3 ::class.java )
                startActivity(move3)

            }
            R.id.btn_soal4 -> {
                val move4 = Intent(this@MainActivity, Soal4 ::class.java )
                startActivity(move4)

            }
            R.id.btn_soal5 -> {
                val move5 = Intent(this@MainActivity, Soal5 ::class.java )
                startActivity(move5)

            }

        }
    }
}
