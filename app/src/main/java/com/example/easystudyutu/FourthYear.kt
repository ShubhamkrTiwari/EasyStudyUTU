package com.example.easystudyutu

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class FourthYear : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fourth_year)
        setupLinkButton()
    }

    fun setupLinkButton() {
        val dotnetnoteslinkButton = findViewById<Button>(R.id.dotnetnotes);
        dotnetnoteslinkButton.setOnClickListener {
            val browserIntent = Intent(
                Intent.ACTION_VIEW,
                Uri.parse("https://drive.google.com/file/d/1akdIOYVneON-Ouq7_rh-ncCFseAiY22p/view?usp=sharing/")
            )
            startActivity(browserIntent)
        }

        val adhocnoteslinkButton = findViewById<Button>(R.id.adhocnotes);
        adhocnoteslinkButton.setOnClickListener {
            val browserIntent = Intent(
                Intent.ACTION_VIEW,
                Uri.parse("https://drive.google.com/file/d/14Tj5JYpXiiQOKazgoulLXa4vhSuVecoA/view?usp=sharing/")
            )
            startActivity(browserIntent)
        }

        val bigdatanoteslinkButton = findViewById<Button>(R.id.bigdatanotes);
        bigdatanoteslinkButton.setOnClickListener {
            val browserIntent = Intent(
                Intent.ACTION_VIEW,
                Uri.parse("https://drive.google.com/file/d/1SfQopCetWuY_RR9Pna1uq3rh01XQ32PQ/view?usp=sharing/")
            )
            startActivity(browserIntent)
        }

        val advcoanoteslinkButton = findViewById<Button>(R.id.advcoanotes);
        advcoanoteslinkButton.setOnClickListener {
            val browserIntent = Intent(
                Intent.ACTION_VIEW,
                Uri.parse("https://drive.google.com/file/d/1bmw7dEZ9LfMxyOHhRqgaNcDE4o1_mxeH/view?usp=sharing/")
            )
            startActivity(browserIntent)
        }

        val advosnoteslinkButton = findViewById<Button>(R.id.advosnotes);
        advosnoteslinkButton.setOnClickListener {
            val browserIntent = Intent(
                Intent.ACTION_VIEW,
                Uri.parse("https://drive.google.com/file/d/1tghuMgBifYg_NNllQBGyUdGiBVLTspMI/view?usp=sharing/")
            )
            startActivity(browserIntent)
        }

        val cryptonoteslinkButton = findViewById<Button>(R.id.cryptonotes);
        cryptonoteslinkButton.setOnClickListener {
            val browserIntent = Intent(
                Intent.ACTION_VIEW,
                Uri.parse("https://drive.google.com/file/d/1AyyRipZrZLLt8YcflvoyoM43FJf68BrK/view?usp=sharing/")
            )
            startActivity(browserIntent)
        }

        val ainoteslinkButton = findViewById<Button>(R.id.ainotes);
        ainoteslinkButton.setOnClickListener {
            val browserIntent = Intent(
                Intent.ACTION_VIEW,
                Uri.parse("https://drive.google.com/file/d/1m3jq4jqYOVOf-jqsXjp0nb0O3VdeNUS2/view?usp=sharing/")
            )
            startActivity(browserIntent)
        }

        val dotnetpyqlinkButton = findViewById<Button>(R.id.dotnetpyq);
        dotnetpyqlinkButton.setOnClickListener {
            val browserIntent = Intent(
                Intent.ACTION_VIEW,
                Uri.parse("https://drive.google.com/file/d/1LEKJ0CxYE-tLglxwaYujbrR-B0KfNYSf/view?usp=sharing/")
            )
            startActivity(browserIntent)
        }

        val adhocpyqlinkButton = findViewById<Button>(R.id.adhocpyq);
        adhocpyqlinkButton.setOnClickListener {
            val browserIntent = Intent(
                Intent.ACTION_VIEW,
                Uri.parse("https://drive.google.com/file/d/1HBLEEA1pFo4gyln6VAy5ZkQFltXIiOz0/view?usp=sharing/")
            )
            startActivity(browserIntent)
        }

        val bigdatapyqlinkButton = findViewById<Button>(R.id.bigdatapyq);
        bigdatapyqlinkButton.setOnClickListener {
            val browserIntent = Intent(
                Intent.ACTION_VIEW,
                Uri.parse("https://drive.google.com/file/d/1zat1ne1zr2BvjTzICcBsm6DxDNe-HXvu/view?usp=sharing/")
            )
            startActivity(browserIntent)
        }

        val advcoapyqlinkButton = findViewById<Button>(R.id.advcoapyq);
        advcoapyqlinkButton.setOnClickListener {
            val browserIntent = Intent(
                Intent.ACTION_VIEW,
                Uri.parse("https://drive.google.com/file/d/1dI2YtD_gVE-_Ho_IhbbTf9uDCKqCSxu-/view?usp=sharing/")
            )
            startActivity(browserIntent)
        }

        val advospyqlinkButton = findViewById<Button>(R.id.advospyq);
        advospyqlinkButton.setOnClickListener {
            val browserIntent = Intent(
                Intent.ACTION_VIEW,
                Uri.parse("https://drive.google.com/file/d/1AxA3-jwFwTDjOuJRUGU6hzf3lugrnL_L/view?usp=sharing/")
            )
            startActivity(browserIntent)
        }

        val cryptopyqlinkButton = findViewById<Button>(R.id.cryptopyq);
        cryptopyqlinkButton.setOnClickListener {
            val browserIntent = Intent(
                Intent.ACTION_VIEW,
                Uri.parse("https://drive.google.com/file/d/1ppf08EMgHgLLdrXwEjdYI_mAyc6qshPx/view?usp=sharing/")
            )
            startActivity(browserIntent)
        }

        val aipyqlinkButton = findViewById<Button>(R.id.aipyq);
        aipyqlinkButton.setOnClickListener {
            val browserIntent = Intent(
                Intent.ACTION_VIEW,
                Uri.parse("https://drive.google.com/file/d/1BV2JW1hfrlXYoNjhbbqc4KFiWEAhNOhJ/view?usp=sharing/")
            )
            startActivity(browserIntent)
        }


    }
}