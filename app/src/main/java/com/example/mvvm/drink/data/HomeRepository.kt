package com.example.mvvm.drink.data

import com.example.mvvm.data.resultLiveData
import javax.inject.Inject
import javax.inject.Singleton

/**
 * Repository module for handling data operations.
 */
@Singleton
class HomeRepository @Inject constructor(
    private val cocktailRemoteDataSource: CocktailRemoteDataSource,
    private val dao: CocktailDao
) {

    fun observeDrinks() = resultLiveData(
        databaseQuery = {dao.getDrinks()},
        networkCall = {cocktailRemoteDataSource.fetchDrink()},
        saveCallResult = {dao.insertDrink(it.drinks.first())}
    )
}