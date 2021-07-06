package es.sdos.poc.compose.csa01.helloCompose

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import es.sdos.poc.compose.R

@Composable
fun Greeting(name: String) {
    Text("Hello $name!", color = Color.Green)
}

@Composable
fun APentatonicMinorScale() {
    MaterialTheme {
        val typography = MaterialTheme.typography
        Column(
            modifier = Modifier.padding(16.dp),
        ) {
            Image(
                painter = painterResource(R.drawable.ic_launcher_foreground),
                contentDescription = null,
                modifier = Modifier
                    .height(180.dp)
                    .fillMaxWidth(),
                contentScale = ContentScale.Crop
            )
            Spacer(Modifier.height(16.dp))
            Text(
                "A Pentatonic Minor Scale is a classical Blues and Rock scale",
                style = typography.h6,
                maxLines = 2,
                overflow = TextOverflow.Ellipsis
            )
            Text("A", style = typography.body2)
            Text("C", style = typography.body2)
            Text("D", style = typography.body2)
            Text("E", style = typography.body2)
            Text("G", style = typography.body2)
        }
    }
}

@Preview
@Composable
fun PreviewGreeting() {
    Greeting("Android")
}

@Preview
@Composable
fun APentatonicMinorScalePreview() {
    APentatonicMinorScale()
}
