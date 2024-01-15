package com.example.surfchill

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.surfchill.ui.theme.SurfChillTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SurfChillTheme {
                val navController = rememberNavController()

                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    NavHost(navController, startDestination = "homeScreen") {
                        composable("homeScreen") {
                            HomeScreen()
                        }
                        composable("spotScreen") {
                            SpotScreen()
                        }
                    }
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
            painter = painterResource(id = R.drawable.bud_bud_vendee),
            contentDescription = null,
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight(),
            contentScale = ContentScale.Crop,
            alpha = 0.5F
        )

        TitleApp(stringResource(id = R.string.app_name))
    }
}

@Composable
fun TitleApp(message: String, modifier: Modifier = Modifier) {
    val sonsieOneFamily = FontFamily(Font(R.font.sonsieone_regular, FontWeight.Normal))

    Text(
        text = message,
        fontFamily = sonsieOneFamily,
        fontWeight = FontWeight.Normal,
        color = Color.Blue,
        fontSize = 48.sp,
        lineHeight = 66.sp,
        textAlign = TextAlign.Center,
        modifier = Modifier
            .fillMaxWidth()
            .padding(bottom = 16.dp)
    )
}


//@Composable
//fun ButtonGo(listener: EventListener, modifier: Modifier = Modifier): Unit {
//        Button(
//            onClick = { /* Handle button click */ },
//            modifier = Modifier,
//                .fillMaxWidth(),
//                .height(50.dp)
//        )
//}


@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingPreview() {
        SurfChillTheme {
            HomeScreen()
            TitleApp(stringResource(id = R.string.app_name))
    }
  }
}
