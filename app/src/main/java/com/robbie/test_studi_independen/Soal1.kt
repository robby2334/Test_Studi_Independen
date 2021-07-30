package com.robbie.test_studi_independen
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_soal1.*

class Soal1 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_soal1)
        btn_soal01.setOnClickListener {
            val inputNum = input.text.toString().trim()
            val No = inputNum.toInt()
            when {
                No % 5 == 0 && No % 3 == 0 -> {
                    hasil.text = "Hello World"
                }
                No % 3 == 0 -> {
                    hasil.text = "Hello"
                }
                No % 5 == 0 -> {
                    hasil.text = "World"
                }
                else -> hasil.text = "try again"
            }

        }
    }
}
