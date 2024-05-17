package com.example.test_composecard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.test_composecard.ui.theme.Test_ComposeCardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Test_ComposeCardTheme {

                Box(
                    modifier = Modifier
                        .fillMaxSize()
                        .background(Color.Black.copy(alpha = 0.8f)),
                    contentAlignment = Alignment.Center

                ) {
                    MyCustomCard(
                        modifier = Modifier.fillMaxWidth(fraction = 0.8f),
                        cardImg = R.drawable.elephant,
                        cardTitle = "Shadows & Lightning",
                        cardDescription = "The story follows the journey of Ariadne, a young woman who discovers that she is the last of the Astrakhan, a race of powerful warriors who were once revered as gods. Ariadne must learn to control her newfound powers and use them to defeat the evil sorcerer who is threatening to destroy the world.",
                        publisher = Publisher(
                            publisherName = "Amr Nasser ",
                            publisherJob = "Android Developer",
                            publisherImg = R.drawable.profileimg
                        )
                    )
                }
            }
        }
    }
}


