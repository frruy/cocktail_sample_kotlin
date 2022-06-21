package com.example.mvvm.data

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.mvvm.drink.data.CocktailDao
import com.example.mvvm.drink.data.Drink
import com.example.mvvm.di.ApplicationScope
import kotlinx.coroutines.CoroutineScope
import javax.inject.Inject
import javax.inject.Provider

@Database(entities = [Drink::class], version = 1)
abstract class AppDatabase : RoomDatabase() {

    abstract fun getCocktailAppDao(): CocktailDao

    class Callback @Inject constructor(
        private val database: Provider<AppDatabase>,
        @ApplicationScope private val applicationScope: CoroutineScope
    ) : RoomDatabase.Callback()
}