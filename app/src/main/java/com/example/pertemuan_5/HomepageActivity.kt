package com.example.pertemuan_5

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.pertemuan_5.databinding.ActivityHomepageBinding

class HomepageActivity : AppCompatActivity() {

    private lateinit var binding: ActivityHomepageBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomepageBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val usernames = intent.getStringExtra(RegisterActivity.username)
        val emails = intent.getStringExtra(RegisterActivity.email)
        val phones = intent.getStringExtra(RegisterActivity.phone)
        val passwords = intent.getStringExtra(RegisterActivity.password)

        with(binding){

            txtUsername.text = "Welcome $usernames !!"
            txtEmail.text = "Your email : $emails"
            txtPhone.text = "Your phone number : $phones"
        }
    }
}