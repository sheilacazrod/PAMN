package com.example.tarjetadepresentasion

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import com.android.volley.Network
import com.example.tarjetadepresentasion.ui.theme.TarjetaDePresentasionTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TarjetaDePresentasionTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = Color(0xFF6DFE)
                ) {
                    Greeting()
                }
            }
        }
    }
}

@Composable
fun Greeting() {
    Box(
        modifier = Modifier.background(Color(0xFFB69DF8),),
        contentAlignment = Alignment.Center
    ) {
        Column(
            modifier = Modifier.padding(16.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                painter = painterResource(id = R.drawable.ic_launcher_foreground), // Reemplaza con la referencia a tu imagen
                contentDescription = null, // Puedes dejarlo en nulo si la imagen no necesita una descripción
                modifier = Modifier.size(120.dp), // Ajusta el tamaño de la imagen según tus preferencias
            )

            // Nombre completo en negrita y de mayor tamaño
            Text(
                text = stringResource(R.string.nombre),
                fontWeight = FontWeight.Bold,
                fontSize = 24.sp
            )

            // Profesión
            Text(
                text = stringResource(R.string.titulo),
                fontSize = 18.sp
            )
        }
    }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(bottom = 18.dp),
        verticalArrangement = Arrangement.Bottom,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        // Número de teléfono con ícono
        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {
            Icon(
                imageVector = Icons.Default.Phone, // Ícono de teléfono
                contentDescription = "Teléfono",
                tint = Color.Gray
            )
            Spacer(modifier = Modifier.width(4.dp)) // Espacio entre el ícono y el texto
            Text(
                text = stringResource(R.string.telefono),
                fontSize = 18.sp
            )
        }

        // Correo electrónico con ícono
        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {
            Icon(
                imageVector = Icons.Default.Email, // Ícono de correo
                contentDescription = "Correo",
                tint = Color.Gray
            )
            Spacer(modifier = Modifier.width(4.dp)) // Espacio entre el ícono y el texto
            Text(
                text = stringResource(R.string.mail),
                fontSize = 16.sp
            )
        }

        // GitHub con ícono de redes (usamos AccountCircle como ejemplo)
        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {
            Icon(
                imageVector = Icons.Default.AccountCircle, // Ícono de redes (ejemplo)
                contentDescription = "Redes",
                tint = Color.Gray
            )
            Spacer(modifier = Modifier.width(4.dp)) // Espacio entre el ícono y el texto
            Text(
                text = stringResource(R.string.github),
                fontSize = 18.sp
            )
        }
    }
}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    TarjetaDePresentasionTheme {
        Greeting()
    }
}
