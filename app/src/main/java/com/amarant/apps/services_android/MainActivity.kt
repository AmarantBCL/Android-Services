package com.amarant.apps.services_android

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.amarant.apps.services_android.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val binding: ActivityMainBinding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        binding.btnService.setOnClickListener {
            startService(MyService.newIntent(this, 25))
        }
    }
}