package com.example.sub1kade.anko

import android.view.Gravity
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import com.example.sub1kade.R
import com.example.sub1kade.view.DetailActivity
import org.jetbrains.anko.*

class DetailUI : AnkoComponent<DetailActivity> {

    lateinit var imageLeague: ImageView
    lateinit var nameLeague: TextView
    lateinit var descLeague: TextView

    override fun createView(ui: AnkoContext<DetailActivity>) = with(ui) {
        verticalLayout {
            imageLeague = imageView {
                setImageResource(R.drawable.bundesliga)
            }.lparams(200, 200) {
                gravity = Gravity.CENTER
                topMargin = dip(15)
            }

            nameLeague = textView("Bundesliga") {
                textSize = 20f
            }.lparams(wrapContent, wrapContent) {
                gravity = Gravity.CENTER
                margin = dip(15)
            }

            descLeague = textView("Lorem ipsum aja broo") {
                textSize = 13f
            }.lparams(wrapContent, wrapContent) {
                gravity = Gravity.CENTER
                margin = dip(15)
            }
        }
    }
}