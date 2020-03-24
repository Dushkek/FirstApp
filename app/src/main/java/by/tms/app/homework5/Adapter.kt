package by.tms.app.homework5

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.FragmentManager
import androidx.recyclerview.widget.RecyclerView
import by.tms.app.R
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.snack_item.view.*

class Adapter(val list : ArrayList<Snack>, val recycler:RecyclerView, val supportFragmentManager: FragmentManager):RecyclerView.Adapter<Adapter.SnackViewHolder>() {

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

        myView.setOnClickListener {
            SnackCollection.instance.selectSnack(position)

            when(recycler.tag) {
                recycler.context.getString(R.string.landscape) -> {
                    supportFragmentManager.beginTransaction().replace(R.id.landscapeFragment, Fragment()).commit()
                }

                recycler.context.getString(R.string.portrait) -> {
                    val intent = Intent(recycler.context,InfoFragment::class.java)
                    recycler.context.startActivity(intent)

                }
            }
        }

    }

}