
package com.example.jurabekov_sherzod_exam.activity

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager.widget.ViewPager
import androidx.viewpager.widget.ViewPager.OnPageChangeListener
import com.example.jurabekov_sherzod_exam.MainActivity
import com.example.jurabekov_sherzod_exam.R
import com.example.jurabekov_sherzod_exam.adapter.ViewPagerAdapter
import com.example.jurabekov_sherzod_exam.fragment.Fragment1
import com.example.jurabekov_sherzod_exam.fragment.Fragment2
import com.example.jurabekov_sherzod_exam.fragment.Fragment3
import com.example.jurabekov_sherzod_exam.fragment.Fragment4
import com.tbuonomo.viewpagerdotsindicator.DotsIndicator
import com.tbuonomo.viewpagerdotsindicator.WormDotsIndicator


class SplashActivity : AppCompatActivity() {
    private var viewPager: ViewPager? = null
    var wormDotsIndicator: WormDotsIndicator? = null
    private var viewPagerAdapter: ViewPagerAdapter? = null

    lateinit var text_done :TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        initView()
    }
    private fun initView() {

        viewPager = findViewById<ViewPager>(R.id.view_pager)
        wormDotsIndicator = findViewById(R.id.worm_dots_indicator)
        viewPagerAdapter = ViewPagerAdapter(supportFragmentManager)
        viewPagerAdapter!!.add(Fragment1()) //bular viewpagerlarni qo'shadi
        viewPagerAdapter!!.add(Fragment2())
        viewPagerAdapter!!.add(Fragment3())
        viewPagerAdapter!!.add(Fragment4())

        viewPager!!.addOnPageChangeListener(object : ViewPager.OnPageChangeListener{
            override fun onPageScrolled(
                position: Int,
                positionOffset: Float,
                positionOffsetPixels: Int
            ) {}

            override fun onPageSelected(position: Int) {
                if(position == 3){
                    text_done.text = "Done"

                    text_done.setOnClickListener {
                        val intent = Intent(this@SplashActivity,MainActivity::class.java)
                        startActivity(intent)
                        finish()
                    }
                }else{
                    text_done.text = "Next"
                }
            }

            override fun onPageScrollStateChanged(state: Int) {}

        })

        viewPager!!.adapter = viewPagerAdapter
        wormDotsIndicator!!.setViewPager(viewPager!!)





    }
    fun setNext(){
        var intent = Intent(this,MainActivity::class.java)
        startActivity(intent)
    }

}