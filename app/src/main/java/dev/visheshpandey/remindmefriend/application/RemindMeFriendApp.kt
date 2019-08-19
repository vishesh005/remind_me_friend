package dev.visheshpandey.remindmefriend.application

import android.app.Application

class RemindMeFriendApp : Application() {

     val appComp: ApplicationComponent by lazy {
        DaggerApplicationComponent
            .builder()
            .applicationModule(ApplicationModule(this))
            .networkModule(NetworkModule())
            .build()
    }

    override fun onCreate() {
        super.onCreate()
        appComp.inject(this)
    }


}