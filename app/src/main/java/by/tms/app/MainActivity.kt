package by.tms.app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Homework1Button.setOnClickListener {
            startActivity(Intent(this,SecondActivity::class.java))
        }

        Homework2Button.setOnClickListener {
            startActivity(Intent(this,Homework2Activity::class.java))
        }

        Homework3Button.setOnClickListener {
            startActivity(Intent(this,VirusActivity::class.java))
        }
    }

}
