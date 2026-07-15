package ec.edu.puce.githubclient

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.lifecycle.viewmodel.compose.viewModel
import ec.edu.puce.githubclient.services.AuthService
import ec.edu.puce.githubclient.ui.screens.LoginForm
import ec.edu.puce.githubclient.ui.screens.RepoForm
import ec.edu.puce.githubclient.ui.screens.RepoList
import ec.edu.puce.githubclient.ui.theme.GithubClientTheme
import ec.edu.puce.githubclient.viewmodels.RepoFormViewModel
import ec.edu.puce.githubclient.viewmodels.RepoListViewModel

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        val authService = AuthService(this)
        
        setContent {
            GithubClientTheme {
                var currentScreen by remember { 
                    mutableStateOf(if (authService.isLoggedIn()) "repoList" else "login") 
                }
                val listViewModel: RepoListViewModel = viewModel()
                val formViewModel: RepoFormViewModel = viewModel()
                
                when (currentScreen) {
                    "login" -> LoginForm(
                        onLoginSuccess = { currentScreen = "repoList" }
                    )
                    "repoList" -> RepoList(
                        onNavigateToForm = { currentScreen = "repoForm" },
                        onLogout = {
                            authService.logout()
                            currentScreen = "login"
                        }
                    )
                    "repoForm" -> RepoForm(
                        onBackClick = {
                            formViewModel.resetError()
                            currentScreen = "repoList"
                        },
                        onSaveSuccess = {
                            listViewModel.fetchRepos()
                            currentScreen = "repoList"
                        }
                    )
                }
            }
        }
    }
}
