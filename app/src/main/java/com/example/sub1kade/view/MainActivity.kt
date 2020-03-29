package com.example.sub1kade.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import com.example.sub1kade.R
import com.example.sub1kade.adapter.FootballAdapter
import com.example.sub1kade.anko.MainUI
import com.example.sub1kade.item.Item
import org.jetbrains.anko.setContentView
import org.jetbrains.anko.startActivity

class MainActivity : AppCompatActivity() {

    lateinit var mainActivity: MainUI

    private var main: MutableList<Item> = mutableListOf()

    private fun initData(){
        val name = resources.getStringArray(R.array.liga_name)
        val image = resources.obtainTypedArray(R.array.liga_image)
        val desc = resources.getStringArray(R.array.liga_desc)
        main.clear()
        for (i in name.indices){
            main.add(Item(name[i], image.getResourceId(i, 0), desc[i]))
        }

        image.recycle()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        mainActivity = MainUI()
        mainActivity.setContentView(this)

        initData()

        mainActivity.recycler.layoutManager = GridLayoutManager(this, 2)
        mainActivity.recycler.adapter = FootballAdapter(this, main) {
            startActivity<DetailActivity>("CLUB" to  main.indexOf(it))
        }

    }
}
