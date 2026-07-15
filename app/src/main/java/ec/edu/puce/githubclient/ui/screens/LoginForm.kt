package ec.edu.puce.githubclient.ui.screens

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import ec.edu.puce.githubclient.services.AuthService
import ec.edu.puce.githubclient.ui.theme.GithubClientTheme

@Composable
fun LoginForm(
    onLoginSuccess: () -> Unit = {}
) {
    val context = LocalContext.current
    val authService = remember { AuthService(context) }

    var username by remember { mutableStateOf("") }
    var token by remember { mutableStateOf("") }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            text = "GitHub Login",
            style = MaterialTheme.typography.headlineMedium,
            modifier = Modifier.padding(bottom = 32.dp)
        )

        OutlinedTextField(
            value = username,
            onValueChange = { username = it },
            label = { Text("Username") },
            modifier = Modifier.fillMaxWidth(),
            singleLine = true
        )

        Spacer(modifier = Modifier.height(16.dp))

        OutlinedTextField(
            value = token,
            onValueChange = { token = it },
            label = { Text("Token (Classic PAT)") },
            modifier = Modifier.fillMaxWidth(),
            visualTransformation = PasswordVisualTransformation(),
            singleLine = true
        )

        Spacer(modifier = Modifier.height(24.dp))

        Button(
            onClick = {
                authService.saveAuth(username, token)
                onLoginSuccess()
            },
            modifier = Modifier.fillMaxWidth(),
            enabled = username.isNotBlank() && token.isNotBlank()
        ) {
            Text("Ingresar")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun LoginFormPreview() {
    GithubClientTheme {
        LoginForm()
    }
}
