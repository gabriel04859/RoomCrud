package com.gabriel.crudroom.ui.Data.Db

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.gabriel.crudroom.ui.Data.Db.DAO.SubscriberDAO
import com.gabriel.crudroom.ui.Data.Db.Entity.SubscriberEntity

@Database(entities = [SubscriberEntity::class], version = 1)
abstract class SubscriberDataBase : RoomDatabase(){

    abstract val subscriberDAO : SubscriberDAO
    companion object{
        @Volatile
        private var INSTANCE : SubscriberDataBase? = null

        fun getInstance(context: Context) : SubscriberDataBase{
            synchronized(this){
                var instance : SubscriberDataBase? = INSTANCE
                if (instance == null){
                    instance = Room.databaseBuilder(context, SubscriberDataBase::class.java,
                        "database_subscriber").build()
                }

                return instance
            }


        }
    }

}