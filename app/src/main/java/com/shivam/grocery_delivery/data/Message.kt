package com.shivam.grocery_delivery.data

import androidx.annotation.DrawableRes

data class Message(
    val message: String,
    @DrawableRes val image: Int,
    val contentDescription: String,
    val title: String,

)