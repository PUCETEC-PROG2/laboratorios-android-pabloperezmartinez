package ec.edu.puce.githubclient.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import ec.edu.puce.githubclient.ui.components.RepoItem

@Composable
fun RepoList () {
    Column (
        modifier = Modifier
            .padding(horizontal = 4.dp, vertical = 48.dp)
    ) {
        RepoItem(
            name = "Repositorio Django",
            description = "Proyecto de Python de Pablo",
            avatarImg = "https://avatars.githubusercontent.com/u/48026030?v=4",
            language = "Python"
        )
        RepoItem(
            name = "Repositorio Android",
            description = "Proyecto de Android de Pablo",
            avatarImg = "https://avatars.githubusercontent.com/u/48026030?v=4",
            language = "Kotlin"
        )
        RepoItem(
            name = "Repositorio iOS",
            description = "Proyecto de iOS de Pablo",
            avatarImg = "https://avatars.githubusercontent.com/u/48026030?v=4",
            language = "Swift"
        )
        RepoItem(
            name = "Repositorio Ionic",
            description = "Proyecto de Ionic de Pablo",
            avatarImg = "https://avatars.githubusercontent.com/u/48026030?v=4",
            language = "Typescript"
        )
        RepoItem(
            name = "Repositorio React",
            description = "Proyecto de React de Pablo",
            avatarImg = "https://avatars.githubusercontent.com/u/48026030?v=4",
            language = "Javasctipt"
        )
    }
}

@Preview(showBackground = true)
@Composable
fun RepoListPreview () {
   RepoList()
}