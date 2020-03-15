package by.tms.app.homework2

import android.graphics.drawable.AnimationDrawable
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import by.tms.app.R
import kotlinx.android.synthetic.main.anim_activity.*

class AnimationActivity : AppCompatActivity(){


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.anim_activity)

        var catAnimation: AnimationDrawable

        imageAnimation.apply {
            setBackgroundResource(R.drawable.cat)
            catAnimation = background as AnimationDrawable
        }
        catAnimation.start()
    }
}