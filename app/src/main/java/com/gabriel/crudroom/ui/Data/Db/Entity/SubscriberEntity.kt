package com.gabriel.crudroom.ui.Data.Db.Entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "tb_subscriber")
data class SubscriberEntity(
    @PrimaryKey(autoGenerate = true)
    val id : Long = 0,
val name : String = "",
val email : String = "") {
}