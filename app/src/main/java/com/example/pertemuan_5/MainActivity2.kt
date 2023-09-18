package com.example.pertemuan_5

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.result.contract.ActivityResultContracts
import com.example.pertemuan_5.databinding.ActivityMain2Binding

class MainActivity2 : AppCompatActivity() {

    private lateinit var binding: ActivityMain2Binding
    companion object{
        const val EXTRA_ADDRESS = "extra_address"
    }
    private val launcher =
        registerForActivityResult(ActivityResultContracts.StartActivityForResult()) {
                result ->
// Memeriksa result code
            if (result.resultCode == Activity.RESULT_OK) {
// Mengambil data Intent
                val data = result.data
// Mendapatkan alamat dari data Intent
                val name = data?.getStringExtra(MainActivity.EXTRA_NAME)
                val address = data?.getStringExtra(EXTRA_ADDRESS)
// Menetapkan teks di TextView
                binding.txtName.text = "$name beralamat di $address"
            }
        }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        val name = intent.getStringExtra(MainActivity.EXTRA_NAME)
        with(binding){
            txtName.text = name
            btnToThirdActivity.setOnClickListener {
                val intent = Intent(this@MainActivity2, MainActivity3::class.java)
                    .apply { putExtra(MainActivity.EXTRA_NAME,name) }
                launcher.launch(intent)
            }

        }
    }
}