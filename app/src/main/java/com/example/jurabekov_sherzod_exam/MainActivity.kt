package com.example.jurabekov_sherzod_exam

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.jurabekov_sherzod_exam.adapter.CategoriesAdapter
import com.example.jurabekov_sherzod_exam.adapter.ReastaurantAdapter
import com.example.jurabekov_sherzod_exam.model.Categories
import com.example.jurabekov_sherzod_exam.model.Restaurant

class MainActivity : AppCompatActivity() {
    lateinit var recyclerCate:RecyclerView
    lateinit var recyclerResta:RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initView()
    }
    fun initView(){

        recyclerResta = findViewById(R.id.restaurant_recycler_view)
        recyclerResta.layoutManager = GridLayoutManager(this,2)

        recyclerCate =findViewById(R.id.categories_recycler_view)
        recyclerCate.layoutManager = LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false)
        refreshAdapterCa()
        refreshAdapterRes()
    }
    fun refreshAdapterCa(){
        val  adapter1 =CategoriesAdapter(this,getCatego())
        recyclerCate.adapter = adapter1
    }
    fun refreshAdapterRes(){
        val  adapter2 =ReastaurantAdapter(this,getResta())
        recyclerResta.adapter = adapter2
    }
    fun getCatego():ArrayList<Categories>{
        val items:ArrayList<Categories> = ArrayList()
        items.add(Categories(R.drawable.sherzodd,"delicious"))
        items.add(Categories(R.drawable.sherzodd,"delicious"))
        items.add(Categories(R.drawable.sherzodd,"delicious"))
        items.add(Categories(R.drawable.sherzodd,"delicious"))
        items.add(Categories(R.drawable.sherzodd,"delicious"))
        items.add(Categories(R.drawable.sherzodd,"delicious"))

        return items
    }
    fun getResta():ArrayList<Restaurant>{
        val items:ArrayList<Restaurant> = ArrayList()
        items.add(Restaurant(R.drawable.sherzodd,"Chili",R.drawable.ic_baseline_star_border_yul))
        items.add(Restaurant(R.drawable.food1,"Chili",R.drawable.ic_baseline_star_border_yul))
        items.add(Restaurant(R.drawable.food2,"Chili",R.drawable.ic_baseline_star_rate_24))
        items.add(Restaurant(R.drawable.food1,"Chili",R.drawable.ic_baseline_star_rate_24))
        items.add(Restaurant(R.drawable.food1,"Chili",R.drawable.ic_baseline_star_border_yul))
        items.add(Restaurant(R.drawable.food2,"Chili",R.drawable.ic_baseline_star_border_yul))
        items.add(Restaurant(R.drawable.food1,"Chili",R.drawable.ic_baseline_star_border_yul))
        items.add(Restaurant(R.drawable.food1,"Chili",R.drawable.ic_baseline_star_border_yul))
        items.add(Restaurant(R.drawable.food2,"Chili",R.drawable.ic_baseline_star_rate_24))
        items.add(Restaurant(R.drawable.food1,"Chili",R.drawable.ic_baseline_star_rate_24))
        items.add(Restaurant(R.drawable.food1,"Chili",R.drawable.ic_baseline_star_border_yul))
        items.add(Restaurant(R.drawable.food2,"Chili",R.drawable.ic_baseline_star_border_yul))
        return items
    }
}