package com.example.learningparameters.ui.theme.screen

// 1° Página do projeto a ser codada

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.learningparameters.ui.theme.LearningParametersTheme

// Anotação usada para permitir o uso de API's inacabadas/testes
@OptIn(ExperimentalMaterial3Api::class)

@Composable
fun LoginScreen(navController: NavController) {

    // A variável irá receber os parâmetros instanciados no HomeScreen.kt
    var text by remember { mutableStateOf("") }

    Column (
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.fillMaxWidth()
    ){
        Spacer(modifier = Modifier.height(50.dp))

        Text (
            text = "Você está na tela de login",
            modifier = Modifier.padding(top = 16.dp)
        )

        OutlinedTextField(
            value = text,
            onValueChange = { text = it },
            label = { Text("Digite o nome de usuário:") }
        )

        Button(
            onClick = {
                val name = text.ifEmpty { "Cara" }

                // Irá atribuir a variável "name" e guardar o id
                navController.navigate("home/$name")
            },
            modifier = Modifier.padding(16.dp)
        ) {
            Text(text = "Navegar para a Home")
        }

    }
}

// Parte do preview
@Preview(showBackground = true)
@Composable
fun LoginScreenPreview() {
    LearningParametersTheme {
        LoginScreen(
            navController = rememberNavController()
        )
    }
}

