package dev.visheshpandey.remindmefriend

import androidx.appcompat.app.AppCompatActivity
import dev.visheshpandey.remindmefriend.application.ApplicationComponent
import dev.visheshpandey.remindmefriend.application.RemindMeFriendApp
import dev.visheshpandey.remindmefriend.presentations.PresentationComponent
import dev.visheshpandey.remindmefriend.presentations.PresentationModule

open class BaseActivity : AppCompatActivity() {

    fun getAppComponent(): ApplicationComponent {
        return (getAppComponent() as RemindMeFriendApp).appComp
    }

    fun getComponent(): PresentationComponent {
        return getAppComponent()
            .newPresentationComponent(PresentationModule())
    }

}