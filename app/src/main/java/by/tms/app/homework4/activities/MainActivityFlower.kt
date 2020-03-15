package by.tms.app.homework4.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import by.tms.app.R
import by.tms.app.homework4.fragments.BottomFragment
import by.tms.app.homework4.fragments.TopFragment
import by.tms.app.homework4.model.FlowerList
import kotlinx.android.synthetic.main.flower_main_activity.*


class MainActivityFlower : AppCompatActivity(), View.OnClickListener {

   private val topFragment = TopFragment()
    private val bottomFragment = BottomFragment()
    private val flowers = FlowerList.instance.list

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.flower_main_activity)

        addFlower.setOnClickListener(this)
        addTopFragment.setOnClickListener(this)
        removeTopFragment.setOnClickListener (this)
        addBottomFragment.setOnClickListener (this)
        removeBottomFragment.setOnClickListener (this)
        topFragmentInMain.setOnClickListener(this)
        bottomFragmentInMain.setOnClickListener(this)

    }


    override fun onClick(v: View?) {

        when (v?.id) {

            addFlower.id -> {
                startActivity(Intent(this, AddFlowerActivity()::class.java))
            }

            addTopFragment.id -> {
                supportFragmentManager.beginTransaction().replace(R.id.topFragmentInMain, topFragment).commit()
        }

            removeTopFragment.id->{
                supportFragmentManager.beginTransaction().remove(topFragment).commit()
            }
            addBottomFragment.id -> {
                supportFragmentManager.beginTransaction().replace(R.id.bottomFragmentInMain, bottomFragment).commit()
            }
            removeBottomFragment.id->{
                supportFragmentManager.beginTransaction().remove(bottomFragment).commit()
            }
            topFragmentInMain.id -> {
                val intent = Intent(this, FlowerInfoActivity::class.java)
                intent.putExtra("NAME", flowers[0].name)
                intent.putExtra("PRICE", flowers[0].price)
                intent.putExtra("URL", flowers[0].url)
                startActivity(intent)
            }

            bottomFragmentInMain.id -> {
                val intent = Intent(this, FlowerInfoActivity::class.java)
                intent.putExtra("NAME", flowers[1].name)
                intent.putExtra("PRICE", flowers[1].price)
                intent.putExtra("URL", flowers[1].url)
                startActivity(intent)
            }
      }
    }
    
}
