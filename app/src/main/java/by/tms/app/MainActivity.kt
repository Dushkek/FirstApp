package by.tms.app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import by.tms.app.homework2.Homework2Activity
import by.tms.app.homework3.VirusActivity
import by.tms.app.homework4.activities.MainActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onClick(v: View?) {
        when (v?.id) {
            Homework1Button.id -> {
                startActivity(Intent(this, SecondActivity::class.java))
            }

            Homework2Button.id -> {
                startActivity(Intent(this, Homework2Activity::class.java))
            }

            Homework3Button.id -> {
                startActivity(Intent(this, VirusActivity::class.java))
            }

            Homework4Button.id -> {
                startActivity(Intent(this, MainActivity::class.java))
            }

            HomeworkButton5.id -> {
                startActivity(Intent(this, by.tms.app.homework5.MainActivity::class.java))
            }
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Homework1Button.setOnClickListener(this)
        Homework2Button.setOnClickListener(this)
        Homework3Button.setOnClickListener(this)
        Homework4Button.setOnClickListener(this)
        HomeworkButton5.setOnClickListener(this)

    }

}
