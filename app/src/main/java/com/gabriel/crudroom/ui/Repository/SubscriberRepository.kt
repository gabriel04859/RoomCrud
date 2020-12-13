package com.gabriel.crudroom.ui.Repository

import androidx.lifecycle.LiveData
import com.gabriel.crudroom.ui.Data.Db.Entity.SubscriberEntity

interface SubscriberRepository {

    suspend fun insertSubscriber(name : String, email : String): Long

    suspend fun updateSubscriber(id : Long, name : String, email : String)

    suspend fun deleteSubscriber(id : Long)

    suspend fun deleteAllSubscriber()

    suspend fun getAllSubscriber(): LiveData<List<SubscriberEntity>>
}