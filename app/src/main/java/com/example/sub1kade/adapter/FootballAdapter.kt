package com.example.sub1kade.adapter

import android.content.Context
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.sub1kade.anko.ListUI
import com.example.sub1kade.item.Item
import com.example.sub1kade.view.DetailActivity
import org.jetbrains.anko.AnkoContext
import org.jetbrains.anko.intentFor

class FootballAdapter(private val context: Context, private val items: List<Item>, private val listener: (Item) -> Unit)
    : RecyclerView.Adapter<FootballAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = ViewHolder(ListUI().createView(AnkoContext.create(context)))

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindItem(items[position],listener)
    }

    override fun getItemCount(): Int = items.size

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {

        fun bindItem(items: Item, listener: (Item) -> Unit) {
            val name = itemView.findViewById<TextView>(ListUI.name)
            val image = itemView.findViewById<ImageView>(ListUI.image)

            name.text = items.name
            Glide.with(itemView.context).load(items.image).into(image)

            itemView.setOnClickListener {
                itemView.context.startActivity(
                    itemView.context.intentFor<DetailActivity>(
                        "leagueName" to items.name,
                        "leagueDesc" to items.desc,
                        "leagueImage" to items.image
                    )
                )
            }
        }
        init {
            view.setOnClickListener {
                view.context.startActivity(view.context.intentFor<DetailActivity>())
            }
        }
    }
}