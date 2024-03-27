package com.example.lab2_1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.magnifier
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.lab2_1.ui.theme.Lab2_1Theme
import androidx.compose.material3.Button
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.width
import androidx.compose.ui.Alignment
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Lab2_1Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    lab2task1(modifier = Modifier)
//                      lab2task2(modifier = Modifier)
//                    lab2task3(modifier = Modifier)
                }
            }
        }
    }
}

@Composable
fun lab2task1(modifier: Modifier = Modifier){
    var buttoncolor  = remember {
        mutableStateOf(Color.Blue);
    }

    Button(onClick = { buttoncolor.value = Color.Red },
        colors = ButtonDefaults.buttonColors(containerColor = buttoncolor.value))
    {
     Text(text = "Click me ")
    }
}


@Composable
fun lab2task2 (modifier: Modifier){
    Row (modifier = Modifier ){
        Image(painter = painterResource(id = R.drawable.image_1),
            contentDescription ="",
            contentScale = ContentScale.FillBounds,
            modifier = Modifier
                .width(100.dp)
                .height(100.dp)
                .padding(10.dp))



            Column(
                modifier= Modifier
                    .padding(5.dp)
                    .fillMaxWidth()
                    .height(70.dp),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally) {

                Text(text = "Ahmar Ali",
                    textAlign = TextAlign.Left,
                    modifier= Modifier
                        .width(300.dp)
                        .padding(5.dp)
                        .offset(0.dp, 4.dp))

                Text(text = "Computer Science",
                    textAlign = TextAlign.Left,
                    modifier= Modifier
                        .width(300.dp)
                        .padding(5.dp)
                        .offset(2.dp, 2.dp))
            }

        }

    }



@Composable
fun lab2task3 (modifier: Modifier){
    Column {
       //Row first
        Row (modifier = Modifier ){
            Image(painter = painterResource(id = R.drawable.image_1),
                contentDescription ="",
                contentScale = ContentScale.FillBounds,
                modifier = Modifier
                    .width(100.dp)
                    .height(100.dp)
                    .padding(10.dp))



            Column(
                modifier= Modifier
                    .padding(5.dp)
                    .height(70.dp),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally) {

                Text(text = "Ahmar Ali",
                    textAlign = TextAlign.Left,
                    modifier= Modifier
                        .width(300.dp)
                        .padding(5.dp)
                        .offset(0.dp, 4.dp))

                Text(text = "Computer Science",
                    textAlign = TextAlign.Left,
                    modifier= Modifier
                        .width(300.dp)
                        .padding(5.dp)
                        .offset(2.dp, 2.dp))
            }

        }
         // Row second
        Row (modifier = Modifier ){
            Image(painter = painterResource(id = R.drawable.image_2),
                contentDescription ="",
                contentScale = ContentScale.FillBounds,
                modifier = Modifier
                    .width(100.dp)
                    .height(100.dp)
                    .padding(10.dp))



            Column(
                modifier= Modifier
                    .padding(5.dp)
                    .height(70.dp),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally) {

                Text(text = "Azfar Ali",
                    textAlign = TextAlign.Left,
                    modifier= Modifier
                        .width(300.dp)
                        .padding(5.dp)
                        .offset(0.dp, 4.dp))

                Text(text = "BBA",
                    textAlign = TextAlign.Left,
                    modifier= Modifier
                        .width(300.dp)
                        .padding(5.dp)
                        .offset(2.dp, 2.dp))
            }

        }

        // row third
        Row (modifier = Modifier ){
            Image(painter = painterResource(id = R.drawable.image_3),
                contentDescription ="",
                contentScale = ContentScale.FillBounds,
                modifier = Modifier
                    .width(100.dp)
                    .height(100.dp)
                    .padding(10.dp))



            Column(
                modifier= Modifier
                    .padding(5.dp)
                    .height(70.dp),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally) {

                Text(text = "Asfar Ali",
                    textAlign = TextAlign.Left,
                    modifier= Modifier
                        .width(300.dp)
                        .padding(5.dp)
                        .offset(0.dp, 4.dp))

                Text(text = "LLB",
                    textAlign = TextAlign.Left,
                    modifier= Modifier
                        .width(300.dp)
                        .padding(5.dp)
                        .offset(2.dp, 2.dp))
            }

        }
    }

}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingPreview() {
    Lab2_1Theme {
        lab2task1(modifier=Modifier)
        //lab2task2(modifier=Modifier)
//        lab2task3(modifier=Modifier)
    }
}

