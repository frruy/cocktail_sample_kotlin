package com.example.mvvm.drink.ui

import android.os.Bundle
import android.util.Log
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import com.example.mvvm.util.contentView
import com.example.mvvm.R
import com.example.mvvm.databinding.ActivityMainBinding
import com.example.mvvm.util.log
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    private val binding: ActivityMainBinding by contentView(R.layout.activity_main)
    private val homeViewModel: HomeViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding.btReload.setOnClickListener {
//            homeViewModel.fetchAndSaveRandomCocktail()
        }
//        binding.btLoad.setOnClickListener { homeViewModel.getDrink() }
        observeUI()
    }

    private fun observeUI() {
//        homeViewModel.randomCocktail.observe(this) {
//            Log.d("==duy", "observeUI: $it")
//
//            when (it) {
//                is Resource.Success -> {
//                    Log.d("==duy", "Success observeUI: ${it.data}")
//                }
//            }
//        }

        homeViewModel.drink.observe(this) {
            log("\${it.data?.toString()")
        }
    }

}