package com.example.jurabekov_sherzod_exam.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.jurabekov_sherzod_exam.R
import com.example.jurabekov_sherzod_exam.model.Categories

class CategoriesAdapter(var context: Context,var items:ArrayList<Categories>):RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_categories,parent,false)
        return CategoriesViewHolder(view)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val  item = items[position]
        if (holder is CategoriesViewHolder){
            var pic = holder.pic
            var tit = holder.title
            pic.setImageResource(item.picture)
            tit.text = item.title
        }
    }

    override fun getItemCount(): Int {
        return items.size
    }
    class CategoriesViewHolder(view: View):RecyclerView.ViewHolder(view){
        var pic:ImageView = view.findViewById(R.id.pic_categories)
        var title:TextView =view.findViewById(R.id.title_categories)
    }
}