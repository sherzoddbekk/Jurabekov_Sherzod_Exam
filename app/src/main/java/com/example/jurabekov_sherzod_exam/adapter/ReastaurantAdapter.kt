package com.example.jurabekov_sherzod_exam.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.jurabekov_sherzod_exam.R
import com.example.jurabekov_sherzod_exam.model.Restaurant

class ReastaurantAdapter(var context: Context, var items:ArrayList<Restaurant>):RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_restaurant,parent,false)
        return RestaurantViewHolder(view)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val  item = items[position]
        if (holder is RestaurantViewHolder){
            var pic = holder.pic
            var tit = holder.title
            var star = holder.star
            pic.setImageResource(item.puc)
            tit.text = item.title
            star.setImageResource(item.star)
        }
    }

    override fun getItemCount(): Int {
        return items.size
    }
    class RestaurantViewHolder(view: View):RecyclerView.ViewHolder(view){
        var pic:ImageView = view.findViewById(R.id.pic_resta)
        var title:TextView =view.findViewById(R.id.title_restaurant)
        var star:ImageView = view.findViewById(R.id.star_resta)
    }
}