package com.shivam.grocery_delivery.screens


import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountBox
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.shivam.grocery_delivery.data.MyRepository
import com.shivam.grocery_delivery.ui.theme.Teal100


@Composable
fun Details(name:String){
    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        TopAppBar(
            title = { Text("Hello $name!") },
            backgroundColor = Teal100,

            actions = {
                // RowScope here, so these icons will be placed horizontally

                IconButton(onClick = { /* doSomething() */ }) {
                    Icon(Icons.Filled.AccountBox, contentDescription = "Localized description")
                }
            }
        )
        val myRepo = MyRepository()
        val data = myRepo.getAllMessages()
        MyRecyclerView(messages = data)

    }

}


