package com.belajar.affirmation.data

import com.belajar.affirmation.R
import com.belajar.affirmation.model.CardModel

class DataSource {

    fun listItems():List<CardModel> {
        return listOf(
            CardModel(R.string.affirmation1,R.drawable.image1),
            CardModel(R.string.affirmation2,R.drawable.image2),
            CardModel(R.string.affirmation3,R.drawable.image3),
            CardModel(R.string.affirmation4,R.drawable.image4),
            CardModel(R.string.affirmation5,R.drawable.image5),
            CardModel(R.string.affirmation6,R.drawable.image6),
            CardModel(R.string.affirmation7,R.drawable.image7),
            CardModel(R.string.affirmation8,R.drawable.image8),
            CardModel(R.string.affirmation9,R.drawable.image9),
            CardModel(R.string.affirmation10,R.drawable.image10)

        )
    }
}