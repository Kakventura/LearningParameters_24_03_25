package com.example.learningparameters.ui.theme.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.learningparameters.R


// 2° Página do projeto a ser codada

/*
 * Irá receber os parametros da página de login
 * e fazer a compração (variável "name") dentro da
 * HomeRoute.kt para a autenticação dos usuários
*/

@Composable
fun HomeScreen(user: com.example.learningparameters.data.User) {
    Column (
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.fillMaxWidth()
    ){
        Spacer(modifier = Modifier.height(50.dp))

        Column (
            modifier = Modifier
                .fillMaxWidth()
                .height(35.dp)
                .background(color = Color(0xFF5A6C9A)),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        )
            {
            Text (
                text = "Você está na tela Home",
                fontSize = 18.sp,
                fontFamily = FontFamily.Serif,
                color = Color.White,

            )
        }

        Text (
            text = "Olá, ${user.name}!",
            fontSize = 18.sp,
            fontFamily = FontFamily.Serif,
            modifier = Modifier.padding(top = 16.dp)
        )

        Image(
            painter = painterResource(id = R.drawable.icone),
            contentDescription = "Imagem de perfil",
            modifier = Modifier
                .size(100.dp)
                .padding(top = 8.dp)
                .clip(RoundedCornerShape(150.dp))
        )

        Text (
            text = "\" ${user.bio}\"",
            fontSize = 16.sp,
            fontFamily = FontFamily.Serif,
            modifier = Modifier
                .padding(top = 16.dp)
                .padding(horizontal = 24.dp),
            textAlign = TextAlign.Center
        )

        Text (
            text = "E-mail: ${user.email}",
            fontSize = 16.sp,
            fontFamily = FontFamily.Serif,
            modifier = Modifier.padding(top = 16.dp)
        )

        Text (
            text = "Turma: ${user.turma}",
            fontSize = 16.sp,
            fontFamily = FontFamily.Serif,
            modifier = Modifier.padding(top = 16.dp)
        )


        Text (
            text = "Data de Nascimento: ${user.registerDate}",
            fontSize = 16.sp,
            fontFamily = FontFamily.Serif,
            modifier = Modifier.padding(top = 16.dp)
        )

        Text (
            text = "Pontuação: ${user.score}",
            fontSize = 16.sp,
            fontFamily = FontFamily.Serif,
            modifier = Modifier.padding(top = 16.dp)
        )

        Text (
            text = "Idade: ${user.age}",
            fontSize = 16.sp,
            fontFamily = FontFamily.Serif,
            modifier = Modifier.padding(top = 16.dp)
        )
    }
}


