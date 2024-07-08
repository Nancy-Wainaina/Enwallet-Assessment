package com.example.enwallet

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.enwallet.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.rvWallet.layoutManager = LinearLayoutManager(this)
        displayActivity()

    }
    fun displayActivity(){
        val activity1 = OverView("","Salary" ,"KES 40000", "1 July 2024")
        val activity2 = OverView("", "Rent","KES 16000", "2 July 2024")
        val transactionsactivity = listOf(activity1,activity2)
        val result = OverviewAdapter(transactionsactivity )
        binding.rvWallet.adapter = result
    }
}