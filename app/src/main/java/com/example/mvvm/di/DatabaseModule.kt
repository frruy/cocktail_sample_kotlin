package com.example.mvvm.di

import android.app.Application
import androidx.room.Room
import com.example.mvvm.drink.data.CocktailDao
import com.example.mvvm.data.AppDatabase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object DatabaseModule {

    @Provides
    @Singleton
    fun provideDatabase(
        application: Application,
        callback: AppDatabase.Callback
    ): AppDatabase {
        return Room.databaseBuilder(application, AppDatabase::class.java, "alpha_database")
            .fallbackToDestructiveMigration()
            .addCallback(callback)
            .build()
    }

    @Provides
    fun provideCocktailAppDao(db: AppDatabase): CocktailDao {
        return db.getCocktailAppDao()
    }
}