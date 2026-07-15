package ec.edu.puce.githubclient

import android.app.Application
import ec.edu.puce.githubclient.services.RetrofitClient

class GithubApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        RetrofitClient.init(this)
    }
}
