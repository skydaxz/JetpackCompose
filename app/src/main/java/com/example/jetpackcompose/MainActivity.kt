package com.example.jetpackcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.jetpackcompose.ui.theme.JetpackComposeTheme
import androidx.compose.foundation.Image
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.foundation.layout.Column


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetpackComposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Design(
                        title = stringResource(R.string.title),
                        introduction = stringResource(R.string.introduction),
                        text = stringResource(R.string.text),
                        imagePainter = painterResource(id = R.drawable.bg_compose_background)
                    )
                }
            }
        }
    }
}



@Composable
fun Design(title: String, introduction: String, text: String, imagePainter: Painter, modifier: Modifier = Modifier) {
    Column(modifier = modifier) {
    Image(
        painter = imagePainter, contentDescription = null)
    Text(
        text = title,
        fontSize = 24.sp,
        modifier = Modifier
            .padding(
                start = 16.dp,
                end = 16.dp,
                bottom = 16.dp,
                top = 16.dp)
    )
    Text(
        text = introduction,
        modifier = Modifier
            .padding(
                start = 16.dp,
                end = 16.dp
            ),
        textAlign = TextAlign.Justify
    )
    Text(
        text = text,
        modifier = Modifier
            .padding(
                start = 16.dp,
                end = 16.dp,
                bottom = 16.dp,
                top = 16.dp
            ),
        textAlign = TextAlign.Justify
    )
    }
}


@Preview(showBackground = true)
@Composable
fun Preview() {
    JetpackComposeTheme {
        Design(
            title = stringResource(R.string.title),
            introduction = stringResource(R.string.introduction),
            text = stringResource(R.string.text),
            imagePainter = painterResource(id = R.drawable.bg_compose_background)
        )
    }
}