package com.example.surfchill

import android.content.DialogInterface.OnClickListener
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
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
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ExperimentalLayoutApi
import androidx.compose.foundation.layout.FlowColumn
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.TextButton
import androidx.compose.ui.Alignment
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.zIndex

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
                    HomeScreen()
                    TitleApp(stringResource(id = R.string.app_name))
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

@OptIn(ExperimentalLayoutApi::class)
@Composable
fun NavigateButton(onClick: () -> Unit, modifier: Modifier) {
    val context = LocalContext.current
    Column(
        modifier = Modifier
            .fillMaxSize(),
        verticalArrangement = Arrangement.Bottom,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Box(
            modifier = Modifier
                .clickable(onClick = {
                    Toast.makeText(context, "You clicked me!", Toast.LENGTH_SHORT).show()
                })
        ) {
            Image(
                painter = painterResource(id = R.drawable.bouton),
                modifier = Modifier
                    .align(Alignment.Center)
                    .zIndex(1F)
                    .rotate(90F),
                contentDescription = null,
                contentScale = ContentScale.FillWidth,
                alpha = 0.9F,
            )
            Text(
                text = "Let's go !",
                color = Color.Black,
                modifier = Modifier
                    .align(Alignment.Center)
                    .zIndex(2F)
            )

        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingPreview() {
    val context = LocalContext.current
    SurfChillTheme {
        HomeScreen()
        TitleApp(stringResource(id = R.string.app_name))
        NavigateButton(onClick = {
            Toast.makeText(context, "You clicked me!", Toast.LENGTH_SHORT).show()
        }, modifier = Modifier)
    }
}
