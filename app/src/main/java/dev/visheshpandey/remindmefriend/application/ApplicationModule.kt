package dev.visheshpandey.remindmefriend.application

import android.content.Context
import android.content.SharedPreferences
import androidx.annotation.WorkerThread
import dagger.Module
import dagger.Provides
import dev.visheshpandey.remindmefriend.room.RDatabase
import javax.inject.Singleton


@Module
class ApplicationModule(private val app: RemindMeFriendApp) {

    private val appSharedPref: String = "appPref"

    @Singleton
    @Provides
    fun getApp(): RemindMeFriendApp = app

    @Singleton
    @Provides
    fun getAppPreference(app: RemindMeFriendApp): SharedPreferences {
        return app.getSharedPreferences(appSharedPref, Context.MODE_PRIVATE)
    }


    @Singleton
    @Provides
    fun getRoomDatabase(): RDatabase = RDatabase.getRDatabase(app)


}