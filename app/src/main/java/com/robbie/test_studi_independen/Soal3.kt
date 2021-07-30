package com.robbie.test_studi_independen

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_soal3.*
import java.text.SimpleDateFormat
import java.util.*

class Soal3 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_soal3)

                btn_Konversi.setOnClickListener {
                    val inputHour = Input.text.toString()
                    val dt1 = SimpleDateFormat("hh:mm:ss aa")
                    val dt2 = SimpleDateFormat("HH:mm")
                    val date: Date?
                    val result: String

                    try {
                        date = dt1.parse(inputHour)
                        result = dt2.format(date)

                        konverst.text = result
                    } catch (e: Exception) {
                        e.printStackTrace()
                    }
                }
            }
        }
