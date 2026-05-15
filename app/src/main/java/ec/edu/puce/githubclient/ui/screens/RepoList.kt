package ec.edu.puce.githubclient.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import ec.edu.puce.githubclient.ui.components.RepoItem

@Composable
fun RepoList (
    modifier: Modifier = Modifier
) {
    Column (
        modifier = modifier
    ) {
        RepoItem(
            name = "Repositorio de Android",
            description = "Repositorio usando el lenguaje Kotlin para 4to nivel de PUCETEC",
            avatarUrl = "https://avatars.githubusercontent.com/u/48026030?v=4",
            language = "Kotlin"
        )
        RepoItem(
            name = "Repositorio de Ionic",
            description = "Repositorio usando el lenguaje React Ionic para 4to nivel de PUCETEC",
            avatarUrl = "https://avatars.githubusercontent.com/u/48026030?v=4",
            language = "Javascript"
        )
        RepoItem(
            name = "Repositorio de Django",
            description = "Repositorio usando el lenguaje Python para 4to nivel de PUCETEC",
            avatarUrl = "https://avatars.githubusercontent.com/u/48026030?v=4",
            language = "Python"
        )
        RepoItem(
            name = "Repositorio de iOS",
            description = "Repositorio usando el lenguaje Swift para 4to nivel de PUCETEC",
            avatarUrl = "https://avatars.githubusercontent.com/u/48026030?v=4",
            language = "Swift"
        )
        RepoItem(
            name = "Repositorio de Springboot",
            description = "Repositorio usando el lenguaje Kotlin para 4to nivel de PUCETEC",
            avatarUrl = "https://avatars.githubusercontent.com/u/48026030?v=4",
            language = "Kotlin"
        )
    }
}