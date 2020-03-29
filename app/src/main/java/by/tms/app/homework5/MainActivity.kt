package by.tms.app.homework5

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import by.tms.app.R
import kotlinx.android.synthetic.main.hw5_activity.*

class MainActivity:AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.hw5_activity)

        val model = ViewModelProvider(this).get(SnackCollection::class.java)
        model.fillSnacks()

        recyclerView.adapter = Adapter(model.collectionOfSnacks, recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)

    }
}