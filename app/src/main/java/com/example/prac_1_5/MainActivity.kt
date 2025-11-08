package com.example.prac_1_5

//import android.graphics.fonts.FontStyle
import android.os.Bundle
import android.view.Surface
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.prac_1_5.ui.theme.Prac_1_5Theme
import androidx.compose.ui.text.font.FontStyle

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
                    //HelloPreview_Round()
                    //DescriptionVariants_Preview()
                    //WideRoundedButton()
                    InitialsInContainerPreview()
            }
        }
    }

@Composable
fun WideRoundedButton(
    onClick: () -> Unit = {}
) {
    Button(
        onClick = onClick,
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp),
        shape = RoundedCornerShape(16.dp),
        border = BorderStroke(2.dp, Color.Gray),
        colors = ButtonDefaults.buttonColors(
            containerColor = Color.LightGray,
            contentColor = Color.Black
        ),
        elevation = ButtonDefaults.buttonElevation(defaultElevation = 4.dp)
    ) {
        Text(text = "Нажми на меня")
    }
}

@Preview(showBackground = true)
@Composable
fun WideRoundedButtonPreview() {
    WideRoundedButton()
}

/*@Composable
fun DescriptionVariants() {
    val text = stringResource(id = R.string.jetpack_compose_description)

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Text(
            text = text,
            color = Color(0xFF2E7D32),
            fontSize = 16.sp,
            fontStyle = FontStyle.Italic,
            textAlign = TextAlign.Center,
            modifier = Modifier
                .padding(vertical = 8.dp)
        )


        Text(
            text = text,
            fontSize = 16.sp,
            color = MaterialTheme.colorScheme.onBackground,
            maxLines = 1,
            overflow = TextOverflow.Ellipsis,
            modifier = Modifier
                .padding(vertical = 8.dp)
        )

        Text(
            text = text,
            fontSize = 24.sp,
            color = Color.Black,
            textDecoration = TextDecoration.Underline,
            modifier = Modifier
                .padding(start = 48.dp)
                .background(Color(0xFF2E7D32))
                .padding(8.dp)
        )
    }
}

@Preview(showSystemUi = true, name = "Description variants")
@Composable
fun DescriptionVariants_Preview() {
    Surface(color = MaterialTheme.colorScheme.background) {
        DescriptionVariants()
    }
}*/

/*

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
}*/
