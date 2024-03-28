package com.example.easystudyutu

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

@Suppress("UNUSED_EXPRESSION")
class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        setupLinkButton()
    }

        fun setupLinkButton() {
            val querieslinkButton = findViewById<Button>(R.id.queries);
            querieslinkButton.setOnClickListener {
                val browserIntent = Intent(
                    Intent.ACTION_VIEW,
                    Uri.parse("https://forms.gle/Bm8aPRYSJK8pJSwe8/")
                )
                startActivity(browserIntent)
            }

            val contactuslinkButton = findViewById<Button>(R.id.contactus);
            contactuslinkButton.setOnClickListener {
                val browserIntent = Intent(
                    Intent.ACTION_VIEW,
                    Uri.parse("https://skt916606@gmail.com/")
                )
                startActivity(browserIntent)
            }

        val first = findViewById<Button>(R.id.first)
        first.setOnClickListener {this
            val intent = Intent(this,FirstYear::class.java)
          startActivity(intent)
        }

        val second = findViewById<Button>(R.id.second)
        second.setOnClickListener { this
           val intent = Intent(this,SecondYear::class.java)
            startActivity(intent)
        }

        val third = findViewById<Button>(R.id.third)
        third.setOnClickListener { this
           val intent = Intent(this,ThirdYear::class.java)
            startActivity(intent)
        }

        val fourth = findViewById<Button>(R.id.fourth)
        fourth.setOnClickListener { this
           val intent = Intent(this,FourthYear::class.java)
            startActivity(intent)
        }
    }
}