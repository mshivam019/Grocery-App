package com.shivam.grocery_delivery.navigation


import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.shivam.grocery_delivery.Screen
import com.shivam.grocery_delivery.screens.OnBoarding
import com.shivam.grocery_delivery.screens.Details
import com.shivam.grocery_delivery.screens.Login
import com.shivam.grocery_delivery.screens.Reset

@Composable
fun AppNavigator(){
    val navController = rememberNavController()
    NavHost(navController = navController,
    startDestination = Screen.mainScreen.route
    ){
        composable(route = Screen.mainScreen.route){
            OnBoarding(navController = navController)
        }
        composable(route = Screen.loginScreen.route){
            Login(navController = navController)


        }
        composable(route = Screen.resetScreen.route){
            Reset(navController = navController)
        }
        composable(route = Screen.detailScreen.route + "/{name}",
        arguments = listOf(
            navArgument("name"){
                type = NavType.StringType
                defaultValue=""
            }
        )
        ){ entry ->
            entry.arguments?.getString("name")?.let { Details(name = it) }

        }


    }
}