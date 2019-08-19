package dev.visheshpandey.remindmefriend

import android.os.Bundle

class LoginScreen : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_screen)
        getComponent().inject(this)
    }
}
