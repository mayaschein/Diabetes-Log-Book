package com.example.t1diary

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.t1diary.ui.theme.T1diaryTheme


class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalMaterial3Api::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Scaffold( //basic layout for front screen
                topBar = {
                    TopAppBar(title = { Text("T1Diary") })
                }
            ) { innerPadding ->
                OptionBar(innerPadding)
            }
        }
    }
}

@Composable
fun OptionBar(innerPadding: PaddingValues){
    Column(
        modifier = Modifier
            .padding(innerPadding)
            .background(color = Color.LightGray)
            .fillMaxWidth()
            .padding(16.dp)
    ){
        Text(
            text = "Add new meal",
            modifier = Modifier.padding(16.dp)
        )
    }

}
@Composable
fun Option(name: String){

}


