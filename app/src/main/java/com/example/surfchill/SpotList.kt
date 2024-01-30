package com.example.surfchill

import android.os.Bundle
import android.os.Message
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.surfchill.ui.theme.SurfChillTheme

class SpotList(s: String) : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SurfChillTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    SpotList("list des 20 Spots")
                }
            }
        }
    }
}

@Composable
fun ListeSpot(messages: List<Message>) {
    LazyColumn {
        items(messages) { message -> 
            Card(message)
        }
    
    }
}

@Composable
fun SpotList(modifier: Modifier = Modifier) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(0.dp)
    ) {
        Image(
            painter = painterResource(id= R.drawable.bud_bud_vendee),
            contentDescription = null,
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight(),
            contentScale = ContentScale.Crop,
            alpha = 0.9F
        )
    }
}



@Preview(showBackground = true, showSystemUi = true)
@Composable
fun PreviewList() {
    SurfChillTheme {
        SpotList("list des 20 Spots")
        ListeSpot( /* API */)
    }
}