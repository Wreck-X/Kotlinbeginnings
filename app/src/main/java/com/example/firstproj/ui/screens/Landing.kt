package com.example.firstproj.ui.screens

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.viewModels
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip




import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.unit.dp
import com.example.firstproj.data.models.ScreenDimensions
import com.example.firstproj.ui.theme.FirstProjTheme
import com.example.firstproj.viewmodels.ScreenDimensionsViewModel

class LandingActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContent {
            FirstProjTheme {
                Page()
            }

        }
    }
}

@SuppressLint("ResourceType")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Page() {

    PostView()
    Scaffold(

        bottomBar = {
            Box {
                BottomAppBar(
                    Modifier
                        .height(70.dp)
                        .clip(RoundedCornerShape(15.dp, 15.dp, 0.dp, 0.dp)),
                    
                ) {
                    
                }
                Row(modifier = Modifier.height(70.dp), verticalAlignment = Alignment.CenterVertically) {
                    Spacer(modifier = Modifier.width(50.dp))
                    Icon(Icons.Default.Menu, contentDescription = "Home" , modifier = Modifier.size(30.dp))
                }
                Row(horizontalArrangement = Arrangement.Center, modifier = Modifier.fillMaxWidth()) {
                    Button(onClick = { /*TODO*/ }, shape = CircleShape, modifier = Modifier
                        .size(65.dp)
                        .offset(y = -25.dp)) {
                        Icon(Icons.Default.Add, contentDescription = "Add Icon", )
                    }
                }

            }

        },

    ) {contentPadding ->
        
        Box(modifier = Modifier.padding(contentPadding))
        Column() {

        }
    }
}


@Composable
fun PostView() {
    val configuration = LocalConfiguration.current

    val screenHeight = configuration.screenHeightDp.dp
    val screenWidth = configuration.screenWidthDp.dp
    println(screenWidth)
    println(screenHeight)
    ScreenDimensions(screenHeight,screenWidth)
}
