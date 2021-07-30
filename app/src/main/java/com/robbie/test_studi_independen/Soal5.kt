package com.robbie.test_studi_independen

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_soal5.*

class Soal5 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_soal5)
        btn_cek.setOnClickListener {
            val cekkalimat = cek.text.toString()

            if (isPalindrome(cekkalimat)) {
                Toast.makeText(getApplicationContext(), "$cekkalimat Palindrom", Toast.LENGTH_SHORT).show();
            } else {
                cek.setError("$cekkalimat Bukan Palindrome")
            }
        }
    }
}

private fun isPalindrome(sentence: String): Boolean {
    val stringBuilder = StringBuilder(sentence)
    val reverseSentence = stringBuilder.reverse().toString()
    return sentence.equals(reverseSentence, ignoreCase = true)
}
