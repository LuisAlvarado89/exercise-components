package org.ies.tierno.exercise_components

import androidx.compose.foundation.Image
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import org.ies.tierno.exercise_components.ui.theme.ExercisecomponentsTheme
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.unit.dp

class Loginregister : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ExercisecomponentsTheme {
                Login()
            }

        }
    }
}

@Composable
fun Login() {

    Scaffold(
        modifier = Modifier.fillMaxSize(),
        containerColor = Color(0xFFFAF5EF)
    ) { innerPadding ->

        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .padding(innerPadding)
                .fillMaxSize()
                .verticalScroll(rememberScrollState())
                .padding(horizontal = 15.dp, vertical = 20.dp)
        ) {

            // LOGO DE DESCORCHA
            Image(
                painter = painterResource(R.drawable.logo_descorcha),
                contentDescription = "Icono Descorcha",
                modifier = Modifier.size(150.dp)
            )

            Spacer(modifier = Modifier.height(10.dp))

            // TITULO DESCORCHA
            Text(
                text = "Descorcha",
                fontSize = 38.sp,
                fontWeight = FontWeight.Bold,
                fontFamily = FontFamily.Serif,
                color = Color(0xFF4A1021)
            )

            Spacer(modifier = Modifier.height(8.dp))

            // TEXTO DE BIENVENIDA
            Text(
                text = "Tu próxima copa empieza aquí",
                fontSize = 16.sp,
                color = Color(0xFF80666A)
            )

            Spacer(modifier = Modifier.height(20.dp))

            // CAMPO DE USUARIO
            TextField(
                value = "",
                onValueChange = {},
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 10.dp)
                    .height(65.dp),
                shape = RoundedCornerShape(16.dp),
                colors = TextFieldDefaults.colors(
                    focusedIndicatorColor = Color(0xFF4A1021),
                    unfocusedIndicatorColor = Color(0xFFD8C7C4),
                    focusedContainerColor = Color.White,
                    unfocusedContainerColor = Color.White,
                    focusedLabelColor = Color(0xFF4A1021),
                    cursorColor = Color(0xFF4A1021)
                ),
                label = {
                    Row(
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Icon(
                            imageVector = Icons.Default.Person,
                            contentDescription = "Username",
                            tint = Color(0xFF4A1021)
                        )

                        Spacer(modifier = Modifier.width(10.dp))

                        Text("Username")
                    }
                }
            )

            Spacer(modifier = Modifier.height(15.dp))

            // CAMPO DE CONTRASEÑA
            TextField(
                value = "",
                onValueChange = {},
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 10.dp)
                    .height(65.dp),
                shape = RoundedCornerShape(16.dp),
                visualTransformation = PasswordVisualTransformation(),
                colors = TextFieldDefaults.colors(
                    focusedIndicatorColor = Color(0xFF4A1021),
                    unfocusedIndicatorColor = Color(0xFFD8C7C4),
                    focusedContainerColor = Color.White,
                    unfocusedContainerColor = Color.White,
                    focusedLabelColor = Color(0xFF4A1021),
                    cursorColor = Color(0xFF4A1021)
                ),
                label = {
                    Row(
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Icon(
                            imageVector = Icons.Default.Lock,
                            contentDescription = "Password",
                            tint = Color(0xFF4A1021)
                        )

                        Spacer(modifier = Modifier.width(10.dp))

                        Text("Password")
                    }
                }
            )

            Spacer(modifier = Modifier.height(25.dp))

            // BOTONES LIMPIAR Y ACEPTAR
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically
            ) {

                // BOTON LIMPIAR
                OutlinedButton(
                    onClick = {},
                    shape = RoundedCornerShape(14.dp),
                    colors = ButtonDefaults.outlinedButtonColors(
                        contentColor = Color(0xFF4A1021)
                    )
                ) {
                    Text("Limpiar")
                }

                Spacer(modifier = Modifier.width(15.dp))

                // BOTON ACEPTAR
                Button(
                    onClick = {},
                    shape = RoundedCornerShape(14.dp),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color(0xFF4A1021),
                        contentColor = Color.White
                    )
                ) {
                    Text("Aceptar")
                }
            }

            Spacer(modifier = Modifier.height(15.dp))

            // BOTON REGISTRARSE
            OutlinedButton(
                onClick = {},
                modifier = Modifier.fillMaxWidth(),
                shape = RoundedCornerShape(14.dp),
                colors = ButtonDefaults.outlinedButtonColors(
                    contentColor = Color(0xFF4A1021)
                )
            ) {
                Text("Registrarse")
            }

            Spacer(modifier = Modifier.height(20.dp))

            // TEXTO INFERIOR
            Text(
                text = "Descubre el vino a tu manera",
                fontSize = 13.sp,
                color = Color(0xFF80666A)
            )
        }
    }
}
@Preview(showBackground = true)
@Composable
fun LoginPreview() {
    ExercisecomponentsTheme {
        Login()
    }
}