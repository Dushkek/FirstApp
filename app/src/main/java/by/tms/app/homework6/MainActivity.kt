package by.tms.app.homework6

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import by.tms.app.R
import by.tms.app.homework6.adapter.CoinAdapter
import by.tms.app.homework6.retrofit.CoinAPIFactory
import kotlinx.android.synthetic.main.hw6_main_activity.*
import kotlinx.coroutines.*

class MainActivity:AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.hw6_main_activity)

        CoroutineScope(Dispatchers.IO).launch {
            val result = CoinAPIFactory.getRetrofit().getTopCrypto(10, "USD").await().body()

            if (result != null) {

                withContext(Dispatchers.Main) {
                    recyclerView.adapter = CoinAdapter(result)
                    recyclerView.layoutManager = LinearLayoutManager(this@MainActivity)
                    recyclerView.setHasFixedSize(true)
                }
            }


        }

    }
}