package com.gabriel.crudroom.ui

import android.util.Log
import android.widget.Toast
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.gabriel.crudroom.ui.Repository.SubscriberRepository
import kotlinx.coroutines.launch
import java.lang.Exception

class SubscriberViewModel(private val subscriberRepository: SubscriberRepository) : ViewModel() {
    companion object{
        const val TAG = "TESTE"
    }

    
    fun addSubscriber(name : String, email : String) {
        viewModelScope.launch {
            try {
                val id = subscriberRepository.insertSubscriber(name, email)
                if (id > 0){

                }

            }catch (e : Exception){
                Log.i(TAG,e.message!!)
            }
        }
    }


}