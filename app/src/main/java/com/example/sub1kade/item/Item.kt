package com.example.sub1kade.item

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

// parcelable gan
@Parcelize
data class Item (val name: String,
                 val image: Int?,
                 val desc: String?) : Parcelable{
}
