package com.robbie.test_studi_independen

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_soal2.*
import java.util.regex.Pattern

class Soal2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_soal2)

            btn_soal02.setOnClickListener {
                val email = login.text.toString().trim()
                val regex = "[a-zA-Z0-9\\+\\.\\_\\%\\-\\+]{1,20}" +
                        "\\@" +
                        "[.]" +
                        "[a-zA-Z0-9][a-zA-Z0-9\\-]{0,64}" +
                        "(" +
                        "\\." +
                        "([co]{2}|[id]{2})" +
                        ")+"
                val pattern = Pattern.compile(regex)

                if (email.isNotEmpty() && pattern.matcher(email).matches()) {
                    Toast.makeText(getApplicationContext(), "Registrasi Berhasil!", Toast.LENGTH_SHORT).show();
                } else {
                    login.setError("Email is not valid")
                }
            }
    }
}