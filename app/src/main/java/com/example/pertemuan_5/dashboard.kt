package com.example.pertemuan_5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.pertemuan_5.databinding.ActivityDashboardBinding
import com.example.pertemuan_5.databinding.ActivityHomepageBinding

class dashboard : AppCompatActivity() {

    private lateinit var binding: ActivityDashboardBinding;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDashboardBinding.inflate(layoutInflater);
        setContentView(binding.root)

        val usernames = intent.getStringExtra(LoginActivity.username)

        with(binding){
            txtUsername.text = "Welcome $usernames !!"
        }
    }
}