package com.example.mvvm.drink.data

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

/**
 * The Data Access Object for the Cocktail class.
 */
@Dao
interface CocktailDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertDrink(drink: Drink)

    @Query("SELECT * FROM drink ORDER BY idDrink DESC limit 1")
    fun getDrinks(): LiveData<Drink>
}