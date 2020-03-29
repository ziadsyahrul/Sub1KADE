package com.example.sub1kade.anko

import android.view.View
import android.widget.LinearLayout
import androidx.recyclerview.widget.RecyclerView
import com.example.sub1kade.view.MainActivity
import org.jetbrains.anko.AnkoComponent
import org.jetbrains.anko.AnkoContext
import org.jetbrains.anko.linearLayout
import org.jetbrains.anko.matchParent
import org.jetbrains.anko.recyclerview.v7.recyclerView

class MainUI: AnkoComponent<MainActivity> {

    lateinit var recycler : RecyclerView

    override fun createView(ui: AnkoContext<MainActivity>) = with(ui) {
        linearLayout{
            orientation = LinearLayout.VERTICAL
            recycler = recyclerView {
                lparams(matchParent, matchParent)
            }
        }
    }

}