package dev.visheshpandey.remindmefriend.models

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.*

@Entity
data class ReminderModel(
    @PrimaryKey
    @ColumnInfo val _id: String,

    @ColumnInfo val title: String,

    @ColumnInfo val time: String,

    @ColumnInfo val category: String
)
