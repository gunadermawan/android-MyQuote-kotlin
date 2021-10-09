package com.gunder.myquote

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.gunder.myquote.databinding.ActivityListQuotesBinding
import com.gunder.myquote.databinding.ActivityMainBinding

class ListQuotesActivity : AppCompatActivity() {
    private lateinit var binding: ActivityListQuotesBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityListQuotesBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}