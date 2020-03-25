package by.tms.app.homework5

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import by.tms.app.R
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.hw5_fragment.*

class InfoActivity:AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.hw5_fragment)


        fragmentSnackName.text=intent.getStringExtra(NAME)
        fragmentSnackPrice.text= intent.getStringExtra(PRICE)
        fragmentSnackDetails.text= intent.getStringExtra(DETAILS)
        Picasso.get().load(intent.getStringExtra(URL)).into(fragmentSnackImage)
    }
}