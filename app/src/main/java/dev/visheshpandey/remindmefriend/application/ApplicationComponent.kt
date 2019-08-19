package dev.visheshpandey.remindmefriend.application

import dagger.Component
import dev.visheshpandey.remindmefriend.presentations.PresentationComponent
import dev.visheshpandey.remindmefriend.presentations.PresentationModule
import javax.inject.Singleton

@Singleton
@Component(modules = [ApplicationModule::class, NetworkModule::class])
interface ApplicationComponent {

    fun inject(app: RemindMeFriendApp)

    fun newPresentationComponent(module: PresentationModule): PresentationComponent
}