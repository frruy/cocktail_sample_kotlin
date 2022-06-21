package com.example.mvvm.drink.ui

import androidx.lifecycle.ViewModel
import com.example.mvvm.drink.data.HomeRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(
    private val homeRepository: HomeRepository,
) : ViewModel() {

//    val randomCocktail: MutableLiveData<Resource<Cocktail>> = MutableLiveData()

//    fun fetchAndSaveRandomCocktail() {
//        randomCocktail.postValue(Resource.Loading())
//        viewModelScope.launch {
//            try {
//                if (hasInternetConnection(context)) {
//                    val response = homeRepository.fetchAndSaveRandomCocktail()
//                    randomCocktail.postValue(Resource.Success(response.body()!!))
//                } else
//                    randomCocktail.postValue(Resource.Error("No Internet Connection"))
//            } catch (ex: Exception) {
//                when (ex) {
//                    is IOException -> randomCocktail.postValue(Resource.Error("Network Failure " + ex.localizedMessage))
//                    else -> randomCocktail.postValue(Resource.Error("Conversion Error"))
//                }
//            }
//        }
//    }

    val drink by lazy { homeRepository.observeDrinks() }
}