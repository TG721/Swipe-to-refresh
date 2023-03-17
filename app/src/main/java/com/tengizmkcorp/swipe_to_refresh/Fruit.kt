package com.tengizmkcorp.swipe_to_refresh

import android.graphics.drawable.Drawable
import android.net.Uri

data class Fruit (
    val name: String,
    val picture: Int
    )

val fruits: MutableList<Fruit> = mutableListOf(
    Fruit("Apple", R.drawable.apple),
    Fruit("Banana", R.drawable.banana),
    Fruit("Pineapple", R.drawable.pineapple),
)

val updatedFruits: MutableList<Fruit> = mutableListOf(
    Fruit("Apple", R.drawable.apple),
    Fruit("Banana", R.drawable.banana),
    Fruit("Pineapple", R.drawable.pineapple),
    Fruit("Pear", R.drawable.pear),
    Fruit("Grape", R.drawable.grape)
)