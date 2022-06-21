package com.example.mvvm.drink.data

import com.example.mvvm.api.BaseDataSource
import javax.inject.Inject

class CocktailRemoteDataSource @Inject constructor(private val service: CocktailService) : BaseDataSource() {

    suspend fun fetchDrink() = getResult { service.getRandomCocktail() }
}