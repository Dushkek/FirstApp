package by.tms.app.homework5

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import by.tms.app.R

class InfoFragment:AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.frag_layout)


        supportFragmentManager.beginTransaction().replace(R.id.portraitContainer, Fragment()).commit()
    }
}