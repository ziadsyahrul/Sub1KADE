package com.example.sub1kade.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import com.example.sub1kade.R
import com.example.sub1kade.anko.DetailUI
import org.jetbrains.anko.AnkoLogger
import org.jetbrains.anko.info
import org.jetbrains.anko.setContentView

class DetailActivity : AppCompatActivity(), AnkoLogger {

    var leagueName = ""
    var leagueDesc = ""

    lateinit var detailActivity: DetailUI

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        detailActivity = DetailUI()
        detailActivity.setContentView(this)

        val i = intent
        leagueName = i.getStringExtra("leagueName")
        leagueDesc = i.getStringExtra("leagueDesc")

        // kita set dulu gan datanya
        detailActivity.nameLeague.text = leagueName
        detailActivity.descLeague.text = leagueDesc
        detailActivity.imageLeague.setImageResource(i.getIntExtra("leagueImage", R.drawable.bundesliga))

    }
}
