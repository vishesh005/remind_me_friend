package dev.visheshpandey.remindmefriend.presentations

import dagger.Subcomponent
import dev.visheshpandey.remindmefriend.LoginScreen

@Subcomponent(modules = [PresentationModule::class])
interface PresentationComponent {
    fun inject(activity: LoginScreen)
}