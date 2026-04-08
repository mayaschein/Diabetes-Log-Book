package com.example.t1diary

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.t1diary.ui.theme.T1diaryTheme


class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalMaterial3Api::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val navController = rememberNavController()
            Scaffold( //basic layout
                topBar = {
                    TopAppBar(title = { Text("T1Diary") })
                }
            ) { innerPadding ->
                NavHost( // navigation thingie
                    navController = navController,
                    startDestination = "home",
                    modifier = Modifier.padding(innerPadding)
                ) { // navigation tree
                    composable("home") { HomeScreen(innerPadding, navController) }
                    composable("addMeal") { AddMealScreen(innerPadding, navController)}
                }
            }
        }
    }
}

@Composable
fun HomeScreen(innerPadding: PaddingValues, navController: NavHostController){
    Column(
        modifier = Modifier
            .padding(innerPadding)
            .fillMaxWidth()
            .padding(16.dp)
    ){
        Button(onClick = {
            navController.navigate("addMeal")
        }) {
            Text("Add Meal")
        }
    }

}

@Composable
fun AddMealScreen(innerPadding: PaddingValues, navController: NavHostController) {
    Box(
        modifier = Modifier
            .padding(innerPadding)
            .background(color = Color.LightGray)
            .fillMaxWidth()
            .padding(16.dp),
        contentAlignment = Alignment.Center
    ){
        Text("Add Meal")
    }
}





