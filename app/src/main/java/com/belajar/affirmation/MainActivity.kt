package com.belajar.affirmation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.belajar.affirmation.data.DataSource
import com.belajar.affirmation.model.CardModel
import com.belajar.affirmation.ui.theme.AffirmationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AffirmationTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    CardImageList(list = DataSource().listItems())
                }
            }
        }
    }
}

@Composable
fun CardImage(listAffirmation:CardModel) {

   Card(modifier = Modifier
       .padding(8.dp),
   elevation = 4.dp,
   shape = RoundedCornerShape(12.dp)) {
       Column {
           Image(painter = painterResource(id = listAffirmation.imageCard),
               contentDescription = stringResource( id = listAffirmation.namaCard),
               modifier = Modifier
                   .fillMaxWidth()
                   .height(194.dp),
               contentScale = ContentScale.Crop
           )
           Text(text = stringResource(id = listAffirmation.namaCard),
               style = MaterialTheme.typography.h6,
               modifier = Modifier.padding(16.dp)
           )

       }
   }

}

@Composable
fun CardImageList( list:List<CardModel> ) {
    LazyColumn(content = {
        items(list) {
            CardImage(listAffirmation = it)
        }
    })
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun AffirmationPreview() {
    CardImageList(list = DataSource().listItems())
}