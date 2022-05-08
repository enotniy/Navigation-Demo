package ru.ekitselyuk.navigation_demo

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        val isLogin = getPreferences(MODE_PRIVATE).getBoolean("IS_LOGIN", false)

        val navHost = findNavController(R.id.nav_host_fragment_activity_login)
    }
}