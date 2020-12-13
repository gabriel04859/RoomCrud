package com.gabriel.crudroom.ui.Data.Db.DAO

import androidx.lifecycle.LiveData
import androidx.room.*
import com.gabriel.crudroom.ui.Data.Db.Entity.SubscriberEntity

@Dao
interface SubscriberDAO {
    @Insert
    suspend fun insert(subscriber : SubscriberEntity) : Long

    @Query("SELECT * FROM tb_subscriber")
    suspend fun getAllAllSubscribers() : LiveData<List<SubscriberEntity>>

    @Update
    suspend fun update(subscriber : SubscriberEntity)

    @Query("DELETE FROM tb_subscriber WHERE id = :id")
    suspend fun delete(id : Long)

    @Query("DELETE FROM tb_subscriber")
    suspend fun deleteAll()

}