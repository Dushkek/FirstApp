package by.tms.app.homework4.activities

import android.os.Bundle
import android.view.View
import android.widget.Toast
import android.widget.Toast.LENGTH_SHORT
import androidx.appcompat.app.AppCompatActivity
import by.tms.app.R
import by.tms.app.homework4.model.Flower
import by.tms.app.homework4.model.FlowerList
import kotlinx.android.synthetic.main.add_flower_layout.*

class AddFlowerActivity :AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.add_flower_layout)

        addFlowerToList.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        val url = imageUrl.text
        val name= editFlowerName.text
        val price = editFlowerPrice.text
        if (url.isNotEmpty() && name.isNotEmpty() && price.isNotEmpty()) {
            FlowerList.instance.list.add(
                Flower(
                   url.toString(),
                    name.toString(),
                    price.toString().toDouble()
                )
                   )
            url.clear()
            name.clear()
            price.clear()
            Toast.makeText(this, R.string.flower_added, LENGTH_SHORT).show()
        }
        else
        Toast.makeText(this, R.string.fill_data, LENGTH_SHORT).show()
    }
}
