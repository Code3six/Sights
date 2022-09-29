package com.example.sights

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.*
import androidx.compose.foundation.gestures.FlingBehavior
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.focus.focusModifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.sights.ui.theme.SightsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val montserrat = FontFamily(Font(R.font.montserrat))
            val irishGrover = FontFamily(Font(R.font.irsh_grover))

            var backgroundColor = Color(0xEDEDED)

            SightsTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = backgroundColor
                ) {
                    Column() {
                        Text("Sights",
                            fontSize = 24.sp,
                            fontWeight = FontWeight(700),
                            fontFamily = irishGrover,
                            modifier = Modifier.padding(20.dp))
                        Row(
                            horizontalArrangement = Arrangement.Start,
                            modifier = Modifier
                                .fillMaxWidth(1f)
                                .horizontalScroll(rememberScrollState(), true, null)
                        ) {
                            Spacer(modifier = Modifier.width(40.dp))
                            Image(
                                painterResource(R.drawable.image1),
                                contentDescription = "",
                                modifier = Modifier
                                    .size(50.dp)
                                    .clip(CircleShape),
                                contentScale = ContentScale.FillBounds
                            )
                            Spacer(modifier = Modifier.width(20.dp))
                            Image(
                                painterResource(R.drawable.image2),
                                contentDescription = "",
                                modifier = Modifier
                                    .size(50.dp)
                                    .clip(CircleShape),
                                contentScale = ContentScale.FillBounds
                            )
                            Spacer(modifier = Modifier.width(20.dp))
                            Image(
                                painterResource(R.drawable.image3),
                                contentDescription = "",
                                modifier = Modifier
                                    .size(50.dp)
                                    .clip(CircleShape),
                                contentScale = ContentScale.FillBounds
                            )
                            Spacer(modifier = Modifier.width(20.dp))
                            Image(
                                painterResource(R.drawable.image4),
                                contentDescription = "",
                                modifier = Modifier
                                    .size(50.dp)
                                    .clip(CircleShape),
                                contentScale = ContentScale.FillBounds
                            )
                            Spacer(modifier = Modifier.width(20.dp))
                            Image(
                                painterResource(R.drawable.image5),
                                contentDescription = "",
                                modifier = Modifier
                                    .size(50.dp)
                                    .clip(CircleShape),
                                contentScale = ContentScale.FillBounds
                            )
                            Spacer(modifier = Modifier.width(20.dp))
                            Image(
                                painterResource(R.drawable.image6),
                                contentDescription = "",
                                modifier = Modifier
                                    .size(50.dp)
                                    .clip(CircleShape),
                                contentScale = ContentScale.FillBounds
                            )
                            Spacer(modifier = Modifier.width(20.dp))
                            Image(
                                painterResource(R.drawable.image7),
                                contentDescription = "",
                                modifier = Modifier
                                    .size(50.dp)
                                    .clip(CircleShape),
                                contentScale = ContentScale.FillBounds
                            )
                            Spacer(modifier = Modifier.width(20.dp))
                            Image(
                                painterResource(R.drawable.image8),
                                contentDescription = "",
                                modifier = Modifier
                                    .size(50.dp)
                                    .clip(CircleShape),
                                contentScale = ContentScale.FillBounds
                            )
                            Spacer(modifier = Modifier.width(20.dp))
                            Image(
                                painterResource(R.drawable.image9),
                                contentDescription = "",
                                modifier = Modifier
                                    .size(50.dp)
                                    .clip(CircleShape),
                                contentScale = ContentScale.FillBounds
                            )
                            Spacer(modifier = Modifier.width(20.dp))
                            Image(
                                painterResource(R.drawable.image10),
                                contentDescription = "",
                                modifier = Modifier
                                    .size(50.dp)
                                    .clip(CircleShape),
                                contentScale = ContentScale.FillBounds
                            )
                            Spacer(modifier = Modifier.width(40.dp))
                        }
                        Spacer(modifier = Modifier.height(20.dp))
                        Text("Amazing Views",
                            fontSize = 24.sp,
                            fontWeight = FontWeight(700),
                            fontFamily = irishGrover,
                            modifier = Modifier.padding(20.dp))
                        Column(modifier = Modifier
                            .fillMaxWidth(1f)
                            .verticalScroll(
                                rememberScrollState(),
                                true,
                                null
                            ), horizontalAlignment = Alignment.CenterHorizontally) {

                                Column(horizontalAlignment = Alignment.CenterHorizontally, modifier = Modifier
                                    .fillMaxSize(1f)) {

                                    Column(modifier = Modifier
                                        .background(Color.White)
                                        .padding(15.dp)
                                        .clip(
                                            RoundedCornerShape(20.dp)
                                        )){
                                        Image(painterResource(R.drawable.image2),contentDescription = null,
                                            contentScale = ContentScale.FillBounds,
                                            modifier = Modifier
                                                .height(124.dp)
                                                .width(282.dp)
                                                .padding(5.dp)
                                                .clip(
                                                    RoundedCornerShape(5.dp)
                                                ),)
                                        Text("Water has always been an important " +
                                                "source of life, but drinking and" +
                                                "showering is not its only use. Riding" +
                                                "a boat will help one balance their " +
                                                "chi because of its great.", color = Color.Black,
                                            modifier = Modifier
                                                .padding(5.dp)
                                                .width(280.dp), fontSize = 15.sp, fontFamily = montserrat)
                                    }
                                    Spacer (modifier = Modifier.height(50.dp))
                                    Column(modifier = Modifier
                                        .background(Color.White)
                                        .padding(15.dp)
                                        .clip(
                                            RoundedCornerShape(20.dp)
                                        )){
                                        Image(painterResource(R.drawable.image1),contentDescription = null, contentScale = ContentScale.FillBounds,
                                            modifier = Modifier
                                                .height(124.dp)
                                                .width(282.dp)
                                                .padding(5.dp)
                                                .clip(
                                                    RoundedCornerShape(5.dp)
                                                ))
                                        Text("Water has always been an important " +
                                                "source of life, but drinking and" +
                                                "showering is not its only use. Riding" +
                                                "a boat will help one balance their " +
                                                "chi because of its great.", color = Color.Black,
                                            modifier = Modifier
                                                .padding(5.dp)
                                                .width(280.dp), fontSize = 15.sp, fontFamily = montserrat)
                                    }
                                    Spacer (modifier = Modifier.height(50.dp))
                                    Column(modifier = Modifier
                                        .background(Color.White)
                                        .padding(15.dp)
                                        .clip(
                                            RoundedCornerShape(20.dp)
                                        )){
                                        Image(painterResource(R.drawable.image10),contentDescription = null, contentScale = ContentScale.FillBounds,
                                            modifier = Modifier
                                                .height(124.dp)
                                                .width(282.dp)
                                                .padding(5.dp)
                                                .clip(
                                                    RoundedCornerShape(5.dp)
                                                ))
                                        Text("The appearance of this dry yet wet " +
                                                "land and sunset is a nice blend that " +
                                                "is bound to create chemistry in a " +
                                                "person’s mind.", color = Color.Black,
                                            modifier = Modifier
                                                .padding(5.dp)
                                                .width(280.dp), fontSize = 15.sp, fontFamily = montserrat)
                                    }
                                    Spacer (modifier = Modifier.height(50.dp))
                                    Column(modifier = Modifier
                                        .background(Color.White)
                                        .padding(15.dp)
                                        .clip(
                                            RoundedCornerShape(20.dp)
                                        )){
                                        Image(painterResource(R.drawable.image7),contentDescription = null, contentScale = ContentScale.FillBounds,
                                            modifier = Modifier
                                                .height(124.dp)
                                                .width(282.dp)
                                                .padding(5.dp)
                                                .clip(
                                                    RoundedCornerShape(5.dp)
                                                ))
                                        Text("An obvious paradise island for " +
                                                "everybody. The nice hue of blue and " +
                                                "the brown and green terrain makes " +
                                                "it an excellent choice for a vacation.", color = Color.Black,
                                            modifier = Modifier
                                                .padding(5.dp)
                                                .width(280.dp), fontSize = 15.sp, fontFamily = montserrat)
                                    }
                                    Spacer (modifier = Modifier.height(50.dp))
                                    Column(modifier = Modifier
                                        .background(Color.White)
                                        .padding(15.dp)
                                        .clip(
                                            RoundedCornerShape(20.dp)
                                        )){
                                        Image(painterResource(R.drawable.image9),contentDescription = null, contentScale = ContentScale.FillBounds,
                                            modifier = Modifier
                                                .height(124.dp)
                                                .width(282.dp)
                                                .padding(5.dp)
                                                .clip(
                                                    RoundedCornerShape(5.dp)
                                                ))
                                        Text("It’s like watching sakura blossom in " +
                                                "the sky, it is wonderful to watch and " +
                                                "the  purple mountains are so great to " +
                                                "look at. It almost looks like it was " +
                                                "photoshopped.", color = Color.Black,
                                            modifier = Modifier
                                                .padding(5.dp)
                                                .width(280.dp), fontSize = 15.sp, fontFamily = montserrat)
                                    }
                                    Spacer (modifier = Modifier.height(50.dp))
                                    Column(modifier = Modifier
                                        .background(Color.White)
                                        .padding(15.dp)
                                        .clip(
                                            RoundedCornerShape(20.dp)
                                        )){
                                        Image(painterResource(R.drawable.image8),contentDescription = null, contentScale = ContentScale.FillBounds,
                                            modifier = Modifier
                                                .height(124.dp)
                                                .width(282.dp)
                                                .padding(5.dp)
                                                .clip(
                                                    RoundedCornerShape(5.dp)
                                                ))
                                        Text("These grasses look like they are made " +
                                                "of expensive shards of glass. I wonder " +
                                                "if they have different species of " +
                                                "herbivores eating them...", color = Color.Black,
                                            modifier = Modifier
                                                .padding(5.dp)
                                                .width(280.dp), fontSize = 15.sp, fontFamily = montserrat)
                                    }
                                    Spacer (modifier = Modifier.height(370.dp))
                                }
                        }
                    }
                }
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    SightsTheme {
        Box(modifier = Modifier
            .background(Color(0xEDEDED))
            .fillMaxSize(1f)){
            Column() {
                Text("Sights",
                    fontSize = 24.sp,
                    fontWeight = FontWeight(700),
                    fontStyle = FontStyle.Italic,
                    modifier = Modifier.padding(20.dp))
                Row(
                    horizontalArrangement = Arrangement.Start,
                    modifier = Modifier
                        .fillMaxWidth(1f)
                        .horizontalScroll(rememberScrollState(), true, null)
                ) {
                    Spacer(modifier = Modifier.width(40.dp))
                    Image(
                        painterResource(R.drawable.image1),
                        contentDescription = "",
                        modifier = Modifier
                            .size(50.dp)
                            .clip(CircleShape),
                        contentScale = ContentScale.FillBounds
                    )
                    Spacer(modifier = Modifier.width(20.dp))
                    Image(
                        painterResource(R.drawable.image2),
                        contentDescription = "",
                        modifier = Modifier
                            .size(50.dp)
                            .clip(CircleShape),
                        contentScale = ContentScale.FillBounds
                    )
                    Spacer(modifier = Modifier.width(20.dp))
                    Image(
                        painterResource(R.drawable.image3),
                        contentDescription = "",
                        modifier = Modifier
                            .size(50.dp)
                            .clip(CircleShape),
                        contentScale = ContentScale.FillBounds
                    )
                    Spacer(modifier = Modifier.width(20.dp))
                    Image(
                        painterResource(R.drawable.image4),
                        contentDescription = "",
                        modifier = Modifier
                            .size(50.dp)
                            .clip(CircleShape),
                        contentScale = ContentScale.FillBounds
                    )
                    Spacer(modifier = Modifier.width(20.dp))
                    Image(
                        painterResource(R.drawable.image5),
                        contentDescription = "",
                        modifier = Modifier
                            .size(50.dp)
                            .clip(CircleShape),
                        contentScale = ContentScale.FillBounds
                    )
                    Spacer(modifier = Modifier.width(20.dp))
                    Image(
                        painterResource(R.drawable.image6),
                        contentDescription = "",
                        modifier = Modifier
                            .size(50.dp)
                            .clip(CircleShape),
                        contentScale = ContentScale.FillBounds
                    )
                    Spacer(modifier = Modifier.width(20.dp))
                    Image(
                        painterResource(R.drawable.image7),
                        contentDescription = "",
                        modifier = Modifier
                            .size(50.dp)
                            .clip(CircleShape),
                        contentScale = ContentScale.FillBounds
                    )
                    Spacer(modifier = Modifier.width(20.dp))
                    Image(
                        painterResource(R.drawable.image8),
                        contentDescription = "",
                        modifier = Modifier
                            .size(50.dp)
                            .clip(CircleShape),
                        contentScale = ContentScale.FillBounds
                    )
                    Spacer(modifier = Modifier.width(20.dp))
                    Image(
                        painterResource(R.drawable.image9),
                        contentDescription = "",
                        modifier = Modifier
                            .size(50.dp)
                            .clip(CircleShape),
                        contentScale = ContentScale.FillBounds
                    )
                    Spacer(modifier = Modifier.width(20.dp))
                    Image(
                        painterResource(R.drawable.image10),
                        contentDescription = "",
                        modifier = Modifier
                            .size(50.dp)
                            .clip(CircleShape),
                        contentScale = ContentScale.FillBounds
                    )
                    Spacer(modifier = Modifier.width(40.dp))
                }
                Spacer(modifier = Modifier.height(20.dp))
                Text("Amazing Views",
                    fontSize = 24.sp,
                    fontWeight = FontWeight(700),
                    fontStyle = FontStyle.Italic,
                    modifier = Modifier.padding(20.dp))
                Column(modifier = Modifier
                    .fillMaxWidth(1f)
                    .verticalScroll(
                        rememberScrollState(),
                        true,
                        null
                    ), horizontalAlignment = Alignment.CenterHorizontally) {

                    Column(horizontalAlignment = Alignment.CenterHorizontally, modifier = Modifier
                        .fillMaxSize(1f)
                        .verticalScroll(rememberScrollState(),true,null)) {

                        Column(modifier = Modifier
                            .background(Color.White)
                            .padding(15.dp)
                            .clip(
                                RoundedCornerShape(20.dp)
                            )){
                            Image(painterResource(R.drawable.image1),contentDescription = null, contentScale = ContentScale.FillBounds,
                                modifier = Modifier
                                    .height(124.dp)
                                    .width(282.dp)
                                    .padding(5.dp)
                                    .clip(
                                        RoundedCornerShape(5.dp)
                                    ))
                            Text("Water has always been an important " +
                                    "source of life, but drinking and" +
                                    "showering is not its only use. Riding" +
                                    "a boat will help one balance their " +
                                    "chi because of its great.", color = Color.Black,
                                modifier = Modifier
                                    .padding(5.dp)
                                    .width(280.dp), fontSize = 15.sp)
                        }
                        Spacer (modifier = Modifier.height(50.dp))
                        Column(modifier = Modifier
                            .background(Color.White)
                            .padding(15.dp)
                            .clip(
                                RoundedCornerShape(20.dp)
                            )){
                            Image(painterResource(R.drawable.image1),contentDescription = null, contentScale = ContentScale.FillBounds,
                                modifier = Modifier
                                    .height(124.dp)
                                    .width(282.dp)
                                    .padding(5.dp)
                                    .clip(
                                        RoundedCornerShape(5.dp)
                                    ))
                            Text("Water has always been an important " +
                                    "source of life, but drinking and" +
                                    "showering is not its only use. Riding" +
                                    "a boat will help one balance their " +
                                    "chi because of its great.", color = Color.Black,
                                modifier = Modifier
                                    .padding(5.dp)
                                    .width(280.dp), fontSize = 15.sp)
                        }
                        Spacer (modifier = Modifier.height(50.dp))
                        Column(modifier = Modifier
                            .background(Color.White)
                            .padding(15.dp)
                            .clip(
                                RoundedCornerShape(20.dp)
                            )){
                            Image(painterResource(R.drawable.image10),contentDescription = null, contentScale = ContentScale.FillBounds,
                                modifier = Modifier
                                    .height(124.dp)
                                    .width(282.dp)
                                    .padding(5.dp)
                                    .clip(
                                        RoundedCornerShape(5.dp)
                                    ))
                            Text("The appearance of this dry yet wet " +
                                    "land and sunset is a nice blend that " +
                                    "is bound to create chemistry in a " +
                                    "person’s mind.", color = Color.Black,
                                modifier = Modifier
                                    .padding(5.dp)
                                    .width(280.dp), fontSize = 15.sp)
                        }
                        Spacer (modifier = Modifier.height(50.dp))
                        Column(modifier = Modifier
                            .background(Color.White)
                            .padding(15.dp)
                            .clip(
                                RoundedCornerShape(20.dp)
                            )){
                            Image(painterResource(R.drawable.image7),contentDescription = null, contentScale = ContentScale.FillBounds,
                                modifier = Modifier
                                    .height(124.dp)
                                    .width(282.dp)
                                    .padding(5.dp)
                                    .clip(
                                        RoundedCornerShape(5.dp)
                                    ))
                            Text("An obvious paradise island for " +
                                    "everybody. The nice hue of blue and " +
                                    "the brown and green terrain makes " +
                                    "it an excellent choice for a vacation.", color = Color.Black,
                                modifier = Modifier
                                    .padding(5.dp)
                                    .width(280.dp), fontSize = 15.sp)
                        }
                        Spacer (modifier = Modifier.height(50.dp))
                        Column(modifier = Modifier
                            .background(Color.White)
                            .padding(15.dp)
                            .clip(
                                RoundedCornerShape(20.dp)
                            )){
                            Image(painterResource(R.drawable.image9),contentDescription = null, contentScale = ContentScale.FillBounds,
                                modifier = Modifier
                                    .height(124.dp)
                                    .width(282.dp)
                                    .padding(5.dp)
                                    .clip(
                                        RoundedCornerShape(5.dp)
                                    ))
                            Text("It’s like watching sakura blossom in " +
                                    "the sky, it is wonderful to watch and " +
                                    "the  purple mountains are so great to " +
                                    "look at. It almost looks like it was " +
                                    "photoshopped.", color = Color.Black,
                                modifier = Modifier
                                    .padding(5.dp)
                                    .width(280.dp), fontSize = 15.sp)
                        }
                        Spacer (modifier = Modifier.height(50.dp))
                        Column(modifier = Modifier
                            .background(Color.White)
                            .padding(15.dp)
                            .clip(
                                RoundedCornerShape(20.dp)
                            )){
                            Image(painterResource(R.drawable.image8),contentDescription = null, contentScale = ContentScale.FillBounds,
                                modifier = Modifier
                                    .height(124.dp)
                                    .width(282.dp)
                                    .padding(5.dp)
                                    .clip(
                                        RoundedCornerShape(5.dp)
                                    ))
                            Text("These grasses look like they are made " +
                                    "of expensive shards of glass. I wonder " +
                                    "if they have different species of " +
                                    "herbivores eating them...", color = Color.Black,
                                modifier = Modifier
                                    .padding(5.dp)
                                    .width(280.dp), fontSize = 15.sp)
                        }
                    }
                }
            }
        }

    }
}