package com.example.easystudyutu

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class ThirdYear : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third_year)
        setupLinkButton()

    }

    fun setupLinkButton() {
        val osnoteslinkButton = findViewById<Button>(R.id.osnotes);
        osnoteslinkButton.setOnClickListener {
            val browserIntent = Intent(
                Intent.ACTION_VIEW,
                Uri.parse("https://drive.google.com/file/d/1t6bbDyJl3x3fGPOwCx8z87C3ePfdO0lJ/view?usp=sharing/")
            )
            startActivity(browserIntent)
        }

        val cnnoteslinkButton = findViewById<Button>(R.id.cnnotes);
        cnnoteslinkButton.setOnClickListener {
            val browserIntent = Intent(
                Intent.ACTION_VIEW,
                Uri.parse("https://drive.google.com/file/d/10_QIn5eYusLKEW3wxjxeqa1osOAul8JS/view?usp=sharing/")
            )
            startActivity(browserIntent)
        }

        val daanoteslinkButton = findViewById<Button>(R.id.daanotes);
        daanoteslinkButton.setOnClickListener {
            val browserIntent = Intent(
                Intent.ACTION_VIEW,
                Uri.parse("https://drive.google.com/file/d/1nBJgIBWASfMnle5SHEfGjq_Mr26pK2g5/view?usp=sharing/")
            )
            startActivity(browserIntent)
        }

        val javanoteslinkButton = findViewById<Button>(R.id.javanotes);
        javanoteslinkButton.setOnClickListener {
            val browserIntent = Intent(
                Intent.ACTION_VIEW,
                Uri.parse("https://drive.google.com/file/d/1IaGhiIXtscbv9rXF4DtjqyhU0S0iWd8k/view?usp=sharing/")
            )
            startActivity(browserIntent)
        }

        val iwtnoteslinkButton = findViewById<Button>(R.id.iwtnotes);
        iwtnoteslinkButton.setOnClickListener {
            val browserIntent = Intent(
                Intent.ACTION_VIEW,
                Uri.parse("https://drive.google.com/file/d/1sFR0zgrFBryz_M96VYnzqJrmNI3APfQN/view?usp=sharing/")
            )
            startActivity(browserIntent)
        }

        val cybernoteslinkButton = findViewById<Button>(R.id.cybernotes);
        cybernoteslinkButton.setOnClickListener {
            val browserIntent = Intent(
                Intent.ACTION_VIEW,
                Uri.parse("https://drive.google.com/file/d/1r7QivaHE7L4McJZrFeMc0UXvRXhH4oZj/view?usp=sharing/")
            )
            startActivity(browserIntent)
        }

        val micronoteslinkButton = findViewById<Button>(R.id.micronotes);
        micronoteslinkButton.setOnClickListener {
            val browserIntent = Intent(
                Intent.ACTION_VIEW,
                Uri.parse("https://drive.google.com/file/d/1RT9Ht7Xc71x4k7bh-nUwOGapNgTvtzrs/view?usp=sharing/")
            )
            startActivity(browserIntent)
        }

        val compilernoteslinkButton = findViewById<Button>(R.id.compilernotes);
        compilernoteslinkButton.setOnClickListener {
            val browserIntent = Intent(
                Intent.ACTION_VIEW,
                Uri.parse("https://drive.google.com/file/d/1RZCb2Bdk_V1-XSALpfN-juR2z3IRy4LJ/view?usp=sharing/")
            )
            startActivity(browserIntent)
        }

        val miningnoteslinkButton = findViewById<Button>(R.id.dataminingnotes);
        miningnoteslinkButton.setOnClickListener {
            val browserIntent = Intent(
                Intent.ACTION_VIEW,
                Uri.parse("https://drive.google.com/file/d/1ZoU6odamBpRBptmM0VGEVQhmNcOPim9Y/view?usp=sharing/")
            )
            startActivity(browserIntent)
        }

        val analyticsnoteslinkButton = findViewById<Button>(R.id.analyticnotes);
        analyticsnoteslinkButton.setOnClickListener {
            val browserIntent = Intent(
                Intent.ACTION_VIEW,
                Uri.parse("https://drive.google.com/file/d/1SRe0l33k6Mj71yY3GRco7TtHw0-lXopz/view?usp=sharing/")
            )
            startActivity(browserIntent)
        }

        val ospyqlinkButton = findViewById<Button>(R.id.ospyq);
        ospyqlinkButton.setOnClickListener {
            val browserIntent = Intent(
                Intent.ACTION_VIEW,
                Uri.parse("https://drive.google.com/file/d/17GpXMochNNHwb3P_u4p-OUWWOSJziPja/view?usp=sharing/")
            )
            startActivity(browserIntent)
        }

        val cnpyqlinkButton = findViewById<Button>(R.id.cnpyq);
        cnpyqlinkButton.setOnClickListener {
            val browserIntent = Intent(
                Intent.ACTION_VIEW,
                Uri.parse("https://drive.google.com/file/d/1ywCuIWpwN2ZTg9dKyi1Da_tvOG5Fp-hw/view?usp=sharing/")
            )
            startActivity(browserIntent)
        }

        val daapyqlinkButton = findViewById<Button>(R.id.daapyq);
        daapyqlinkButton.setOnClickListener {
            val browserIntent = Intent(
                Intent.ACTION_VIEW,
                Uri.parse("https://drive.google.com/file/d/1ydcEdgnSJjL0R0SLqnllWWmzbRqYlP5h/view?usp=sharing/")
            )
            startActivity(browserIntent)
        }

        val javapyqlinkButton = findViewById<Button>(R.id.javapyq);
        javapyqlinkButton.setOnClickListener {
            val browserIntent = Intent(
                Intent.ACTION_VIEW,
                Uri.parse("https://drive.google.com/file/d/1D3nx1VBv7RjVMkj8-t4TSvlnFnFO2fWt/view?usp=sharing/")
            )
            startActivity(browserIntent)
        }

        val iwtpyqlinkButton = findViewById<Button>(R.id.iwtpyq);
        iwtpyqlinkButton.setOnClickListener {
            val browserIntent = Intent(
                Intent.ACTION_VIEW,
                Uri.parse("https://drive.google.com/file/d/1m3EQClJ7dO7FFpVq8271Cmd0ojE3ULQ9/view?usp=sharing/")
            )
            startActivity(browserIntent)
        }

        val cyberpyqlinkButton = findViewById<Button>(R.id.cyberpyq);
        cyberpyqlinkButton.setOnClickListener {
            val browserIntent = Intent(
                Intent.ACTION_VIEW,
                Uri.parse("https://drive.google.com/file/d/1qYJEOr0VCvKw_dptrMnTFs74-tXSOsNo/view?usp=sharing/")
            )
            startActivity(browserIntent)
        }

        val micropyqlinkButton = findViewById<Button>(R.id.micropyq);
        micropyqlinkButton.setOnClickListener {
            val browserIntent = Intent(
                Intent.ACTION_VIEW,
                Uri.parse("https://drive.google.com/file/d/1D9iwYGjbLKTK3sUhX6NslrcAh93mCNNR/view?usp=sharing/")
            )
            startActivity(browserIntent)
        }

        val compilerpyqlinkButton = findViewById<Button>(R.id.compilerpyq);
        compilerpyqlinkButton.setOnClickListener {
            val browserIntent = Intent(
                Intent.ACTION_VIEW,
                Uri.parse("https://drive.google.com/file/d/1CIlDoUFDvdHVVNLgdf3rrJH30QvwRSRX/view?usp=sharing/")
            )
            startActivity(browserIntent)
        }

        val miningpyqlinkButton = findViewById<Button>(R.id.minigpyq);
        miningpyqlinkButton.setOnClickListener {
            val browserIntent = Intent(
                Intent.ACTION_VIEW,
                Uri.parse("https://drive.google.com/file/d/1cO-1Xe4X-X40jadCtrnxsa3xdDUucxzH/view?usp=sharing/")
            )
            startActivity(browserIntent)
        }

        val analyticspyqlinkButton = findViewById<Button>(R.id.analyticpyq);
        analyticspyqlinkButton.setOnClickListener {
            val browserIntent = Intent(
                Intent.ACTION_VIEW,
                Uri.parse("https://drive.google.com/file/d/1ZwiCZ1-1ZQV82RkD9Lv36hfgFcWWainc/view?usp=sharing/")
            )
            startActivity(browserIntent)
        }
    }
}

