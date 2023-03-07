package com.example.wishlist
import com.example.wishlist.wishadapter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var wlist= mutableListOf<wishlist>()
        val item_wish= findViewById<View>(R.id.etItem) as EditText
        val store_wish= findViewById<View>(R.id.etStore) as EditText
        val price_wish= findViewById<View>(R.id.etPrice) as EditText
        val rvadapter=wishadapter(wlist)
        val rvWishlist = findViewById<View>(R.id.rvWishlist) as RecyclerView
        rvWishlist.isNestedScrollingEnabled = false

        rvWishlist.adapter = rvadapter
        rvWishlist.layoutManager=LinearLayoutManager(this)

        val wishbutton= findViewById<View>(R.id.addButton)
        wishbutton.setOnClickListener(){
            val item=item_wish.text.toString()
            val price=price_wish.text.toString()
            val store=store_wish.text.toString()

            if ( item=="" || price=="" || store==""){
                Toast.makeText(it.context, "Something is missing", Toast.LENGTH_SHORT).show()

        }
            val wish=wishlist(item, price, store)
            wlist.add(wishlist(item, price, store))
            rvadapter.notifyItemInserted(wlist.size-1)
            item_wish.setText("")
            price_wish.setText("")
            store_wish.setText("")


        }




    }
}