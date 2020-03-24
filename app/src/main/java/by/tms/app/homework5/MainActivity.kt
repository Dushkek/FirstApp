package by.tms.app.homework5

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import by.tms.app.R
import kotlinx.android.synthetic.main.hw5_activity.*

class MainActivity:AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.hw5_activity)

        SnackCollection.instance.fillSnacks()

        recyclerView.adapter = Adapter(SnackCollection.instance.collectionOfSnacks, recyclerView, supportFragmentManager)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)

    }
}