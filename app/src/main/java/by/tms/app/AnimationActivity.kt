package by.tms.app

import android.graphics.drawable.AnimationDrawable
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.anim_activity.*

class AnimationActivity : AppCompatActivity(){

    private lateinit var catAnimation: AnimationDrawable

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.anim_activity)

        imageAnimation.apply {
            setBackgroundResource(R.drawable.cat)
            catAnimation = background as AnimationDrawable
        }
        catAnimation.start()
    }
}