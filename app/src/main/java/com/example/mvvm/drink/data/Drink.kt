package com.example.mvvm.drink.data


import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

@Entity(tableName = "Drink")
data class Drink(
    @PrimaryKey
    @field:SerializedName("idDrink")
    val idDrink: String,
    @field:SerializedName("dateModified")
    val dateModified: String?,
    @field:SerializedName("strAlcoholic")
    val strAlcoholic: String?,
    @field:SerializedName("strCategory")
    val strCategory: String?,
    @field:SerializedName("strCreativeCommonsConfirmed")
    val strCreativeCommonsConfirmed: String?,
    @field:SerializedName("strDrink")
    val strDrink: String?,
    @field:SerializedName("strDrinkAlternate")
    val strDrinkAlternate: String?,
    @field:SerializedName("strDrinkThumb")
    val strDrinkThumb: String?,
    @field:SerializedName("strGlass")
    val strGlass: String?,
    @field:SerializedName("strIBA")
    val strIBA: String?,
    @field:SerializedName("strImageAttribution")
    val strImageAttribution: String?,
    @field:SerializedName("strImageSource")
    val strImageSource: String?,
    @field:SerializedName("strIng?redient1")
    val strIngredient1: String?,
    @field:SerializedName("strIng?redient10")
    val strIngredient10: String?,
    @field:SerializedName("strIng?redient11")
    val strIngredient11: String?,
    @field:SerializedName("strIng?redient12")
    val strIngredient12: String?,
    @field:SerializedName("strIng?redient13")
    val strIngredient13: String?,
    @field:SerializedName("strIng?redient14")
    val strIngredient14: String?,
    @field:SerializedName("strIng?redient15")
    val strIngredient15: String?,
    @field:SerializedName("strIng?redient2")
    val strIngredient2: String?,
    @field:SerializedName("strIng?redient3")
    val strIngredient3: String?,
    @field:SerializedName("strIng?redient4")
    val strIngredient4: String?,
    @field:SerializedName("strIng?redient5")
    val strIngredient5: String?,
    @field:SerializedName("strIng?redient6")
    val strIngredient6: String?,
    @field:SerializedName("strIng?redient7")
    val strIngredient7: String?,
    @field:SerializedName("strIng?redient8")
    val strIngredient8: String?,
    @field:SerializedName("strIng?redient9")
    val strIngredient9: String?,
    @field:SerializedName("strInstructions")
    val strInstructions: String?,
    @field:SerializedName("strInstructionsDE")
    val strInstructionsDE: String?,
    @field:SerializedName("strInstructionsES")
    val strInstructionsES: String?,
    @field:SerializedName("strInstructionsFR")
    val strInstructionsFR: String?,
    @field:SerializedName("strInstructionsIT")
    val strInstructionsIT: String?,
    @field:SerializedName("strInstructionsZH-HANS")
    val strInstructionsZHHANS: String?,
    @field:SerializedName("strInstructionsZH-HANT")
    val strInstructionsZHHANT: String?,
    @field:SerializedName("strMeasure1")
    val strMeasure1: String?,
    @field:SerializedName("strMeasure10")
    val strMeasure10: String?,
    @field:SerializedName("strMeasure11")
    val strMeasure11: String?,
    @field:SerializedName("strMeasure12")
    val strMeasure12: String?,
    @field:SerializedName("strMeasure13")
    val strMeasure13: String?,
    @field:SerializedName("strMeasure14")
    val strMeasure14: String?,
    @field:SerializedName("strMeasure15")
    val strMeasure15: String?,
    @field:SerializedName("strMeasure2")
    val strMeasure2: String?,
    @field:SerializedName("strMeasure3")
    val strMeasure3: String?,
    @field:SerializedName("strMeasure4")
    val strMeasure4: String?,
    @field:SerializedName("strMeasure5")
    val strMeasure5: String?,
    @field:SerializedName("strMeasure6")
    val strMeasure6: String?,
    @field:SerializedName("strMeasure7")
    val strMeasure7: String?,
    @field:SerializedName("strMeasure8")
    val strMeasure8: String?,
    @field:SerializedName("strMeasure9")
    val strMeasure9: String?,
    @field:SerializedName("strTags")
    val strTags: String?,
    @field:SerializedName("strVideo")
    val strVideo: String?
) {
    override fun toString(): String {
        return "Drink(idDrink='$idDrink', dateModified=$dateModified, strAlcoholic=$strAlcoholic, strCategory=$strCategory, strCreativeCommonsConfirmed=$strCreativeCommonsConfirmed, strDrink=$strDrink, strDrinkAlternate=$strDrinkAlternate, strDrinkThumb=$strDrinkThumb, strGlass=$strGlass, strIBA=$strIBA, strImageAttribution=$strImageAttribution, strImageSource=$strImageSource, strIngredient1=$strIngredient1, strIngredient10=$strIngredient10, strIngredient11=$strIngredient11, strIngredient12=$strIngredient12, strIngredient13=$strIngredient13, strIngredient14=$strIngredient14, strIngredient15=$strIngredient15, strIngredient2=$strIngredient2, strIngredient3=$strIngredient3, strIngredient4=$strIngredient4, strIngredient5=$strIngredient5, strIngredient6=$strIngredient6, strIngredient7=$strIngredient7, strIngredient8=$strIngredient8, strIngredient9=$strIngredient9, strInstructions=$strInstructions, strInstructionsDE=$strInstructionsDE, strInstructionsES=$strInstructionsES, strInstructionsFR=$strInstructionsFR, strInstructionsIT=$strInstructionsIT, strInstructionsZHHANS=$strInstructionsZHHANS, strInstructionsZHHANT=$strInstructionsZHHANT, strMeasure1=$strMeasure1, strMeasure10=$strMeasure10, strMeasure11=$strMeasure11, strMeasure12=$strMeasure12, strMeasure13=$strMeasure13, strMeasure14=$strMeasure14, strMeasure15=$strMeasure15, strMeasure2=$strMeasure2, strMeasure3=$strMeasure3, strMeasure4=$strMeasure4, strMeasure5=$strMeasure5, strMeasure6=$strMeasure6, strMeasure7=$strMeasure7, strMeasure8=$strMeasure8, strMeasure9=$strMeasure9, strTags=$strTags, strVideo=$strVideo)"
    }
}