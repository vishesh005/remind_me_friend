package dev.visheshpandey.remindmefriend.room

import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import dev.visheshpandey.remindmefriend.application.RemindMeFriendApp
import dev.visheshpandey.remindmefriend.models.ReminderModel

const val databaseName: String = "myRDatabase.db"

@Database(entities = [ReminderModel::class], version = 1)
abstract class RDatabase : RoomDatabase() {

    abstract fun reminderDao(): ReminderDAO

    companion object {

        fun getRDatabase(app: RemindMeFriendApp): RDatabase {
            return Room.databaseBuilder(
                app, RDatabase::class.java, databaseName
            ).build()
        }
    }

}