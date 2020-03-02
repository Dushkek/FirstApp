package by.tms.app

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.hw2_layout.*

class Homework2Activity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.hw2_layout)

        flagsButton.setOnClickListener {
            startActivity(Intent(this,FlagsActivity::class.java))
        }

        animationButton.setOnClickListener {
            startActivity(Intent(this,AnimationActivity::class.java))
        }
    }
}