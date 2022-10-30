package com.example.lesson7dz

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.lesson7dz.databinding.ActivityMainBinding
import com.example.lesson7dz.databinding.ItemPictureBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}