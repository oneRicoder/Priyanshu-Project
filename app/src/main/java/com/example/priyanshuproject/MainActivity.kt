package com.example.priyanshuproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.priyanshuproject.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    var binding:ActivityMainBinding? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding?.root)
        var count = 1
        binding?.doNotClick?.setOnClickListener {
            binding?.textView?.text = "Priyanshu Gandu * ${count*100}"
            count++
            binding?.doNotClick?.text = "do not click again"
        }
    }
}