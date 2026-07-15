package ec.edu.puce.githubclient.viewmodels

import androidx.lifecycle.ViewModel
import ec.edu.puce.githubclient.services.AuthService

class LoginViewModel(private val authService: AuthService) : ViewModel() {
    
    fun login(username: String, token: String) {
        authService.saveAuth(username, token)
    }

    fun isLoggedIn(): Boolean = authService.isLoggedIn()
    
    fun getUsername(): String? = authService.getUsername()
}
