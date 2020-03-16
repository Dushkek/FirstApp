package by.tms.app.homework4.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import by.tms.app.R
import by.tms.app.homework4.model.FlowerList
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.bottom_fragment_activity.*

class BottomFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.bottom_fragment_activity,container,false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        val flowers = FlowerList.instance.list
        nameBottom.append(flowers[1].name)
        priceBottom.append(flowers[1].price.toString())
        Picasso.get().load(flowers[1].url).into(imageFragmentBottom)

    }

}