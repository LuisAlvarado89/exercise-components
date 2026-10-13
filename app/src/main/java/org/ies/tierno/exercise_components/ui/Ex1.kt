package org.ies.tierno.exercise_components.ui

import android.media.Image
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import org.ies.tierno.exercise_components.Greeting
import org.ies.tierno.exercise_components.R
import org.ies.tierno.exercise_components.ui.ui.theme.ExercisecomponentsTheme

class Ex1 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            LoginRegisterTheme {
                Login()

            }
        }
    }
}
@Composable
fun Login() {
    Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
        Column(
            verticalArrangement = Arrangement.Center,
            modifier = Modifier
                .padding(innerPadding)
                .fillMaxSize()
        ) {
            androidx.compose.foundation.Image(
                painter = painterResource(R.drawable.descorcha),
                contentDescription ="Icono Descorcha"
            )
            Spacer(modifier = Modifier.height(5.dp))
            TextField(
                value = "",
                onValueChange = {},
                label = {
                    Row(
                        verticalAlignment = Alignment.CenterVertically
                    ) { }
                }
            )
        }

    }

}

@Preview(showBackground = true)
@Composable
fun LoginPreview() {
    LoginRegisterTheme {
        Login()
    }
}

@Composable
fun LoginRegisterTheme(content: @Composable () -> Unit) {
    TODO("Not yet implemented")
}