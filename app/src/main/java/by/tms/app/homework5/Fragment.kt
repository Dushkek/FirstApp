package by.tms.app.homework5

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import by.tms.app.R
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.hw5_fragment.*

class Fragment: Fragment(){

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.hw5_fragment,container,false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        Picasso.get().load(SnackCollection.instance.snack?.imageUrl).into(fragmentSnackImage)
        fragmentSnackName.text = SnackCollection.instance.snack?.name
        fragmentSnackDetails.text = SnackCollection.instance.snack?.details
    }
}