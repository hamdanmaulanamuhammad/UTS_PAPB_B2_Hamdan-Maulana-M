package com.example.uts_papb_b2_hamdanmaulanam

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.uts_papb_b2_hamdanmaulanam.databinding.ActivityMain2Binding
import com.example.uts_papb_b2_hamdanmaulanam.databinding.ActivityMainBinding

class MainActivity2 : AppCompatActivity() {
    private lateinit var binding: ActivityMain2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        val nama = intent.getStringExtra("EXTRA_USERNAME")

        binding.textViewName.text = nama

        binding.keluar.setOnClickListener{
            val intentto3 = Intent(this@MainActivity2, MainActivity3::class.java)
            startActivity(intentto3)
        }



    }

}