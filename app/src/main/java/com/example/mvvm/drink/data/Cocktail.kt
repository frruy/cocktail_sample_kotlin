package com.example.mvvm.drink.data

import com.google.gson.annotations.SerializedName

data class Cocktail(
    @SerializedName("drinks")
    val drinks: List<Drink>
) {
    override fun toString(): String {
        return "Cocktail(drinks=$drinks)"
    }
}