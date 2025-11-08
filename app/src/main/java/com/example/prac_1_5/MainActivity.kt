package com.example.prac_1_5

import android.os.Bundle
import android.view.Surface
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.prac_1_5.ui.theme.Prac_1_5Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
                    HelloPreview_Round()
            }
        }
    }


@Composable
fun Hello(name: String?) {
    Text(
        text = name?.let { "Привет $it!" } ?: "Имя не задано",
        modifier = Modifier.padding(top = 12.dp),
        color = MaterialTheme.colorScheme.onBackground
    )
}



@Composable
fun HelloPreview() {
    Surface(color = MaterialTheme.colorScheme.background) {
        Box(
            modifier = Modifier.fillMaxSize(),
            contentAlignment = Alignment.TopCenter
        ) {
            Hello(name = "Efim")
        }
    }
}

@Preview(
    name = "Portrait",
    showBackground = false,
    showSystemUi = true,
    widthDp = 360,
    heightDp = 800
)
@Composable
fun HelloPreview_Portrait() {
    HelloPreview()
}

@Preview(
    name = "Landscape",
    showBackground = false,
    showSystemUi = true,
    widthDp = 800,
    heightDp = 360
)
@Composable
fun HelloPreview_Landscape() {
    HelloPreview()
}

@Preview(
    name = "Round 200dp",
    showBackground = false,
    showSystemUi = true,
    widthDp = 200,
    heightDp = 200
)
@Composable
fun HelloPreview_Round() {
    Box(
        modifier = Modifier
            .size(200.dp)
            .clip(CircleShape)
            .background(Color(0xFFFFEB3B)), // жёлтый фон
        contentAlignment = Alignment.Center
    ) {
        Hello("Efim")
    }
}