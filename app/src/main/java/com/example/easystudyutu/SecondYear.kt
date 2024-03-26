package com.example.easystudyutu

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class SecondYear : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second_year)
        setupLinkButton()
    }

    fun setupLinkButton() {
        val mathlinkButton = findViewById<Button>(R.id.math3notes);
        mathlinkButton.setOnClickListener {
            val browserIntent = Intent(
                Intent.ACTION_VIEW,
                Uri.parse("https://drive.google.com/file/d/1MWgJJnHgKDGGgV80HdkUKHHC-rc04jv0/view?usp=sharing/")
            )
            startActivity(browserIntent)


        }
        val dsalinkButton = findViewById<Button>(R.id.dsanotes);
        dsalinkButton.setOnClickListener {
            val browserIntent = Intent(
                Intent.ACTION_VIEW,
                Uri.parse("https://drive.google.com/file/d/1sSzS50iLpCzTWCUP_kfbrpob3FWFoSoP/view?usp=sharing/")
            )
            startActivity(browserIntent)
        }

        val softwarelinkButton = findViewById<Button>(R.id.softwarenotes);
        softwarelinkButton.setOnClickListener {
            val browserIntent = Intent(
                Intent.ACTION_VIEW,
                Uri.parse("https://drive.google.com/file/d/1qqJgo0pmKESubMb8SCcSb019A9v6u_q5/view?usp=sharing/")
            )
            startActivity(browserIntent)
        }

        val oopslinkButton = findViewById<Button>(R.id.oopsnotes);
        oopslinkButton.setOnClickListener {
            val browserIntent = Intent(
                Intent.ACTION_VIEW,
                Uri.parse("https://drive.google.com/file/d/1FXXysihxxdpEyoI0np7yHzQCwtim24GY/view?usp=sharing/")
            )
            startActivity(browserIntent)
        }

        val disclinkButton = findViewById<Button>(R.id.discretenotes);
        disclinkButton.setOnClickListener {
            val browserIntent = Intent(
                Intent.ACTION_VIEW,
                Uri.parse("https://drive.google.com/file/d/1sL0aUugypfr2lq_OcN1L_Q0Pqt8WTfq7/view?usp=sharing/")
            )
            startActivity(browserIntent)
        }

        val dbmslinkButton = findViewById<Button>(R.id.dbmsnotes);
        dbmslinkButton.setOnClickListener {
            val browserIntent = Intent(
                Intent.ACTION_VIEW,
                Uri.parse("https://drive.google.com/file/d/19adyJgxUAzbv7bfdVT6ER6mRDit7ETWX/view?usp=sharing/")
            )
            startActivity(browserIntent)
        }

        val digitallinkButton = findViewById<Button>(R.id.digitalelectronotes);
        digitallinkButton.setOnClickListener {
            val browserIntent = Intent(
                Intent.ACTION_VIEW,
                Uri.parse("https://drive.google.com/file/d/1auHabIuVAjXp9gQR3b4sOTg7zxOYldl2/view?usp=sharing/")
            )
            startActivity(browserIntent)
        }

        val coalinkButton = findViewById<Button>(R.id.coanotes);
        coalinkButton.setOnClickListener {
            val browserIntent = Intent(
                Intent.ACTION_VIEW,
                Uri.parse("https://drive.google.com/file/d/1Hdru1G_P6SrIu1akZ9Ttkku_Tq50N99q/view?usp=sharing/")
            )
            startActivity(browserIntent)
        }

        val automatalinkButton = findViewById<Button>(R.id.automatanotes);
        automatalinkButton.setOnClickListener {
            val browserIntent = Intent(
                Intent.ACTION_VIEW,
                Uri.parse("https://drive.google.com/file/d/17KLpAyYJAQ_ZNO7poX2W6N_OlovWoDdw/view?usp=sharing/")
            )
            startActivity(browserIntent)
        }
    }
}