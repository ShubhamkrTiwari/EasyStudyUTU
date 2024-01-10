package com.example.easystudyutu

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val first = findViewById<Button>(R.id.first);

        first.setOnClickListener { this
            val intent = Intent(this,FirstYear::class.java)
          startActivity(intent)
        }

        val second = findViewById<Button>(R.id.second);
        second.setOnClickListener { this
        val intent = Intent(this,SecondYear::class.java)
            startActivity(intent)
        }


    }
}