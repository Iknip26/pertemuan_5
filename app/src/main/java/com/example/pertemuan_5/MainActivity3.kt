package com.example.pertemuan_5

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.pertemuan_5.MainActivity2.Companion.EXTRA_ADDRESS
import com.example.pertemuan_5.databinding.ActivityMain3Binding

class MainActivity3 : AppCompatActivity() {
    private lateinit var binding: ActivityMain3Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain3Binding.inflate(layoutInflater)
        setContentView(binding.root)

        val name = intent.getStringExtra(MainActivity.EXTRA_NAME)
        with(binding) {
            btnToSecondActivity.setOnClickListener {
                val resultIntent = Intent()
// Memasukkan alamat ke Intent
                resultIntent.putExtra(EXTRA_ADDRESS, edtAddress.text.toString())
                resultIntent.putExtra(MainActivity.EXTRA_NAME, name)
// Menetapkan result code dan data Intent
                setResult(Activity.RESULT_OK, resultIntent)
// Menyelesaikan aktivitas
                finish()
            }
        }
    }
}