package com.example.mvvm.drink.data

import retrofit2.Response
import retrofit2.http.GET
import javax.inject.Inject


interface CocktailService {
    companion object {
        const val ENDPOINT = "https://www.thecocktaildb.com/api/json/v1/1/"
    }

    @GET("random.php")
    suspend fun getRandomCocktail(): Response<Cocktail>
}