package com.shivam.grocery_delivery.screens


import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.shivam.grocery_delivery.data.Message
import com.shivam.grocery_delivery.data.MyRepository

@Composable
private fun ItemUI(message: Message

) {
    val context = LocalContext.current
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .padding(5.dp)
                .clickable {
                    Toast
                        .makeText(
                            context,
                            message.title,
                            Toast.LENGTH_SHORT)
                        .show() },
            elevation = 5.dp
        ) {
            Row(modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp), verticalAlignment = Alignment.CenterVertically) {
            Box(
                modifier = Modifier
                    .height(130.dp)
                    .width(130.dp)
                    .padding(end = 10.dp)
                    .clip(shape = RoundedCornerShape(
                        topStart = 0f, topEnd = 50f,
                        bottomEnd = 50f, bottomStart = 0f))
            ) {
                Image(
                    painter = painterResource(id = message.image),
                    contentDescription = message.contentDescription,


                    contentScale = ContentScale.Crop
                )
                Box(
                    modifier = Modifier
                        .align(Alignment.BottomStart)
                        .fillMaxWidth(1f)
                        .fillMaxHeight(0.17f)
                        .background(
                            Color.Gray
                        )
                ) {

                }
                Box(
                    modifier = Modifier
                        .fillMaxSize(),
                    contentAlignment = Alignment.BottomStart
                ) {

                    Text(
                        text = message.title,
                        style = TextStyle(color = Color.White, fontSize = 18.sp),
                        fontWeight = FontWeight.SemiBold,
                        modifier = Modifier
                            .fillMaxWidth()
                            .wrapContentWidth(Alignment.CenterHorizontally)
                    )
                }
            }
                Text(text = message.message,modifier = Modifier.wrapContentWidth(), fontSize = 16.sp)
        }
    }
}
@Composable
fun MyRecyclerView(messages: List<Message>) {
    LazyColumn {
        items(messages) { myMessage ->
            ItemUI(message = myMessage)
        }
    }
}
@Preview(showBackground = true)
@Composable
fun MyPrev(){
    val data = remember {
        MyRepository().getAllMessages()
    }
    MyRecyclerView(messages = data)
}

