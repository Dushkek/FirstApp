package by.tms.app.homework5

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.RecyclerView
import by.tms.app.R
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.snack_item.view.*

const val NAME = "NAME"
const val PRICE= "PRICE"
const val DETAILS = "DETAILS"
const val URL = "URL"

class Adapter(private val list : ArrayList<Snack>, private val recycler:RecyclerView):RecyclerView.Adapter<Adapter.SnackViewHolder>() {

    class SnackViewHolder(itemView: View): RecyclerView.ViewHolder(itemView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SnackViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.snack_item,parent,false)
        return SnackViewHolder(itemView)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: SnackViewHolder, position: Int) {
        val myView = holder.itemView

        Picasso.get().load(list[position].imageUrl).into(myView.snackImage)
        myView.snackName.text = list[position].name
        myView.snackPrice.text = list[position].price.toString()

        myView.setOnClickListener {

            when(recycler.tag) {
                recycler.context.getString(R.string.landscape) -> {
                    val model = ViewModelProvider(myView.context as MainActivity).get(SnackCollection::class.java)
                    model.name = list[position].name
                    model.price = (list[position].price.toString() + "  BYN")
                    model.details = list[position].details
                    model.imageUrl = list[position].imageUrl
                    val fragmentSnack = Fragment()
                    (holder.itemView.context as MainActivity).supportFragmentManager.beginTransaction().replace(R.id.landscapeFragment, fragmentSnack).commit()

                }

                recycler.context.getString(R.string.portrait) -> {
                    val intent = Intent(myView.context, InfoActivity::class.java)
                    intent.putExtra(NAME, list[position].name)
                    intent.putExtra(PRICE, list[position].price.toString() + " BYN")
                    intent.putExtra(DETAILS, list[position].details)
                    intent.putExtra(URL, list[position].imageUrl)
                    holder.itemView.context.startActivity(intent)

                }
            }
        }

    }

}