package com.example.surfchill

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.surfchill.ui.theme.SurfChillTheme
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SurfChillTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    HomeScreen() //(stringResource(R.string.app_name),

                }
            }
        }
    }
}

@Composable
fun HomeScreen(modifier: Modifier = Modifier) {
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
        )}}

@Composable
fun TitleApp(message: String, modifier: Modifier = Modifier) {
        Text(
            text = "Surf and Chill",
            fontSize = 40.sp,
            lineHeight = 66.sp,
            textAlign = TextAlign.Center,

            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 16.dp)
        )}

//@Composable
//fun ButtonGo(){
        //Button(
            //onClick = { /* Handle button click */ },
            //modifier = Modifier
                //.fillMaxWidth()
                //.height(50.dp)
        //)
//}

//@Composable
//fun GreetingText(message: String, modifier: Modifier = Modifier) {
    //Column(
        //verticalArrangement = Arrangement.Center,
        //modifier = modifier.padding(8.dp)
    //) {
        //Text(
            //text = message,
            //fontSize = 40.sp,
            //lineHeight = 66.sp,
            //textAlign = TextAlign.Center,
            //modifier = Modifier
        //)
    //}
//}


@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingPreview() {
    SurfChillTheme {
        HomeScreen()
        TitleApp(stringResource(id = R.string.app_name))
    }
}
