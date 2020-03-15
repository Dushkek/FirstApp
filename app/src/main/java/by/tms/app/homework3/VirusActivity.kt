package by.tms.app.homework3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import by.tms.app.R
import kotlinx.android.synthetic.main.virus_activity.*
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class VirusActivity : AppCompatActivity(), View.OnClickListener {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.virus_activity)
        val model = ViewModelProvider(this).get(MyViewModel::class.java)
        lifecycle.addObserver(MyLifeObserver())

        plusConfBtn.setOnClickListener(this)
        plusDeadBtn.setOnClickListener(this)
        plusRecBtn.setOnClickListener(this)

        model.currentStats.observe(this, Observer {
            confirmedCount.text = it[0].toString()
            recoveredCount.text = it.get(1).toString()
            deadCount.text = it.get(2).toString()
        })

        refreshDataButton.setOnClickListener{
            GlobalScope.launch { Dispatchers.IO
                model.getDataFromInternet()
            }
        }
    }

    override fun onClick(v: View?) {
        val model = ViewModelProvider(this).get(MyViewModel::class.java)
        when (v?.id) {
            R.id.plusConfBtn -> {
                model.confirmed++
                confirmedCount.text = model.confirmed.toString()
            }
            R.id.plusDeadBtn -> {
                model.dead++
                deadCount.text = model.dead.toString()
            }
            R.id.plusRecBtn -> {
                model.refused++
                recoveredCount.text = model.refused.toString()
            }
        }
    }


}
