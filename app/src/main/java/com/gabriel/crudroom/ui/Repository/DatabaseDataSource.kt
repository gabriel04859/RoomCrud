package com.gabriel.crudroom.ui.Repository

import androidx.lifecycle.LiveData
import com.gabriel.crudroom.ui.Data.Db.DAO.SubscriberDAO
import com.gabriel.crudroom.ui.Data.Db.Entity.SubscriberEntity

class DatabaseDataSource(private val subscriberDAO: SubscriberDAO) : SubscriberRepository {
    override suspend fun insertSubscriber(name: String, email: String): Long {
        val subscriber = SubscriberEntity(name = name,
        email= email)
        return subscriberDAO.insert(subscriber)
    }

    override suspend fun updateSubscriber(id: Long, name: String, email: String) {
        val subscriber = SubscriberEntity(id, name, email)
        subscriberDAO.update(subscriber)
    }

    override suspend fun deleteSubscriber(id: Long) {
        subscriberDAO.delete(id)
    }

    override suspend fun deleteAllSubscriber() {
        subscriberDAO.deleteAll()
    }

    override suspend fun getAllSubscriber(): LiveData<List<SubscriberEntity>> {
       return subscriberDAO.getAllAllSubscribers()
    }
}