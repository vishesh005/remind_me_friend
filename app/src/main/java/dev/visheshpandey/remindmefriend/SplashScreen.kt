package dev.visheshpandey.remindmefriend

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.Window
import android.view.WindowManager

class SplashScreen : AppCompatActivity() {

    private val delay = 3000L

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        fullscreen()
        setContentView(R.layout.activity_splash_screen)
        moveToMainScreen()

    }

    private fun fullscreen() {
        requestWindowFeature(Window.FEATURE_NO_TITLE)
        window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN)
    }

    private fun moveToMainScreen() =
        Handler().postDelayed({ startActivity(Intent(this, LoginScreen::class.java)).also { finish() } }, delay)


}
