package com.example.pertemuan_5

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.pertemuan_5.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    companion object{
        const val EXTRA_NAME = "EXT_NAME"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        with(binding){
            btnToSecondActivity.setOnClickListener{
                val intent = Intent(this@MainActivity, MainActivity2::class.java)
                intent.putExtra(EXTRA_NAME, edtName.text.toString())
                startActivity(intent)
            }

            btnSendMessage.setOnClickListener{
                val intent = Intent(Intent.ACTION_SEND)
                intent.type = "type/plain"
                intent.putExtra(Intent.EXTRA_TEXT, "Hello World")
                startActivity(intent)
            }

            btnDial.setOnClickListener{
                val intent = Intent(Intent.ACTION_DIAL)
                intent.data = Uri.parse("tel:08217882517")
                startActivity(intent)
            }
            btnOpenLink.setOnClickListener{
                val intent = Intent(Intent.ACTION_SEND)
                intent.data = Uri.parse("https://www.google.com")
                startActivity(intent)
            }

        }

    }
}