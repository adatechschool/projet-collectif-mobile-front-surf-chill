package com.example.surfchill

import android.os.Bundle
import android.os.Message
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.material3.Surface
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.movableContentOf
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.surfchill.ui.theme.SurfChillTheme
class SpotScreen : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SurfChillTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    SpotScreen("Les Spots de Surf")
                }
            }
        }
    }
}
@Composable
fun SpotScreen(message: String, modifier: Modifier = Modifier) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(8.dp)
    ){
        Text(
            text = "Bells Beach",
            color = colorResource(id = R.color.blue),
            fontSize = 40.sp,
            lineHeight = 25.sp,
            textAlign = TextAlign.Center,
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 16.dp)
        )
        Image(
            painter = painterResource(id = R.drawable.bells_beach),
            contentDescription = "Mer bleu et plage de sable blanc",
            modifier = Modifier
                .fillMaxWidth()
                .height(200.dp)
                .padding(bottom = 16.dp),
            contentScale = ContentScale.Crop
        )
        Text(
            text = "L’Australie est définitivement l’un des pays avec les meilleurs spots de surf au monde. Parmi eux vous trouverez le très connu Bells Beach considéré comme un spot historique et spirituel australien. En effet, ce n’est qu’autre la célèbre vague que rêve de surfer Bodhi dans Point Break. Chaque année vous pourrez également y retrouver le célèbre Rip Curl Pro Surf & Music Festival.\n" +
                    "Sur cette plage, à 100 km au Sud-Ouest de Melbourne dans l’Etat de Victoria vous pourrez profiter d’un magnifique Swell, observer les plus grands surfeurs du monde ou encore faire la fête dans une ambiance détente qui ne peut que vous plaire.",
            fontSize = 24.sp,
            lineHeight = 25.sp,
            textAlign = TextAlign.Left,
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 16.dp)
        )
        Image(
            painter = painterResource(id = R.drawable.lieu),
            contentDescription = "goutte bleue symbolisant un lieu sur une carte",
            modifier = Modifier
                .fillMaxWidth()
                .height(55.dp)

        )
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun Preview() {
    SurfChillTheme {
        SpotScreen("Les Spots de Surf")
    }
}