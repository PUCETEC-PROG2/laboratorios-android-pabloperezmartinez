package ec.edu.puce.githubclient.ui.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import ec.edu.puce.githubclient.models.GithubUser
import ec.edu.puce.githubclient.models.Repository
import ec.edu.puce.githubclient.ui.theme.GithubClientTheme

@Composable
fun RepoItem (repository: Repository) {
    Card (
        modifier = Modifier
            .padding(8.dp)
            .fillMaxWidth()
    ) {
        Row (
            modifier = Modifier
                .padding(16.dp)
                .fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically
        ) {
            AsyncImage(
                model = repository.owner.avatarUrl,
                contentDescription = "Imagen de repositorio \"${repository.name}\"",
                modifier = Modifier.size(60.dp),
                contentScale = ContentScale.Crop
            )
            Spacer(modifier = Modifier.width(16.dp))

            Column (modifier = Modifier.weight(1f) ) {

                Text(
                    text = repository.name,
                    style = MaterialTheme.typography.titleMedium
                )
                Spacer(modifier = Modifier.height(4.dp))

                repository.description?.let {
                    Text(
                        text = it,
                        style = MaterialTheme.typography.bodyMedium,
                        maxLines = 3
                    )
                }
                Spacer(modifier = Modifier.height(4.dp))

                repository.language?.let {
                    Text(
                        text = it,
                        style = MaterialTheme.typography.labelSmall,
                    )
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun RepoItemPreview () {
    GithubClientTheme {
        val repository = Repository(
            id = "12312414",
            name = "Nombre del repositorio",
            description = "Descripción del repositorio",
            language = "Kotlin",
            owner = GithubUser(
                id = "213123",
                login = "pabloperezmartinez",
                avatarUrl = "https://avatars.githubusercontent.com/u/48026030?v=4"
            )
        )
        RepoItem(repository)
    }
}