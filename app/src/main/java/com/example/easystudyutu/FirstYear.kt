package com.example.easystudyutu

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class FirstYear : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first_year)
        setupLinkButton()
    }
    fun setupLinkButton() {
        val mathlinkButton = findViewById<Button>(R.id.math1notes);
        mathlinkButton.setOnClickListener {
            val browserIntent = Intent(
                Intent.ACTION_VIEW,
                Uri.parse("https://drive.google.com/file/d/1WUhnF3V8opwbyvIUHVBjAgep_OOXUdjF/view?usp=sharing/")
            )
            startActivity(browserIntent)




        }

        val physlinkButton = findViewById<Button>(R.id.physicsnotes);
        physlinkButton.setOnClickListener {
            val browserIntent = Intent(
                Intent.ACTION_VIEW,
                Uri.parse("https://drive.google.com/file/d/1ftChPYivi9BqQicWnokqg7HqTgiE4Q0i/view?usp=sharing/")
            )
            startActivity(browserIntent)
        }

        val chemlinkButton = findViewById<Button>(R.id.chemnotes);
        chemlinkButton.setOnClickListener {
            val browserIntent = Intent(
                Intent.ACTION_VIEW,
                Uri.parse("https://drive.google.com/file/d/14Fl4r_AcK0hnBSJtm30ZkruJNj5rG5Sd/view?usp=sharing/")
            )
            startActivity(browserIntent)
        }

        val electrilinkButton = findViewById<Button>(R.id.electrinotes);
        electrilinkButton.setOnClickListener {
            val browserIntent = Intent(
                Intent.ACTION_VIEW,
                Uri.parse("https://drive.google.com/file/d/1qisWgRgq4V6cXS5uBkUDUlFzGNGDNwQe/view?usp=sharing/")
            )
            startActivity(browserIntent)
        }

        val focplinkButton = findViewById<Button>(R.id.focpnotes);
        focplinkButton.setOnClickListener {
            val browserIntent = Intent(
                Intent.ACTION_VIEW,
                Uri.parse("https://drive.google.com/file/d/1VUD1EPRnRwlnYzvpyU2DjSntManmwEUF/view?usp=sharing/")
            )
            startActivity(browserIntent)
        }

        val mechlinkButton = findViewById<Button>(R.id.mechnotes);
        mechlinkButton.setOnClickListener {
            val browserIntent = Intent(
                Intent.ACTION_VIEW,
                Uri.parse("https://drive.google.com/file/d/1uJ-V2WQObeLGzh72qvMEipaNDRTCZjqn/view?usp=sharing/")
            )
            startActivity(browserIntent)
        }

        val math2linkButton = findViewById<Button>(R.id.math2notes);
        math2linkButton.setOnClickListener {
            val browserIntent = Intent(
                Intent.ACTION_VIEW,
                Uri.parse("https://drive.google.com/file/d/1wPGFhbgNSG66YF8UPNa-dXf6CFraTR39/view?usp=sharing/")
            )
            startActivity(browserIntent)
        }

        val electrolinkButton = findViewById<Button>(R.id.electronotes);
        electrolinkButton.setOnClickListener {
            val browserIntent = Intent(
                Intent.ACTION_VIEW,
                Uri.parse("https://drive.google.com/file/d/14-PjjFtFx9i9_9EcktISnBpaD-079tdC/view?usp=sharing/")
            )
            startActivity(browserIntent)
        }

        val evslinkButton = findViewById<Button>(R.id.evsnotes)
        evslinkButton.setOnClickListener {
            val browserIntent = Intent(
                Intent.ACTION_VIEW,
                Uri.parse("https://drive.google.com/file/d/184Vf3r0Kk5YyFSrUvdUcar8PbIJ69Njv/view?usp=sharing/")
            )
            startActivity(browserIntent)
        }

        val m1pyqlinkButton = findViewById<Button>(R.id.math1pyq)
        m1pyqlinkButton.setOnClickListener {
            val browserIntent = Intent(
                Intent.ACTION_VIEW,
                Uri.parse("https://drive.google.com/file/d/1nXZcAY9MpcAa_bXQerFyxvOlE4Gpyy9h/view?usp=sharing/")
            )
            startActivity(browserIntent)
        }

        val physpyqlinkButton = findViewById<Button>(R.id.physicspyq)
        physpyqlinkButton.setOnClickListener {
            val browserIntent = Intent(
                Intent.ACTION_VIEW,
                Uri.parse("https://drive.google.com/file/d/1_tNk_SnfkDxc9vuEt_q3htmZEDDr2Oxd/view?usp=sharing/")
            )
            startActivity(browserIntent)
        }

        val chempyqlinkButton = findViewById<Button>(R.id.chempyq)
        chempyqlinkButton.setOnClickListener {
            val browserIntent = Intent(
                Intent.ACTION_VIEW,
                Uri.parse("https://drive.google.com/file/d/17q65CEjxcU3LmH1VXG5yNZjuwS4XlUjM/view?usp=sharing/")
            )
            startActivity(browserIntent)
        }

        val electripyqlinkButton = findViewById<Button>(R.id.electripyq)
        electripyqlinkButton.setOnClickListener {
            val browserIntent = Intent(
                Intent.ACTION_VIEW,
                Uri.parse("https://drive.google.com/file/d/1_8ZMDktdYpsCcsnAQDXeyvO8ohwET6PH/view?usp=sharing/")
            )
            startActivity(browserIntent)
        }

        val focppyqlinkButton = findViewById<Button>(R.id.focppyq)
        focppyqlinkButton.setOnClickListener {
            val browserIntent = Intent(
                Intent.ACTION_VIEW,
                Uri.parse("https://drive.google.com/file/d/184Vf3r0Kk5YyFSrUvdUcar8PbIJ69Njv/view?usp=sharing/")
            )
            startActivity(browserIntent)
        }

        val mechpyqlinkButton = findViewById<Button>(R.id.mechpyq)
        mechpyqlinkButton.setOnClickListener {
            val browserIntent = Intent(
                Intent.ACTION_VIEW,
                Uri.parse("https://drive.google.com/file/d/184Vf3r0Kk5YyFSrUvdUcar8PbIJ69Njv/view?usp=sharing/")
            )
            startActivity(browserIntent)
        }

        val m2pyqlinkButton = findViewById<Button>(R.id.math2pyq)
        m2pyqlinkButton.setOnClickListener {
            val browserIntent = Intent(
                Intent.ACTION_VIEW,
                Uri.parse("https://drive.google.com/file/d/184Vf3r0Kk5YyFSrUvdUcar8PbIJ69Njv/view?usp=sharing/")
            )
            startActivity(browserIntent)
        }

        val elecropyqlinkButton = findViewById<Button>(R.id.electropyq)
        elecropyqlinkButton.setOnClickListener {
            val browserIntent = Intent(
                Intent.ACTION_VIEW,
                Uri.parse("https://drive.google.com/file/d/184Vf3r0Kk5YyFSrUvdUcar8PbIJ69Njv/view?usp=sharing/")
            )
            startActivity(browserIntent)
        }

        val evspyqlinkButton = findViewById<Button>(R.id.evspyq)
        evspyqlinkButton.setOnClickListener {
            val browserIntent = Intent(
                Intent.ACTION_VIEW,
                Uri.parse("https://drive.google.com/file/d/184Vf3r0Kk5YyFSrUvdUcar8PbIJ69Njv/view?usp=sharing/")
            )
            startActivity(browserIntent)
        }

    }
}