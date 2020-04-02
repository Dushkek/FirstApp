package by.tms.app.homework6.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat.getColor
import androidx.recyclerview.widget.RecyclerView
import by.tms.app.R
import by.tms.app.homework6.entity.Coins
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.recycler_item.view.*

class CoinAdapter(private val coins: Coins) : RecyclerView.Adapter<CoinAdapter.CoinViewHolder>() {

    class CoinViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CoinViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.recycler_item,parent,false)
        return CoinViewHolder(itemView)
    }

    override fun getItemCount(): Int {
        return coins.data.size
    }


    override fun onBindViewHolder(holder: CoinViewHolder, position: Int) {
        val myView = holder.itemView


       Picasso.get().load("https://s2.coinmarketcap.com/static/img/coins/200x200/${coins.data[position].id}.png").into(myView.imageOfCoin)
        myView.nameOfCrypto.text = coins.data[position].name
        val price = coins.data[position].quote.USD.price.toString()
        myView.priceOfCrypto.text = "$$price"
        val change = coins.data[position].quote.USD.percent_change_1h.toString()
        when{
            coins.data[position].quote.USD.percent_change_1h  > 0.0 -> {
                myView.percentChangeFor1Hour.text = "1 hour: +$change%"
                myView.percentChangeFor1Hour.setTextColor(getColor(myView.context, R.color.colorGreen))

            }
            coins.data[position].quote.USD.percent_change_1h  < 0.0 -> {
                myView.percentChangeFor1Hour.text = "1 hour: -$change%"
                myView.percentChangeFor1Hour.setTextColor(getColor(myView.context, R.color.colorRed))
            }
            coins.data[position].quote.USD.percent_change_1h  == 0.0 -> {
                myView.percentChangeFor1Hour.text = "1 hour: $change%"
                myView.percentChangeFor1Hour.setTextColor(getColor(myView.context, R.color.colorWhite))
            }
        }





        }
    }