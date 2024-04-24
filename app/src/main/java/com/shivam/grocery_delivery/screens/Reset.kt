package com.shivam.grocery_delivery.screens

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Email
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

import androidx.navigation.NavController
import com.shivam.grocery_delivery.ui.theme.Teal500

@Composable
fun Reset(navController: NavController){
    var username by remember {
        mutableStateOf("")
    }


    val imageVector = Icons.Default.Email
    Scaffold(
        topBar = {
            Row {
                Icon(
                    imageVector = Icons.Filled.ArrowBack,
                    contentDescription = "Back",
                    modifier = Modifier
                        .padding(16.dp)
                        .clickable {
                            // Implement back action here
                            navController.navigateUp()
                        }
                )
            }
        }
    ) {


    }
    Column(modifier = Modifier.fillMaxSize()) {
        Text(text = "Reset Password", fontWeight= FontWeight.Bold, fontSize = 48.sp, modifier = Modifier
            .fillMaxWidth()
            .padding(top = 60.dp)
            .wrapContentWidth(Alignment.CenterHorizontally) )
        Text(text = "You'll receive a mail to reset your password", modifier = Modifier
            .width(360.dp)
            .padding(top = 10.dp, bottom = 10.dp)
            .wrapContentWidth(Alignment.CenterHorizontally)
            , fontSize =16.sp)
        AppTextField(username,"Username","Enter your email address",imageVector){
            username=it
        }
        Button(onClick = {}, colors = ButtonDefaults.buttonColors(
            backgroundColor = Teal500,
            contentColor = Color.White
        ), modifier = Modifier
            .width(375.dp)
            .padding(start = 16.dp, top = 10.dp)) {
            Text(text = "Reset Password")
        }
    }

}