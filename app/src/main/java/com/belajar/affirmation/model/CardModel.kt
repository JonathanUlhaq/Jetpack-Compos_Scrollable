package com.belajar.affirmation.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class CardModel(
    @StringRes val namaCard:Int,
    @DrawableRes val imageCard:Int
)
