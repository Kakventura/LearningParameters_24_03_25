package com.example.learningparameters.data

val userDefault = User(
    userId = "Aluno",
    name = "Aluno DS",
    avatarUrl = null,
    age = 17,
    score = 75,
    turma = "3° AMS",
    registerDate = "24/03/2025",
    email = "aluno@etec.sp.gov.br",
    bio = "Sou estudante de Desenvolvimento de Sistemas na ETEC Zona Leste que criou um aplicativo com passagem de parâmetros no JetPackCompose."

)

val karinne = User(
    userId = "Karinne",
    name = "Karinne Angelo dos Santos Ventura",
    avatarUrl = null,
    age = 18,
    score = 90,
    turma = "3° AMS",
    registerDate = "25/02/2007",
    email = "karinne.ventura@etec.sp.gov.br",
    bio = "Sou estudante de Desenvolvimento de Sistemas na ETEC Zona Leste que criou um aplicativo com passagem de parâmetros no JetPackCompose."

)

fun getUserData(userName: String): User {
    return if (userName == "Karinne") {
        karinne
    } else {
        userDefault
    }
}