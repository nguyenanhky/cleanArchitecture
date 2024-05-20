package kynv1.fsoft.apptask.data

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.UUID

@Entity(tableName = "tasks")
data class Task @JvmOverloads constructor(
    @ColumnInfo(name = "title")
    var title: String = "",
    @ColumnInfo(name = "destination")
    var destination: String = "",
    @ColumnInfo(name = "completed")
    var isCompleted: Boolean = false,
    @PrimaryKey
    @ColumnInfo(name = "entryId")
    var id: String = UUID.randomUUID().toString(),
) {
    val titleForList: String
        get() = if (title.isNotEmpty()) title else destination

    val isActive
        get() = !isCompleted

    val isEmpty
        get() = title.isEmpty() || destination.isEmpty()
}