package com.muratcangzm.mobilyaarti.presentation.screen.home.composables

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.muratcangzm.mobilyaarti.R


@OptIn(ExperimentalMaterial3Api::class)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun HomeScreen() {

    Surface(modifier = Modifier.fillMaxSize()) {
        Scaffold(topBar = {
            TopAppBar(
                title = {
                    Text(
                        text = "Mobilya Plus", fontWeight = FontWeight.ExtraBold,
                        fontSize = 19.sp,
                        fontStyle = FontStyle.Italic,
                    )
                },
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = colorResource(id = R.color.status_bg ),
                    titleContentColor = colorResource(id = R.color.TopBarTitle)
                )
            )
        },
            content = {

                HomeScreenContent()

            })

    }
}
