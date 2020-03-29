package com.example.sub1kade.anko

import android.content.Context
import android.view.Gravity
import android.view.View
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import org.jetbrains.anko.*

class ListUI: AnkoComponent<Context> {

    lateinit var image: ImageView
    lateinit var name: TextView

    override fun createView(ui: AnkoContext<Context>): View = with(ui){
        linearLayout{
            orientation = LinearLayout.VERTICAL
            padding = dip(15)

            imageView{
                id = Id.image
            }.lparams(width = dip(100), height = dip(100))
            textView {
                id = Id.name
            }.lparams(width = wrapContent, height = wrapContent) {
                gravity = Gravity.CENTER_VERTICAL
                margin = dip(8)
            }
        }
    }

    companion object Id {
        val image = 1
        val name = 2
    }
}