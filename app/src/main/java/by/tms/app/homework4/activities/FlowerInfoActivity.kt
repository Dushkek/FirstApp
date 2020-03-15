package by.tms.app.homework4.activities

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import by.tms.app.R
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.flower_info_layout.*

class FlowerInfoActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.flower_info_layout)

        flowerInfoName.text = intent.getStringExtra("NAME")
        flowerInfoPrice.text = intent.getDoubleExtra("PRICE",0.0).toString()
        Picasso.get().load(intent.getStringExtra("URL")).into(flowerInfoImage)
        }
}