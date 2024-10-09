package com.example.uts_papb_b2_hamdanmaulanam

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.uts_papb_b2_hamdanmaulanam.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        with(binding) {
            submitBtn.setOnClickListener {
                val username = username.text.toString()

                if (username.isEmpty()) {
                    Toast.makeText(this@MainActivity, "Please enter the task title", Toast.LENGTH_SHORT).show()
                    return@setOnClickListener
                }

                // Passing data ke halaman Login
                val intent = Intent(this@MainActivity, MainActivity2::class.java)
                intent.putExtra("EXTRA_USERNAME", username)

                startActivity(intent)
            }
        }



    }
}