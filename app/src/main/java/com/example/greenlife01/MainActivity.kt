package com.example.greenlife01
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private lateinit var btNavigate: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btNavigate = findViewById(R.id.bt_navigate)

        btNavigate.setOnClickListener {
            val intent = Intent(this, SegundaTela::class.java)
            startActivity(intent)
        }

    }
}