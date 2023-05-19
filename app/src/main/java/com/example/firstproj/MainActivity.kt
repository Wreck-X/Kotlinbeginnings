package com.example.firstproj

import android.os.Bundle
import android.service.autofill.OnClickAction
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.firstproj.ui.theme.FirstProjTheme



class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContent {
            FirstProjTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
                    Row() {
                        Image(painter = painterResource(id = R.drawable.images), contentDescription = "profile picture", modifier = Modifier.size(40.dp).clip(
                            CircleShape))
                        Column{
                            Greeting("something")
                            Greeting("idk")
                        }
                    }

                }
            }
        }
    }
}

@Composable
fun Greeting(names: String, modifier: Modifier = Modifier) {
        Text("Hello $names")
}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    FirstProjTheme {
        Greeting("Android")
    }
}