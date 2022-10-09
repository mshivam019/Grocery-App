package com.shivam.grocery_delivery.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.shivam.grocery_delivery.R
import com.shivam.grocery_delivery.Screen


@Composable
fun OnBoarding(navController: NavController) {

    Column(modifier = Modifier
        .fillMaxSize()
        .padding(24.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
    verticalArrangement = Arrangement.SpaceAround) {

        Image(painter = painterResource(id = R.drawable.fruit_intro_logo),
            contentDescription = "Logo",
            modifier = Modifier
                .size(360.dp)
                .clip(CircleShape),
            contentScale = ContentScale.Crop)
        Column(modifier = Modifier.fillMaxWidth(), horizontalAlignment = Alignment.CenterHorizontally) {
            Text(text = stringResource(R.string.onboarding_title_delivery_at), fontWeight = FontWeight.ExtraBold, fontSize = 26.sp)
            Text(text = stringResource(R.string.onboarding_sub_title), fontWeight = FontWeight.ExtraBold, fontSize = 24.sp, color = MaterialTheme.colors.primary)

        }
       Text(text = stringResource(R.string.onboarding_description),
           fontStyle = FontStyle.Italic,
           fontSize = 20.sp, modifier = Modifier.padding(horizontal = 6.dp),
       textAlign = TextAlign.Center)

        IconButton(onClick = { navController.navigate(Screen.loginScreen.route) }) {
            Icon(Icons.Default.ArrowForward, contentDescription = "Next",
            modifier = Modifier.size(42.dp).clip(CircleShape)
                .background(MaterialTheme.colors.primary),
                tint = MaterialTheme.colors.onPrimary)
        }
    }
}
