package com.shivam.grocery_delivery.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Visibility
import androidx.compose.material.icons.filled.VisibilityOff
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.White
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.shivam.grocery_delivery.R
import com.shivam.grocery_delivery.Screen
import com.shivam.grocery_delivery.ui.theme.Teal100
import com.shivam.grocery_delivery.ui.theme.Teal500
@Composable
fun Login(navController:NavController){
    var username by remember {
        mutableStateOf("")
    }
    var password by remember {
        mutableStateOf("")
    }
    val imageVector = Icons.Default.Email
     val imageVector2 = Icons.Default.Lock


    Column(modifier = Modifier.fillMaxSize(),horizontalAlignment = Alignment.CenterHorizontally) {
            Text(text = "Login", fontWeight= FontWeight.Bold, fontSize = 56.sp, modifier = Modifier
                .fillMaxWidth()
                .padding(top = 80.dp)
                .wrapContentWidth(Alignment.CenterHorizontally) )
        Spacer(modifier = Modifier.height(80.dp))
        Box(modifier = Modifier.fillMaxWidth().fillMaxHeight(1f).background(Teal100)) {
            Column(modifier = Modifier.fillMaxWidth(1f)) {
                Spacer(modifier = Modifier.height(70.dp))
                AppTextField(username,"Username","Enter your username",imageVector){
                    username=it
                }
                Spacer(modifier = Modifier.height(30.dp))

                AppTextField2(password,"Password","Enter your password",imageVector2){
                    password=it
                }
                Spacer(modifier = Modifier.height(28.dp))

                Text(text = "Reset Password", modifier = Modifier
                    .padding(start = 259.dp).clickable {
                        navController.navigate(Screen.resetScreen.route)
                    },
                    color = Teal500
                    , fontWeight= FontWeight.Bold, fontSize =15.sp)

                Spacer(modifier = Modifier.height(160.dp))
                Button(onClick = { navController.navigate(Screen.detailScreen.withArgs(username)) }, colors = ButtonDefaults.buttonColors(
                    backgroundColor = Teal500,
                    contentColor = White), modifier = Modifier.width(375.dp).padding(start = 16.dp)) {
                    Text(text = "Sign in")
                }
                Text(text = "Don't have an account? Sign up", modifier = Modifier.width(360.dp)
                    .padding(top = 5.dp)
                    .wrapContentWidth(Alignment.CenterHorizontally)
                    , fontSize =18.sp)
            }
        }


    }
}
@Composable
fun AppTextField(value:String,label:String,placeholder:String,imageVector:ImageVector,
                    onValueChange:(String) -> Unit){

    OutlinedTextField(value = value,
        leadingIcon = { Icon(imageVector = imageVector, contentDescription = "emailIcon") },onValueChange = {
        onValueChange(it)
    },
        singleLine = true,
    label = {
        Text(text =label)
    },
    placeholder = {
        Text(text = placeholder)
    },
        colors = TextFieldDefaults.outlinedTextFieldColors(
            focusedBorderColor = MaterialTheme.colors.secondary,
            unfocusedBorderColor = Color.Black,
            focusedLabelColor = MaterialTheme.colors.secondary,
            cursorColor = MaterialTheme.colors.primaryVariant
        ),modifier = Modifier
            .fillMaxWidth()
            .wrapContentWidth(Alignment.CenterHorizontally)
            .width(360.dp))


}
@Composable
fun AppTextField2(value:String,label:String,placeholder:String,imageVector:ImageVector,
                 onValueChange:(String) -> Unit){
    val showPassword = remember { mutableStateOf(false) }

    OutlinedTextField(value = value,
        visualTransformation = if (showPassword.value) VisualTransformation.None else PasswordVisualTransformation(),
        trailingIcon = {
            val (icon, iconColor) = if (showPassword.value) {
                Pair(
                    Icons.Filled.Visibility,
                    colorResource(id = R.color.black)
                )
            } else {
                Pair(Icons.Filled.VisibilityOff, colorResource(id = R.color.black))
            }

            IconButton(onClick = { showPassword.value = !showPassword.value }) {
                Icon(
                    icon,
                    contentDescription = "Visibility",
                    tint = iconColor
                )
            }
        },
        singleLine = true,
        leadingIcon = { Icon(imageVector = imageVector, contentDescription = "emailIcon") },onValueChange = {
            onValueChange(it)
        },
        label = {
            Text(text =label)
        },
        placeholder = {
            Text(text = placeholder)
        },
        colors = TextFieldDefaults.outlinedTextFieldColors(
            focusedBorderColor = MaterialTheme.colors.secondary,
            unfocusedBorderColor = Color.Black,
            focusedLabelColor = MaterialTheme.colors.secondary,
            cursorColor = MaterialTheme.colors.primaryVariant
        ),modifier = Modifier
            .fillMaxWidth()
            .wrapContentWidth(Alignment.CenterHorizontally)
            .width(360.dp))


}