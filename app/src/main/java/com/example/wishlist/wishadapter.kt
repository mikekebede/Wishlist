package com.example.wishlist

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class wishadapter ( var wishitems : List<wishlist>):RecyclerView.Adapter<wishadapter.wishViewHolder>(){
    inner class wishViewHolder(itemView: View):RecyclerView.ViewHolder(itemView) {
        val itemText=itemView.findViewById<TextView>(R.id.itemTextview)
        val priceText=itemView.findViewById<TextView>(R.id.priceTextview)
        val storeText=itemView.findViewById<TextView>(R.id.storeTextview)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): wishViewHolder {
        val view=LayoutInflater.from(parent.context).inflate(R.layout.wishlist_layout, parent, false)
        return wishViewHolder(view)

    }

    override fun onBindViewHolder(holder: wishViewHolder, position: Int) {
        holder.itemView.apply {

            holder.itemText.text=wishitems[position].item
            holder.priceText.text=wishitems[position].price
            holder.storeText.text=wishitems[position].store

        }

    }

    override fun getItemCount(): Int {
        return wishitems.size

    }
}