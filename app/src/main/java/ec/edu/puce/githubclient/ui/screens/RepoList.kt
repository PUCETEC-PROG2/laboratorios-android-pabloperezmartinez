package ec.edu.puce.githubclient.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import ec.edu.puce.githubclient.ui.components.RepoItem

@Composable
fun RepoList(
    modifier: Modifier = Modifier
) {
    Column (
        modifier = modifier
    ) {
        RepoItem(
            name = "Repositorio de Android",
            description = "Repositorio creado en Kotlin para Desarrollo Móvil paralelo 1471",
            avatarUrl = "https://avatars.githubusercontent.com/u/48026030?v=4",
            language = "Kotlin"
        )
        RepoItem(
            name = "Repositorio de Django",
            description = "Repositorio creado en Python para Desarrollo Móvil paralelo 1471",
            avatarUrl = "https://avatars.githubusercontent.com/u/48026030?v=4",
            language = "Python"
        )
        RepoItem(
            name = "Repositorio de React",
            description = "Repositorio creado en React para Desarrollo Móvil paralelo 1471",
            avatarUrl = "https://avatars.githubusercontent.com/u/48026030?v=4",
            language = "Javascript"
        )
        RepoItem(
            name = "Repositorio de iOS",
            description = "Repositorio creado en Swift para Desarrollo Móvil paralelo 1471",
            avatarUrl = "https://avatars.githubusercontent.com/u/48026030?v=4",
            language = "Swift"
        )
        RepoItem(
            name = "Repositorio de Ionic",
            description = "Repositorio creado en Ionic para Desarrollo Móvil paralelo 1471",
            avatarUrl = "https://avatars.githubusercontent.com/u/48026030?v=4",
            language = "Typescript"
        )
    }
}